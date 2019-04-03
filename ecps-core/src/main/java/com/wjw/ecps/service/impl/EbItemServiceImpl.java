package com.wjw.ecps.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbConsoleLogMapper;
import com.wjw.ecps.dao.EbItemClobMapper;
import com.wjw.ecps.dao.EbItemMapper;
import com.wjw.ecps.dao.EbParaValueMapper;
import com.wjw.ecps.dao.EbSkuMapper;
import com.wjw.ecps.dao.EbSpecValueMapper;
import com.wjw.ecps.model.EbConsoleLog;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbItemClob;
import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.EbSpecValue;
import com.wjw.ecps.model.Page;
import com.wjw.ecps.model.query.EbItemQuery;
import com.wjw.ecps.service.EbItemService;
import com.wjw.ecps.stub.EbWSItemService;
import com.wjw.ecps.stub.EbWSItemServiceService;
import com.wjw.ecps.util.ECPSUtils;
import org.apache.commons.lang.StringUtils;

@Service
public class EbItemServiceImpl implements EbItemService {
	@Autowired
	private EbItemMapper ebItemMapper;
	@Autowired
	private EbItemClobMapper ebItemClobMapper;
	@Autowired
	private EbSkuMapper ebSkuMapper;
	@Autowired
	private EbParaValueMapper ebParaValueMapper;
	@Autowired
	private EbSpecValueMapper ebSpecValueMapper;
	@Autowired
	private EbConsoleLogMapper ebConsoleLogMapper;

	@Override
	public int selectCountByQuery(EbItemQuery eq) {
		return ebItemMapper.selectCountByQuery(eq);
	}
 
	@Override
	public Page getPageByQurey(EbItemQuery eq) {
		// 先设置条件
		Page page = new Page();
		page.setPageNo(eq.getPageNo());
		page.setCount(this.selectCountByQuery(eq));
		// 获得开始结束条件
		eq.setStartNum(page.getStartNo());
		eq.setEndNum(page.getEndNo());
		// 查询
		List<EbItem> iEbItems = ebItemMapper.selectItemsByQuery(eq);
		page.setList(iEbItems);
		return page;
	}

	@Override
	public void saveItem(EbItem ebItem, EbItemClob ebItemClob, List<EbSku> ebSkus, List<EbParaValue> paraList) {
		// 保存商品
		ebItemMapper.insert(ebItem);
		Long itemId = ebItem.getItemId();
		ebItemClob.setItemId(itemId);
		// 保存商品大字段
		ebItemClobMapper.insert(ebItemClob);
		// 保存普通属性
		for (EbParaValue ebParaValue : paraList) {
			ebParaValue.setItemId(itemId);
			ebParaValueMapper.insert(ebParaValue);
		}

		for (EbSku ebSku : ebSkus) {
			ebSku.setItemId(itemId);
			// 保存商品特殊属性
			ebSkuMapper.insert(ebSku);
			// 保存特殊属性的id
			for (EbSpecValue ebSpecValue : ebSku.getEbSpecValues()) {
				ebSpecValue.setSkuId(ebSku.getSkuId());
				ebSpecValueMapper.insert(ebSpecValue);
			}
		}

	}

	@Override
	public void auditItem(Long itemId, Short auditStatus, String itemNote) {
		// 更新状态
		EbItem ebItem = new EbItem();
		ebItem.setItemId(itemId);
		ebItem.setAuditStatus(auditStatus);
		ebItemMapper.updateByPrimaryKeySelective(ebItem);
		// 保存商品大字段
		EbConsoleLog ebConsoleLog = new EbConsoleLog();
		ebConsoleLog.setEntityId(itemId);
		ebConsoleLog.setEntityName("商品表");
		ebConsoleLog.setNotes(itemNote);
		ebConsoleLog.setOpTime(new Date());
		ebConsoleLog.setOpType("审核");
		ebConsoleLog.setTableName("EB_ITEM");
		ebConsoleLog.setUserId(1l);
		ebConsoleLogMapper.insert(ebConsoleLog);
	}

	@Override
	public void showItem(Long itemId, Short showStatus, String notes) {
		// 更新状态
		EbItem ebItem = new EbItem();
		ebItem.setItemId(itemId);
		ebItem.setShowStatus(showStatus);
		ebItemMapper.updateByPrimaryKeySelective(ebItem);
		// 操作日记
		EbConsoleLog log = new EbConsoleLog();
		log.setEntityId(itemId);
		log.setEntityName("商品表");
		log.setNotes(notes);
		log.setOpTime(new Date());
		log.setOpType("上下架");
		log.setTableName("EB_ITEM");
		log.setUserId(1l);
		ebConsoleLogMapper.insert(log);
	}

	/*
	 * 前台进行solr条件查询
	 * 
	 * @see com.wjw.ecps.service.EbItemService#selectByQurey(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<EbItem> selectByQurey(String price, String brandId, String featValues, String keyWords) throws Exception {
		HttpSolrClient solrClient = ECPSUtils.getSolrClient();
		// 创建查询的类
		SolrQuery query = new SolrQuery();
		// 进行金钱的筛选
		if (StringUtils.isNotBlank(price)) {
			String[] priceArr = price.split("-");
			query.set("fq", "sku_price:[" + priceArr[0] + " TO " + priceArr[1] + " ]");
		}
		// 进行普通筛选
		String qrStr = "*:*";
		if (StringUtils.isNotBlank(brandId)) {
			qrStr = "brand_id:" + brandId;
		}
		// 关键字
		if (StringUtils.isNotBlank(keyWords)) {
			if (qrStr == "*:*") {
				qrStr = "item_keywords:" + keyWords;
			} else {
				qrStr = qrStr + " AND item_keywords:" + keyWords;
			}
		}
		// 属性

		if (StringUtils.isNotBlank(featValues)) {
			String[] paraValArr = featValues.split(",");

			String paraValsQuery = "";
			for (String paraVal : paraValArr) {
				paraValsQuery = paraValsQuery + "para_vals:" + paraVal + " AND ";
			}
			// 去掉最后一个AND
			paraValsQuery = paraValsQuery.substring(0, paraValsQuery.lastIndexOf(" AND "));

			if (StringUtils.equals(qrStr, "*:*")) {
				qrStr = paraValsQuery;
			} else {
				qrStr = qrStr + " AND " + paraValsQuery;
			}

		}
		query.setQuery(qrStr);

		// 对id倒叙
		query.setSort("id", ORDER.desc);
		// 进行高亮查询
		query.addHighlightField("item_name");
		query.addHighlightField("promotion");
		// 对高亮字段前面加上
		query.setHighlightSimplePre("<font color='red'>");
		query.setHighlightSimplePost("</font>");
		// 对进行查询
		QueryResponse response = solrClient.query(query);
		SolrDocumentList results = response.getResults();
		List<EbItem>itemList=new ArrayList<>();
		for(SolrDocument sd : results){
			String itemId = (String) sd.getFieldValue("id");
			String itemName = (String) sd.getFieldValue("item_name");
			String promotion = (String) sd.getFieldValue("promotion");
			String imgs = (String) sd.getFieldValue("imgs");
			String skuPrice = sd.getFieldValue("sku_price").toString();
			//{1001:item_name:["<font>.."]}
			Map<String, Map<String, List<String>>>  hlMap = response.getHighlighting();
			if(hlMap != null){
				Map<String, List<String>> listMap = hlMap.get(itemId);
				if(listMap != null){
					List<String> iList = listMap.get("item_name");
					if(iList != null && iList.size() > 0){
						String hlStr = "";
						for(String hl : iList){
							hlStr = hlStr + hl;
						}
						itemName = hlStr;
					}
					List<String> pList = listMap.get("promotion");
					if(pList != null && pList.size() > 0){
						String hlStr = "";
						for(String hl : pList){
							hlStr = hlStr + hl;
						}
						promotion = hlStr;
					}
				}
			}
			
			EbItem item = new EbItem();
			item.setItemId(new Long(itemId));
			item.setItemName(itemName);
			item.setPromotion(promotion);
			item.setImgs(imgs);
			item.setSkuPrice(new Double(skuPrice));
			itemList.add(item);
		}
		return itemList;
	}

	@Override
	public EbItem selectByPrimaryKey(Long itemId) {
		// TODO Auto-generated method stub
		return ebItemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public EbItem selectItemDetailById(Long itemId) {
		// TODO Auto-generated method stub
		return ebItemMapper.selectItemDetailById(itemId);
	}

	@Override
	public String publsihItem(Long itemId, String password) {
			//创建服务访问点集合的对象
			EbWSItemServiceService wSItemServiceService = new EbWSItemServiceService();
			//调用get加上服务访问点的name（EbWSItemServicePort），getEbWSItemServicePort获得到服务访问的类
			 EbWSItemService service = wSItemServiceService.getEbWSItemServicePort();
			return service.publishItem(itemId, password);
	}
	
	
}

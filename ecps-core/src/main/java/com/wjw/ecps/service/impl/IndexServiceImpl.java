package com.wjw.ecps.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbItemMapper;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.service.IndexService;
import com.wjw.ecps.util.ECPSUtils;
@Service
public class IndexServiceImpl implements IndexService {
	@Autowired
	private EbItemMapper ebItemMapper;
	
	@Override
	public void importIndex() throws Exception {
		//找到集合
		List<EbItem> ebItems = ebItemMapper.selectIsSelectItemList();
		//获取solr客户端
		HttpSolrClient solrClient = ECPSUtils.getSolrClient();
		for(EbItem ebItem:ebItems)
		{
			//创建一个文档对象
			SolrInputDocument document=new SolrInputDocument();
			document.addField("id", ebItem.getItemId());
			document.addField("item_name", ebItem.getItemName());
			document.addField("brand_id", ebItem.getBrandId());
			document.addField("sku_price", ebItem.getSkuPrice());
			document.addField("promotion", ebItem.getPromotion());
			document.addField("item_keywords", ebItem.getKeywords());
			document.addField("imgs", ebItem.getImgs());
			//可选属性值
			String paraValue="";
			for (EbParaValue ebParaValue:ebItem.getEbParaValues()) {
				paraValue=paraValue+ebParaValue.getParaValue()+",";
			}
			document.addField("para_vals", paraValue);
			//把文档加入
			solrClient.add(document);
		}
		solrClient.commit();
		solrClient.close();
	}
	
	
}

package com.wjw.ecps.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbBrandExample;
import com.wjw.ecps.model.EbBrandExample.Criteria;
import com.wjw.ecps.model.EbFeature;
import com.wjw.ecps.model.EbFeatureExample;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbItemClob;
import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.model.EbSku; 
import com.wjw.ecps.model.EbSpecValue;
import com.wjw.ecps.model.Page;
import com.wjw.ecps.model.query.EbItemQuery;
import com.wjw.ecps.service.EbFeatureService;
import com.wjw.ecps.service.EbItemService;
import com.wjw.ecps.util.ECPSUtils;
import com.wjw.ecps.service.EbBrandService;
@Controller
// 配置访问路径前缀 
@RequestMapping("item")
public class EbItemController {
	@Autowired
	private EbBrandService ebBrandService;
	@Autowired
	private EbItemService ebItemService;
	@Autowired
	private EbFeatureService ebFeatureService;

	@RequestMapping("index")
	public String index() {
		return "item/index";
	}

	@RequestMapping("listBrand")
	public String listBrand(Model model) {
		// 查询所有信息
		List<EbBrand> ebBrands = ebBrandService.selectByExample(null);
		model.addAttribute("item", ebBrands);
		return "item/listbrand";
	}

	@RequestMapping("toAddBrand")
	public String toAddBrand() {
		return "item/addbrand";
	}

	@RequestMapping("validateName")
	public void validateName(HttpServletResponse response, String brandName) throws IOException {
		EbBrandExample ebBrandExample = new EbBrandExample();
		Criteria criteria = ebBrandExample.createCriteria();
		criteria.andBrandNameEqualTo(brandName);
		int size = ebBrandService.selectByExample(ebBrandExample).size();
		if (size > 0)
			response.getWriter().write("no");
		else
			response.getWriter().write("yes");

	}

	@RequestMapping("addBrand")
	public String addBrand(EbBrand ebBrand) {
		ebBrandService.insert(ebBrand);
		return "redirect:listBrand.do";
	}

	@RequestMapping("listItems")
	public String listItems(EbItemQuery eq, Model model) {
		// 如果是跳转页
		if (eq.getPageNo() == null) {
			eq.setPageNo(1);
		}
		// 查询所有信息
		List<EbBrand> ebBrands = ebBrandService.selectByExample(null);
		// 查询
		Page page = ebItemService.getPageByQurey(eq);
		// 返回查询结果
		model.addAttribute("page", page);
		model.addAttribute("ebBrands", ebBrands);

		// 返回查询条件
		model.addAttribute("ebq", eq);
		return "item/list";
	}

	@RequestMapping("toAddItem")
	public String toAddItem(Model model) {
		// 查询所有信息
		List<EbBrand> ebBrands = ebBrandService.selectByExample(null);
		model.addAttribute("ebBrands", ebBrands);
		EbFeatureExample example = new EbFeatureExample();
		com.wjw.ecps.model.EbFeatureExample.Criteria criteria = example.createCriteria();
		// 查询普通属性
		criteria.andIsSpecEqualTo((short) 0);
		List<EbFeature> noSpec = ebFeatureService.selectByExample(example);
		// 查询特殊属性
		EbFeatureExample example01 = new EbFeatureExample();
		com.wjw.ecps.model.EbFeatureExample.Criteria criteria01 = example01.createCriteria();
		criteria01.andIsSpecEqualTo((short) 1);
		List<EbFeature> specList = ebFeatureService.selectByExample(example01);
		model.addAttribute("specList", specList);
		model.addAttribute("paraList", noSpec);
		return "item/addItem";
	}

	@RequestMapping("saveItem")
	public String saveItem(HttpServletRequest request, EbItem ebItem, EbItemClob ebItemClob, Integer divNum) {

		// 生成商品的编号
		ebItem.setItemNo(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
		// 封装信息
		EbFeatureExample example = new EbFeatureExample();
		com.wjw.ecps.model.EbFeatureExample.Criteria criteria = example.createCriteria();
		// 查询普通属性
		criteria.andIsSpecEqualTo((short) 0);
		List<EbFeature> noSpec = ebFeatureService.selectByExample(example);
		List<EbParaValue> eList = new ArrayList<>();
		for (EbFeature ebFeature : noSpec) {
			// 创建实列
			EbParaValue ebParaValue = new EbParaValue();
			// 先判断是否是多选
			if (ebFeature.getInputType() == 3) {
				String[] values = request.getParameterValues(ebFeature.getFeatureId() + "");
				if (values != null && values.length > 0) {
					String valueAll = "";
					for (String value : values) {
						valueAll = valueAll + value + ",";
					}
					valueAll.substring(0, valueAll.length() - 1);
					ebParaValue.setParaValue(valueAll);
					//保存普通属性id
					ebParaValue.setFeatureId(ebFeature.getFeatureId());
					//保存商品id
					ebParaValue.setItemId(ebItem.getItemId());
					// 接收到的普通属性放入集合
					eList.add(ebParaValue);
				}
			} else {
				// 因为前台的name是id 我们根据id来接受
				String value = request.getParameter(ebFeature.getFeatureId() + "");
				if (StringUtils.isNotBlank(value))
				{
					ebParaValue.setParaValue(value);
					//保存普通属性id
					ebParaValue.setFeatureId(ebFeature.getFeatureId());
					//保存商品id
					ebParaValue.setItemId(ebItem.getItemId());
					// 接收到的普通属性放入集合
					eList.add(ebParaValue);
				}
					
			}
			
		}
		// 创建订单集合
		List<EbSku> eSkus = new ArrayList<>();
		List<EbSpecValue> ebSpecValues = new ArrayList<>();
		// 对特殊字段的接收
		for (int i = 1; i <= divNum; i++) {
			// 必填字段的校验
			String skuPrice = request.getParameter("skuPrice" + i);
			String stockInventory = request.getParameter("stockInventory" + i);
			// 进行判空
			if (StringUtils.isNotBlank(skuPrice) && StringUtils.isNotBlank(skuPrice)) {
				String sort = request.getParameter("sort" + i);
				String marketPrice = request.getParameter("marketPrice" + i);
				String skuUpperLimit = request.getParameter("skuUpperLimit" + i);
				String sku = request.getParameter("sku" + i);
				String location = request.getParameter("location" + i);
				String skuType = request.getParameter("skuType" + i);
				String showStatus = request.getParameter("showStatus" + i);
				EbSku ebSku = new EbSku();
				if (StringUtils.isNotBlank(sort))
					ebSku.setSkuSort(new Integer(sort));
				if (StringUtils.isNotBlank(marketPrice))
					ebSku.setMarketPrice(new BigDecimal(marketPrice));
				if (StringUtils.isNotBlank(skuUpperLimit))
					ebSku.setSkuUpperLimit(new Integer(skuUpperLimit));
				if (StringUtils.isNotBlank(showStatus))
					ebSku.setShowStatus(new Short(showStatus));
				if (StringUtils.isNotBlank(skuType))
					ebSku.setSkuType(new Short(skuType));
				ebSku.setSku(sku);
				ebSku.setLocation(location);
				ebSku.setSkuPrice(new BigDecimal(skuPrice));
				ebSku.setStockInventory(new Integer(stockInventory));
				/*--------------------------封装特殊属性id------------------------------------*/
				// 查询特殊属性
				EbFeatureExample example01 = new EbFeatureExample();
				com.wjw.ecps.model.EbFeatureExample.Criteria criteria01 = example01.createCriteria();
				criteria01.andIsSpecEqualTo((short) 1);
				List<EbFeature> specList = ebFeatureService.selectByExample(example01);
			
				for (EbFeature ebFeature : specList) {
					EbSpecValue ebSpecValue = new EbSpecValue();
					String radio = request.getParameter(ebFeature.getFeatureId() + "specradio" + i);
					// 设置参数
					ebSpecValue.setSpecValue(radio);
					ebSpecValue.setFeatureId(ebFeature.getFeatureId());
					ebSpecValues.add(ebSpecValue);
				}
				ebSku.setEbSpecValues(ebSpecValues);
				eSkus.add(ebSku);
			}
		}
		//入库
		ebItemService.saveItem(ebItem, ebItemClob,eSkus, eList);
		return "redirect:listItems.do";
	}

	@RequestMapping("listAudit")
	public String aduitItem(EbItemQuery eq, Model model) {
		// 如果是跳转页
		if (eq.getPageNo() == null) {
			eq.setPageNo(1);
		}
		// 查询所有信息
		List<EbBrand> ebBrands = ebBrandService.selectByExample(null);
		// 查询
		Page page = ebItemService.getPageByQurey(eq);
		// 返回查询结果
		model.addAttribute("page", page);
		model.addAttribute("ebBrands", ebBrands);

		// 返回查询条件
		model.addAttribute("ebq", eq);
		return "item/listAudit";
	}
	
	@RequestMapping("auditItem")
	public String auditItem(Long itemId, Short auditStatus,String itemNote) {
		//保存修改信息
		ebItemService.auditItem(itemId, auditStatus, itemNote);
		
		return "redirect:listAudit.do?auditStatus=0&showStatus=1";
	}
	

	@RequestMapping("showItem")
	public String showItem(Long itemId, Short showStatus,String notes) {
		//保存修改信息
		ebItemService.showItem(itemId, showStatus, notes);
		int flag=0;
		if (showStatus==0) {
			flag=1;
		}
		return "redirect:listItems.do?auditStatus=1&showStatus="+flag;
	}
	
	@RequestMapping("publishItem.do")
	public void publishItem(Long itemId, PrintWriter out){
		String result = ebItemService.publsihItem(itemId, ECPSUtils.readProp("ws_pass"));
		out.write(result);
	}

}

package com.wjw.ecps.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjw.ecps.dao.EbFeatureMapper;
import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbFeature;
import com.wjw.ecps.model.EbFeatureExample;
import com.wjw.ecps.model.EbFeatureExample.Criteria;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.EbSkuExample;
import com.wjw.ecps.service.EbBrandService;
import com.wjw.ecps.service.EbFeatureService;
import com.wjw.ecps.service.EbItemService;
import com.wjw.ecps.service.EbSkuService;
import com.wjw.ecps.util.ECPSUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	private EbBrandService ebBrandService;
	@Autowired
	private EbFeatureService ebFeatureService;
	@Autowired
	private EbItemService ebItemService;
	@Autowired
	private EbSkuService ebSkuService;
 	@RequestMapping("index")
	public String toIndex(Model model) {
		//查询品牌
		List<EbBrand> eBrands = ebBrandService.selectByExample(null);
		//查询可选择属性
		EbFeatureExample example=new EbFeatureExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIsSelectEqualTo((short)1);
		List<EbFeature> ebFeatures = ebFeatureService.selectByExample(example);
		
		model.addAttribute("ebd",eBrands);
		model.addAttribute("ebf",ebFeatures);
		return "index";
	}
 	
 	@RequestMapping("phoneClassification")
	public String phoneClassification(Model model,String price,String brandId,String featValues,String keyWords) throws Exception {
 		List<EbItem> selectByQurey = ebItemService.selectByQurey(price, brandId, featValues, keyWords);
 		model.addAttribute("itemList",selectByQurey);
 		return "phoneClassification";
 	}
 	
 	@RequestMapping("toProductDetail")
	public String toProductDetail(Long itemId,Model model) {
 		EbItem ebItem = ebItemService.selectItemDetailById(itemId);
 		
 		model.addAttribute("item", ebItem);
 		return "productDetail";
 	}
 	@RequestMapping("ajaxGetSkuById")
 	public void ajaxGetSkuById(HttpServletResponse response,Long skuId)
 	{
 		EbSku sku = ebSkuService.selectByPrimaryKey(skuId);
 		JSONObject jsonObject = new JSONObject();
 		jsonObject.accumulate("sku", sku);
 		ECPSUtils.printAjax(response, jsonObject.toString());
 	}
	
	
}

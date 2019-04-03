package com.wjw.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.query.EbItemQuery;
import com.wjw.ecps.service.EbItemService;
import com.wjw.ecps.service.EbRedisService;
import com.wjw.ecps.service.IndexService;
import com.wjw.ecps.util.ECPSUtils;
import com.wjw.ecps.util.FMutil;
import com.wjw.ecps.util.MD5;



public class EbItems {
	static ApplicationContext	context=	new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
	static EbItemService	ebItemService =  context.getBean(EbItemService.class);
	static EbRedisService ebRedisService=context.getBean(EbRedisService.class);
	static IndexService indexService = context.getBean(IndexService.class);
	public static void main(String[] args) throws Exception {
		ebRedisService.importEbShipAddr();
	}

	public static void testSelectByExample() {
		int selectCountByQuery = ebItemService.selectCountByQuery(new EbItemQuery());
		System.out.println(selectCountByQuery);
	}
	
	public static void importIndex() {
		try {
			indexService.importIndex();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void md5() {
	System.out.println(MD5.GetMD5Code("123"));
	}

	
	public static void Fm() throws Exception {
		EbItem item = ebItemService.selectItemDetailById(3087l);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("item", item);
		map.put("path", ECPSUtils.readProp("portal_path"));
		map.put("request_file_path", ECPSUtils.readProp("request_file_path"));
		FMutil.ouputFile("productDetail.ftl", item.getItemId()+".html", map);
		}
	
	public static void importEbSkuToRedids() throws Exception {
	ebRedisService.importEbSkuToRedids();
	}
	
	public static void updateItem() throws Exception {
	
		
		}
}

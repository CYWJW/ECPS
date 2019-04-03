package com.wjw.ecps.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbBrandExample;
import com.wjw.ecps.model.EbRegion;
import com.wjw.ecps.service.EbBrandService;
import com.wjw.ecps.service.EbregionService;

public class EbBrandServiceImplTest {

	static ApplicationContext	context=	new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
	static EbBrandService service=	context.getBean(EbBrandService.class);
	public static void main(String[] args) {
		getEbRegion();
	}
	
	public static void getEbRegion() {
		service.selectByExample(null);
		System.out.println(service.selectByExample(new EbBrandExample()));
	}
	
}

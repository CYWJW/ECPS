package com.wjw.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbBrandExample;
import com.wjw.ecps.model.EbBrandExample.Criteria;
import com.wjw.ecps.service.EbBrandService;

public class EbBrandServiceTest {
	static ApplicationContext	context=	new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
	static EbBrandService	ebBrandService =  context.getBean(EbBrandService.class);
	
	public static void main(String[] args) {
		testSelectByExample01();
	}

	@Test
	public static void testSelectByExample() {
		
		EbBrand selectByTest01 = ebBrandService.selectByTest01(11);
		
		
		System.out.println(selectByTest01);
	}
	
	@Test
	public static void testSelectByExample01() {
		
		EbBrand selectByTest01 = ebBrandService.selectByTest02("1 ");
		
		
		System.out.println(selectByTest01);
	}

}

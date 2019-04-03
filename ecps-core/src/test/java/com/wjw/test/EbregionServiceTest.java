package com.wjw.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjw.ecps.service.EbregionService;
//指定运行器和文件
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ApplicationContext.xml")
public class EbregionServiceTest {
	@Autowired
	EbregionService ebregionService;
	@Test
	public void testCountByExample() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testSelectByPrimaryKey() {
	}

	@Test
	public void testUpdateByExample() {
	}

}

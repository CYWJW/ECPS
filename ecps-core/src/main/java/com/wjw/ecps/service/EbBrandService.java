package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbBrandExample;

public interface EbBrandService {
	int countByExample(EbBrandExample example);

	int deleteByExample(EbBrandExample example);

	int deleteByPrimaryKey(Long brandId);

	int insert(EbBrand record);

	int insertSelective(EbBrand record);

	List<EbBrand> selectByExample(EbBrandExample example);

	EbBrand selectByPrimaryKey(Long brandId);

	int updateByExampleSelective(@Param("record") EbBrand record, @Param("example") EbBrandExample example);

	int updateByExample(@Param("record") EbBrand record, @Param("example") EbBrandExample example);

	int updateByPrimaryKeySelective(EbBrand record);

	int updateByPrimaryKey(EbBrand record);

	EbBrand selectByTest01(Object brandId);

	EbBrand selectByTest02(Object brandId);
}

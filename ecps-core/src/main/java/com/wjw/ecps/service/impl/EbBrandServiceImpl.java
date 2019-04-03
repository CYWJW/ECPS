package com.wjw.ecps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbBrandMapper;
import com.wjw.ecps.model.EbBrand;
import com.wjw.ecps.model.EbBrandExample;
import com.wjw.ecps.service.EbBrandService;
@Service
public class EbBrandServiceImpl implements EbBrandService {
	@Autowired
	private	EbBrandMapper ebBrandMapper;
	
	@Override
	public int countByExample(EbBrandExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(EbBrandExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long brandId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(EbBrand record) {
		// TODO Auto-generated method stub
		return ebBrandMapper.insert(record);
	}

	@Override
	public int insertSelective(EbBrand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EbBrand> selectByExample(EbBrandExample example) {
		return ebBrandMapper.selectByExample(example);
	}

	@Override
	public EbBrand selectByPrimaryKey(Long brandId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(EbBrand record, EbBrandExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EbBrand record, EbBrandExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbBrand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EbBrand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EbBrand selectByTest01(Object brandId) {
		// TODO Auto-generated method stub
		return ebBrandMapper.selectByTest01(brandId);
	}

	@Override
	public EbBrand selectByTest02(Object brandId) {
		// TODO Auto-generated method stub
		return ebBrandMapper.selectByTest02(brandId);
	}

}

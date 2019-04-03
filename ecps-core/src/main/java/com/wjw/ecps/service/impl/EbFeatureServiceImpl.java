package com.wjw.ecps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbFeatureMapper;
import com.wjw.ecps.model.EbFeature;
import com.wjw.ecps.model.EbFeatureExample;
import com.wjw.ecps.service.EbFeatureService;
@Service
public class EbFeatureServiceImpl implements EbFeatureService {
	@Autowired
	EbFeatureMapper featureMapper;
	
	@Override
	public int countByExample(EbFeatureExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(EbFeatureExample example) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long featureId) {
		return 0;
	}

	@Override
	public int insert(EbFeature record) {
		return 0;
	}

	@Override
	public int insertSelective(EbFeature record) {
		return 0;
	}

	@Override
	public List<EbFeature> selectByExample(EbFeatureExample example) {
		return featureMapper.selectByExample(example);
	}

	@Override
	public EbFeature selectByPrimaryKey(Long featureId) {
		return null;
	}

	@Override
	public int updateByExampleSelective(EbFeature record, EbFeatureExample example) {
		return 0;
	}

	@Override
	public int updateByExample(EbFeature record, EbFeatureExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbFeature record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EbFeature record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

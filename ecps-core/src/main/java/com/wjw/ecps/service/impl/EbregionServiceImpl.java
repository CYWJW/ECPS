package com.wjw.ecps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbRegionMapper;
import com.wjw.ecps.model.EbRegion;
import com.wjw.ecps.model.EbRegionExample;
import com.wjw.ecps.service.EbregionService;
@Service
public class EbregionServiceImpl implements EbregionService {
	@Autowired
	private	EbRegionMapper ebRegionMapper;
	@Override
	public int countByExample(EbRegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(EbRegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long regionId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(EbRegion record) {
		// TODO Auto-generated method stub
		return ebRegionMapper.insert(record);
	}

	@Override
	public int insertSelective(EbRegion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EbRegion> selectByExample(EbRegionExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EbRegion selectByPrimaryKey(Long regionId) {
		// TODO Auto-generated method stub
		return ebRegionMapper.selectByPrimaryKey(regionId);
	}

	@Override
	public int updateByExampleSelective(EbRegion record, EbRegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EbRegion record, EbRegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbRegion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EbRegion record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package com.wjw.ecps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbParaValueMapper;
import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.model.EbParaValueExample;
import com.wjw.ecps.model.EbSpecValue;
import com.wjw.ecps.service.EbParaValueService;
@Service
public class EbParaValueServiceImpl implements EbParaValueService {
	@Autowired
	private EbParaValueMapper ebParaValueMapper;

	@Override
	public int countByExample(EbParaValueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(EbParaValueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(EbParaValue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EbParaValue> selectByExample(EbParaValueExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EbParaValue selectByPrimaryKey(Long paraId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(EbParaValue record, EbParaValueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EbParaValue record, EbParaValueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbParaValue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EbParaValue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long paraId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(EbParaValue record) {
		// TODO Auto-generated method stub
		return ebParaValueMapper.insert(record);
	}

}

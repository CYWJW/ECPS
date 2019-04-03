package com.wjw.ecps.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbItemClobMapper;
import com.wjw.ecps.model.EbItemClob;
import com.wjw.ecps.service.EbItemClobService;
@Service
public class EbItemClobServiceImpl implements EbItemClobService {
	@Autowired
	private EbItemClobMapper ebItemClobMapper;
	
	@Override
	public int insert(EbItemClob record) {
		return ebItemClobMapper.insert(record);
	}

}

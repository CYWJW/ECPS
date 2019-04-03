package com.wjw.ecps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.AreaMapper;
import com.wjw.ecps.model.Area;
import com.wjw.ecps.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper areaMapper;

	@Override
	public List<Area> selectAddrByPreId(Long prentId) {
		return areaMapper.selectAddrByPreId(prentId);
	}

}

package com.wjw.ecps.service;

import java.util.List;

import com.wjw.ecps.model.Area;

public interface AreaService {
	 List<Area> selectAddrByPreId(Long prentId);
}

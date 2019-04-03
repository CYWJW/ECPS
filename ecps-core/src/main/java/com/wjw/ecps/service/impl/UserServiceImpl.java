package com.wjw.ecps.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.TsPtlUserMapper;
import com.wjw.ecps.model.TsPtlUser;
import com.wjw.ecps.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TsPtlUserMapper tsPtlUserMapper;
	
	@Override
	public TsPtlUser selectUserByUserAndPass(Map<String, String> map) {
		return tsPtlUserMapper.selectUserByUserAndPass(map);
	}

}

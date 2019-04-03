package com.wjw.ecps.service;

import java.util.Map;

import com.wjw.ecps.model.TsPtlUser;

public interface UserService {
	TsPtlUser selectUserByUserAndPass(Map<String, String> map);
}

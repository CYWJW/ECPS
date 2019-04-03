package com.wjw.ecps.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbShipAddrMapper;
import com.wjw.ecps.model.EbShipAddr;
import com.wjw.ecps.model.EbShipAddrExample;
import com.wjw.ecps.service.EbShipAddrService;
import com.wjw.ecps.util.ECPSUtils;

import redis.clients.jedis.Jedis;
@Service
public class EbShipAddrServiceImpl implements EbShipAddrService {
	@Autowired
	private EbShipAddrMapper ebShipAddrMapper;
	
	@Override
	public List<EbShipAddr> selectAddrByUserId(Long userID) {
		return ebShipAddrMapper.selectAddrByUserId(userID);
	}

	@Override
	public int countByExample(EbShipAddrExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public EbShipAddr selectAddrByIdWithRedis(Long userId, Long addrId) {
		Jedis jedis = new Jedis(ECPSUtils.readProp("redis_ip"), new Integer(ECPSUtils.readProp("redis_port")));
		String shipName = jedis.hget("user:"+userId+":addr:" +addrId, "shipName");
		String province = jedis.hget("user:"+userId+":addr:" +addrId, "province");
		String city = jedis.hget("user:"+userId+":addr:" +addrId, "city");
		String district = jedis.hget("user:"+userId+":addr:" +addrId, "district");
		String addr = jedis.hget("user:"+userId+":addr:" +addrId, "addr");
		String zipCode = jedis.hget("user:"+userId+":addr:" +addrId, "zipCode");
		String phone = jedis.hget("user:"+userId+":addr:" +addrId, "phone");
		String defaultAddr = jedis.hget("user:"+userId+":addr:" +addrId, "defaultAddr");
		EbShipAddr addrObj = new EbShipAddr();
		addrObj.setShipAddrId(new Long(addrId));
		addrObj.setShipName(shipName);
		addrObj.setProvince(province);
		addrObj.setCity(city);
		addrObj.setDistrict(district);
		addrObj.setAddr(addr);
		addrObj.setZipCode(zipCode);
		addrObj.setPhone(phone);
		addrObj.setDefaultAddr(new Short(defaultAddr));
		return addrObj;
	}


	@Override
	public int insert(EbShipAddr record) {
		// TODO Auto-generated method stub
		return ebShipAddrMapper.insert(record);
	}

	@Override
	public int insertSelective(EbShipAddr record) {
		// TODO Auto-generated method stub
		return ebShipAddrMapper.insertSelective(record);
	}

	@Override
	public List<EbShipAddr> selectByExample(EbShipAddrExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EbShipAddr selectByPrimaryKey(Long shipAddrId) {
		// TODO Auto-generated method stub
		return ebShipAddrMapper.selectByPrimaryKey(shipAddrId);
	}

	@Override
	public int updateByExampleSelective(EbShipAddr record, EbShipAddrExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EbShipAddr record, EbShipAddrExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbShipAddr record) {
		// TODO Auto-generated method stub
		return 		ebShipAddrMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(EbShipAddr record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateBydefAddr(Long userID) {
		ebShipAddrMapper.updateBydefAddr(userID);
	}
	
	public List<EbShipAddr> selectAddrByUserIdWithRedis(Long userId) {
		Jedis jedis = new Jedis(ECPSUtils.readProp("redis_ip"), new Integer(ECPSUtils.readProp("redis_port")));
		List<EbShipAddr> addrList = new ArrayList<EbShipAddr>();
		List<String> addrIds = jedis.lrange("user:"+userId+":addrList", 0, -1);
		for(String addrId : addrIds){
			String shipName = jedis.hget("user:"+userId+":addr:" +addrId, "shipName");
			String province = jedis.hget("user:"+userId+":addr:" +addrId, "province");
			String city = jedis.hget("user:"+userId+":addr:" +addrId, "city");
			String district = jedis.hget("user:"+userId+":addr:" +addrId, "district");
			String addr = jedis.hget("user:"+userId+":addr:" +addrId, "addr");
			String zipCode = jedis.hget("user:"+userId+":addr:" +addrId, "zipCode");
			String phone = jedis.hget("user:"+userId+":addr:" +addrId, "phone");
			String defaultAddr = jedis.hget("user:"+userId+":addr:" +addrId, "defaultAddr");
			EbShipAddr addrObj = new EbShipAddr();
			addrObj.setShipAddrId(new Long(addrId));
			addrObj.setShipName(shipName);
			addrObj.setProvince(province);
			addrObj.setCity(city);
			addrObj.setDistrict(district);
			addrObj.setAddr(addr);
			addrObj.setZipCode(zipCode);
			addrObj.setPhone(phone);
			addrObj.setDefaultAddr(new Short(defaultAddr));
			addrList.add(addrObj);
			
		}
		
		
		return addrList;
	}


}

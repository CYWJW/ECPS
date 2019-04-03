package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbShipAddr;
import com.wjw.ecps.model.EbShipAddrExample;

public interface EbShipAddrService {
	List<EbShipAddr>  selectAddrByUserId(Long userID);
	
    int countByExample(EbShipAddrExample example);

    int insert(EbShipAddr record);

    int insertSelective(EbShipAddr record);

    List<EbShipAddr> selectByExample(EbShipAddrExample example);

    EbShipAddr selectByPrimaryKey(Long shipAddrId);

    int updateByExampleSelective(@Param("record") EbShipAddr record, @Param("example") EbShipAddrExample example);

    int updateByExample(@Param("record") EbShipAddr record, @Param("example") EbShipAddrExample example);

    int updateByPrimaryKeySelective(EbShipAddr record);

    int updateByPrimaryKey(EbShipAddr record);
    
    void updateBydefAddr(Long userID);
    
    List<EbShipAddr> selectAddrByUserIdWithRedis(Long userId) ;
    
    EbShipAddr selectAddrByIdWithRedis(Long userId, Long addrId);
}

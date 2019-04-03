package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbShipAddr;
import com.wjw.ecps.model.EbShipAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbShipAddrMapper {
    int countByExample(EbShipAddrExample example);

    int deleteByExample(EbShipAddrExample example);

    int deleteByPrimaryKey(Long shipAddrId);

    int insert(EbShipAddr record);

    int insertSelective(EbShipAddr record);

    List<EbShipAddr> selectByExample(EbShipAddrExample example);

    EbShipAddr selectByPrimaryKey(Long shipAddrId);

    int updateByExampleSelective(@Param("record") EbShipAddr record, @Param("example") EbShipAddrExample example);

    int updateByExample(@Param("record") EbShipAddr record, @Param("example") EbShipAddrExample example);

    int updateByPrimaryKeySelective(EbShipAddr record);

    int updateByPrimaryKey(EbShipAddr record);
    
    List<EbShipAddr> selectAddrByUserId(Long userID);
    
    void updateBydefAddr(Long userID);
}
package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbOrder;
import com.wjw.ecps.model.EbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbOrderMapper {
    int countByExample(EbOrderExample example);

    int deleteByExample(EbOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(EbOrder record);

    int insertSelective(EbOrder record);

    List<EbOrder> selectByExample(EbOrderExample example);

    EbOrder selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") EbOrder record, @Param("example") EbOrderExample example);

    int updateByExample(@Param("record") EbOrder record, @Param("example") EbOrderExample example);

    int updateByPrimaryKeySelective(EbOrder record);

    int updateByPrimaryKey(EbOrder record);
}
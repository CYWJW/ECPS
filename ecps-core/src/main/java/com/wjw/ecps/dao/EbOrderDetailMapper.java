package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbOrderDetail;
import com.wjw.ecps.model.EbOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbOrderDetailMapper {
    int countByExample(EbOrderDetailExample example);

    int deleteByExample(EbOrderDetailExample example);

    int deleteByPrimaryKey(Long orderDetailId);

    int insert(EbOrderDetail record);

    int insertSelective(EbOrderDetail record);

    List<EbOrderDetail> selectByExample(EbOrderDetailExample example);

    EbOrderDetail selectByPrimaryKey(Long orderDetailId);

    int updateByExampleSelective(@Param("record") EbOrderDetail record, @Param("example") EbOrderDetailExample example);

    int updateByExample(@Param("record") EbOrderDetail record, @Param("example") EbOrderDetailExample example);

    int updateByPrimaryKeySelective(EbOrderDetail record);

    int updateByPrimaryKey(EbOrderDetail record);
}
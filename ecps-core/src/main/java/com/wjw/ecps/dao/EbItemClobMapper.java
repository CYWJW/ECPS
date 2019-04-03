package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbItemClob;
import com.wjw.ecps.model.EbItemClobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbItemClobMapper {
    int countByExample(EbItemClobExample example);

    int deleteByExample(EbItemClobExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(EbItemClob record);

    int insertSelective(EbItemClob record);

    List<EbItemClob> selectByExampleWithBLOBs(EbItemClobExample example);

    List<EbItemClob> selectByExample(EbItemClobExample example);

    EbItemClob selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") EbItemClob record, @Param("example") EbItemClobExample example);

    int updateByExampleWithBLOBs(@Param("record") EbItemClob record, @Param("example") EbItemClobExample example);

    int updateByExample(@Param("record") EbItemClob record, @Param("example") EbItemClobExample example);

    int updateByPrimaryKeySelective(EbItemClob record);

    int updateByPrimaryKeyWithBLOBs(EbItemClob record);
}
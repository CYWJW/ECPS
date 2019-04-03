package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbSpecValue;
import com.wjw.ecps.model.EbSpecValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbSpecValueMapper {
    int countByExample(EbSpecValueExample example);

    int deleteByExample(EbSpecValueExample example);

    int deleteByPrimaryKey(Long specId);

    int insert(EbSpecValue record);

    int insertSelective(EbSpecValue record);

    List<EbSpecValue> selectByExample(EbSpecValueExample example);

    EbSpecValue selectByPrimaryKey(Long specId);

    int updateByExampleSelective(@Param("record") EbSpecValue record, @Param("example") EbSpecValueExample example);

    int updateByExample(@Param("record") EbSpecValue record, @Param("example") EbSpecValueExample example);

    int updateByPrimaryKeySelective(EbSpecValue record);

    int updateByPrimaryKey(EbSpecValue record);
}
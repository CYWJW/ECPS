package com.wjw.ecps.dao;

import com.wjw.ecps.model.TsPtlUser;
import com.wjw.ecps.model.TsPtlUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TsPtlUserMapper {
    int countByExample(TsPtlUserExample example);

    int deleteByExample(TsPtlUserExample example);

    int deleteByPrimaryKey(Long ptlUserId);

    int insert(TsPtlUser record);

    int insertSelective(TsPtlUser record);

    List<TsPtlUser> selectByExample(TsPtlUserExample example);

    TsPtlUser selectByPrimaryKey(Long ptlUserId);

    int updateByExampleSelective(@Param("record") TsPtlUser record, @Param("example") TsPtlUserExample example);

    int updateByExample(@Param("record") TsPtlUser record, @Param("example") TsPtlUserExample example);

    int updateByPrimaryKeySelective(TsPtlUser record);

    int updateByPrimaryKey(TsPtlUser record);
    
    TsPtlUser selectUserByUserAndPass(Map<String, String> map);
}
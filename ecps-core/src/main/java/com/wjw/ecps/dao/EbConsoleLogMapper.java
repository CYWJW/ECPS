package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbConsoleLog;
import com.wjw.ecps.model.EbConsoleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbConsoleLogMapper {
    int countByExample(EbConsoleLogExample example);

    int deleteByExample(EbConsoleLogExample example);

    int deleteByPrimaryKey(Long consoleLogId);

    int insert(EbConsoleLog record);

    int insertSelective(EbConsoleLog record);

    List<EbConsoleLog> selectByExample(EbConsoleLogExample example);

    EbConsoleLog selectByPrimaryKey(Long consoleLogId);

    int updateByExampleSelective(@Param("record") EbConsoleLog record, @Param("example") EbConsoleLogExample example);

    int updateByExample(@Param("record") EbConsoleLog record, @Param("example") EbConsoleLogExample example);

    int updateByPrimaryKeySelective(EbConsoleLog record);

    int updateByPrimaryKey(EbConsoleLog record);
}
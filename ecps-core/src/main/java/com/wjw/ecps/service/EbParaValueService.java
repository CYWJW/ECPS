package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.model.EbParaValueExample;

public interface EbParaValueService {

	   int countByExample(EbParaValueExample example);

	    int deleteByExample(EbParaValueExample example);

	    int deleteByPrimaryKey(Long paraId);

	    int insert(EbParaValue record);

	    int insertSelective(EbParaValue record);

	    List<EbParaValue> selectByExample(EbParaValueExample example);

	    EbParaValue selectByPrimaryKey(Long paraId);

	    int updateByExampleSelective(@Param("record") EbParaValue record, @Param("example") EbParaValueExample example);

	    int updateByExample(@Param("record") EbParaValue record, @Param("example") EbParaValueExample example);

	    int updateByPrimaryKeySelective(EbParaValue record);

	    int updateByPrimaryKey(EbParaValue record);

}

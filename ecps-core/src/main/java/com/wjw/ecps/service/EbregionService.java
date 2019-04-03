package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbRegion;
import com.wjw.ecps.model.EbRegionExample;

public interface EbregionService {

	int countByExample(EbRegionExample example);

    int deleteByExample(EbRegionExample example);

    int deleteByPrimaryKey(Long regionId);

    int insert(EbRegion record);

    int insertSelective(EbRegion record);

    List<EbRegion> selectByExample(EbRegionExample example);

    EbRegion selectByPrimaryKey(Long regionId);

    int updateByExampleSelective(@Param("record") EbRegion record, @Param("example") EbRegionExample example);

    int updateByExample(@Param("record") EbRegion record, @Param("example") EbRegionExample example);

    int updateByPrimaryKeySelective(EbRegion record);

    int updateByPrimaryKey(EbRegion record);

}

package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbFeature;
import com.wjw.ecps.model.EbFeatureExample;
import com.wjw.ecps.model.EbRegion;
import com.wjw.ecps.model.EbRegionExample;

public interface EbFeatureService {
	int countByExample(EbFeatureExample example);

    int deleteByExample(EbFeatureExample example);

    int deleteByPrimaryKey(Long featureId);

    int insert(EbFeature record);

    int insertSelective(EbFeature record);

    List<EbFeature> selectByExample(EbFeatureExample example);

    EbFeature selectByPrimaryKey(Long featureId);

    int updateByExampleSelective(@Param("record") EbFeature record, @Param("example") EbFeatureExample example);

    int updateByExample(@Param("record") EbFeature record, @Param("example") EbFeatureExample example);

    int updateByPrimaryKeySelective(EbFeature record);

    int updateByPrimaryKey(EbFeature record);

}

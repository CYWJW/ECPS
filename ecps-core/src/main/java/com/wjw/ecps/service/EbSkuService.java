package com.wjw.ecps.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.EbSkuExample;

public interface EbSkuService {

	int countByExample(EbSkuExample example);

    int deleteByExample(EbSkuExample example);

    int deleteByPrimaryKey(Long skuId);

    int insert(EbSku record);

    int insertSelective(EbSku record);

    List<EbSku> selectByExample(EbSkuExample example);

    EbSku selectByPrimaryKey(Long skuId);

    int updateByExampleSelective(@Param("record") EbSku record, @Param("example") EbSkuExample example);

    int updateByExample(@Param("record") EbSku record, @Param("example") EbSkuExample example);

    int updateByPrimaryKeySelective(EbSku record);

    int updateByPrimaryKey(EbSku record);
    
    EbSku getSkuDetailByIdWithRedis(Long skuId);

}

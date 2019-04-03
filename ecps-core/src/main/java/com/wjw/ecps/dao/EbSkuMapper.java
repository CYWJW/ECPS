package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.EbSkuExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EbSkuMapper {
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
    
    List<EbSku>	selectSkuList();
    
    List<EbSku> selectSkuDetailList();
    
    int updateStock(Map<String, Object> map);
}
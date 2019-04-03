package com.wjw.ecps.dao;

import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbItemExample;
import com.wjw.ecps.model.query.EbItemQuery;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbItemMapper {
    int countByExample(EbItemExample example);

    int deleteByExample(EbItemExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(EbItem record);

    int insertSelective(EbItem record);

    List<EbItem> selectByExample(EbItemExample example);

    EbItem selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") EbItem record, @Param("example") EbItemExample example);

    int updateByExample(@Param("record") EbItem record, @Param("example") EbItemExample example);

    int updateByPrimaryKeySelective(EbItem record);

    int updateByPrimaryKey(EbItem record);
    
    int selectCountByQuery(EbItemQuery eq);
    
    List<EbItem> selectItemsByQuery (EbItemQuery eq);
    
    List<EbItem> selectIsSelectItemList();
    
    EbItem selectItemDetailById(Long itemId);

}
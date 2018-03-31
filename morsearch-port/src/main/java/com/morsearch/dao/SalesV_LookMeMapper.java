package com.morsearch.dao;

import com.morsearch.model.SalesV_LookMe;
import com.morsearch.model.SalesV_LookMeExample;
import java.util.List;
import java.util.Map;

import com.morsearch.model.Sales_LookMe;
import org.apache.ibatis.annotations.Param;

public interface SalesV_LookMeMapper {
    int countByExample(SalesV_LookMeExample example);

    int deleteByExample(SalesV_LookMeExample example);

    int insert(SalesV_LookMe record);

    int insertSelective(SalesV_LookMe record);

    List<SalesV_LookMe> selectByExample(SalesV_LookMeExample example);

    int updateByExampleSelective(@Param("record") SalesV_LookMe record, @Param("example") SalesV_LookMeExample example);

    int updateByExample(@Param("record") SalesV_LookMe record, @Param("example") SalesV_LookMeExample example);

    List<SalesV_LookMe> getLookList(Map<String, Object> map);

    int getLookListCount(Map<String, Object> map);
}
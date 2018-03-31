package com.morsearch.dao;

import com.morsearch.model.Sales_LookMe;
import com.morsearch.model.Sales_LookMeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_LookMeMapper {
    int countByExample(Sales_LookMeExample example);

    int deleteByExample(Sales_LookMeExample example);

    int deleteByPrimaryKey(Long sl_id);

    int insert(Sales_LookMe record);

    int insertSelective(Sales_LookMe record);

    List<Sales_LookMe> selectByExample(Sales_LookMeExample example);

    Sales_LookMe selectByPrimaryKey(Long sl_id);

    int updateByExampleSelective(@Param("record") Sales_LookMe record, @Param("example") Sales_LookMeExample example);

    int updateByExample(@Param("record") Sales_LookMe record, @Param("example") Sales_LookMeExample example);

    int updateByPrimaryKeySelective(Sales_LookMe record);

    int updateByPrimaryKey(Sales_LookMe record);



}
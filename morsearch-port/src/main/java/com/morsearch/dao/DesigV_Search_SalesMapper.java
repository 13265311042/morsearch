package com.morsearch.dao;

import com.morsearch.model.DesigV_Search_Sales;
import com.morsearch.model.DesigV_Search_SalesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Search_SalesMapper {
    int countByExample(DesigV_Search_SalesExample example);

    int deleteByExample(DesigV_Search_SalesExample example);

    int insert(DesigV_Search_Sales record);

    int insertSelective(DesigV_Search_Sales record);

    List<DesigV_Search_Sales> selectByExample(DesigV_Search_SalesExample example);

    int updateByExampleSelective(@Param("record") DesigV_Search_Sales record, @Param("example") DesigV_Search_SalesExample example);

    int updateByExample(@Param("record") DesigV_Search_Sales record, @Param("example") DesigV_Search_SalesExample example);

        /*自定义*/
    List<DesigV_Search_Sales> getDesigV_Search_SalesList(Map<String, Object> map);//列表

    int getCountDesigV_Search_Sales(Map<String, Object> map);//总数
}
package com.morsearch.dao;

import com.morsearch.model.DesigV_Home_Sales;
import com.morsearch.model.DesigV_Home_SalesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Home_SalesMapper {
    int countByExample(DesigV_Home_SalesExample example);

    int deleteByExample(DesigV_Home_SalesExample example);

    int insert(DesigV_Home_Sales record);

    int insertSelective(DesigV_Home_Sales record);

    List<DesigV_Home_Sales> selectByExample(DesigV_Home_SalesExample example);

    int updateByExampleSelective(@Param("record") DesigV_Home_Sales record, @Param("example") DesigV_Home_SalesExample example);

    int updateByExample(@Param("record") DesigV_Home_Sales record, @Param("example") DesigV_Home_SalesExample example);

    //自定义
    List<DesigV_Home_Sales> getDesigV_Home_SalesList(Map<String, Object> map);//设计师首页业务员列表

    Integer getDesigV_Home_SalesListCount(Map<String, Object> map);//设计师首页业务员数量
}
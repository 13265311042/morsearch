package com.morsearch.dao;

import com.morsearch.model.Sales_Appeal;
import com.morsearch.model.Sales_AppealExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_AppealMapper {
    int countByExample(Sales_AppealExample example);

    int deleteByExample(Sales_AppealExample example);

    int deleteByPrimaryKey(Long sp_id);

    int insert(Sales_Appeal record);

    int insertSelective(Sales_Appeal record);

    List<Sales_Appeal> selectByExample(Sales_AppealExample example);

    Sales_Appeal selectByPrimaryKey(Long sp_id);

    int updateByExampleSelective(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example);

    int updateByExample(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example);

    int updateByPrimaryKeySelective(Sales_Appeal record);

    int updateByPrimaryKey(Sales_Appeal record);

    //自定义
    List<Sales_Appeal> getSales_AppealList(Map<String, Object> map);//业务员申述列表
    Sales_Appeal selectByPrimaryNo(String orderno);

    int getCountSales_Appeal(Map<String, Object> map);//业务员申述总数


}
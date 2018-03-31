package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_List;
import com.morsearch.model.SalesV_Order_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_ListMapper {
    int countByExample(SalesV_Order_ListExample example);

    int deleteByExample(SalesV_Order_ListExample example);

    int insert(SalesV_Order_List record);

    int insertSelective(SalesV_Order_List record);

    List<SalesV_Order_List> selectByExample(SalesV_Order_ListExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_List record, @Param("example") SalesV_Order_ListExample example);

    int updateByExample(@Param("record") SalesV_Order_List record, @Param("example") SalesV_Order_ListExample example);

    List<SalesV_Order_List> getSalesVOrderListList(Map<String, Object> map);//查询订单的数量

    int getCountSalesVOrderList(Map<String, Object> map);//查询订单的数量
}
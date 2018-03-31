package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_Sms;
import com.morsearch.model.Sales_Order;
import com.morsearch.model.Sales_OrderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_OrderMapper {
    int countByExample(Sales_OrderExample example);

    int deleteByExample(Sales_OrderExample example);

    int deleteByPrimaryKey(Long of_id);

    int insert(Sales_Order record);

    int insertSelective(Sales_Order record);

    List<Sales_Order> selectByExample(Sales_OrderExample example);

    Sales_Order selectByPrimaryKey(Long of_id);

    int updateByExampleSelective(@Param("record") Sales_Order record, @Param("example") Sales_OrderExample example);

    int updateByExample(@Param("record") Sales_Order record, @Param("example") Sales_OrderExample example);

    int updateByPrimaryKeySelective(Sales_Order record);

    int updateByPrimaryKey(Sales_Order record);

/*自定义*/
    Long getOrderId(@Param("orderno") String orderno);/*根据订单号查ID*/
    String getOrderNo(@Param("orderid") Long orderid);/*根据ID查订单号*/
    Sales_Order getOrderMemo(@Param("orderno") String orderno, @Param("type") int type);/*根据订单号查相关明细*/

    List<Sales_Order> getOrderPsnDetail(@Param("salerid") Long salerid, @Param("designerid") Long designerid
            , @Param("status") byte status, @Param("finish") byte finish, @Param("limitqty") int limitqty);/*获取个人订单明细*/

    int getOrderSendQty(@Param("salerid") Long salerid, @Param("designerid") Long designerid, @Param("status") byte status);/*查询状态数量*/

    List<Sales_Order> getOrderStatusList(@Param("type") Integer type);/*获取订单状态*/
}
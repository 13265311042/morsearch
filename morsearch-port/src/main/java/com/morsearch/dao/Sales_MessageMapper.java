package com.morsearch.dao;

import com.morsearch.model.Sales_Message;
import com.morsearch.model.Sales_MessageExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_MessageMapper {
    int countByExample(Sales_MessageExample example);

    int deleteByExample(Sales_MessageExample example);

    int deleteByPrimaryKey(Long sm_id);

    int insert(Sales_Message record);

    int insertSelective(Sales_Message record);

    List<Sales_Message> selectByExample(Sales_MessageExample example);

    Sales_Message selectByPrimaryKey(Long sm_id);

    int updateByExampleSelective(@Param("record") Sales_Message record, @Param("example") Sales_MessageExample example);

    int updateByExample(@Param("record") Sales_Message record, @Param("example") Sales_MessageExample example);

    int updateByPrimaryKeySelective(Sales_Message record);

    int updateByPrimaryKey(Sales_Message record);

/*自定义*/
    List<Sales_Message> getOrderMsg_list(Map<String, Object> map);/*获取订单对话消息列表*/
    int getOrderMsg_count(Map<String, Object> map);/*获取订单对话消息列表*/

    void updateSales_Message_Read(@Param("orderno") String orderno, @Param("type") int type);/*批量更新订单消息已读*/

    List<Sales_Message> getSalesMessageList(Map<String, Object> map);// //订单对话消息

    int  getSalesMessageCount(Map<String, Object> map); //订单对话总数

}
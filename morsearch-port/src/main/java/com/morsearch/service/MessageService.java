package com.morsearch.service;

import com.morsearch.model.*;

import java.util.List;
import java.util.Map;


/*Redis service
*
* */

public interface MessageService {
	int addSalesLookMe(Sales_LookMe lm, String logititle);/*增加业务员谁看了我*/
	int updateSalesLookMe(Sales_LookMe lm,String logititle);/*修改业务员谁看了我*/

	int addSalesInterest(Sales_Interest lm, String logititle);/*增加业务员谁对我有兴趣*/
	int updateSalesInterest(Sales_Interest lm,String logititle);/*修改业务员谁对我有兴趣*/

	List<SalesV_Order_Msg> getSales_Order_Msg_list(Map<String, Object> map);/*获取订单消息列表*/
	int getSales_Order_Msg_count(Map<String, Object> map);/*获取订单消息列表*/

	void saveOrderMsgRead(String orderno, int type) throws Exception;/*保存订单已读消息*/
	int addOrderMessage(Sales_Message sm, int msgtype) throws Exception;/*保存订单已读消息*/

	List<Sales_Message> getOrderMsg_list(Map<String, Object> map);/*获取订单对话列表*/
	int getOrderMsg_count(Map<String, Object> map);/*获取订单对话列表*/

	int addUserMessage(Sys_User_Msg msg);/*保存用户消息表*/
	int saveUserMessage(String type,Sys_User_Msg msg);/*保存用户消息表*/

	int UserMsgCount(Sys_User_Msg umadd);/*统计订单*/



}

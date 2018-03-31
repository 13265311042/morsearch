package com.morsearch.service;

import com.morsearch.model.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;


/*订单service
*
* */

public interface OrderService {

	Long getOrderId(String orderno);/*根据订单号查ID*/
	String getOrderNo(Long orderid);/*根据ID查订单号*/

	List<SalesV_Order_List> getOrderstatuslist(Map<String, Object> map);/*查询业务员订单列表*/
	int getOrderstatusCount(Map<String, Object> map);/*查询业务员订单列表*/

	Sales_Order getOrderMemo(String orderno, int type);/*根据订单号查明细*/
	int saveOrderRevoke(String orderno, int orderstatus);/*撤回订单*/
	int saveorderfinish(String orderno, int orderstatus);/*完成订单*/

	int addorder(Sales_Order order, Boolean iscompanyaccount) throws Exception;/*增加订单 ,iscompanyaccount支付企业账号*/
	int saveorder(Sales_Order order, Boolean addmsg) throws ParseException;/*保存订单*/

	int getOrderSendQty(Long salerid, Long designerid, byte status);/*查询当前业务员发送给设计师的拜贴数量*/

	List<Sales_Order> getOrderPsnDetail(Long salerid, Long designerid, byte status, byte finish, int limitqty);/*获取个人订单明细*/

	Sales_Order selectByPrimaryKey(Long of_id);

/*设计师*/

	List<SalesV_Order_Guest> getDesOrderGuestList(Map<String, Object> map);/*获取设计师“我的访客"*/
	int getDesOrderGuestCount(Map<String, Object> map);/*查询我的访客统计*/

	List<MsgV_Order_List> getDesMsgOrderList(Map<String, Object> map);/*获取设计师“拜贴消息"*/
	int getDesMsgOrderCount(Map<String, Object> map);/*查询拜贴消息订单统计*/

//	int saveDesOrderMsgRead(String msglist);/*批量更新已读订单消息*/

	int saveDesOrderDjt(Long userid, String orderno, String type, String content) throws Exception;/*批量更新已读订单消息*/

	SalesV_Order_CountDes getDesOrderCount(Long userid);/*设计师统计数量订单状态*/

	boolean saveOrderStatusToRedis(String orderno, Date meetdate, byte orderstatus, byte appealstatus); /*需要调整的日期，确定完成，状态编码*/

	List<SalesV_Order_Sms> getOrderSmsNotice(Integer type, String orderno, Long createid); /*获取订单短信需要的资料*/

	List<Sales_Order> getOrderStatusList(Integer type);/*获取订单状态*/
}

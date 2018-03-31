package com.morsearch.dao;

import com.morsearch.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component("A_CommMapper")

public interface AA_CommMapper {

    String LoginUser(@Param("userno") String userno, @Param("password") String password);/*shiro登录*/
    String getPermission(@Param("sm_no") String sm_no); /*权限管理*/
    String getRole(@Param("sm_no") String sm_no);/*角色管理*/

    List<Acc_MemoAmt> getAcc_Wallet_Memo_Amt_list(Map<String, Object> map);/*获取钱包明细*/
    int getAcc_Wallet_Memo_Amt_count(Map<String, Object> map);/*获取钱包明细*/

    List<Acc_MemoCoin> getAcc_Wallet_Memo_Coin_list(Map<String, Object> map);/*获取魔币明细*/
    int getAcc_Wallet_Memo_Coin_count(Map<String, Object> map);/*获取魔币明细*/

    String getPmArchivesTitle(@Param("pmid") Long pmid);/*获取产品档案标题*/

    List<SalesV_Order_Msg> getSales_Order_Msg_list(Map<String, Object> map);/*获取订单消息列表*/
    int getSales_Order_Msg_count(Map<String, Object> map);/*获取订单消息列表*/

    List<SalesV_Order_List> getOrderstatuslist(Map<String, Object> map);/*查询业务员订单列表*/
    int getOrderstatusCount(Map<String, Object> map);/*查询业务员订单列表*/

    Map<String,String> getUserPosTeam(@Param("lng") String lng, @Param("lat") String lat);/*查公司坐标相同的小组*/

    List<SalesV_Order_Guest> getDesOrderGuestList(Map<String, Object> map);/*获取我的访客*/
    int getDesOrderGuestCount(Map<String, Object> map);/*获取我的访客*/

    List<MsgV_Order_List> getDesMsgOrderList(Map<String, Object> map);/*获取拜贴消息*/
    int getDesMsgOrderCount(Map<String, Object> map);/*获取拜贴消息*/

    int getDesMsgOrder(@Param("userid") Long userid);/*统计设计师未读拜贴数量*/
    int getDesMsgAppeal(@Param("userid") Long userid);/*统计设计师未读投诉数量*/
    int getDesMsgAudit(@Param("userid") Long userid);/*统计设计师未读审核数量*/


    Map<String,Object> getFn_Award_Recharge(@Param("type") String type, @Param("baid") Long baid
            , @Param("lvalue") Integer lvalue, @Param("isdefault") Integer isdefault);/*获取赠送赠送资料*/

    Map<String,Object> getAccCompanyAccount(@Param("userid") Long userid);/*获取个人相关企业的余额帐户 leoli*/

    List<Map<String,Object>> getCompanyNameList(@Param("keyword") String keyword);/*获取公司列表 leoli*/

    String getDateToShortStr(@Param("dt") Date dt);/*转简短日期*/


    String getPmArchivesfilename(@Param("pmid") Long pmid);/*获取产品档案文件名称*/

    Map<String,Object> getFn_Award_Share(@Param("task") String task,@Param("userid") Long userid, @Param("yqm") String yqm);/*查赠送资料-多类*/

    Map<String,Object> getFn_Award_Evaluate(@Param("userid") Long userid);/*评价赠送*/

    void updatemsg_Order(@Param("userid") Long userid);/*更新设计师未读信息，改为已读*/
    void updatemsg_Project(@Param("userid") Long userid);/*更新设计师未读信息，改为已读*/
    void updatemsg_Demand(@Param("userid") Long userid);/*更新设计师未读信息，改为已读*/
    void updatemsg_Appeal(@Param("userid") Long userid);/*更新设计师未读信息，改为已读*/

    int update_Message_image_saler(@Param("userid") Long userid,@Param("filename") String filename);/*更新对话信息图片*/
    int update_Message_image_desig(@Param("userid") Long userid,@Param("filename") String filename);/*更新对话信息图片*/

    int savenideshop_order_status(@Param("ordersn") String ordersn);/*更新商城订单 leoli*/
    int savenideshop_order_kcqty(@Param("ordersn") String ordersn);/*更新商城库存 leoli*/


}

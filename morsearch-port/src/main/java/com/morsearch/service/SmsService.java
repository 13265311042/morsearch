package com.morsearch.service;

import com.morsearch.model.Sys_SmsMessage;
import com.morsearch.model.Sys_SmsReply;
import com.morsearch.model.Sys_SmsVerify;

import java.util.Date;
import java.util.List;


public interface SmsService {
	public void save(Sys_SmsReply transientInstance) ;
	public void delete(Sys_SmsReply persistentInstance);
	public Sys_SmsReply findById(Long id) ;
	public List<Sys_SmsReply> findNotReply();/**根据orderid和回复途径获取Smsreply*/
	public String modifSmsreply(Sys_SmsReply smsreply);/*修改短信回复数据*/
	public int getPhoneCount(String phone, int typeindex, Date todaymintime, Date todaymaxtime);/*得到手机数量*/
	public Sys_SmsVerify getPhoneVerifylast(String phone, int typeindex);/*得到手机最后一条验证码*/
	public void verifysave(Sys_SmsVerify ti) ;
	public void verifyupdate(Sys_SmsVerify ti) ;
//	public  Sys_SmsVerify getCodeVerify(String code);

	public String saveSmsVerifyResult(String phone, int type, String code,Boolean issave);/*保存验证结果*/

	public void addSmsMessage(Sys_SmsMessage sm) ;
	public void saveSmsMessage(Sys_SmsMessage sm) ;

	public boolean phonsendmsg(Sys_SmsMessage smsMsg);/*发送短信*/

	public boolean saveSmsOrderNotice(String orderno, int type);/*发送订单短信通知*/

	public boolean savePushOrderNotice(String orderno, int type) throws Exception;/*发送订单推送通知*/

	public  int getSys_SmsVerify_phone_size(String phone);/*根据电话查询短信验证表里面是否存在着个手机号码*/
}

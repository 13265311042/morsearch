package com.morsearch.quartz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.common.util.umeng.UMengPushUtil;
import com.morsearch.model.Sales_Order;
import com.morsearch.model.Sys_Config;
import com.morsearch.model.Sys_User;
import com.morsearch.service.OrderService;
import com.morsearch.service.RedisService;
import com.morsearch.service.SmsService;
import com.morsearch.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;


@Component
public class JobTask {
	private Logger logger = Logger.getLogger(getClass());
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	@Resource
	private RedisService redisService;
	@Resource
	private OrderService orderService;
	@Resource
	private SmsService smsService;
	@Resource
	private UserService userService;

	
	
	


/*更改拜贴状态任务
短信通知，测试阶段暂时去除发送
* leoli
* 2017.11.30*/

public void saveSaleOrderStatus() throws UnsupportedEncodingException, ParseException {
//	System.out.println("saveSaleOrderStatus");
//	Long long_now =System.currentTimeMillis()/1000;/*当前时间*/
	Date date_now=DateTimeUtil.longconvertdate(System.currentTimeMillis()/1000);
	System.out.println(DateTimeUtil.getStrFormat(DateTimeUtil.addDay(date_now,1),"yyyy-MM-dd")+","+DateTimeUtil.getStrFormat(date_now,"HH"));

/*获取配置文件 begin*/
	String push_order_meet=redisService.getMapRow(Constants.REDIS_SYS_CONFIG,"push_order_meet");/*读取会面提醒配置*/
	String push_order_appraise=redisService.getMapRow(Constants.REDIS_SYS_CONFIG,"push_order_appraise");/*读取评价提醒配置*/
	String push_order_sms=redisService.getMapRow(Constants.REDIS_SYS_CONFIG,"push_order_sms");/*拜帖短信通知*/
	if (push_order_meet!=null){
		push_order_meet= gson.fromJson(push_order_meet, Sys_Config.class).getSc_value();
	};
	if (push_order_appraise!=null){
		push_order_appraise= gson.fromJson(push_order_appraise, Sys_Config.class).getSc_value();
	};
	if (push_order_sms!=null){
		push_order_sms= gson.fromJson(push_order_sms, Sys_Config.class).getSc_value();
	};

/*获取配置文件 end*/

/*处理订单状态 begin*/
	Map<String, String> mp=redisService.getMapValue(Constants.REDIS_ORDER_STATUS);/*读取明细*/
	Boolean flagsave=false; /*是否需要更新*/
	for (Map.Entry<String, String> entry : mp.entrySet()) {
		try {
		//	System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
			Sales_Order smq = gson.fromJson(entry.getValue(), Sales_Order.class);
			if (smq != null) {/*处理未完成订单*/
				Sales_Order soupd = new Sales_Order();/*用于更新的数据*/
				flagsave = false;
				soupd.setOf_id(smq.getOf_id());

/*新单通知 1 begin*/
				if (smq.getOf_status()==1 && CommonUtil.read_boolean(smq.getOf_noticenew()) == false){
					    Boolean b1=true;
						if ("1".equals(push_order_sms)) {
							b1 = smsService.saveSmsOrderNotice(smq.getOf_no(), 1); /*新单通知设计师*/
						};
						soupd.setOf_noticenew(b1);
						smq.setOf_noticenew(b1);
						flagsave = true;
				};
/*新单通知 end*/

/*长时间不接贴，则自动撤回 4 begin*/

				if (smq.getOf_status()==1 && Math.abs(DateTimeUtil.getDaysBetween(date_now,smq.getOf_dateorder()))>15){ /*大于15天*/
					Sales_Order som=orderService.getOrderMemo(smq.getOf_no(),0); /*验证数据库资料*/
					if (som!=null&&som.getOf_status()==smq.getOf_status()
							&&CommonUtil.read_boolean(som.getOf_flagfinish())==CommonUtil.read_boolean(smq.getOf_flagfinish())) {
						smq.setOf_status((byte) 4);
						smq.setOf_flagfinish(true);
						orderService.saveOrderRevoke(som.getOf_no(),4);/*撤回*/
						flagsave = true;
					};
				}


				//
/*长时间不接贴，则自动撤回 end*/



/*通知会面时间 begin*/
				if (smq.getOf_datemeet() != null && CommonUtil.read_boolean(smq.getOf_noticemeet()) == false &&smq.getOf_status()==2
				&& CommonUtil.read_boolean(smq.getOf_flagfinish()) == false
				&&(((DateTimeUtil.getStrFormat(DateTimeUtil.addDay(date_now,1),"yyyy-MM-dd").equals(DateTimeUtil.getStrFormat(smq.getOf_datemeet(),"yyyy-MM-dd")))
				&&"20".equals(DateTimeUtil.getStrFormat(date_now,"HH"))) /*拜访前一天20点之前*/
			||(DateTimeUtil.getStrFormat(date_now,"yyyy-MM-dd").equals(DateTimeUtil.getStrFormat(smq.getOf_datemeet(),"yyyy-MM-dd"))) /*当天接贴当天发送*/
				)){
					if ("1".equals(push_order_sms)) { /*拜贴短信通知*/
						Boolean b1 = smsService.saveSmsOrderNotice(smq.getOf_no(), 2); /*短信通知业务员*/
						Boolean b2 = smsService.saveSmsOrderNotice(smq.getOf_no(), 3);/*短信通知设计师*/
					};
					if ("1".equals(push_order_meet)) {
						Boolean b3 = smsService.savePushOrderNotice(smq.getOf_no(), 1); /*推送通知业务员*/
						Boolean b4 = smsService.savePushOrderNotice(smq.getOf_no(), 2); /*推送通知业务员*/
					};
					soupd.setOf_noticemeet(true);
					smq.setOf_noticemeet(true); //(b1==true||b2==true)?true:false
					flagsave = true;
				};
/*通知会面时间 end*/

/*更改拜访状态 3 begin*/
				if (smq.getOf_datemeet() != null&&smq.getOf_status()==2 && CommonUtil.read_boolean(smq.getOf_flagfinish()) == false
						&& (DateTimeUtil.getDateTostr(date_now).compareTo(DateTimeUtil.getDateTostr(smq.getOf_datemeet())))==1){
					Sales_Order som=orderService.getOrderMemo(smq.getOf_no(),0); /*验证数据库资料*/
					if (som!=null&&som.getOf_status()==smq.getOf_status()
						&&CommonUtil.read_boolean(som.getOf_flagfinish())==CommonUtil.read_boolean(smq.getOf_flagfinish())){
						soupd.setOf_flagfinish(true);
						soupd.setOf_status((byte) 3);
						soupd.setOf_appealstatus((byte) 1);/*允许申诉*/
						smq.setOf_flagfinish(true);
						smq.setOf_status((byte) 3);
						smq.setOf_appealstatus((byte) 1);/*允许申诉*/
						flagsave = true;
					};
				};
/*更改拜访状态 end*/

/*推送提示评价 begin */

				if (smq.getOf_datemeet() != null&&smq.getOf_status()==3 && CommonUtil.read_boolean(smq.getOf_noticeappraise()) == false
						&&smq.getOf_appealstatus()!=2&& (DateTimeUtil.addMinute(smq.getOf_datemeet(),90).getTime()<=date_now.getTime())
						&&("1".equals(push_order_appraise))){
					/*业务员通知*/
						if (CommonUtil.read_boolean(smq.getOf_flagappraisesale())==false){
							Boolean b1=smsService.savePushOrderNotice(smq.getOf_no(),3); /*通知业务员*/
						};
					/*设计师通知*/
						if (CommonUtil.read_boolean(smq.getOf_flagappraisedesi())==false){
							Boolean b2=smsService.savePushOrderNotice(smq.getOf_no(),4); /*通知业务员*/
						};
						soupd.setOf_noticeappraise(true);
						smq.setOf_noticeappraise(true);
						flagsave = true;
				};


/*推送提示评价 end */

/*自动结贴状态 9 begin*/
				if (smq.getOf_datemeet()!=null&&smq.getOf_dateplanclose()==null){smq.setOf_dateplanclose(
						DateTimeUtil.addDay(smq.getOf_datemeet(),Constants.ORDER_PLANCLOSE_TIME));};/*赋值关闭时间*/

				if (smq.getOf_dateplanclose() != null && CommonUtil.read_boolean(smq.getOf_flagfinish()) == true
						&&smq.getOf_status()==3	&smq.getOf_appealstatus()!=2 /*申诉中状态不能结贴*/
						&& (DateTimeUtil.getDateTostr(date_now).compareTo(DateTimeUtil.getDateTostr(smq.getOf_dateplanclose())))==1){
					Sales_Order som=orderService.getOrderMemo(smq.getOf_no(),0); /*验证数据库资料*/
					if (som!=null&&som.getOf_status()==smq.getOf_status()&som.getOf_appealstatus()!=2 /*申诉中状态不能结贴*/
							&&CommonUtil.read_boolean(som.getOf_flagfinish())==CommonUtil.read_boolean(smq.getOf_flagfinish())){
						int iflag=orderService.saveorderfinish(smq.getOf_no(),9);
						if (iflag>0){};/*完成状态不在当前处理，逻辑层已处理并删除redis*/
					};
				};
/*自动结贴状态 end*/

				if (flagsave == true) { /*确认更新*/
				orderService.saveorder(soupd, false);
				if (smq.getOf_status()!=null&&smq.getOf_status()!=9) {
					redisService.saveMapRow(Constants.REDIS_ORDER_STATUS, smq.getOf_no(), gson.toJson(smq)); /*存入订单状态*/
				};
				};
			};
		}catch (Exception ex){
			ex.printStackTrace();
		};
    }
/*处理订单状态 end*/


}



/*清除空置的在线用户session
leoli
2017.12.08
* */
	public void deleteusersession() {
		System.out.println("deleteusersession");
		Long long_now =System.currentTimeMillis()/1000;/*当前时间*/
		Map<String, String> mp=redisService.getMapValue(Constants.REDIS_LOGIN_FRONT);/*读取明细*/
		for (String userid:mp.keySet()) {
			String lng=mp.get(userid).split(";")[1];/*取时间*/
			if (((long_now-Long.parseLong(lng))/3600)>=24){ /*24小时后*/
				Sys_User uselogin=new Sys_User();
				uselogin.setUr_id(Long.valueOf(userid));
				uselogin.setUr_login_online(false);
				userService.updatesave(uselogin,null,null);
				redisService.removeMapRow(Constants.REDIS_LOGIN_FRONT,userid);
			};
		}

	};


/*
	*/
/**
	 * @Title 用户回复短信上行数据解析处理任务
	 * @Description 每10分钟，实时获取SMSREPLY表中未处理的记录。
	 * @param
	 * @return 成功/失败
	 *//*

	public void processSmsreply() {
		try{
			// 获取超过10分钟未处理的记录
			List<Smsreply> list = smsreplyService.findNotReply();
			// 若有未处理记录，下面依次处理
			for(Smsreply record : list) {
				String memo = smsreplyService.modifSmsreply(record);
				record.setStatus(Constant.SMSREPLY_STATUS_YES);
				record.setProcesstime(new Date());
				record.setMemo(memo);
				smsreplyService.merge(record);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
*/




}
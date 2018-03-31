package com.morsearch.service.impl;

import com.morsearch.base.SDKSendSMS;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.common.util.umeng.UMengPushUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.RedisService;
import com.morsearch.service.SmsService;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("SmsService")

public class SmsServiceImpl implements SmsService {

	private  SDKSendSMS sdkSendSMS;
	@Autowired
	private Sys_SmsVerifyMapper verifyMapper;
	@Autowired
	private Sys_SmsReplyMapper replyMapper;
	@Autowired
	private Sys_SmsMessageMapper smsmessagemapper;
	@Autowired
	private Sales_OrderMapper ordermapper;
	@Autowired
	private SalesV_Order_SmsMapper order_smsmapper;
	@Resource
	private RedisService redisService;

	@Override
	public void save(Sys_SmsReply transientInstance) {
	}

	@Override
	public void delete(Sys_SmsReply persistentInstance) {

	}

	@Override
	public Sys_SmsReply findById(Long id) {
		return null;
	}

	@Override
	public List<Sys_SmsReply> findNotReply() {
		return null;
	}

	@Override
	public String modifSmsreply(Sys_SmsReply smsreply) {
		return null;
	}

	@Override
	public int getPhoneCount(String phone,int typeindex, Date todaymintime, Date todaymaxtime) {
		return verifyMapper.getPhoneCount(phone,typeindex,todaymintime,todaymaxtime);
	}

	@Override
	public Sys_SmsVerify getPhoneVerifylast(String phone, int typeindex) {
		return verifyMapper.getPhoneVerifylast(phone,typeindex);
	}

	@Override
	public void verifysave(Sys_SmsVerify ti) {
		 verifyMapper.insertSelective(ti);
	}

	@Override
	public void verifyupdate(Sys_SmsVerify ti) {
		verifyMapper.updateByPrimaryKeySelective(ti);
	}

/*
	@Override
	public Sys_SmsVerify getCodeVerify(String code) {
		return verifyMapper.getCodeVerify(code);
	}
*/

	@Override
	/*保存验证结果*/
	public String saveSmsVerifyResult(String phone, int type, String code,Boolean issave) {
		String rut="1";
		Boolean flag_pass=true;
		Boolean flag_save=false;
		Sys_SmsVerify sv =getPhoneVerifylast(phone,type); /*固定验证为1*/
		if (sv!=null){
			int iminute = (int) (((new Date()).getTime() - sv.getSv_sendtime().getTime()) / 1000 / 60);
			if (flag_pass==true&&iminute > Constants.SMS_EXPRIATIONTIME) {
				rut="验证时间超过【"+10+"】分钟";
				sv.setSv_status((byte) 1);
				flag_save=true;
				flag_pass=false;
			};
			if (sv.getSv_repeat()!=null&&sv.getSv_repeat()>5&& flag_pass==true) { /*验证码错误*/
				rut="验证码错误次数过多";
				sv.setSv_status((byte) 1);
				flag_save=true;
				flag_pass=false;
			};
			if (!code.equals(sv.getSv_code())&& flag_pass==true) { /*验证码错误*/
				rut="验证码错误,请重新录入";
				sv.setSv_repeat((byte) (sv.getSv_repeat()+1));
				flag_save=true;
				flag_pass=false;
			};
			if (code.equals(sv.getSv_code())&& flag_pass==true) {/*验证码正确*/
				rut="1."+sv.getSv_id();
			//	sv.setSv_status((byte) 1);
			//	flag_save=true;
				flag_pass=true;
			};
		}else{
			rut="查不到验证记录";
			flag_pass=false;
		};
		if (sv!=null&&flag_save==true&&issave==true) {
			sv.setSv_verifytime(new Date());
			verifyupdate(sv);
		};
		return rut;
	}


	@Override
	public void addSmsMessage(Sys_SmsMessage sm) {
		smsmessagemapper.insertSelective(sm);
	}

	@Override
	public void saveSmsMessage(Sys_SmsMessage sm) {
		smsmessagemapper.updateByPrimaryKeySelective(sm);
	}

	@Override
/*手机发送短信
   储存到Sys_SmsMessage表
   *Leoli 2017.12.01
   * */

	public boolean phonsendmsg(Sys_SmsMessage smsMsg) {
			ArrayList<String> paraList = new ArrayList<String>();
			if (smsMsg.getSm_para0() != null) {
				paraList.add(smsMsg.getSm_para0());
			}
			if (smsMsg.getSm_para1() != null) {
				paraList.add(smsMsg.getSm_para1());
			}
			if (smsMsg.getSm_para2() != null) {
				paraList.add(smsMsg.getSm_para2());
			}
			if (smsMsg.getSm_para3() != null) {
				paraList.add(smsMsg.getSm_para3());
			}
			if (smsMsg.getSm_para4() != null) {
				paraList.add(smsMsg.getSm_para4());
			}
			if (smsMsg.getSm_para5() != null) {
				paraList.add(smsMsg.getSm_para5());
			}
			if (smsMsg.getSm_para6() != null) {
				paraList.add(smsMsg.getSm_para6());
			}
			if (smsMsg.getSm_para7() != null) {
				paraList.add(smsMsg.getSm_para7());
			}
			if (smsMsg.getSm_para8() != null) {
				paraList.add(smsMsg.getSm_para8());
			}
			String[] paras = null;
			if (paraList.size() > 0) {
				paras = (String[]) paraList.toArray(new String[paraList.size()]);
			}

			String smsresult =sdkSendSMS.sendMsgToPhone(smsMsg.getSm_phone(), smsMsg.getSm_tempno(), paras);
			if ("1".equals(smsresult)) {
				smsMsg.setSm_status((byte) 2);
				smsMsg.setSm_sendtime(new Date());
			} else {
				smsMsg.setSm_status((byte) 4);
			}
			if (smsMsg.getSm_id()!=null&&smsMsg.getSm_id()>0){ /*更新*/
				smsmessagemapper.updateByPrimaryKeySelective(smsMsg);
			}else{ /*新增*/
				smsMsg.setSm_createtime(new Date());
				smsmessagemapper.insertSelective(smsMsg);
			};
		return "1".equals(smsresult);

		}

	@Override
	/*发送订单通知*/
	public boolean saveSmsOrderNotice(String orderno, int type) {
		List<SalesV_Order_Sms> om=order_smsmapper.getOrderSmsNotice(1,orderno,null);
		if (om!=null&&om.size()>0) {

			Sys_SmsMessage sm = new Sys_SmsMessage();
			if (type == 1&& CommonUtil.isEmpty(om.get(0).getDesigphone())==false) {/*新单设计师提醒*/
				sm.setSm_userid(om.get(0).getOf_createid());
				sm.setSm_tempno(Constants.SMS_NOTICE_NEW_DESIGN);
				sm.setSm_phone(om.get(0).getDesigphone());
				sm.setSm_remark(om.get(0).getOf_no());
				sm.setSm_para0(om.get(0).getOf_coinname()+"贴");
				sm.setSm_para1(om.get(0).getOf_coinprice()+"");
			};

			if (type == 2&& CommonUtil.isEmpty(om.get(0).getSalephone())==false) {/*业务员会面提醒*/
				sm.setSm_userid(om.get(0).getOf_createid());
				sm.setSm_tempno(Constants.SMS_MEET_SALES);
				sm.setSm_phone(om.get(0).getSalephone());
				sm.setSm_remark(om.get(0).getOf_no());
				sm.setSm_para0(DateTimeUtil.getDateStrChinese((Date) om.get(0).getOf_datemeet()));
				sm.setSm_para1(om.get(0).getDesigname());
				sm.setSm_para2(om.get(0).getDesigcompanyadd());
			};

			if (type == 3&& CommonUtil.isEmpty(om.get(0).getDesigphone())==false) {/*设计师会面提醒*/
				sm.setSm_userid(om.get(0).getOf_custid());
				sm.setSm_tempno(Constants.SMS_MEET_DESIGN);
				sm.setSm_phone(om.get(0).getDesigphone());
				sm.setSm_remark(om.get(0).getOf_no());
				sm.setSm_para0(DateTimeUtil.getDateStrChinese((Date) om.get(0).getOf_datemeet()) + ",");
				sm.setSm_para1(om.get(0).getSalename());
			};
		 return phonsendmsg(sm); /*短信通知*/
		};
		return true;
	}

	@Override
	public boolean savePushOrderNotice(String orderno, int type) {
		/* type:10 会面，type:11 评价*/
		List<SalesV_Order_Sms> om=order_smsmapper.getOrderSmsNotice(1,orderno,null);
		String rs1="";
		String rs2="";
		try {
			if (om != null && om.size() > 0) {
				if (type == 1) { /*推送会面业务员*/
					rs1 = UMengPushUtil.sendAndroidAlias(Constants.PUSH_DEFAULT_TICKER, Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_createid() + "", Constants.PUSH_DEFAULT_TITLE_HM, "会面设计师:" + om.get(0).getDesigname(),
							"type:10;orderno:" + om.get(0).getOf_no(), null);
					rs2 = UMengPushUtil.sendIOSAlias(Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_createid() + "", Constants.PUSH_DEFAULT_TITLE_HM, "会面设计师:" + om.get(0).getDesigname(),
							"type:10;orderno:" + om.get(0).getOf_no(), null);
				}
				;
				if (type == 2) { /*推送会面设计师*/
					rs1 = UMengPushUtil.sendAndroidAlias(Constants.PUSH_DEFAULT_TICKER, Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_custid() + "", Constants.PUSH_DEFAULT_TITLE_HM, "会面业务员" + om.get(0).getSalename(),
							"type:10;orderno:" + om.get(0).getOf_no(), null);
					rs2 = UMengPushUtil.sendIOSAlias(Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_custid() + "", Constants.PUSH_DEFAULT_TITLE_HM, "会面业务员" + om.get(0).getSalename(),
							"type:10;orderno:" + om.get(0).getOf_no(), null);
				}
				;


				if (type == 3) { /*推送评价业务员*/
					rs1 = UMengPushUtil.sendAndroidAlias(Constants.PUSH_DEFAULT_TICKER, Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_createid() + "", Constants.PUSH_DEFAULT_TITLE_PJ, "评价设计师:" + om.get(0).getDesigname(),
							"type:11;orderno:" + om.get(0).getOf_no(), null);
					rs2 = UMengPushUtil.sendIOSAlias(Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_createid() + "", Constants.PUSH_DEFAULT_TITLE_PJ, "评价设计师:" + om.get(0).getDesigname(),
							"type:11;orderno:" + om.get(0).getOf_no(), null);
				}
				;

				if (type == 4) { /*推送评价设计师*/
					rs1 = UMengPushUtil.sendAndroidAlias(Constants.PUSH_DEFAULT_TICKER, Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_custid() + "", Constants.PUSH_DEFAULT_TITLE_PJ, "评价业务员" + om.get(0).getSalename(),
							"type:11;orderno:" + om.get(0).getOf_no(), null);
					rs2 = UMengPushUtil.sendIOSAlias(Constants.PUSH_DEFAULT_ALIAS_TYPE,
							om.get(0).getOf_custid() + "", Constants.PUSH_DEFAULT_TITLE_PJ, "评价业务员" + om.get(0).getSalename(),
							"type:11;orderno:" + om.get(0).getOf_no(), null);
				}
				;
			}
			;
		}catch (Exception ex){
			ex.printStackTrace();
		}

		redisService.saveMapRow("PUSH",rs1+","+rs2,orderno+","+type);
		return true;
	}

	@Override
	public int getSys_SmsVerify_phone_size(String phone) {
		Sys_SmsVerifyExample example = new Sys_SmsVerifyExample();
		Sys_SmsVerifyExample.Criteria criteria = example.createCriteria();
		criteria.andSv_phoneEqualTo(phone);
		return verifyMapper.selectByExample(example).size();//到底有没有发送验证码
	}


}

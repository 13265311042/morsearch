package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.MessageService;
import com.morsearch.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("messageService")

public class MessageServiceImpl implements MessageService {
	@Autowired
	private Sales_LookMeMapper sales_LookMeMapper;
	@Autowired
	private Sales_InterestMapper sales_InterestMapper;
	@Autowired
	private Sys_User_MsgMapper sys_User_MsgMapper;
	@Autowired
	private AA_CommMapper commMapper;
	@Autowired
	private Sales_MessageMapper messageMapper;
	@Autowired
	private Sales_OrderMapper orderMapper;
	@Autowired
	private SysV_UserFullMapper ufMapper;
	@Autowired
	private Sys_User_MsgMapper umMapper;
	@Autowired
	private Sys_UserMapper userMapper;
	@Resource
	private RedisService redisService;


	/*处理用户消息表加数*/
	public int UserMsgCount(Sys_User_Msg umadd){
		Sys_User_Msg um=sys_User_MsgMapper.selectByPrimaryKey(umadd.getUm_userid());
		if (um==null){
			um=new Sys_User_Msg();
			um.setUm_userid(umadd.getUm_userid());
		};
		if (umadd.getUm_lookmetime()!=null){
			um.setUm_lookmetime(CommonUtil.read_int(um.getUm_lookmetime())+umadd.getUm_lookmetime());};
		if (umadd.getUm_lookmetitle()!=null){
			um.setUm_lookmetitle(umadd.getUm_lookmetitle());};
		if (umadd.getUm_lookmedate()!=null){
			um.setUm_lookmedate(umadd.getUm_lookmedate());};

		if (umadd.getUm_interesttime()!=null){
			um.setUm_interesttime(CommonUtil.read_int(um.getUm_interesttime())+umadd.getUm_interesttime());};
		if (umadd.getUm_interesttitle()!=null){
			um.setUm_interesttitle(umadd.getUm_interesttitle());};
		if (umadd.getUm_interestdate()!=null){
			um.setUm_interestdate(umadd.getUm_interestdate());};

		if (umadd.getUm_ordermsgdate()!=null){
			um.setUm_ordermsgdate(umadd.getUm_ordermsgdate());};

/*订单消息直接赋值*/
		if (umadd.getUm_ordermsgtime()!=null){
			um.setUm_ordermsgtime(umadd.getUm_ordermsgtime());
		};

/*设计师*/
		if (umadd.getUm_dsg_baitietime()!=null){
			um.setUm_dsg_baitietime(CommonUtil.read_int(um.getUm_dsg_baitietime())+umadd.getUm_dsg_baitietime());};
		if (umadd.getUm_dsg_baitiedate()!=null){
			um.setUm_dsg_baitiedate(umadd.getUm_dsg_baitiedate());};

		if (umadd.getUm_dsg_audittime()!=null){
			um.setUm_dsg_audittime(CommonUtil.read_int(um.getUm_dsg_audittime())+umadd.getUm_dsg_audittime());};
		if (umadd.getUm_dsg_auditdate()!=null){
			um.setUm_dsg_auditdate(umadd.getUm_dsg_auditdate());};

		if (umadd.getUm_dsg_appealtime()!=null){
			um.setUm_dsg_appealtime(CommonUtil.read_int(um.getUm_dsg_appealtime())+umadd.getUm_dsg_appealtime());};
		if (umadd.getUm_dsg_appealdate()!=null){
			um.setUm_dsg_appealdate(umadd.getUm_dsg_appealdate());};

/*置0*/
		if (umadd.getUm_lookmetime()!=null&&umadd.getUm_lookmetime()<=-1){um.setUm_lookmetime(null);};
		if (umadd.getUm_interesttime()!=null&&umadd.getUm_interesttime()<=-1){um.setUm_interesttime(null);};
		if (umadd.getUm_ordermsgtime()!=null&&umadd.getUm_ordermsgtime()<=-1){um.setUm_ordermsgtime(null);};

		if (umadd.getUm_dsg_baitietime()!=null&&umadd.getUm_dsg_baitietime()<=-1){um.setUm_dsg_baitietime(null);};
		if (umadd.getUm_dsg_audittime()!=null&&umadd.getUm_dsg_audittime()<=-1){um.setUm_dsg_audittime(null);};
		if (umadd.getUm_dsg_appealtime()!=null&&umadd.getUm_dsg_appealtime()<=-1){um.setUm_dsg_appealtime(null);};

/*汇总*/
		um.setUm_msgsumtime(CommonUtil.read_int(um.getUm_lookmetime())+CommonUtil.read_int(um.getUm_interesttime())
				+CommonUtil.read_int(um.getUm_ordermsgtime())+CommonUtil.read_int(um.getUm_dsg_baitietime())
				+CommonUtil.read_int(um.getUm_dsg_audittime())+CommonUtil.read_int(um.getUm_dsg_appealtime())
		);
		int iadd=0;
		if (um.getUm_userid()==null||um.getUm_userid()==0){
			iadd=sys_User_MsgMapper.insertSelective(um);
		}else{
			iadd=sys_User_MsgMapper.updateByPrimaryKeySelective(um);
		}
		redisService.saveMapRow(Constants.REDIS_USER_MSG,umadd.getUm_userid()+"",um.getUm_msgsumtime()+"");/*更新redis信息*/
		return iadd;
	}


	@Override
	public int addSalesLookMe(Sales_LookMe lm,String logititle) {
		int iadd=0;
		iadd=sales_LookMeMapper.insertSelective(lm);
/*更新用户消息 begin*/
		Sys_User_Msg msg=new Sys_User_Msg();
		msg.setUm_userid(lm.getSl_salesmanid());
		msg.setUm_lookmetime(1);
		msg.setUm_lookmedate(new Date());
		msg.setUm_lookmetitle(logititle);
		iadd=iadd+UserMsgCount(msg);
/*更新用户消息 end*/
		return iadd;
	}

	@Override
	public int updateSalesLookMe(Sales_LookMe lm,String logititle) {
		int iadd;
		iadd=sales_LookMeMapper.updateByPrimaryKeySelective(lm);
		/*更新用户消息 begin*/
		Sys_User_Msg msg=new Sys_User_Msg();
		msg.setUm_userid(lm.getSl_salesmanid());
		msg.setUm_lookmetime(1);
		msg.setUm_lookmedate(new Date());
		msg.setUm_lookmetitle(logititle);
		iadd=iadd+UserMsgCount(msg);
/*更新用户消息 end*/
		return iadd;

	}


	@Override
	public int addSalesInterest(Sales_Interest lm,String logititle) {
		int iadd=0;
		iadd=sales_InterestMapper.insertSelective(lm);
/*更新用户消息 begin*/
		Sys_User_Msg msg=new Sys_User_Msg();
		msg.setUm_userid(lm.getSi_salesmanid());
		msg.setUm_interesttime(1);
		msg.setUm_interestdate(new Date());
		msg.setUm_interesttitle(logititle);
		iadd=iadd+UserMsgCount(msg);
/*更新用户消息 end*/
		return iadd;
	}

	@Override
	public int updateSalesInterest(Sales_Interest lm,String logititle) {
		int iadd;
		iadd=sales_InterestMapper.updateByPrimaryKeySelective(lm);

		/*更新用户消息 begin*/
		Sys_User_Msg msg=new Sys_User_Msg();
		msg.setUm_userid(lm.getSi_salesmanid());
		msg.setUm_interesttime(1);
		msg.setUm_interestdate(new Date());
		msg.setUm_interesttitle(logititle);
		iadd=iadd+UserMsgCount(msg);
/*更新用户消息 end*/
		return iadd;

	}


	@Override
	public List<SalesV_Order_Msg> getSales_Order_Msg_list(Map<String, Object> map) {
		return commMapper.getSales_Order_Msg_list(map);
	}

	@Override
	public int getSales_Order_Msg_count(Map<String, Object> map) {
		return commMapper.getSales_Order_Msg_count(map);
	}

	@Override
	public void saveOrderMsgRead(String orderno, int type) throws Exception {
/*修改订单最新消息 */
		Sales_Order som=orderMapper.getOrderMemo(orderno,3);
		if (som!=null) {
			Integer imsgcount=0;
			Long msguserid=0L;
			if (type == 1) {
				som.setOf_checkmsgd(true);/*设计师已读*/
				msguserid=som.getOf_custid();
				imsgcount=CommonUtil.read_int(som.getOf_msgdesigcount());
				som.setOf_msgdesigcount(0);/*置0*/
			} else {
				som.setOf_checkmsgs(true);/*业务员已读*/
				msguserid=som.getOf_createid();
				imsgcount=CommonUtil.read_int(som.getOf_msgsalescount());
				som.setOf_msgsalescount(0);/*置0*/
			};
			som.setOf_dateupdate(new Date());
			orderMapper.updateByPrimaryKeySelective(som);
/*更新用户消息 begin*/
			messageMapper.updateSales_Message_Read(orderno, type); /*更新对话框明细*/
/*保存订单消息*/
			Sys_User_Msg um=umMapper.getUserMsgDetail(msguserid,1);
			if (um==null){um=new Sys_User_Msg();};
			um.setUm_userid(msguserid);
			um.setUm_ordermsgtime(CommonUtil.read_int(um.getUm_ordermsgtime())-imsgcount);
			um.setUm_ordermsgdate(new Date());
			UserMsgCount(um);

		}else{
			throw new Exception("无此订单");
		};
	}

	@Override
	public int addOrderMessage(Sales_Message sm,int msgtype) throws Exception {
		int iadd=0;
/*区分业务员和设计师内容*/
		if (msgtype==1){
			SysV_UserFull ufd=ufMapper.getUserDetail(sm.getSm_designerid(),5);/*读取设计师信息*/
			if (ufd!=null) {
				sm.setSm_designername(ufd.getUr_namenick());
				sm.setSm_designerimage(ufd.getUr_imageurl());
			};
			sm.setSm_salerisread(false);
			sm.setSm_designerisread(true);/*设计师发送，设计师已读*/
		}else{
			SysV_UserFull ufs=ufMapper.getUserDetail(sm.getSm_salerid(),5);/*读取业务员信息*/
			if (ufs!=null) {
				sm.setSm_salername(ufs.getUr_namenick());
				sm.setSm_salerimage(ufs.getUr_imageurl());
			};
			sm.setSm_salerisread(true);/*业务员发送，设计师已读*/
			sm.setSm_designerisread(false);
		};
		sm.setSm_type((byte) msgtype);
		sm.setSm_createdate(new Date());
		iadd+=messageMapper.insertSelective(sm);
/*修改订单最新消息 */
		Sales_Order som=orderMapper.getOrderMemo(sm.getSm_orderno().toString(),3);
		if (som!=null) {
			String scont=sm.getSm_content();
			if (scont.length()>20){scont=scont.substring(0,20)+"..";};
			som.setOf_talklastmsg(scont);
			if (msgtype == 1) {
				som.setOf_checkmsgd(true);/*设计师已读*/
				som.setOf_checkmsgs(false);/*业务员未读*/
				som.setOf_msgsalescount(CommonUtil.read_int(som.getOf_msgsalescount())+1);
			} else {
				som.setOf_checkmsgd(false);/*设计师未读*/
				som.setOf_checkmsgs(true);/*业务员已读*/
				som.setOf_msgdesigcount(CommonUtil.read_int(som.getOf_msgdesigcount())+1);
			};
			som.setOf_dateupdate(new Date());
			iadd+=orderMapper.updateByPrimaryKeySelective(som);
/*更新用户消息 begin*/
			Long msguserid=0L;
			if (msgtype==1){/*设计师时，通知业务员*/
				msguserid=som.getOf_createid();
			}else{ /*业务员时，通知设计师*/
				msguserid=som.getOf_custid();
			};
			Sys_User_Msg um=umMapper.getUserMsgDetail(msguserid,1);
			if (um==null){um=new Sys_User_Msg();};
			um.setUm_userid(msguserid);
			um.setUm_ordermsgtime(CommonUtil.read_int(um.getUm_ordermsgtime())+1);
			um.setUm_ordermsgdate(new Date());
			UserMsgCount(um);
/*更新用户消息 end*/

		}else{
			throw new Exception("无此订单");/*超低价*/
		};

		return  iadd;
	}

	@Override
	public List<Sales_Message> getOrderMsg_list(Map<String, Object> map) {
		return messageMapper.getOrderMsg_list(map);
	}

	@Override
	public int getOrderMsg_count(Map<String, Object> map) {
		return messageMapper.getOrderMsg_count(map);
	}

	@Override
	public int addUserMessage(Sys_User_Msg msg) {
		int iadd=UserMsgCount(msg);
		return iadd+umMapper.insertSelective(msg);
	}

	@Override
	public int saveUserMessage(String type,Sys_User_Msg msg) {
		int iadd=UserMsgCount(msg);
		if ("4".equals(type)||"5".equals(type)||"6".equals(type)){
			commMapper.updatemsg_Order(msg.getUm_userid());/*设置已读*/
			commMapper.updatemsg_Project(msg.getUm_userid());/*设置已读*/
			commMapper.updatemsg_Demand(msg.getUm_userid());/*设置已读*/
			commMapper.updatemsg_Appeal(msg.getUm_userid());/*设置已读*/
		};
		return iadd+umMapper.updateByPrimaryKeySelective(msg);
	}


}

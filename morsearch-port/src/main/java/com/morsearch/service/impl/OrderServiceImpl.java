package com.morsearch.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.MessageService;
import com.morsearch.service.OrderService;
import com.morsearch.service.RedisService;
import com.morsearch.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("orderService")

public class OrderServiceImpl implements OrderService {
	@Autowired
	private Acc_BuyMapper acc_BuyMapper;
	@Autowired
	private Sys_WordListMapper sys_WordMapper;
	@Autowired
	private Sales_OrderMapper orderMapper;
	@Autowired
	private Acc_DepositMapper depositMapper;
	@Autowired
	private Acc_WalletMapper walletMapper;
	@Autowired
	private AA_CommMapper commMapper;
	@Autowired
	private Acc_MemoCoinMapper memocoinMapper;
	@Autowired
	private SysV_UserFullMapper ufMapper;
	@Autowired
	private SalesV_Order_CountDesMapper salesv_order_countdes;
	@Autowired
	private Msg_OrderMapper msg_ordermapper;
	@Autowired
	private Sys_User_MsgMapper umMapper;
	@Resource
	private MessageService messageService;
	@Resource
	private RedisService redisService;
	@Autowired
	private SalesV_Order_SmsMapper order_smsmapper;
	@Autowired
	private Acc_MemoAmtMapper accmemomapper;
	@Autowired
	private Acc_MemoIntegralMapper memointegralmapper;	

	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Override
	public Sales_Order selectByPrimaryKey(Long of_id) {
		return orderMapper.selectByPrimaryKey(of_id);
	}


	@Override
	public Long getOrderId(String orderno) {
		return orderMapper.getOrderId(orderno);
	}

	@Override
	public String getOrderNo(Long orderid) {
		return orderMapper.getOrderNo(orderid);
	}

	@Override
	public List<SalesV_Order_List> getOrderstatuslist(Map<String, Object> map) {
		return commMapper.getOrderstatuslist(map);
	}

	@Override
	public int getOrderstatusCount(Map<String, Object> map) {
		return commMapper.getOrderstatusCount(map);
	}

	@Override
	public Sales_Order getOrderMemo(String orderno,int type) {
		/*根据订单号查相关状态*/
		return orderMapper.getOrderMemo(orderno,type);
	}

	@Override
	/*撤回订单*/
	public int saveOrderRevoke(String orderno,int orderstatus) {
		Sales_Order som=orderMapper.getOrderMemo(orderno,3);
		if (som==null ||som.getOf_status()!=1){return -1;};/*检查是否正常状态*/
		int iadd=0;
/*处理订单状态,设置业务员和设计师已评价*/
		Sales_Order sonew=new Sales_Order();
		sonew.setOf_id(som.getOf_id());
		sonew.setOf_flagappraisesale(true);
		sonew.setOf_flagappraisedesi(true);
		sonew.setOf_flagsuccess(false);
		sonew.setOf_status((byte) orderstatus);
		sonew.setOf_datefinish(new Date());
		sonew.setOf_dateupdate(new Date());
		sonew.setOf_flagfinish(true);
		iadd=iadd+orderMapper.updateByPrimaryKeySelective(sonew);
		redisService.removeMapRow(Constants.REDIS_ORDER_STATUS, orderno);/*删除*/
	//	saveOrderStatusToRedis(orderno,null,true, (byte) orderstatus,(byte)0);/*/*保存订单状态到redis*/
/*处理拜贴仓库*/
		Acc_DepositKey adk=new Acc_DepositKey();
		adk.setAc_userid(som.getOf_accountid());
		adk.setAc_typecode(som.getOf_coincode());
		Acc_Deposit ad=depositMapper.selectByPrimaryKey(adk);
		ad.setAc_deposit(CommonUtil.read_decimal(ad.getAc_deposit()).add(new BigDecimal(1)));
		ad.setAc_occupied(CommonUtil.read_decimal(ad.getAc_occupied()).subtract(new BigDecimal(1)));
		iadd=iadd+depositMapper.updateByPrimaryKeySelective(ad);

/*处理钱包总额*/
		Acc_Wallet aw=walletMapper.selectByPrimaryKey(som.getOf_accountid());
		aw.setWl_deposit(CommonUtil.read_decimal(aw.getWl_deposit()).add(new BigDecimal(1)));
		aw.setWl_occupied(CommonUtil.read_decimal(aw.getWl_occupied()).subtract(new BigDecimal(1)));
		aw.setWl_updatedate(new Date());
		iadd=iadd+walletMapper.updateByPrimaryKeySelective(aw);
/*修改信息 begin*/
/*修改业务员信息*/
		if (som.getOf_msgsalescount()!=null&&som.getOf_msgsalescount()>0) {
			Sys_User_Msg msgs = umMapper.getUserMsgDetail(som.getOf_createid(), 1);
			if (msgs!=null){
			msgs.setUm_userid(som.getOf_createid());
			msgs.setUm_ordermsgtime(CommonUtil.read_int(msgs.getUm_ordermsgtime()) - CommonUtil.read_int(som.getOf_msgsalescount()));
			msgs.setUm_ordermsgdate(new Date());
			iadd += messageService.UserMsgCount(msgs);
			};
		};
/*修改设计师信息*/
		if (som.getOf_msgdesigcount()!=null&&som.getOf_msgdesigcount()>0) {
			Sys_User_Msg msgd = umMapper.getUserMsgDetail(som.getOf_custid(), 1);
			if (msgd != null) {
			msgd.setUm_userid(som.getOf_custid());
			msgd.setUm_ordermsgtime(CommonUtil.read_int(msgd.getUm_ordermsgtime()) - CommonUtil.read_int(som.getOf_msgdesigcount()));
			msgd.setUm_ordermsgdate(new Date());
			iadd += messageService.UserMsgCount(msgd);
			};
		};
/*修改信息 end*/
		return iadd;
	}

	@Override
	/*完成订单*/
	public int saveorderfinish(String orderno,int orderstatus) {
		Sales_Order som=orderMapper.getOrderMemo(orderno,3);
		if (som==null ||som.getOf_status()!=3){return -1;};/*检查是否正常状态*/

		int iadd=0;
		Sales_Order sonew=new Sales_Order();
		sonew.setOf_id(som.getOf_id());
		sonew.setOf_status((byte) orderstatus);
		sonew.setOf_datefinish(new Date());
		sonew.setOf_flagfinish(true);
		iadd=iadd+orderMapper.updateByPrimaryKeySelective(sonew);
		redisService.removeMapRow(Constants.REDIS_ORDER_STATUS,orderno);/*删除redis*/

/*处理业务员*/
/*处理拜贴仓库*/
		Acc_DepositKey adk=new Acc_DepositKey();
		adk.setAc_userid(som.getOf_accountid());
		adk.setAc_typecode(som.getOf_coincode());
		Acc_Deposit ad=depositMapper.selectByPrimaryKey(adk);
		ad.setAc_occupied(CommonUtil.read_decimal(ad.getAc_occupied()).subtract(new BigDecimal(1)));
		iadd=iadd+depositMapper.updateByPrimaryKeySelective(ad);
/*处理钱包总额*/
		Acc_Wallet aw=walletMapper.selectByPrimaryKey(som.getOf_accountid());
		aw.setWl_occupied(CommonUtil.read_decimal(aw.getWl_occupied()).subtract(new BigDecimal(1)));
		aw.setWl_updatedate(new Date());
		iadd=iadd+walletMapper.updateByPrimaryKeySelective(aw);

		


/*处理设计师*/
/*设计师处理接收仓库*/
		Acc_DepositKey adk2=new Acc_DepositKey();
		adk2.setAc_userid(som.getOf_custid());
		adk2.setAc_typecode(som.getOf_coincode());
		Acc_Deposit ad2=depositMapper.selectByPrimaryKey(adk2);
		if (ad2!=null){
			ad2.setAc_receiveqty(CommonUtil.read_decimal(ad2.getAc_receiveqty()).add(new BigDecimal(1)));
			iadd=iadd+depositMapper.updateByPrimaryKeySelective(ad2);
		}else{
			ad2=new Acc_Deposit();
			ad2.setAc_userid(som.getOf_custid());
			ad2.setAc_typecode(som.getOf_coincode());
			ad2.setAc_receiveqty(CommonUtil.read_decimal(ad2.getAc_receiveqty()).add(new BigDecimal(1)));
			iadd=iadd+depositMapper.insertSelective(ad2);
		};

/*处理钱包总额*/
		Acc_Wallet aw2=walletMapper.selectByPrimaryKey(som.getOf_custid());
		if (aw2==null){
			aw2=new Acc_Wallet();
			aw2.setWl_userid(som.getOf_custid());
			aw2.setWl_createdate(new Date());
		};
		String bmm=String.format("%.2f",som.getOf_coinprice().multiply(Constants.order_desgi_sclae));
		aw2.setWl_integral(CommonUtil.read_decimal(aw2.getWl_integral()).add(new BigDecimal(bmm)));
		aw2.setWl_receiveqty(CommonUtil.read_decimal(aw2.getWl_receiveqty()).add(new BigDecimal(1)));
		aw2.setWl_updatedate(new Date());
		//aw2.setWl_deposit(CommonUtil.read_decimal(aw2.getWl_deposit()).add(new BigDecimal(1)));
		iadd=iadd+walletMapper.updateByPrimaryKeySelective(aw2);

		
/*增加业务员明细 begin*/
		Acc_MemoCoin amc=new Acc_MemoCoin();
		amc.setOrderno(som.getOf_no());
		amc.setOrderdate(new Date());
		amc.setOrdercoincode(som.getOf_coincode());
		amc.setOrdercoinname(som.getOf_coinname());
		amc.setOrdercoinqty(new BigDecimal(1));
		amc.setOrdercoinprice(som.getOf_coinprice());
		amc.setOrderaccount(som.getOf_coinprice());
		amc.setCurrency("￥");
		amc.setAccountid(som.getOf_accountid());
		amc.setCreateid(som.getOf_createid());
		amc.setOrdertype("支出");
		amc.setOrdersign("-");
		amc.setOrdertitle("会面支出"+som.getOf_coinname()+"拜贴");
		memocoinMapper.insertSelective(amc);
/*增加业务员明细 end*/
		
/*增加设计师明细 begin*/
			Acc_MemoIntegral ami=new Acc_MemoIntegral();
			ami.setMi_type("11.会面收入");
			ami.setMi_sourceno(som.getOf_no());
			ami.setMi_integral(new BigDecimal(bmm));
			ami.setMi_accountid(som.getOf_custid());
			ami.setMi_createid(som.getOf_custid());
			ami.setMi_date(new Date());
			ami.setMi_typesign("+");
			memointegralmapper.insertSelective(ami);
/*增加设计师明细 end*/

/*增加设计师收入明细 begin*/
		Acc_MemoCoin ams=new Acc_MemoCoin();
		ams.setOrderno(som.getOf_no());
		ams.setOrderdate(new Date());
		ams.setOrdercoincode(som.getOf_coincode());
		ams.setOrdercoinname(som.getOf_coinname());
		ams.setOrdercoinqty(new BigDecimal(1));
		ams.setOrdercoinprice(som.getOf_coinprice());
		ams.setOrderaccount(som.getOf_coinprice());
		ams.setCurrency("￥");
		ams.setAccountid(som.getOf_custid());
		ams.setCreateid(som.getOf_custid());
		ams.setOrdertype("收入");
		ams.setOrdersign("+");
		ams.setOrdertitle("会面收入"+som.getOf_coinname()+"拜贴");
		memocoinMapper.insertSelective(ams);
/*增加设计师收入明细 end*/

		return iadd;
	}


	@Override
/*增加订单*/
	public int addorder(Sales_Order order,Boolean iscompanyaccount) throws Exception {
		int iadd = 0;
		order.setOf_accountid(order.getOf_createid());
		if (iscompanyaccount==true) {/*企业支付账户*/
			Map<String, Object> aca =commMapper.getAccCompanyAccount(order.getOf_createid());/*获取个人相关企业的余额帐户 leoli*/
			if (aca != null) {
				order.setOf_accountid((Long) aca.get("wl_userid"));
			};
		};

/*增加名称和图片*/
		Sys_WordList wl = sys_WordMapper.getSys_WordCodeDetail(Constants.WORD_ORDERTYPE, order.getOf_coincode());
		order.setOf_coinname(wl.getSw_name());
		order.setOf_coinimage(wl.getSw_imageurl());
		order.setOf_coinprice(new BigDecimal(wl.getSw_include()));

/*处理拜贴仓库*/
		Acc_DepositKey adk = new Acc_DepositKey();
		adk.setAc_userid(order.getOf_accountid());
		adk.setAc_typecode(order.getOf_coincode());
		Acc_Deposit ad = depositMapper.selectByPrimaryKey(adk);
		if (ad==null){
			ad=new Acc_Deposit();
			ad.setAc_userid(order.getOf_accountid());
			ad.setAc_typecode(order.getOf_coincode());
		};
		ad.setAc_deposit(CommonUtil.read_decimal(ad.getAc_deposit()).subtract(new BigDecimal(1)));/*实际减少*/
		ad.setAc_occupied(CommonUtil.read_decimal(ad.getAc_occupied()).add(new BigDecimal(1)));/*占用增加*/
		iadd = iadd + depositMapper.updateByPrimaryKeySelective(ad);

/*处理钱包总额*/
		Acc_Wallet aw = walletMapper.selectByPrimaryKey(order.getOf_accountid());
		if (aw==null){
			aw=new Acc_Wallet();
			aw.setWl_userid(order.getOf_accountid());
		};
		aw.setWl_deposit(CommonUtil.read_decimal(aw.getWl_deposit()).subtract(new BigDecimal(1)));/*实际减少*/
		aw.setWl_occupied(CommonUtil.read_decimal(aw.getWl_occupied()).add(new BigDecimal(1)));/*占用增加*/
		aw.setWl_updatedate(new Date());
		iadd = iadd + walletMapper.updateByPrimaryKeySelective(aw);
/*增加订单*/
		if (ad.getAc_deposit().compareTo(new BigDecimal(0)) == -1) {/*没库存*/
			throw new Exception("拜贴已用完，请充值");
		};
		if (iadd > 0) {
			order.setOf_msgdesigcount(1);/*设计师增加1*/
			iadd = iadd + orderMapper.insertSelective(order);

/*增加信息 begin*/
			Sys_User_Msg msg = umMapper.getUserMsgDetail(order.getOf_custid(),1);
			if (msg==null){msg=new Sys_User_Msg();};
			msg.setUm_userid(order.getOf_custid());
			msg.setUm_ordermsgtime(CommonUtil.read_int(msg.getUm_ordermsgtime())+1);
			msg.setUm_ordermsgdate(new Date());
			iadd+=messageService.UserMsgCount(msg);
/*增加信息 end*/

/*增加拜贴支出信息 begin*/
			Acc_MemoCoin amc=new Acc_MemoCoin();
			amc.setOrderno(order.getOf_no());
			amc.setOrderdate(new Date());
			amc.setOrdertype("支出");
			amc.setOrdersign("-");
			amc.setOrdertitle("支出"+order.getOf_coinname()+"拜贴");
			amc.setOrdercoincode(order.getOf_coincode());
			amc.setOrdercoinname(order.getOf_coinname());
			amc.setOrdercoinqty(new BigDecimal(1));
			amc.setOrdercoinprice(new BigDecimal(wl.getSw_value()));
			amc.setOrderaccount(amc.getOrdercoinprice().multiply(amc.getOrdercoinqty()));
			amc.setCurrency("￥");
			amc.setAccountid(order.getOf_accountid());
			amc.setCreateid(order.getOf_createid());
			memocoinMapper.insertSelective(amc);
/*增加拜贴支出信息 end*/
			addMsgOrder(order,true);/*增加拜贴消息*/

		};/*确认新增*/
		return iadd;
	}

	/*增加拜贴信息*/
	private  int addMsgOrder(Sales_Order order,boolean addflag) throws ParseException {

		if (addflag==false) {/*修改时，需要重新读取订单信息*/
			order = orderMapper.getOrderMemo(order.getOf_no(), 2);
			order.setOf_talkcontent(order.getOf_talkcontent());
		};

		Msg_Order mo=new Msg_Order();
		mo.setMo_orderno(order.getOf_no());
		mo.setMo_talkcontent(order.getOf_talkcontent());
		mo.setMo_orderstatus(order.getOf_status());
		mo.setMo_desigid(order.getOf_custid());
		mo.setMo_salerid(order.getOf_createid());
		mo.setMo_createdate(new Date());

		String namenick=ufMapper.getUserDetail(order.getOf_createid(), 5).getUr_namenick();

		switch (order.getOf_status()){
			case 1: { /*待接贴*/
				mo.setMo_title("请及时接帖，以免拜帖失效");
				break;
			}
			case 3: { /*待见面*/
				mo.setMo_title(namenick+"将于"+DateTimeUtil.getStrFormat(order.getOf_datemeet(),"MM月dd日HH时ss分")+"登门拜访，请提前准备");
				break;
			}
			case 6: { /*待评价*/
				mo.setMo_title("拜访完成，快给"+namenick+"评价吧");
				break;
			}
		};
		int iadd=0;
/*更新设计师拜贴消息 begin*/
		Sys_User_Msg msg=new Sys_User_Msg();
		msg.setUm_userid(mo.getMo_desigid());
		msg.setUm_dsg_baitietime(1);
		msg.setUm_dsg_baitiedate(new Date());
		iadd=iadd+messageService.UserMsgCount(msg);
/*更新设计师拜贴消息 end*/
		iadd=iadd+msg_ordermapper.insertSelective(mo);
		return iadd;
	};

	@Override
	public int saveorder(Sales_Order order,Boolean addmsg) throws ParseException {
		int iadd=0;
		if (addmsg==true){iadd+=addMsgOrder(order,false);} /*增加拜贴消息*/
		if (order.getOf_datemeet()!=null){saveOrderStatusToRedis(order.getOf_no(),order.getOf_datemeet(),(byte)0,(byte)0);};/*/*保存订单状态到redis*/
		iadd+=orderMapper.updateByPrimaryKeySelective(order);
		return iadd;
	}

	@Override
/*查询当前业务员发送给设计师的拜贴数量*/
	public int getOrderSendQty(Long salerid, Long designerid, byte status) {
		int icount=orderMapper.getOrderSendQty(salerid,designerid,status);
		return  icount;
	}

	@Override
	public List<Sales_Order> getOrderPsnDetail(Long salerid, Long designerid, byte status,byte finish,int limitqty) {
		return orderMapper.getOrderPsnDetail(salerid,designerid,status,finish,limitqty);
	}

/*设计师*/

	@Override
	public List<SalesV_Order_Guest> getDesOrderGuestList(Map<String, Object> map) {
		return commMapper.getDesOrderGuestList(map);
	}

	@Override
	public int getDesOrderGuestCount(Map<String, Object> map) {
		return commMapper.getDesOrderGuestCount(map);
	}

	@Override
	public List<MsgV_Order_List> getDesMsgOrderList(Map<String, Object> map) {
		return commMapper.getDesMsgOrderList(map);
	}

	@Override
	public int getDesMsgOrderCount(Map<String, Object> map) {
		return commMapper.getDesMsgOrderCount(map);
	}

	@Override
/*	11 无情拒绝 12 朕收了  2.待确认 我知道了，*/
	public int saveDesOrderDjt(Long userid,String orderno,String type, String content) throws Exception {
		int iadd=0;
/*增加会话 begin*/
		if (CommonUtil.isEmpty(content)==false) {
			Sales_Message sm = new Sales_Message();
			sm.setSm_orderno(orderno);
			sm.setSm_content(content);
			sm.setSm_designerid(userid);
			iadd=messageService.addOrderMessage(sm, 1);
		};
/*增加会话 end*/


		if ("0".equals(type)){/*无情拒绝*/
		    iadd=iadd+saveOrderRevoke(orderno,5);
		};
		if ("1".equals(type)){/*朕收了*/
			Long orderid=orderMapper.getOrderId(orderno);
		    Sales_Order so=new Sales_Order();
		    so.setOf_id(orderid);
			so.setOf_adjdateread(true);
			so.setOf_status((byte) 2);
			so.setOf_flagsuccess(true);
			iadd=orderMapper.updateByPrimaryKeySelective(so);
			saveOrderStatusToRedis(orderno,null, (byte) so.getOf_status(),(byte)0);/*保存订单状态到redis*/
		};
		return iadd;

	}




	@Override
/*设计师统计数量订单状态*/
	public SalesV_Order_CountDes getDesOrderCount(Long userid) {
		return salesv_order_countdes.getDesOrderCount(userid);
	}

	@Override
	 /*调整日期，接收拜贴和撤回拜贴这三个接口涉及 需要调整的日期，确定完成，状态编码*/
	public boolean saveOrderStatusToRedis(String orderno, Date meetdate,byte orderstatus,byte appealstatus) {
		boolean rut=true;
		Sales_Order som = gson.fromJson(redisService.getMapRow(Constants.REDIS_ORDER_STATUS,orderno), Sales_Order.class);
		if (som==null){som=orderMapper.getOrderMemo(orderno,4);};
		if (meetdate!=null){som.setOf_datemeet(meetdate);};/*重定当前状态*/
	//	if (flagfinish!=null){som.setOf_flagfinish(flagfinish);};/*重定当前状态*/
		if (orderstatus!=0){som.setOf_status(orderstatus);};/*重定订单状态*/
		if (appealstatus!=0){som.setOf_appealstatus(appealstatus);};/*重定申诉状态*/
	//	if ((CommonUtil.read_boolean(som.getOf_flagfinish())==false)) {
		redisService.saveMapRow(Constants.REDIS_ORDER_STATUS, orderno, gson.toJson(som)); /*存入订单状态*/
		/*}else{
			redisService.removeMapRow(Constants.REDIS_ORDER_STATUS, orderno);*//*删除*//*
		};*/
		return rut;

	}

	@Override
	public List<SalesV_Order_Sms> getOrderSmsNotice(Integer type,String orderno,Long createid) {
		return order_smsmapper.getOrderSmsNotice(type,orderno,createid);
	}

	@Override
	/*获取订单状态*/
	public List<Sales_Order> getOrderStatusList(Integer type) {
		return orderMapper.getOrderStatusList(type);
	}


}

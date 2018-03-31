package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.*;
import com.morsearch.service.OrderService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

/*订单处理接口*/

@Controller("FrontOrderController")
@RequestMapping("/front/")

public class FrontOrderController extends BaseController {
	@Resource
	private OrderService orderService;
	private  String userid;
	private  String orderno;
	private  String salesmanid;
	private  String desginerid;



/*业务员订单列表
* leoli
* 2017.10.25
*
*1申述
2待接贴
3待拜访
4待评价
5已完成

* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getorderlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getorderlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;
		String type=request.getParameter("type");

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true )) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true )) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("类别参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/
/*处理数据 begin*/
		List<SalesV_Order_List> list = new ArrayList<SalesV_Order_List>();

		if (flag_pass==true) {
			try {

			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String,Object> map=new HashMap<String,Object>();
				map.put("pagestart",page.getPagestart());
				map.put("pagesize",page.getPagesize());
				map.put("userid",userid);
				map.put("type",type);
			/*查询条件 end*/
				list=orderService.getOrderstatuslist(map);
				page.setRowcount(orderService.getOrderstatusCount(map));/*记录数*/
				appresult.setPage(page);
				if (list==null|| list.size()== 0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(list);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

/*
撤回拜贴
leoli
2017.10.25
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "saveorderrevoke", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String saveorderrevoke(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		orderno=request.getParameter("orderno");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("用户ID不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单号不能为空");
			flag_pass = false;
		};
		Sales_Order so=orderService.getOrderMemo(orderno,1);
		if (flag_pass==true&&so!=null) {
			if (flag_pass==true&&so.getOf_flagfinish() != null && so.getOf_flagfinish() == true) {
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单已完成");
				flag_pass = false;
			};
			if (flag_pass==true&&so.getOf_status()!= null && so.getOf_status() !=1) { /*发贴状态为1*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单状态已改变");
				flag_pass = false;
			};
			if (flag_pass==true&&so.getOf_createid()!=Long.parseLong(userid)) { /*查对应用户*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("不是本人订单");
				flag_pass = false;
			};
			if ((flag_pass==true)&&((System.currentTimeMillis()-((Long)so.getOf_dateorder().getTime()/1000))<7200)){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("允许的撤回时间还未到");
				flag_pass = false;
			};
		};
		if (flag_pass==true&&so==null){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此订单号");
			flag_pass = false;
		};
/*检查参数 end*/

/*处理数据 begin*/

		if (flag_pass==true) {
			try {
				int iadd=orderService.saveOrderRevoke(orderno,4);
				if (iadd== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}




	/*
    *业务员消息首页，获取用户消息订单
    * leoli
    * 2017.12.07
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getusermsgorder", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getsalesmessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		List<SalesV_Order_Msg> um = new ArrayList<SalesV_Order_Msg>();

		if (flag_pass==true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String,Object> map=new HashMap<String,Object>();
				map.put("pagestart",page.getPagestart());
				map.put("pagesize",page.getPagesize());
				map.put("userid",Long.parseLong(userid));
			/*查询条件 end*/
				um=messageService.getSales_Order_Msg_list(map);
				page.setRowcount(messageService.getSales_Order_Msg_count(map));/*记录数*/
				appresult.setPage(page);
				if (um==null && um.size()==0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(um);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}




	/*
    完成拜贴
    leoli
    2017.10.25
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "saveorderfinish", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String saveorderfinish(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		orderno=request.getParameter("orderno");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("用户ID不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单号不能为空");
			flag_pass = false;
		};
		Sales_Order so=orderService.getOrderMemo(orderno,1);
		if (flag_pass==true&&so!=null) {
			if (flag_pass==true&&so.getOf_status()!= null && so.getOf_status() !=3) { /*发贴状态为1*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单状态已改变");
				flag_pass = false;
			};
			if (flag_pass==true&&so.getOf_createid()!=Long.parseLong(userid)) { /*查对应用户*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("不是本人订单");
				flag_pass = false;
			};
		};
		if (flag_pass==true&&so==null){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此订单号");
			flag_pass = false;
		};
/*检查参数 end*/

/*处理数据 begin*/

		if (flag_pass==true) {
			try {
				int iadd=orderService.saveorderfinish(orderno,8);
				if (iadd== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	/*
    发送拜贴
    leoli
    2017.10.26
    type ,支付帐户，1为企业，2为个人
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "addorder", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String addorder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		salesmanid=request.getParameter("salesmanid");
		desginerid=request.getParameter("desginerid");
		String coin=request.getParameter("coin");
		String content=request.getParameter("content");
		String meetdate=request.getParameter("meetdate");
		String talkcode=request.getParameter("talkcode");
		String type=request.getParameter("type");
		Boolean flag_pass=true;

		if (CommonUtil.isEmpty(talkcode)==true){talkcode="1";};
		if (CommonUtil.isEmpty(type)==true){type="2";};

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(salesmanid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("业务员ID参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(desginerid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("设计师ID参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(coin)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("拜贴类别不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(talkcode)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("talkcode不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(content)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("拜贴内容不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(meetdate)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("拜访时间不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(desginerid.equals(salesmanid))) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("操作逻辑有误");
			flag_pass = false;
		};

/*检查参数 end*/
		if (flag_pass==true&&(orderService.getOrderSendQty(Long.parseLong(salesmanid),Long.parseLong(desginerid), (byte)1)>=1)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("拜贴还未处理，不允许重复发送");
			flag_pass = false;
		};

		if (userService.isUserId(Long.parseLong(salesmanid))==false){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此业务员");
			flag_pass = false;
		};

		if (userService.isUserId(Long.parseLong(desginerid))==false){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此设计师");
			flag_pass = false;
		};


/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Sales_Order so=new Sales_Order();
				so.setOf_no(SequenceCreator.createnumber("",5));
				so.setOf_dateorder(new Date());
				so.setOf_datemeet(DateTimeUtil.longconvertdate(Long.parseLong(meetdate)));
				so.setOf_dateplanclose(DateTimeUtil.addDay(so.getOf_datemeet(),Constants.ORDER_PLANCLOSE_TIME));
				so.setOf_dateupdate(new Date());
				so.setOf_custid(Long.parseLong(desginerid));
				so.setOf_talkcontent(content);
				so.setOf_talklastmsg("等待接贴 ");/*最新一次 content.substring(0,content.length()>30?30:content.length())*/
				so.setOf_coincode(coin);/*金币*/
				so.setOf_checkmsgd(true);
				so.setOf_talkcode(talkcode);
				so.setOf_checkmsgs(false);
				so.setOf_createid(Long.parseLong(salesmanid));
				so.setOf_createno(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,salesmanid,"userno"));
				so.setOf_createdate(new Date());
				so.setOf_status((byte) 1);
				so.setOf_sourcename(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,salesmanid,"loginsource"));
				so.setOf_sourceversion(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,salesmanid,"loginversion"));
				/*查用户 begin*/
				SysV_UserFull svh=userService.getUser_FullDetail(Long.parseLong(desginerid),5);
				if (svh!=null){
					so.setOf_custname(svh.getUr_namenick());
					so.setOf_talkhead("尊敬的"+svh.getUr_namenick()+"，您好");
				};
				SysV_UserFull svs=userService.getUser_FullDetail(Long.parseLong(salesmanid),5);/*查用户 end*/
				if (svs!=null&&CommonUtil.read_boolean(svs.getUr_msgflag2()==true)){
					so.setOf_talksign(svs.getUr_namenick()+"");
					rs=so.getOf_no();
					int iadd=orderService.addorder(so,"1".equals(type));
					if (iadd>0) {
					orderService.saveOrderStatusToRedis(so.getOf_no(), null, (byte) 0, (byte) 0); /*存入订单状态,放在接口，新增事务处理后增加*/
					};
					}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此用户还未完善资料");
					flag_pass = false;
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(e.getMessage());
				if ("拜贴已用完，请充值".equals(e.getMessage())){appresult.setErrorcode("-1");};

			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(rs);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*
* 调整拜贴会面时间
* leoli
*
* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savemeettime", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savemeettime(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		String userid=request.getParameter("userid");
		String orderno=request.getParameter("orderno");
		String meetdate=request.getParameter("meetdate");
		String content=request.getParameter("content");

		Boolean flag_pass=true;
/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};
*/

		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("orderno参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(meetdate)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("meetdate参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(content)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("拜贴内容不能为空");
			flag_pass = false;
		};

		Sales_Order soc=orderService.getOrderMemo(orderno,0);
		if (soc!=null){

			if (CommonUtil.isEmpty(userid)==false &&!userid.equals(soc.getOf_createid())){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单信息不符");
				flag_pass = false;
			};

			if (soc.getOf_status()!=1&&soc.getOf_status()!=2){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单状态不能调整时间");
				flag_pass = false;
			};

		}else{
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此订单");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/

		if (flag_pass==true) {
			try {
				Long orderid=orderService.getOrderId(orderno);
				Sales_Order so=new Sales_Order();
				so.setOf_id(orderid);
				so.setOf_no(orderno);
				so.setOf_datemeet(DateTimeUtil.longconvertdate(Long.parseLong(meetdate)));
				so.setOf_dateplanclose(DateTimeUtil.addDay(so.getOf_datemeet(),Constants.ORDER_PLANCLOSE_TIME));
				so.setOf_talkcontent(content);
				so.setOf_talklastmsg("调整拜贴时间");/*最新一次*/
				so.setOf_dateupdate(new Date());
				so.setOf_noticemeet(false);/*重置false,防止短信已发的情况下，需要再重新发送*/
				so.setOf_adjdateread(false); /*调整时间*/
				so.setOf_adjdatemsg("拜访时间已变更为"+DateTimeUtil.getDateStrChinese(so.getOf_datemeet())+"，还请确认");
				int ii=orderService.saveorder(so,true);
				if (ii== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("无此订单");
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*获取订单提醒列表
	Leoli
	2017.12.4
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getordersms", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getordersms(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String userid=request.getParameter("userid");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				List<SalesV_Order_Sms>  us = orderService.getOrderSmsNotice(2,null,Long.parseLong(userid));
				appresult.setData(us);


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/

		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}





}

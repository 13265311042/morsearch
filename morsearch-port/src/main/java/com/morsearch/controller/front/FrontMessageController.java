package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.model.*;
import com.morsearch.service.*;
import com.morsearch.service.impl.MessageServiceImpl;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.CallOn;
import com.morsearch.vo.OrderMessagHead;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

//消息类接口

@Controller("FrontMessageController")
@RequestMapping("/front/")

public class FrontMessageController extends BaseController {


	@Resource
	private SalesVInterestService salesVInterestService;
	@Resource
	private SalesVLookMeService salesVLookMeService;
	@Resource
	private OrderService orderService;
	@Resource
	private LableListService lableListService;


	private  String salesmanid;
	private  String desginerid;
	private  String userid;
	private  String orderno;

/*保存谁看了我
leoli
2017.10.23
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savesaleslookme", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savesaleslookme(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		salesmanid=request.getParameter("salesmanid");
		desginerid=request.getParameter("desginerid");
		Boolean flag_pass=true;

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

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Sales_LookMe lm=new Sales_LookMe();
				lm.setSl_salesmanid(Long.parseLong(salesmanid));
				lm.setSl_desginerid(Long.parseLong(desginerid));
				lm.setSl_createdate(new Date()); /*保存最新日期*/
				String skey="SalesLookMe"+DateTimeUtil.getStrFormat(new Date(),"yyyyMMdd")+"."+salesmanid+"."+desginerid;/*key值*/
				int iadd=0;
				String svalue=redisService.getStringValue(skey);

				if (svalue==null){
					iadd=messageService.addSalesLookMe(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,desginerid,"name.job"));
				}else{
					lm.setSl_id(Long.parseLong(svalue));/*读取ID*/
					iadd=messageService.updateSalesLookMe(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,desginerid,"name.job"));
				};
				if (iadd>0)
				{
					redisService.saveStringValue(skey,lm.getSl_id()+"",60*60*24);/*保留24小时*/
				}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_ADD_FAIL);
				};
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


	/*保存谁对我有兴趣
    leoli
    2017.10.23
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savesalesinterest", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savesalesinterest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		salesmanid=request.getParameter("salesmanid");
		desginerid=request.getParameter("desginerid");
		String pmid=request.getParameter("pmid");
		Boolean flag_pass=true;

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
		if (flag_pass==true&&(CommonUtil.isEmpty(pmid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("pmid参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Sales_Interest lm=new Sales_Interest();
				lm.setSi_salesmanid(Long.parseLong(salesmanid));
				lm.setSi_desginerid(Long.parseLong(desginerid));
				lm.setSi_createdate(new Date()); /*保存最新日期*/
				lm.setSi_pmid(Long.parseLong(pmid));
				lm.setSi_pmtitle(commService.getPmArchivesTitle(Long.parseLong(pmid)));/*获取档案title*/
				String skey="SalesInterest"+DateTimeUtil.getStrFormat(new Date(),"yyyyMMdd")+"."+salesmanid+"."+desginerid;/*key值*/
				int iadd=0;
				String svalue=redisService.getStringValue(skey);
				if (svalue==null){
					iadd=messageService.addSalesInterest(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,desginerid,"name.job"));

				}else{
					lm.setSi_id(Long.parseLong(svalue));/*读取ID*/
					iadd=messageService.updateSalesInterest(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,desginerid,"name.job"));
				};
				if (iadd>0)
				{
					redisService.saveStringValue(skey,lm.getSi_id()+"",60*60*24);/*保留24小时*/
				}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_ADD_FAIL);
				};

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
    *设置用户已读信息状态
    * leoli
    * 2017.10.27
    * type=1, 谁看了我，type=2，谁对我感兴趣
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "saveusermsgread", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String saveusermsgread(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;
		String type=request.getParameter("type");
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("type参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Sys_User_Msg um=new Sys_User_Msg();
				um.setUm_userid(Long.parseLong(userid));
				if ("1".equals(type)){ /*谁看了我*/
					um.setUm_lookmetime(0);
				};
				if ("2".equals(type)){ /*谁对我感兴趣*/
					um.setUm_interesttime(0);
				};
				if ("4".equals(type)){ /*设计师拜帖消息数量*/
					um.setUm_dsg_baitietime(0);
				};
				if ("5".equals(type)){ /*设计师审核消息数量*/
					um.setUm_dsg_audittime(0);
				};
				if ("6".equals(type)){ /*设计师投诉消息数量*/
					um.setUm_dsg_appealtime(0);
				};

				messageService.saveUserMessage(type,um);/*保存*/

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
订单消息已读
leoli
orderno-- 订单单号
type---2业务员，1为设计师
* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "saveordermsgread", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String saveordermsgread(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		Boolean flag_pass=true;

/*检查参数 begin*/
		orderno=request.getParameter("orderno");
		String type=request.getParameter("type");
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单单号参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("类别参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				messageService.saveOrderMsgRead(orderno,Integer.parseInt(type));

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
				if (!"".equals(e.getMessage())){appresult.setMessage(e.getMessage());};
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


/*保存订单消息对话内容
leoli
*orderno
* salesmanid
* desginerid
* content
* type 1.设计师，2为业务员
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "addordermsgcontent", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String addordermsgcontent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		orderno=request.getParameter("orderno");
		userid=request.getParameter("userid");
		String type=request.getParameter("type");
		String content=request.getParameter("content");
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单单号参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("type参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(content)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("消息内容不能为空");
			flag_pass = false;
		};

		Sales_Order so=orderService.getOrderMemo(orderno,0);
		if (flag_pass==true&&so!=null){
			if (flag_pass==true&&"1".equals(type)&&(so.getOf_custid()!=Long.parseLong(userid))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单的设计师不符合");
				flag_pass = false;
			};
			if (flag_pass==true&&"2".equals(type)&&(so.getOf_createid()!=Long.parseLong(userid))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("订单的业务员不符合");
				flag_pass = false;
			};

			if (flag_pass==true&&"2".equals(type)&&(so.getOf_status()==1)){ /*不允许操作信息*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("设计师未处理，暂时不能发送");
				flag_pass = false;
			};

			if (flag_pass==true&&(so.getOf_flagfinish()==true&&so.getOf_flagsuccess()==false)){ /*不允许操作信息*/
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("拜贴已过期，不能发送");
				flag_pass = false;
			};

		};
		if (flag_pass==true&&so==null){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此订单");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {

				Sales_Message sm=new Sales_Message();
				sm.setSm_orderno(orderno);
				sm.setSm_content(content);
				sm.setSm_createdate(new Date());
				sm.setSm_flagstop(false);
				sm.setSm_type(Byte.valueOf(type));
				if ("1".equals(type)){
					sm.setSm_designerid(Long.parseLong(userid));/*设计师*/
				}else{
					sm.setSm_salerid(Long.parseLong(userid)); /*业务员*/
				};
				int iadd=messageService.addOrderMessage(sm,Integer.parseInt(type));
				if (iadd== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_ADD_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
				if (!"".equals(e.getMessage())){appresult.setMessage(e.getMessage());};
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

/*获取消息对话框表头
leoli
orderno
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getordermsghead", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getordermsghead(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		orderno=request.getParameter("orderno");
		String type=request.getParameter("type");
		Boolean flag_pass=true;
		if (CommonUtil.isEmpty(type)==true){type="2";};
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单单号参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		OrderMessagHead om=new OrderMessagHead();

		if (flag_pass==true) {
			try {
				/*查订单*/
				Sales_Order so=orderService.getOrderMemo(orderno,2);
				if (so!=null){
					om.setOrderno(so.getOf_no());
					om.setTalkhead(so.getOf_talkhead());
					om.setTalkcontent(so.getOf_talkcontent());
					om.setTalkcode(so.getOf_talkcode());
					om.setTalksign(so.getOf_talksign());
					om.setCoinname(so.getOf_coinname());
					om.setCoinimage(so.getOf_coinimage());
					om.setDatemeet(so.getOf_datemeet());
					om.setCoincode(so.getOf_coincode());
					om.setAdjdatemsg(so.getOf_adjdatemsg());
					om.setAdjdateread(so.getOf_adjdateread());
					om.setFlagfinish(so.getOf_flagfinish());
					om.setFlagsuccess(so.getOf_flagsuccess());
					om.setOrderstatus(so.getOf_status());

/*处理不允许发送信息 begin*/
					om.setIsoperate(true);
					if ("2".equals(type)&&(so.getOf_status()==1)){ /*不允许操作信息*/
						om.setIsoperate(false);
					};
					if (so.getOf_flagfinish()==true&&so.getOf_flagsuccess()==false){ /*不允许操作信息*/
						om.setIsoperate(false);
					};
/*处理不允许发送信息 end*/

					if (so.getOf_talkcode()==null){so.setOf_talkcode("1");};
					Sys_WordList sw=commService.getSys_WordCodeDetail("2001",so.getOf_talkcode());
					om.setTalkformat(sw.getSw_include());
/*获取个人信息*/
					SysV_UserFull userFull = userService.getUser_FullDetail(so.getOf_createid(),8);
					if (userFull!=null) {
						om.setCompanyname(userFull.getUe_companyname());
						om.setNamenick(userFull.getUr_namenick());
						om.setImageurl(userFull.getUr_imageurl());
						om.setPersonjob(userFull.getUe_personjob());
					};

					SysV_UserFull ufcust=userService.getUser_FullDetail(so.getOf_custid(),8);
					if (ufcust!=null) {
						om.setDesig_namenick(ufcust.getUr_namenick());
						om.setDesig_imageurl(ufcust.getUr_imageurl());
					};


				}else{
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
		appresult.setData(om);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*获取消息对话框列表
    leoli
    orderno
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getordermsglist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getordermsglist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		orderno=request.getParameter("orderno");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单单号参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		List<Sales_Message> sm = new ArrayList<Sales_Message>();
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
				map.put("orderno",orderno);
			/*查询条件 end*/
				sm=messageService.getOrderMsg_list(map);
				page.setRowcount(messageService.getOrderMsg_count(map));/*记录数*/
				appresult.setPage(page);
				if (sm==null && sm.size()==0) {
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
		appresult.setData(sm);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	/**
	 *
	 * 谁看了我列表详情
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getsaleslookmedetails", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getsaleslookmedetails(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		Boolean flag_pass=true;/*检查是否能过*/
		String id = request.getParameter("sl_salesmanid");
		if (flag_pass==true&&(CommonUtil.isEmpty(id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("id不能为空");
			flag_pass = false;
		};

		List<SalesV_LookMe> list=new ArrayList<>();

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
				map.put("sl_salesmanid",id);       //业务员ID
				map.put("ue_personjob",request.getParameter("desginer_job"));         //个人职位
				map.put("desginer_message",request.getParameter("desginer_message"));   			 //动态信息
				map.put("desginer_imageurl",request.getParameter("desginer_imageurl"));
				map.put("desginer_name",request.getParameter("desginer_name"));
				map.put("sl_createdate",request.getParameter("sl_createdate")); //日期

	/*查询条件 end*/
				list=salesVLookMeService.getLookList(map);
				page.setRowcount(salesVLookMeService.getLookListCount(map));//*记录数*//*
				appresult.setPage(page);
				if (list==null){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		};
	   /*处理数据 end*/
		/*返回数据 begin*/
		appresult.setData(list);
		//appresult.setData(salesV);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
		/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/

		return null;

	}

	/**
	 *
	 * 对我感兴趣列表详情
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getsalesvinterest", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getsalesvinterest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;/*检查是否能过*/
		String id = request.getParameter("si_salesmanid");
		if (flag_pass==true&&(CommonUtil.isEmpty(id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("id不能为空");
			flag_pass = false;
		};

		List<SalesV_Interest> list=new ArrayList<SalesV_Interest>();

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
				map.put("si_salesmanid",id);       //业务员ID

			/*查询条件 end*/
				list=salesVInterestService.getinterestList(map);
				page.setRowcount(salesVInterestService.getinterestListCount(map));//*记录数*//*
				appresult.setPage(page);
				if (list==null){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		};
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

	/**
	 *拜贴内容
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getcallon", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getcallon(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;/*检查是否能过*/

		String  id = request.getParameter("ur_id");
		if (flag_pass==true&&(CommonUtil.isEmpty(id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
		CallOn cn = new CallOn();
		if (flag_pass==true){
			try{
				SysV_UserFull userFull = userService.getUser_FullDetail(Long.valueOf(id),8);
				cn.setCompanyname(userFull.getUe_companyname());
				cn.setNamenick(userFull.getUr_namenick());
				cn.setPersonjob(userFull.getUe_personjob());
				cn.setContent(commService.getSys_WordListSingle("2001").get(0).getSw_include());
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}

		}
		appresult.setData(cn);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/

		return null;
	}


}

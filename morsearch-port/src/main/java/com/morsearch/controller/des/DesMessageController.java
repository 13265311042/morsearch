package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.MsgVAuditListService;
import com.morsearch.service.OrderService;
import com.morsearch.service.SalesVAppealMsgService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.MsgDesig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//设计师消息

@Controller("DesMessageController")
@RequestMapping("/des/")

public class DesMessageController extends BaseController {
	@Resource
	private WalletService walletService;
	@Resource
	private OrderService orderService;
	@Resource
	private SalesVAppealMsgService salesVAppealMsgService;
	@Resource
	private MsgVAuditListService msgVAuditListService;


/*设计师消息数量统计
* leoli
* 2017.11.23
* */

	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getdesmsgsum", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getdesmsgsum(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);

		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String userid = request.getParameter("userid");
		Boolean flag_pass = true;

/*检查参数 begin*/
		if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		}
		;

/*检查参数 end*/
/*处理数据 begin*/
		MsgDesig md = new MsgDesig();

		if (flag_pass == true) {
			try {
				Sys_User_Msg um=userService.getUserMessage(Long.valueOf(userid));
				md.setDsg_baitietime(CommonUtil.read_int(um.getUm_dsg_baitietime()));
				md.setDsg_audittime(CommonUtil.read_int(um.getUm_dsg_audittime()));
				md.setDsg_appealtime(CommonUtil.read_int(um.getUm_dsg_appealtime()));
				md.setLookmetime(CommonUtil.read_int(um.getUm_lookmetime()));
				md.setInteresttime(CommonUtil.read_int(um.getUm_interesttime()));
				md.setOrdermsgtime(CommonUtil.read_int(um.getUm_ordermsgtime()));

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(md);
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*WEB设计师,拜贴消息
    *leoli
    * 2017.11.21
    * */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getdesmsgorder", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getdesmsgorder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String userid = request.getParameter("userid");
		Boolean flag_pass = true;

/*检查参数 begin*/
		if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[userid]参数不能为空");
			flag_pass = false;
		}
		;
/*检查参数 end*/
/*处理数据 begin*/
		List<MsgV_Order_List> wm = new ArrayList<MsgV_Order_List>();
		if (flag_pass == true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pagestart", page.getPagestart());
				map.put("pagesize", page.getPagesize());
				map.put("userid", Long.parseLong(userid));
			/*查询条件 end*/
				wm = orderService.getDesMsgOrderList(map);
				page.setRowcount(orderService.getDesMsgOrderCount(map));/*记录数*/
				appresult.setPage(page);
				if (wm == null && wm.size() == 0) {
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
		appresult.setData(wm);
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*
*//*设计师设置拜贴消息已读
* leoli
* 2017.11.23
* *//*

	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "savedesmsgorderread", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savedesmsgorderread(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		String msglist = request.getParameter("msglist");
		Boolean flag_pass = true;
*//*检查参数 begin*//*
		if (flag_pass == true && (CommonUtil.isEmpty(msglist) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("msglist参数不能为空");
			flag_pass = false;
		}
		;

*//*检查参数 end*//*
*//*处理数据 begin*//*
		if (flag_pass == true) {
			try {
				int iadd = orderService.saveDesOrderMsgRead(msglist);
				if (iadd == 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}
				;
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
*//*处理数据 end*//*
*//*返回数据 begin*//*
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
*//*处理数据格式*//*
		out.print(rs);
		out.close();
*//*返回数据 end*//*
		return null;
	}*/


	/**
	 * 投诉消息列表
	 *ywh
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getcomplainList", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getcomplainList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass = true;/*检查是否能过*/

		String id = request.getParameter("sp_createid");

		List<MsgV_Appeal_List> list = new ArrayList<MsgV_Appeal_List>();
		if (flag_pass == true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pagestart", page.getPagestart());
				map.put("pagesize", page.getPagesize());
				map.put("sp_createid", Long.parseLong(id));
			/*查询条件 end*/
				list = salesVAppealMsgService.getSalesV_Appeal_MsgList(map);
				page.setRowcount(salesVAppealMsgService.getCountSalesV_Appeal_Msg(map));/*记录数*/
				appresult.setPage(page);
				if (list == null && list.size() == 0) {
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
		appresult.setData(list);
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	/**
	 * 投诉消息已读
	 * ywh
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
     */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "updatecomplain", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String updatecomplain(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		Boolean flag_pass = true;/*检查是否能过*/

		String nolist = request.getParameter("sp_no");
		if (flag_pass == true && (CommonUtil.isEmpty(nolist) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("msglist参数不能为空");
			flag_pass = false;
		}
		;

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass == true) {
			try {
				int iadd = salesVAppealMsgService.updateMegApple(nolist);
				if (iadd == 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}
				;
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
}

	/**
	 *
	 *审核消息列表
	 * ywh
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
     */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getAuditinglist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getAuditinglist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass = true;/*检查是否能过*/

		String id = request.getParameter("sp_createid");
		if (flag_pass == true && (CommonUtil.isEmpty(id) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("id参数不能为空");
			flag_pass = false;
		}
		List<MsgV_Audit_List> list = new ArrayList<MsgV_Audit_List>();
		if (flag_pass == true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pagestart", page.getPagestart());
				map.put("pagesize", page.getPagesize());
				map.put("sp_createid", Long.parseLong(id));
			/*查询条件 end*/
				list = msgVAuditListService.getMsgV_Audit_ListList(map);
				page.setRowcount(msgVAuditListService.getCountMsgV_Audit_List(map));/*记录数*/
				appresult.setPage(page);
				if (list == null && list.size() == 0) {
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
		appresult.setData(list);
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
}

	/**
	 *
	 * 审核消息已读
	 * ywh
	 */

	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "updateAuditing", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String updateAuditing(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		Boolean flag_pass = true;/*检查是否能过*/


		String nolist = request.getParameter("sp_no");
		if (flag_pass == true && (CommonUtil.isEmpty(nolist) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("msglist参数不能为空");
			flag_pass = false;
		}
		;

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass == true) {
			try {
				int iadd = msgVAuditListService.updateMegAudit(nolist);
				if (iadd == 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}
				;
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}
}
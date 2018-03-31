package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.OrderService;
import com.morsearch.service.WalletService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//设计师订单 Leoli 2017.11.22

@Controller("DesOrderController")
@RequestMapping("/des/")

public class DesOrderController extends BaseController {
	@Resource
	private WalletService walletService;
	@Resource
	private OrderService orderService;


	/*WEB设计师,获取我的访客
    *leoli
    * 2017.11.21
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getdesmyguest", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getdesmyguest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
			appresult.setMessage("[userid]参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/
/*处理数据 begin*/
		List<SalesV_Order_Guest> wm = new ArrayList<SalesV_Order_Guest>();
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
				wm=orderService.getDesOrderGuestList(map);
				page.setRowcount(orderService.getDesOrderGuestCount(map));/*记录数*/
				appresult.setPage(page);
				if (wm==null && wm.size()==0) {
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
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}



/*更改设计师订单--待接贴
* leoli
* 2017.11.23
11 无情拒绝 12 朕收了  2.待确认 我知道了，3.待接见,4.待评价,5.已完成

3.待接见,4.待评价,5.已完成-----采用定时器时间处理，按会面时间后是待评价，
*/

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savedesorderdjt", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savedesorderdjt(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		String userid=request.getParameter("userid");
		String orderno=request.getParameter("orderno");
		String content=request.getParameter("content");
		String type=request.getParameter("type");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("orderno参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("type参数不能为空");
			flag_pass = false;
		};

/*
		if (flag_pass==true&&(CommonUtil.isEmpty(content)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("content参数不能为空");
			flag_pass = false;
		};
*/

		Sales_Order so=orderService.getOrderMemo(orderno,0);
		if ((flag_pass==true)&&(so==null)){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此订单");
			flag_pass = false;
		};
		if ((flag_pass==true)&&(so!=null)&&(so.getOf_status()!=1)) {/*不是待接贴状态，不是处理*/
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单状态不是待接贴状态");
			flag_pass = false;
		};
		if ((flag_pass==true)&&(so!=null)&&(!userid.equals(so.getOf_custid()+""))) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("订单信息与用户不符");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				int iadd=orderService.saveDesOrderDjt(Long.parseLong(userid),orderno,type,content);
				if (iadd==0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_EDIT_FAIL);
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



	/*更改设计师订单--待确认
    * leoli
    * 2017.11.23
    2.待确认 我知道了
    */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savedesorderdqr", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savedesorderdqr(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		Boolean flag_pass=true;
		String userid=request.getParameter("userid");
		String orderno=request.getParameter("orderno");
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("orderno参数不能为空");
			flag_pass = false;
		};

		if ((flag_pass==true)&&(!userid.equals(""+orderService.getOrderMemo(orderno,0).getOf_custid()))) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("当前订单与用户不符");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {

				Long orderid=orderService.getOrderId(orderno);
				Sales_Order som=new Sales_Order();
				som.setOf_id(orderid);
				som.setOf_adjdateread(true); /*调整时间*/
				int iadd=orderService.saveorder(som,false);
				if (iadd==0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
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


/*获取设计师订单统计状态
leoli
2017.11.23
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getdesordercount", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getdesordercount(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;

/*检查参数 begin*/
		String userid=request.getParameter("userid");
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/

		SalesV_Order_CountDes doc=new SalesV_Order_CountDes();
		if (flag_pass==true) {
			try {
				doc=orderService.getDesOrderCount(Long.parseLong(userid));
				if (doc==null){
					doc=new SalesV_Order_CountDes();
					doc.setDesignid(Long.parseLong(userid));;
					doc.setDjt(new BigDecimal(0));;
					doc.setDjj(new BigDecimal(0));;
					doc.setDpj(new BigDecimal(0));;
					doc.setDqr(new BigDecimal(0));;
					doc.setYwc(new BigDecimal(0));;
				};


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(doc);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}





}

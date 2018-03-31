package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.AccMemoIntegralService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AccMemoIntegral;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
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

//设计师钱包 Leoli 2017.11.21

@Controller("DesWalletController")
@RequestMapping("/des/")

public class DesWalletController extends BaseController {
	@Resource
	private WalletService walletService;
	@Resource
	private AccMemoIntegralService accMemoIntegralService;


	/*WEB 获取魔币明细
    *leoli
    * 2017.11.21
    * */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getaccmemocoin", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getaccmemocoin(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
		List<Acc_MemoCoin> wm = new ArrayList<Acc_MemoCoin>();
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
				wm = walletService.getAcc_Wallet_Memo_Coin_list(map);
				page.setRowcount(walletService.getAcc_Wallet_Memo_Coin_count(map));/*记录数*/
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


	/**
	 * 设计师web 魔币明细
	 * ywh
	 *
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({"unused", "null"})
	@RequestMapping(value = "getmemoIntegral", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getmemoIntegral(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult = new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass = true;
		String userid = request.getParameter("userid");

		if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[userid]参数不能为空");
			flag_pass = false;
		}
		AccMemoIntegral am = new AccMemoIntegral();
		List<Acc_MemoIntegral> wa = new ArrayList<Acc_MemoIntegral>();
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
				wa = accMemoIntegralService.getAcc_MemoIntegralList(map);
				page.setRowcount(accMemoIntegralService.getCountAcc_MemoIntegral(map));/*记录数*/

				appresult.setPage(page);

				Acc_Wallet ac = walletService.getIntegral(Long.valueOf(userid));
				am.setWl_integral(ac.getWl_integral());
				am.setList(wa);


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(am);
		rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}
}
package com.morsearch.controller.comm;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DESUtil;
import com.morsearch.model.Sys_User;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.BASE64Decoder;

//JSON接口例子 Leoli 2017.09.15
// http://localhost:8080/app/test.shtml

@Controller("Apptest")
@RequestMapping("/comm/")

public class Apptest extends BaseController {


	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "test", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String sm_id=request.getParameter("sm_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/
		List<Sys_User> us = new ArrayList<Sys_User>();

		if (flag_pass==true) {
			try {
				us = userService.getuserList(0,10);
				if (us==null || us.size()== 0) {
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
		appresult.setData(us);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}





}

package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Sys_User;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*设计师小程序
* */

@Controller("DesWxApp")
@RequestMapping("/des/")

public class DesWxApp extends BaseController {


/*设计师小程序调用
微信消息推送

* */
	private String TOKEN="";

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "wxstylist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String wxstylist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
	//	String sm_id=request.getParameter("sm_id");
		Boolean flag_pass=true;

		String signature = request.getParameter("signature");
		// 随机字符串
		String echostr = request.getParameter("echostr");
		// 时间戳
		String timestamp = request.getParameter("timestamp");
		// 随机数
		String nonce = request.getParameter("nonce");

/*
		String[] str = { TOKEN, timestamp, nonce };
		Arrays.sort(str); // 字典序排序
		String bigStr = str[0] + str[1] + str[2];
*/
		// SHA1加密
	//	String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();

		// 确认请求来至微信
/*
		if (digest.equals(signature)) {
			response.getWriter().print(echostr);
		}
*/

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
	//	List<Sys_User> us = new ArrayList<Sys_User>();

		if (flag_pass==true) {
			try {
			//	us = userService.getuserList(0,10);


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
	//	appresult.setData(us);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(echostr);
		out.close();
/*返回数据 end*/
		return null;
	}






}

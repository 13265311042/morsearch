package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.mongo.OpertionLog;
import com.morsearch.mongo.OpertionLogQuery;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

/*
* 业务员接口
* */

@Controller("FrontSalesController")
@RequestMapping("/front/")

public class FrontSalesController extends BaseController {


	private  String ur_id;


/*业务员查看设计师
* 保存次数*/
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savecheckdesign", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savecheckdesign(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String ur_id=request.getParameter("ur_id");
		Boolean flag_pass=true;

/*检查参数 begin*/
/*
		if (flag_pass==true&&(ur_id==null || "".equals(ur_id))) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/
	//	List<Sys_User> us = new ArrayList<Sys_User>();


		OpertionLog ab=new OpertionLog();
		ab.setUsername("addfd");
		ab.setLogTime(new Date());
		ab.setMenuName("989");
		mongoService.addOperationLog(ab);


		AppPage pageCom = new AppPage(1, 1);
		OpertionLogQuery query = new OpertionLogQuery();
		query.setMenuName("9");
		List<OpertionLog> list = mongoService.queryOpertionLog(pageCom, query);


		if (flag_pass==true) {
			try {
/*
				us = userService.getuserList(0,10);
				if (us==null || us.size()== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

*/
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



}

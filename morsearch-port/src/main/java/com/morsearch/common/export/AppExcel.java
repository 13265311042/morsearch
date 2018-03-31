package com.morsearch.common.export;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Sales_Order;
import com.morsearch.service.OrderService;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/*接口导出Excel例子
leoli
2017-12.06
 */

@Controller("AppExcel")
@RequestMapping("/comm/")

public class AppExcel extends BaseController {
	@Resource
	private OrderService orderService;

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "testexcel", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public void testexcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String sm_id=request.getParameter("sm_id");
		Boolean flag_pass=true;

/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/


/*检查参数 begin*/
		if (flag_pass==true) {
			String[] excelheader = new String[]{"订单号", "业务员"};
			String[] excelkey = new String[]{"of_no", "of_status"};
			OutputStream outs = null;
			List<Object[]> resultexcel = null;
			try {
/*加入处理条件*/
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("userid", request.getParameter("userid"));
/*加入返回结果*/
				List<Map<String, Object>> sos =CommonUtil.objectsToMaps(orderService.getOrderStatusList(1));
/*处理对应位置*/
				resultexcel =ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
/*加入输出流*/
				outs = response.getOutputStream();
/*返回内容*/
			response.reset();
			response.setContentType("application/vnd.ms-excel");
			String filename = new StringBuilder(SequenceCreator.createNewFileName()+".xls").toString();//"repairorderpayment_export.xls";
			response.setHeader("Content-disposition", "attachment; filename=" + filename);
			Locale locale = null;
			if (locale != null && locale == Locale.TRADITIONAL_CHINESE) {
				ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
			} else {
				ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
			}
			} catch (IOException e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}

		};
/*检查参数 end*/
/*处理数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		out.print(rs);
		out.close();
/*返回数据 end*/
//		return null;
	}
















}

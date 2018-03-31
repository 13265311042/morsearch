package com.morsearch.controller.company;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.AccV_MemoAmt;
import com.morsearch.model.Base_Company;
import com.morsearch.service.AccVMemoAmtService;
import com.morsearch.service.BaseCompanyService;
import com.morsearch.vo.AppPage;
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
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ywh on 2017-12-21.
 */
@Controller("CompanyEmployController")
@RequestMapping("/company/")
public class CompanyEmployController extends BaseController {

    @Resource
    private BaseCompanyService baseCompanyService;
    @Resource
    private AccVMemoAmtService accVMemoAmtService;

    /**
     * 资金使用记录
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "Employlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String Employlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String userid = request.getParameter("userid");
        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        List<AccV_MemoAmt> list = new ArrayList<>();
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
                map.put("userid",Long.parseLong(userid));
                map.put("createname", request.getParameter("createname"));
                map.put("orderno", request.getParameter("orderno"));


			/*查询条件 end*/
                list =accVMemoAmtService.getAccV_MemoAmtlist(map);
                page.setRowcount(accVMemoAmtService.getCountAccV_MemoAmt(map));//*记录数*//*
                appresult.setPage(page);
                if (list == null) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }


    /**
     * 资金使用导出
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "exportEmploy", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String exportEmploy(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
      /*  String sc_activityid = request.getParameter("ba_id");//这是活动的id*/
        String userid=request.getParameter("sm_id");
        String date1 = request.getParameter("date1");
        String date2 = request.getParameter("date2");
        String tomorrow="";
        String StartDate="";
        if(date1!=""&&date2!="") {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            date = format.parse(date1);
            Date dBefore = new Date();
            Calendar calendar = Calendar.getInstance(); //得到日历
            calendar.setTime(date);//把当前时间赋给日历
            calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
            dBefore = calendar.getTime();   //得到前一天的时间
            //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
           StartDate = format.format(dBefore);    //格式化前一天
            date = format.parse(date2);
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);  //设置为后一天
            tomorrow = format.format(calendar.getTime());//获得后一天
        }else{
            StartDate =date1;
            tomorrow =date2;

        }
        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请先登录");
            flag_pass = false;
        }
       /* if (CommonUtil.isEmpty(sc_activityid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动id不能为空");
            flag_pass = false;
        }*/

        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                //*查询条件 begin*//*

                String[] excelheader = new String[]{ "业务员", "订单单号", "订单时间",
                        "交易明细", "金额明细"};//27
                String[] excelkey = new String[]{"createname", "orderno", "orderdate",
                        "ordertitle","orderaccount"};//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("Date1", StartDate);
                map.put("Date2", tomorrow);

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps(accVMemoAmtService.getAccV_MemoAmtlist(map));
/*处理对应位置*/
                resultexcel = ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
/*加入输出流*/
                outs = response.getOutputStream();
/*返回内容*/
                response.reset();
                response.setContentType("application/vnd.ms-excel;charset=utf-8");
                response.setCharacterEncoding("utf-8");
                String filename = new StringBuilder(SequenceCreator.createNewFileName()+".xls").toString();//"repairorderpayment_export.xls";
                response.setHeader("Content-disposition", "attachment; filename=" + filename);
                Locale locale = null;
                if (locale != null && locale == Locale.TRADITIONAL_CHINESE) {
                    ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
                } else {
                    ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("文档导出成功");
                }
            } catch (IOException e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        };
        //*begin返回数据*//*
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        PrintWriter out= ControllerUtils.getPrintWriter(response, logger, "----");
        //*end返回数据

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }
}
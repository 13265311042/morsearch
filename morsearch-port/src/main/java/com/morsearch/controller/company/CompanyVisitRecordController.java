package com.morsearch.controller.company;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Base_Company;
import com.morsearch.model.Base_Company_User;
import com.morsearch.model.SalesV_Order_person;
import com.morsearch.service.BaseCompanyService;
import com.morsearch.service.SalesVOrderPersonService;
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
 * Created by ywh on 2017-12-19.
 */
@Controller("CompanyVisitRecordController")
@RequestMapping("/company/")
public class CompanyVisitRecordController extends BaseController {


    @Resource
    private BaseCompanyService baseCompanyService;

    @Resource
    private SalesVOrderPersonService salesVOrderPersonService;

    /**
     * 已发帖
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getpostlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpostlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String userid = request.getParameter("userid");
        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        List<SalesV_Order_person> list = new ArrayList<SalesV_Order_person>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(new Date());
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("sale_name", request.getParameter("sale_name"));
                map.put("desig_name",request.getParameter("desig_name"));
                //map.put("Date", date);
			/*查询条件 end*/
                list = salesVOrderPersonService.getSalesV_Order_personlist(map);
                page.setRowcount(salesVOrderPersonService.getSalesV_Order_personCount(map));/*记录数*/
                appresult.setPage(page);

                if (list == null || list.size() == 0) {
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
     * 待见面
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "gettobemet", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String gettobemet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String userid = request.getParameter("userid");
        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        List<SalesV_Order_person> list = new ArrayList<SalesV_Order_person>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(new Date());
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("sale_name", request.getParameter("sale_name"));
                map.put("desig_name",request.getParameter("desig_name"));
                //map.put("Date", date);
			/*查询条件 end*/
                list = salesVOrderPersonService.getSalesV_Order_personlist1(map);
                page.setRowcount(salesVOrderPersonService.getSalesV_Order_personCount(map));/*记录数*/
                appresult.setPage(page);

                if (list == null || list.size() == 0) {
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
     * 已完成
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getcompleted", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getcompleted(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("userid");
        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        List<SalesV_Order_person> list = new ArrayList<SalesV_Order_person>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(new Date());
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("sale_name", request.getParameter("sale_name"));
                map.put("desig_name",request.getParameter("desig_name"));
                //map.put("Date", date);
			/*查询条件 end*/
                list = salesVOrderPersonService.getSalesV_Order_personlist2(map);
                page.setRowcount(salesVOrderPersonService.getSalesV_Order_personCount(map));/*记录数*/
                appresult.setPage(page);

                if (list == null || list.size() == 0) {
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
     * 发帖导出
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "export", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String export(HttpServletRequest request, HttpServletResponse response) throws Exception {
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

                String[] excelheader = new String[]{ "业务员姓名", "发帖时间", "拜贴类型",
                        "拜贴金额", "设计师名称", "设计师品牌", "设计师职位", "设计师企业名称", "设计师企业地址"};//27
                String[] excelkey = new String[]{"sale_name", "of_dateorder", "of_coinname",
                        "of_coinprice","desig_name","desig_companybrand","desig_personjob","desig_companyname","desig_companyaddr"};//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("Date1", StartDate);
                map.put("Date2", tomorrow);

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps(salesVOrderPersonService.getSalesV_Order_personlist(map));
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

    /**
     * 待会面导出
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "exporttobemet", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String exporttobemet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
      /*  String sc_activityid = request.getParameter("ba_id");//这是活动的id*/
        String userid=request.getParameter("sm_id");
        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请先登录");
            flag_pass = false;
        }

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

        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                //*查询条件 begin*//*

                String[] excelheader = new String[]{"业务员ID", "业务员姓名", "拜访时间", "拜贴类型",
                        "拜贴金额", "设计师名称", "设计师品牌", "设计师职位", "设计师企业名称", "设计师企业地址"};//27
                String[] excelkey = new String[]{"of_createid", "sale_name", "of_datemeet", "of_coinname",
                        "of_coinprice","desig_name","desig_companybrand","desig_personjob","desig_companyname","desig_companyaddr"};//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("Date3", StartDate);
                map.put("Date4", tomorrow);

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps(salesVOrderPersonService.getSalesV_Order_personlist1(map));
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

    /**
     * 已完成导出
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "exportcompleted", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String exportcompleted(HttpServletRequest request, HttpServletResponse response) throws Exception {
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

                String[] excelheader = new String[]{"业务员ID", "业务员姓名", "完成时间", "拜贴类型",
                        "拜贴金额", "设计师名称","设计师品牌", "设计师职位", "设计师企业名称", "设计师企业地址"};//27
                String[] excelkey = new String[]{"of_createid", "sale_name", "of_datefinish", "of_coinname",
                        "of_coinprice","desig_name","desig_companybrand","desig_personjob","desig_companyname","desig_companyaddr"};//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("Date5", StartDate);
                map.put("Date6", tomorrow);


                List<Map<String, Object>> sos =CommonUtil.objectsToMaps(salesVOrderPersonService.getSalesV_Order_personlist2(map));
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
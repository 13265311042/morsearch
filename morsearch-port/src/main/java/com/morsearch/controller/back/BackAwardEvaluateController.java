package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.*;
import com.morsearch.service.AwardVEvaluateService;
import com.morsearch.vo.AppDatagrid;
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
import java.util.*;

/**
 * Created by hyt on 2017/12/14.
 * 关于评价活动赠币的类
 */

@Controller("BackAwardEvaluateController")
@RequestMapping("/back/")
public class BackAwardEvaluateController extends BaseController{

    @Resource
    private  AwardVEvaluateService awardVEvaluateService;
    /**
     * 评价活动列表展示 zuoxiaochao
     * AwardV_Evaluate
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardvevaluatelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getawardvevaluatelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<AwardV_Evaluate> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("ba_name", request.getParameter("ba_name"));//活动名称
            map.put("ba_status",CommonUtil.convert_Byte(request.getParameter("ba_status")));

                /*开始时间的查询*/
            map.put("ba_datebegin1", CommonUtil.queryTime1(request.getParameter("ba_datebegin1"), request.getParameter("ba_datebegin2")));
            map.put("ba_datebegin2", CommonUtil.queryTime2(request.getParameter("ba_datebegin1"), request.getParameter("ba_datebegin2")));
                /*结束时间的查询*/
            map.put("ba_dateend1", CommonUtil.queryTime1(request.getParameter("ba_dateend1"), request.getParameter("ba_dateend2")));
            map.put("ba_dateend2", CommonUtil.queryTime2(request.getParameter("ba_dateend1"), request.getParameter("ba_dateend2")));
            //查询条件
            us = awardVEvaluateService.getAwardV_EvaluateList(map);
            page.setRowcount(awardVEvaluateService.getCountAwardV_Evaluate(map));
            appResult.setPage(page);

            if (!CommonUtil.isNullOrEmpty(us) && us.size() > 0) {
                appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
            }
        } catch (Exception e) {
            //打印错误的日志
            logger.error(e.getMessage());
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }
        /*end处理数据*/
/*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 充值活动添加 zuoxiaochao
     * Award_Evaluate
     */
    @RequestMapping(value = "addawardevaluate" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String addawardevaluate(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String ba_name = request.getParameter("ba_name");//活动名称(必填)
        String ba_datebegin = request.getParameter("ba_datebegin");//开始时间(必填)
        String ba_dateend = request.getParameter("ba_dateend");//结束时间(必填)

        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String ba_status="1";

        String ba_popup = request.getParameter("ba_popup");//弹窗位置
        String ba_integral_first = request.getParameter("ba_integral_first");//首次评价赠送
        String ba_integral_normal = request.getParameter("ba_integral_normal");//非首次评价赠送

        /*检查参数begin*/
        if (CommonUtil.isEmpty(ba_name)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_datebegin)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("开始时间不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_dateend)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("结束时间不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                //充值送魔币的逻辑
                Award_Evaluate ba = new Award_Evaluate();
                //封装数据
                ba.setBa_name(ba_name);//活动名称
                ba.setBa_datebegin(ba_datebegin);
                ba.setBa_dateend(ba_dateend);
                if(!CommonUtil.isEmpty(ba_popup)){
                    ba.setBa_popup(Short.valueOf(ba_popup));
                }
                ba.setBa_integral_first(CommonUtil.convert_Int(ba_integral_first));//首次评价赠送
                ba.setBa_integral_normal(CommonUtil.convert_Int(ba_integral_normal));//非首次评价赠送
                ba.setBa_status(CommonUtil.convert_Byte(ba_status));
                ba.setBa_createid(Long.valueOf(sm_id));
                ba.setBa_createno(sm_no);
                ba.setBa_createdate(new Date());
                int ii=awardVEvaluateService.addAward_Evaluate(ba);

                if (ii==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*添加失败*/
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/

        /*begin返回数据*/

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * 读取每一条评价活动赠币的详情(修改的前提)
     * Award_Evaluate
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardevaluatedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardevaluatedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        //获取ba_id
        String ba_id = request.getParameter("ba_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(ba_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Award_Evaluate ar = new Award_Evaluate();

        if (flag_pass==true) {
            try {
                ar = awardVEvaluateService.getAward_Evaluatedetail(CommonUtil.convert_Long(ba_id));
                if (ar!=null){
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        appresult.setData(ar);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /***
     * @param request
     *评价活动修改
     * Award_Evaluate
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "saveawardevaluate", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String saveawardevaluate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String ba_id = request.getParameter("ba_id");//得到的id
        String ba_name = request.getParameter("ba_name");//活动名称(必填)
        String ba_datebegin = request.getParameter("ba_datebegin");//开始时间(必填)
        String ba_dateend = request.getParameter("ba_dateend");//结束时间(必填)
        String ba_status = request.getParameter("ba_status");//结束时间(必填)


        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
 /*检查参数begin*/
        if (CommonUtil.isEmpty(ba_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请先登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_name)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_datebegin)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("开始时间不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_dateend)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("结束时间不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Award_Evaluate ar = new Award_Evaluate();
                ar.setBa_id(Long.valueOf(ba_id));
                //封装数据
                ar.setBa_name(ba_name);//活动名称
                ar.setBa_datebegin(ba_datebegin);
                ar.setBa_dateend(ba_dateend);
                ar.setBa_status(CommonUtil.convert_Byte(ba_status));

                ar.setBa_integral_first(CommonUtil.convert_Int(request.getParameter("ba_integral_first")));//首次评价赠送
                ar.setBa_integral_normal(CommonUtil.convert_Int(request.getParameter("ba_integral_normal")));//非首次评价赠送

                ar.setBa_confirmid(CommonUtil.convert_Long(sm_id));
                ar.setBa_confirmno(sm_no);
                ar.setBa_confirmdate(new Date());
                int ii = awardVEvaluateService.updateAward_Evaluate(ar);
                if (ii==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                };/*提示资料不存在*/
            } catch (Exception e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appResult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 删除评价赠送活动
     * Award_Evaluate
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deleteawardevaluate" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deleteawardevaluate(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i=0;

        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String ba_id = request.getParameter("ba_id");
        String sm_id = request.getParameter("sm_id");

        if(CommonUtil.isEmpty(ba_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = awardVEvaluateService.deleteAward_EvaluateById(Long.parseLong(ba_id));

                if(i==1){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_DEL_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_DEL_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        //*end处理数据*//*

        //*begin返回数据*//*
        //其实就是封装数据

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * @param request
     *评论赠币活动发布
     * Award_Evaluate
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "saveawardevaluatestatus", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String saveawardevaluatestatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String ba_id = request.getParameter("ba_id");
        String sm_id = request.getParameter("sm_id");

        String ba_status="2";
        if (CommonUtil.isEmpty(ba_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Award_Evaluate ar = new Award_Evaluate();
                ar.setBa_id(Long.valueOf(ba_id));
                //封装数据
                ar.setBa_status(CommonUtil.convert_Byte(ba_status));
                int ii = awardVEvaluateService.updateAward_Evaluatestatus(ar);
                if (ii==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                };/*提示资料不存在*/
            } catch (Exception e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appResult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /***
     * 评价统计列表
     * AwardV_Evaluate_Count
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardvevaluatedetaillist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardvevaluatedetaillist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        //获取ba_id
        String sc_activityid = request.getParameter("sc_activityid");//活动id
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(sc_activityid)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        List<AwardV_Evaluate_Count> us = new ArrayList<>();

        if (flag_pass==true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                //*查询条件 begin*//*

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("sc_activityid",Long.valueOf(sc_activityid));
                us = awardVEvaluateService.getAwardV_Evaluate_CountList(map);
                page.setRowcount(awardVEvaluateService.getCountAwardV_Evaluate_Count(map));
                appresult.setPage(page);

                if (!CommonUtil.isNullOrEmpty(us) && us.size() > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        appresult.setData(us);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



    /**
     * 评价赠送统计导出 zuoxiaochao
     * Award_Evaluate_Count
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardevaluatecountexport" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getawardevaluatecountexport(HttpServletRequest request, HttpServletResponse response) throws Exception{

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String sc_activityid = request.getParameter("ba_id");//这是活动的id
        String sm_id=request.getParameter("sm_id");
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请先登录");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sc_activityid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动id不能为空");
            flag_pass = false;
        }
        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                //*查询条件 begin*//*

                String[] excelheader = new String[]{"用户名", "手机号", "被评价人", "赠送金额(元)",
                        "是否首次评价", "评价时间"};//27
                String[] excelkey = new String[]{"username", "userphone", "appraisename", "sc_addintegral",
                        "sc_isfirst","sc_createdate"};//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", 10000);
                map.put("sc_activityid", Long.valueOf(sc_activityid));

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps( awardVEvaluateService.getAwardV_Evaluate_CountList(map));
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
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //*end返回数据

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

}

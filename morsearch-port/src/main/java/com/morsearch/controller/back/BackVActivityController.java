package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.AwardV_Share_List;
import com.morsearch.model.AwardV_Share_Count;
import com.morsearch.model.Award_Share;
import com.morsearch.service.AwardShareService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ValueConstants;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * Created by zuoxiaochao on 2017/11/30.
 */
@Controller("BackVActivityController")
@RequestMapping("/back/")
public class BackVActivityController extends BaseController{

    @Resource
    private AwardShareService baseActivityService;
    /**
     * 活动设置显示 zuoxiaochao
     * AwardV_Share_List
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbasevactivitylistlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getbasevactivitylistlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<AwardV_Share_List> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                 //*查询条件 begin*//*

                map.put("pagestart", page.getPagestart());

                map.put("pagesize", page.getPagesize());
                map.put("ba_name",request.getParameter("ba_name"));//活动名称
                if(!CommonUtil.isEmpty(request.getParameter("ba_status"))){
                    map.put("ba_status",request.getParameter("ba_status"));//活动状态
                }
                map.put("ba_tasktype",request.getParameter("ba_tasktype"));//任务类别
                //关于开始时间的查询

                map.put("ba_datebegin1",CommonUtil.queryTime1(request.getParameter("ba_datebegin1"),request.getParameter("ba_datebegin2")));
                map.put("ba_datebegin2",CommonUtil.queryTime2(request.getParameter("ba_datebegin1"),request.getParameter("ba_datebegin2")));
                //关于结束时间的查询
                map.put("ba_dateend1",CommonUtil.queryTime1(request.getParameter("ba_dateend1"),request.getParameter("ba_dateend2")));
                map.put("ba_dateend2",CommonUtil.queryTime2(request.getParameter("ba_dateend1"),request.getParameter("ba_dateend2")));
                //查询条件
                us = baseActivityService.getAwardV_Share_ListList(map);
                page.setRowcount(baseActivityService.getCountAwardV_Share_List(map));
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
        }
        //*end处理数据*//*
/*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        //*begin返回数据*//*
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 活动设置添加 zuoxiaochao
     * Award_Share
     */
    @RequestMapping(value = "addbaseactivity" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String addbaseactivity( HttpServletRequest request, HttpServletResponse response) throws Exception{
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
       /* String ba_popup = request.getParameter("ba_popup");//'弹出位置:0：不弹出，2：首页，3.推荐页',smallint
        String ba_title = request.getParameter("ba_title");//活动标题(必填)
        String ba_link = request.getParameter("ba_link");//活动链接(必填)
        String ba_rule = request.getParameter("ba_rule");//产品特性,也是规则内容(必填)
        String ba_image = request.getParameter("ba_image");//活动图标(必填)*/
        String ba_share_gift = request.getParameter("ba_share_gift");//分享人赠送数(必填)
        String ba_share_astrict = request.getParameter("ba_share_astrict");//分享人是否限定赠送次数(必填)
        String ba_share_count = request.getParameter("ba_share_count");//分享人限定赠送次数
        String ba_receive_gift = request.getParameter("ba_receive_gift");//被分享人赠送数(必填)
        String ba_receive_astrict = request.getParameter("ba_receive_astrict");//被分享人是否限定赠送次数(必填)
        String ba_receive_count = request.getParameter("ba_receive_count");//被分享人限定赠送次数
        String ba_createid = request.getParameter("ba_createid");//建立用户ID
        String ba_createno = request.getParameter("ba_createno");//建立用户名称
        String ba_createdate = request.getParameter("ba_createdate");//建立日期
        String ba_confirmid = request.getParameter("ba_confirmid");//审核人员ID
        String ba_confirmno = request.getParameter("ba_confirmno");//审核人员
        String ba_confirmdate = request.getParameter("ba_confirmdate");//审核日期
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

        String ba_record_activities = request.getParameter("ba_record_activities");//活动文案
        String ba_award_type = request.getParameter("ba_award_type");//奖励类型
        String ba_tasktype = request.getParameter("ba_tasktype");//任务类别

        String ba_status="1";//默认为1
        /*检查参数begin*/
        if (CommonUtil.isEmpty(ba_name)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
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
        if (CommonUtil.isEmpty(ba_record_activities)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动文案不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_award_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("奖励类型不能为空");
            flag_pass = false;
        };
      if (CommonUtil.isEmpty(ba_share_gift)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分享人赠送数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_share_astrict)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分享人是否限定赠送次数不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(ba_receive_gift)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("被分享人赠送数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_receive_astrict)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("被分享人是否限定赠送次数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_tasktype)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("任务类别不能为空");
            flag_pass = false;
        };
        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                Award_Share ba = new Award_Share();
                //封装数据
                ba.setBa_name(ba_name);//活动名称
                ba.setBa_datebegin(ba_datebegin);
                ba.setBa_dateend(ba_dateend);
                ba.setBa_tasktype(ba_tasktype);//类型

                ba.setBa_share_gift(Integer.valueOf(ba_share_gift));
                ba.setBa_share_astrict(CommonUtil.convert_boolean(ba_share_astrict));
                if(!CommonUtil.isEmpty(ba_share_count)){
                    ba.setBa_share_count(Integer.valueOf(ba_share_count));
                }
                ba.setBa_receive_gift(Integer.valueOf(ba_receive_gift));
                ba.setBa_receive_astrict(CommonUtil.convert_boolean(ba_receive_astrict));
                if(!CommonUtil.isEmpty(ba_receive_count)){
                    ba.setBa_receive_count(Integer.valueOf(ba_receive_count));
                }
                ba.setBa_createid(CommonUtil.convert_Long(sm_id));
                ba.setBa_createno(sm_no);
                ba.setBa_createdate(new Date());
                ba.setBa_status(Byte.valueOf(ba_status));
                ba.setBa_record_activities(ba_record_activities);
                ba.setBa_award_type(CommonUtil.convert_Byte(ba_award_type));
                int ii=baseActivityService.addAward_Share(ba);
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


    /**
     * 活动设置删除 zuoxiaochao
     * Award_Share
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletebaseactivity" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletebaseactivity(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i;
        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String  ba_id = request.getParameter("ba_id");
        String  sm_id = request.getParameter("sm_id");
        if(CommonUtil.isEmpty(ba_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        }

        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = baseActivityService.deleteAward_Share(Long.parseLong(ba_id));

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
     *读取活动详情
     * Award_Share
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbaseactivitydetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbaseactivitydetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String  ba_id = request.getParameter("ba_id");
        if(CommonUtil.isEmpty(ba_id)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id不能为空");
            flag_pass = false;
        }

/*检查参数 end*/
/*处理逻辑 begin*/
        Award_Share bv = new Award_Share();
        if (flag_pass==true) {
            try {
                bv = baseActivityService.getAward_Sharedetail(Long.parseLong(ba_id));
                if (bv!=null){
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
        appresult.setData(bv);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /***
     * @param request
     *活动修改保存
     * Award_Share
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savebaseactivity", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savebaseactivity(HttpServletRequest request, HttpServletResponse response) throws Exception {
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

        String ba_share_gift = request.getParameter("ba_share_gift");//分享人赠送数(必填)
        String ba_share_astrict = request.getParameter("ba_share_astrict");//分享人是否限定赠送次数(必填)
        String ba_share_count = request.getParameter("ba_share_count");//分享人限定赠送次数
        String ba_receive_gift = request.getParameter("ba_receive_gift");//被分享人赠送数(必填)
        String ba_receive_astrict = request.getParameter("ba_receive_astrict");//被分享人是否限定赠送次数(必填)
        String ba_receive_count = request.getParameter("ba_receive_count");//被分享人限定赠送次数

        String ba_record_activities = request.getParameter("ba_record_activities");//活动文案
        String ba_award_type = request.getParameter("ba_award_type");//活动奖励规则
        String ba_tasktype = request.getParameter("ba_tasktype");//任务类别

        String ba_confirmid = request.getParameter("ba_confirmid");//审核人员ID
        String ba_confirmno = request.getParameter("ba_confirmno");//审核人员
        String ba_confirmdate = request.getParameter("ba_confirmdate");//审核日期


        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String ba_status = request.getParameter("ba_status");
 /*检查参数begin*/
        if (CommonUtil.isEmpty(ba_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
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
      if (CommonUtil.isEmpty(ba_share_gift)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分享人赠送数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_share_astrict)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分享人是否限定赠送次数不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(ba_receive_gift)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("被分享人赠送数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_receive_astrict)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("被分享人是否限定赠送次数不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_tasktype)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("任务类别不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ba_status)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("审核状态不能为空");
            flag_pass = false;
        };
/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Award_Share ba = new Award_Share();
                ba.setBa_id(Long.valueOf(ba_id));
                //封装数据
                ba.setBa_name(ba_name);//活动名称
                ba.setBa_tasktype(ba_tasktype);//任务类别
                ba.setBa_datebegin(ba_datebegin);
                ba.setBa_dateend(ba_dateend);

                ba.setBa_share_gift(Integer.valueOf(ba_share_gift));
                ba.setBa_share_astrict(CommonUtil.convert_boolean(ba_share_astrict));
                ba.setBa_share_count(CommonUtil.convert_Int(ba_share_count));
                ba.setBa_receive_gift(Integer.valueOf(ba_receive_gift));
                ba.setBa_receive_astrict(CommonUtil.convert_boolean(ba_receive_astrict));
                ba.setBa_receive_count(CommonUtil.convert_Int(ba_receive_count));

                ba.setBa_award_type(CommonUtil.convert_Byte(ba_award_type));//文案
                ba.setBa_record_activities(ba_record_activities);//奖励类型

                ba.setBa_confirmid(Long.valueOf(sm_id));
                ba.setBa_confirmno(sm_no);
                ba.setBa_confirmdate(new Date());
                ba.setBa_status(CommonUtil.convert_Byte(ba_status));

                int ii = baseActivityService.updateAward_Share(ba);
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
     * 活动统计列表显示 zuoxiaochao
     * AwardV_Share_Count
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbasevactivitysharelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getbasevactivitysharelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String sc_activityid = request.getParameter("ba_id");//这是活动的id
        if (CommonUtil.isEmpty(sc_activityid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("活动id不能为空");
            flag_pass = false;
        }
            List<AwardV_Share_Count> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));//*当前页*//*
                page.setPagesize(request.getParameter("pagesize"));//*分页*//*
                Map<String, Object> map = new HashMap<String, Object>();
                //*查询条件 begin*//*

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("sc_activityid",Long.valueOf(sc_activityid));
                if(!CommonUtil.isEmpty(request.getParameter("sc_share_userid"))){
                    map.put("sc_share_userid",Long.valueOf(request.getParameter("sc_share_userid")));//分享人id
                }
                if(!CommonUtil.isEmpty(request.getParameter("sc_receive_userid"))){
                    map.put("sc_receive_userid",Long.valueOf(request.getParameter("sc_receive_userid")));//被分享人ID
                }

                map.put("share_name",request.getParameter("share_name"));//分享人昵称
                map.put("share_phone",request.getParameter("share_phone"));//分享人电话
                map.put("receive_name",request.getParameter("receive_name"));//被分享人昵称
                map.put("receive_phone",request.getParameter("receive_phone"));//被分享人电话
                //关于建立时间的查询
                map.put("sc_createdate1",CommonUtil.queryTime1(request.getParameter("sc_createdate1"),request.getParameter("sc_createdate2")));
                map.put("sc_createdate2",CommonUtil.queryTime2(request.getParameter("sc_createdate1"),request.getParameter("sc_createdate2")));
                us = baseActivityService.getAwardV_Share_CountList(map);
                page.setRowcount(baseActivityService.getCountAwardV_Share_Count(map));
                appResult.setPage(page);

                if (!CommonUtil.isNullOrEmpty(us) && us.size() > 0) {
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                } else {
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_FAIL);
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
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * @param request
     *活动发布与终止的共用接口
     * Award_Share
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savebaseactivitystatus", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savebaseactivitystatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String ba_id = request.getParameter("ba_id");
        String sm_id = request.getParameter("sm_id");
        String ba_status=request.getParameter("ba_status");//已发布
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
                Award_Share ba = new Award_Share();
                ba.setBa_id(Long.valueOf(ba_id));
                //封装数据
                ba.setBa_status(CommonUtil.convert_Byte(ba_status));
                int ii = baseActivityService.updateAward_Share(ba);
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
     * 活动统计列表导出 zuoxiaochao
     * AwardV_Share_Count
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbasevactivityshareexport" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getbasevactivityshareexport(HttpServletRequest request, HttpServletResponse response) throws Exception{
       /* PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");*/

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

                String[] excelheader = new String[]{"邀请人", "邀请码","邀请账号", "获得魔币数", "被邀请人",
                        "被邀请账号", "获得魔币数","分享时间"};//27
                String[] excelkey = new String[]{"share_name", "share_invitecode","share_phone", "sc_share_award", "receive_name",
                        "receive_phone","sc_receive_award", "sc_createdate", };//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", 10000);//这里设置的是下载的条数,可以无限大
                map.put("sc_activityid", Long.valueOf(sc_activityid));

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps( baseActivityService.getAwardV_Share_CountList(map));
/*处理对应位置*/
                resultexcel =ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
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

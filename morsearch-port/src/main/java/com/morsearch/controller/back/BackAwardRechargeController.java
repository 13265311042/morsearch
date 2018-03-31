package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.AwardVService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by hyt on 2017/12/12.
 * 有关奖励的类
 */
@Controller("BackAwardRechargeController")
@RequestMapping("/back/")
public class BackAwardRechargeController extends BaseController{

    @Resource
    private AwardVService awardVService;
    /**
     * 充值活动列表展示 zuoxiaochao
     * AwardV_Recharge
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardvrechargelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getawardvrechargelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<AwardV_Recharge> us = new ArrayList<>();
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
            us = awardVService.getAwardV_RechargeList(map);
            page.setRowcount(awardVService.getCountAwardV_Recharge(map));
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
     * 充值活动添加 zuoxiaochao
     * AwardV_Recharge
     */
    //@Transactional//运用事物
    @RequestMapping(value = "addawardvrecharge" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String addawardvrecharge(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
            String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String ba_name = request.getParameter("ba_name");//活动名称(必填)
        String ba_type = request.getParameter("ba_type");//类型(必填)
        String ba_default = request.getParameter("ba_default");//默认规则
        String ba_datebegin = request.getParameter("ba_datebegin");//开始时间(必填)
        String ba_dateend = request.getParameter("ba_dateend");//结束时间(必填)
        String ba_status = "1";


        String arm_valuemin1 = request.getParameter("arm_valuemin1");//就由这个判断
        String arm_valuemin2 = request.getParameter("arm_valuemin2");//就由这个判断
        String arm_valuemin3 = request.getParameter("arm_valuemin3");//就由这个判断
        String arm_valuemin4 = request.getParameter("arm_valuemin4");//就由这个判断
        String arm_valuemin5 = request.getParameter("arm_valuemin5");//就由这个判断
        String arm_valuemin6 = request.getParameter("arm_valuemin6");//就由这个判断

        int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String ba_popup = request.getParameter("ba_popup");//弹窗位置

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
        };
        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                //充值送魔币的逻辑
                Award_Recharge ba = new Award_Recharge();
                //封装数据
                ba.setBa_name(ba_name);//活动名称
                ba.setBa_type(ba_type);//;类型
                ba.setBa_default(CommonUtil.convert_boolean(ba_default));//;活动规则
                ba.setBa_datebegin(ba_datebegin);
                ba.setBa_dateend(ba_dateend);
                ba.setBa_status(CommonUtil.convert_Byte(ba_status));
                if(!CommonUtil.isEmpty(sm_id)){
                    ba.setBa_createid(Long.parseLong(sm_id));
                }
                ba.setBa_createno(sm_no);
                if(!CommonUtil.isEmpty(ba_popup)){
                    ba.setBa_popup(Short.valueOf(ba_popup));
                }
                ba.setBa_createdate(new Date());
               awardVService.addAward_Recharge(ba);
                Long ba_id = ba.getBa_id();
                //第一个赠送规则的添加
                Award_Recharge_Rule arr = new Award_Recharge_Rule();
                if(!CommonUtil.isEmpty(arm_valuemin1)&&flag_pass==true){//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("01");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin1")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax1")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount1"))){
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount1")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase1"))){
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase1")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode1")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount1")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral1")));//魔币赠送
                    int i = awardVService.addAward_Recharge_Rule(arr);
                }
                //第二个赠送规则的添加
                if(!CommonUtil.isEmpty(arm_valuemin2)&&flag_pass==true) {//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("02");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin2")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax2")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount2"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount2")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase2"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase2")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode2")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount2")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral2")));//魔币赠送
                     a2=awardVService.addAward_Recharge_Rule(arr);
                }
                //第三个赠送规则的添加
                if(!CommonUtil.isEmpty(arm_valuemin3)&&flag_pass==true) {//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("03");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin3")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax3")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount3"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount3")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase3"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase3")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode3")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount3")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral3")));//魔币赠送
                     a3= awardVService.addAward_Recharge_Rule(arr);
                }
                //第四个赠送规则的添加
                if(!CommonUtil.isEmpty(arm_valuemin4)&&flag_pass==true) {//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("04");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin4")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax4")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount4"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount4")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase4"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase4")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode4")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount4")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral4")));//魔币赠送
                     a4=awardVService.addAward_Recharge_Rule(arr);
                }
                //第五个赠送规则的添加
                if(!CommonUtil.isEmpty(arm_valuemin5)&&flag_pass==true) {//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("05");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin5")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax5")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount5"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount5")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase5"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase5")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode5")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount5")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral5")));//魔币赠送
                     a5=awardVService.addAward_Recharge_Rule(arr);
                }
                //第六个赠送规则的添加
                if(!CommonUtil.isEmpty(arm_valuemin6)&&flag_pass==true) {//第一个框不是空
                    arr.setArm_baid(ba_id);
                    arr.setArm_index("06");
                    arr.setArm_valuemin(Integer.valueOf(request.getParameter("arm_valuemin6")));//最小值
                    arr.setArm_valuemax(Integer.valueOf(request.getParameter("arm_valuemax6")));//最大值
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount6"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount6")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase6"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase6")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode6")));//赠送方式
                    arr.setArm_addamount(Integer.valueOf(request.getParameter("arm_addamount6")));//赠送金额
                    arr.setArm_addintegral(Integer.valueOf(request.getParameter("arm_addintegral6")));//魔币赠送
                     a6= awardVService.addAward_Recharge_Rule(arr);
                }
                if (a1+a2+a3+a4+a5+a6==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*添加失败*/
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
     * 读取充值赠币活动详情
     * Award_Recharge
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardrechargedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardrechargedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;


        //获取ba_id
       String ba_id = request.getParameter("ba_id");
    /*检查参数 begin*/
        if ((CommonUtil.isEmpty(ba_id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Award_Recharge ar = new Award_Recharge();

        if (flag_pass==true) {
            try {
                ar = awardVService.getAward_Rechargedetail(Long.parseLong(ba_id));
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
     * 读取充值赠币活动详情
     * Award_Recharge_Rule
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardrechargerulelist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardrechargerulelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;


        //获取ba_id
        String ba_id = request.getParameter("ba_id");
    /*检查参数 begin*/
        if ((ba_id==null || "".equals(ba_id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        List<Award_Recharge_Rule> arrlist = new ArrayList<>();

        if (flag_pass==true) {
            try {
                arrlist=awardVService.getAward_Recharge_RuleList(Long.parseLong(ba_id));

                if (arrlist.size()>0){
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
        appresult.setData(arrlist);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



    /**
     * 删除充值活动
     * Award_Recharge
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deleteawardrecharge" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deleteawardrecharge(HttpServletRequest request, HttpServletResponse response) throws Exception{
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
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = awardVService.deleteAward_RechargeById(Long.parseLong(ba_id));

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
     *充值活动发布
     * Award_Recharge
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "saveawardrechargestatus", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String saveawardrechargestatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
                Award_Recharge ar = new Award_Recharge();
                ar.setBa_id(Long.valueOf(ba_id));
                //封装数据
                if(!CommonUtil.isEmpty(ba_status)){
                    ar.setBa_status(Byte.valueOf(ba_status));
                }
                int ii = awardVService.updateAward_Rechargestatus(ar);
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
     * 读取充值赠币活动详情每一条记录(arm_index)
     * Award_Recharge_Rule
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardrechargeruledetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardrechargeruledetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String arm_index = request.getParameter("arm_index");
        //获取ba_id
        String ba_id = request.getParameter("ba_id");
    /*检查参数 begin*/
        if ((ba_id==null || "".equals(ba_id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Award_Recharge_Rule arr = new Award_Recharge_Rule();
        if (flag_pass==true) {
            try {
                arr=awardVService.getAward_Recharge_Ruledetail(Long.parseLong(ba_id),arm_index);

                if (arr!=null){
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("没有这样的规则");
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        appresult.setData(arr);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /***
     * @param request
     *充值活动修改
     * Award_Recharge
     * */
    @Transactional
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "saveawardrecharge", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String saveawardrecharge(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String ba_id = request.getParameter("ba_id");//得到的id
        String ba_type = request.getParameter("ba_type");
        String ba_popup = request.getParameter("ba_popup");//弹出位置

        String ba_name = request.getParameter("ba_name");//活动名称(必填)
        String ba_default = request.getParameter("ba_default");//默认规则

        String ba_datebegin = request.getParameter("ba_datebegin");//开始时间(必填)
        String ba_dateend = request.getParameter("ba_dateend");//结束时间(必填)
        String ba_status = request.getParameter("ba_status");//结束时间(必填)

        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

        //根据最小来判断要不要修改,修改的时候要先删除,然后再添加,还要运用事物

        String arm_index = request.getParameter("arm_index");//这个是序号

        String arm_valuemin2 = request.getParameter("arm_valuemin2");//充值最小值
        String arm_valuemin3 = request.getParameter("arm_valuemin3");//充值最小值
        String arm_valuemin4 = request.getParameter("arm_valuemin4");//充值最小值
        String arm_valuemin5 = request.getParameter("arm_valuemin5");//充值最小值
        String arm_valuemin6 = request.getParameter("arm_valuemin6");//充值最小值
        String arm_valuemin7 = request.getParameter("arm_valuemin7");//充值最小值

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
                Award_Recharge ar = new Award_Recharge();
                ar.setBa_id(Long.valueOf(ba_id));
                //封装数据
                ar.setBa_name(ba_name);//活动名称
                ar.setBa_type(ba_type);//;类型
                if(!CommonUtil.isEmpty(ba_popup)){//判断是否为空
                    ar.setBa_popup(Short.valueOf(ba_popup));//弹出位置
                }
                ar.setBa_default(CommonUtil.convert_boolean(ba_default));//;活动规则
                ar.setBa_datebegin(ba_datebegin);
                ar.setBa_dateend(ba_dateend);
                ar.setBa_status(CommonUtil.convert_Byte(ba_status));
                ar.setBa_confirmid(Long.valueOf(sm_id));
                ar.setBa_confirmno(sm_no);
                ar.setBa_confirmdate(new Date());
                int ii = awardVService.updateAward_Recharge(ar);//这个是修改

                Award_Recharge_Rule arr = new Award_Recharge_Rule();
                if(!CommonUtil.isEmpty(arm_valuemin2)){
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("01");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin2")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax2")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount2"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount2")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase2"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase2")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode2")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral2")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount2")));
                   awardVService.updateAward_Recharge_Rule(arr);
                }
                if(!CommonUtil.isEmpty(arm_valuemin3)){
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("02");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin3")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax3")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount3"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount3")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase3"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase3")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode3")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral3")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount3")));
                    awardVService.updateAward_Recharge_Rule(arr);
                }
                if(!CommonUtil.isEmpty(arm_valuemin4)){
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("03");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin4")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax4")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount4"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount4")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase4"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase4")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode4")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral4")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount4")));
                    awardVService.updateAward_Recharge_Rule(arr);
                }
                if(!CommonUtil.isEmpty(arm_valuemin5)){
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("04");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin5")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax5")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount5"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount5")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase5"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase5")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode5")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral5")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount5")));
                    awardVService.updateAward_Recharge_Rule(arr);
                }
                if(!CommonUtil.isEmpty(arm_valuemin6)){
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("05");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin6")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax6")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount6"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount6")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase6"))) {
                        arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase6")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode6")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral6")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount6")));
                    awardVService.updateAward_Recharge_Rule(arr);
                }

                if(!CommonUtil.isEmpty(arm_valuemin7)){
                    arr = new Award_Recharge_Rule();
                    arr.setArm_baid(Long.valueOf(ba_id));
                    arr.setArm_index("06");//序号
                    arr.setArm_valuemin(CommonUtil.convert_Int(request.getParameter("arm_valuemin7")));
                    arr.setArm_valuemax(CommonUtil.convert_Int(request.getParameter("arm_valuemax7")));
                    if(!CommonUtil.isEmpty(request.getParameter("arm_discount7"))) {
                        arr.setArm_discount(CommonUtil.convert_bigdecimal(request.getParameter("arm_discount7")));//折扣
                    }
                    if(!CommonUtil.isEmpty(request.getParameter("arm_addbase7"))) {
                    arr.setArm_addbase(CommonUtil.convert_Int(request.getParameter("arm_addbase7")));//比例基数
                    }
                    arr.setArm_addmode(CommonUtil.convert_Byte(request.getParameter("arm_addmode7")));//赠送方式
                    arr.setArm_addintegral(CommonUtil.convert_Int(request.getParameter("arm_addintegral7")));
                    arr.setArm_addamount(CommonUtil.convert_Int(request.getParameter("arm_addamount7")));
                    awardVService.updateAward_Recharge_Rule(arr);
                }
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
     * @param request
     *充值活动规则修改
     * Award_Recharge_Rule
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "saveawardrechargerule", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String saveawardrechargerule( HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String ba_id = request.getParameter("ba_id");//得到的id
        String arm_index = request.getParameter("arm_index");//这个是序号
        String arm_valuemin = request.getParameter("arm_valuemin");//充值最小值
        String arm_valuemax = request.getParameter("arm_valuemax");//充值最大值
        String arm_addintegral = request.getParameter("arm_addintegral");//赠送魔币
        String arm_addamount = request.getParameter("arm_addamount");//赠送金额

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

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Award_Recharge_Rule arr = new Award_Recharge_Rule();
                arr.setArm_baid(Long.valueOf(ba_id));
                arr.setArm_index(arm_index);//序号
                arr.setArm_valuemin(Integer.valueOf(arm_valuemin));
                arr.setArm_valuemax(Integer.valueOf(arm_valuemax));
                arr.setArm_addintegral(Integer.valueOf(arm_addintegral));
                arr.setArm_addamount(Integer.valueOf(arm_addamount));

                int ii = awardVService.updateAward_Recharge_Rule(arr);
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
     * 充值赠送明细列表视图展示
     * AwardV_Recharge_Count
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getawardvrechargecountlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getawardvrechargecountlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
        List<AwardV_Recharge_Count> arclist = new ArrayList<>();

        if (flag_pass==true) {
            try {
                arclist=awardVService.getAwardV_Recharge_CountList(Long.parseLong(ba_id));

                if (arclist.size()>0){
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
        appresult.setData(arclist);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


}

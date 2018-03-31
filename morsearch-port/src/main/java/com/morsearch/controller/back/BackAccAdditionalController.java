package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Acc_Additional;
import com.morsearch.service.AccAdditionalService;
import com.morsearch.service.ManagerService;
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
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by hyt on 2018/3/20.
 * 额外充值相关
 */

@Controller("BackAccAdditionalController")
@RequestMapping("/back/")
public class BackAccAdditionalController extends BaseController {

    @Resource
    private AccAdditionalService accAdditionalService;

    @Resource
    private ManagerService managerService;
    /***
     * 额外充值用户充值
     * Acc_Additional
     */
    @Transactional
    @RequestMapping(value = "addaccadditionaldesign" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String addaccadditionaldesign( HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        String sm_id = request.getParameter("sm_id");//登录账号
        String sm_no = request.getParameter("sm_no");//建表账号

        String aa_userid = request.getParameter("aa_userid");//充值用户id(前端传过来)
        String ur_phone = request.getParameter("ur_phone");//传过来的电话
        String aa_integral = request.getParameter("aa_integral");//魔币数量

        if (CommonUtil.isEmpty(sm_id) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(aa_userid) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("充值用户id不能为空");
            flag_pass = false;
        }

        if (flag_pass == true) {
            try {
                Acc_Additional aa = new Acc_Additional();
                aa.setAa_no("D"+ SequenceCreator.createNewFileName());//充值单号
                aa.setAa_type(Short.valueOf(("2")));//充值类别(设计师充值)
                aa.setAa_userid(CommonUtil.convert_Long(aa_userid));//充值用户id
                aa.setAa_useraccount(ur_phone);//充值用户账号
                //根据设计师id查询出设计师的昵称
                String ur_namenick = commService.getDm_createno(CommonUtil.convert_Long(aa_userid));
                if(!CommonUtil.isEmpty(ur_namenick)){
                    aa.setAa_username(ur_namenick);//充值用户名称
                }
                aa.setAa_integral(CommonUtil.convert_bigdecimal(aa_integral));//积分即是魔币
                aa.setAa_createno(sm_no);//建表账号
                //根据sm_id查询出是sm_name
                String sm_name = managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name();
                if(!CommonUtil.isEmpty(sm_name)){//建表姓名的设置
                    aa.setAa_createname( managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name());
                }
                aa.setAa_createdate(new Date());//建表时间
                aa.setAa_status(Short.valueOf("0"));//状态
                //封装数据
                int ii = accAdditionalService.addAcc_AdditionalDesign(aa);
                if (ii == 0) {
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_ADD_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 额外充值展示列表
     * Acc_Additional
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getaccadditionallist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getaccadditionallist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/
        List<Acc_Additional> us = new ArrayList<>();
        if (flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String, Object> map = new HashMap<String, Object>();
                 /*查询条件 begin*/
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());

                map.put("aa_createno",request.getParameter("aa_createno"));//建表账号
                map.put("aa_status",CommonUtil.convert_Byte(request.getParameter("aa_status")));//审核状态
                map.put("aa_type",2);

                map.put("aa_createdate1",CommonUtil.queryTime1(request.getParameter("aa_createdate1"),request.getParameter("aa_createdate2")));
                map.put("aa_createdate2",CommonUtil.queryTime2(request.getParameter("aa_createdate1"),request.getParameter("aa_createdate2")));

                map.put("aa_confirmdate1",CommonUtil.queryTime1(request.getParameter("aa_confirmdate1"),request.getParameter("aa_confirmdate2")));
                map.put("aa_confirmdate2",CommonUtil.queryTime2(request.getParameter("aa_confirmdate1"),request.getParameter("aa_confirmdate2")));
                //查询条件
                us = accAdditionalService.getAcc_AdditionalList(map);
                page.setRowcount(accAdditionalService.getCountAcc_Additional(map));
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
            AppDatagrid dto = new AppDatagrid();
            dto.setRows(us);
            dto.setTotal(appResult.getPage().getRowcount());
            appResult.setData(dto); /*us*/
        /*begin返回数据*/
            //转化为json格式()
            rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
            out.print(rs);
            out.close();
            return null;
        }


    /***
     * Acc_Additional
     * 得到额外充值详细信息
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getaccadditionaldesigndetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getaccadditionaldesigndetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String  aa_id = request.getParameter("aa_id");
        if (CommonUtil.isEmpty(aa_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

        Acc_Additional aa = new Acc_Additional();
        if (flag_pass==true) {
            try {
                aa = accAdditionalService.getAcc_AdditionalDesignDetail(Long.parseLong(aa_id),1);
                if (aa!=null){
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
        appresult.setData(aa);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /**
     * 额外充值审核
     * Acc_Additional
     */
    @Transactional
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveaccadditionaldesign", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String saveaccadditionaldesign(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String aa_userid = request.getParameter("aa_userid");//充值用户的id
      /*  String aa_integral = request.getParameter("aa_integral");//充值额度*/
        String aa_id = request.getParameter("aa_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String ur_phone = request.getParameter("ur_phone");
        String aa_status = request.getParameter("aa_status");

        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(aa_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID不能为空");
            flag_pass = false;
        }
        //如果传混过来的状态是0;那就啥都不准备做
        if("0".equals( aa_status)){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("本身就是未审核状态");
            flag_pass = false;
        }

        //根据aa_id查出状态,状态为1的什么都不做
        Short aa_status1 = accAdditionalService.getAcc_AdditionalDesignDetail(Long.parseLong(aa_id), 1).getAa_status();
        BigDecimal aa_integral1 = accAdditionalService.getAcc_AdditionalDesignDetail(Long.parseLong(aa_id), 1).getAa_integral();

        if("1".equals( aa_status1.toString())){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("已经审核过");
            flag_pass = false;
        }
        if (flag_pass==true&&"1".equals(aa_status)) {//确定要审核通过
            try {
                Acc_Additional aa = new Acc_Additional();
                aa.setAa_id(CommonUtil.convert_Long(aa_id));//传过来的id
                aa.setAa_confirmdate(new Date());
                aa.setAa_confirmno(sm_no);
                //根据sm_id查询出是sm_name
                String sm_name = managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name();
                if(!CommonUtil.isEmpty(sm_name)){
                    aa.setAa_confirmname( managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name());
                }
                aa.setAa_status(Short.valueOf(aa_status));
                int ii = accAdditionalService.saveAcc_Additionaldesign(aa,CommonUtil.convert_Long(aa_userid),aa_integral1);
                if (ii == 0) {
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        if (flag_pass==true&&"2".equals(aa_status)) {//确定要审核不通过
            try {
                Acc_Additional aa = new Acc_Additional();
                aa.setAa_id(CommonUtil.convert_Long(aa_id));//传过来的id
                aa.setAa_confirmdate(new Date());
                aa.setAa_confirmno(sm_no);
                //根据sm_id查询出是sm_name
                String sm_name = managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name();
                if(!CommonUtil.isEmpty(sm_name)){
                    aa.setAa_confirmname( managerService.getManagerDetail(CommonUtil.convert_Int(sm_id)).getSm_name());
                }
                aa.setAa_status(Short.valueOf(aa_status));
                int ii= accAdditionalService.saveAcc_Additionaldesignstatus(aa);
                if (ii == 0) {
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


}

package com.morsearch.controller.back;

/**
 * Created by zuoxiaochao on 2017/11/3.
 */

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Desig_Evaluate;
import com.morsearch.service.DesigEvaluateService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *设计师
 * */
@Controller("BackDesignController")
@RequestMapping("/back/")
public class BackDesignController extends BaseController {

    @Resource
    private DesigEvaluateService designEvaluateService;


    /**
     * 设计师评价展示 zuoxiaochao
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigneavluatelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigneavluatelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Desig_Evaluate> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                //      map.put("pagestart",page.getPagestart());

                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("de_orderno",request.getParameter("de_orderno"));//订单单号
                map.put("de_createno",request.getParameter("de_createno"));//制表人员,登陆账号
                map.put("de_confirmno",request.getParameter("de_confirmno"));//审核人员,登陆账号

				/*注册日期的查询*/
                map.put("de_createdate1",CommonUtil.queryTime1(request.getParameter("de_createdate1"),request.getParameter("de_createdate2")));
                map.put("de_createdate2",CommonUtil.queryTime2(request.getParameter("de_createdate1"),request.getParameter("de_createdate2")));

                /*审核日期的查询*/
                map.put("de_confirmdate1",CommonUtil.queryTime1(request.getParameter("de_confirmdate1"),request.getParameter("de_confirmdate2")));
                map.put("de_confirmdate2",CommonUtil.queryTime2(request.getParameter("de_confirmdate1"),request.getParameter("de_confirmdate2")));

                Desig_Evaluate de = new Desig_Evaluate();
                //查询条件
                us = designEvaluateService.getDesig_EvaluateList(map);
                page.setRowcount(designEvaluateService.getCountDesig_Evaluate(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
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
        /*end处理数据*/

        /*begin返回数据*/
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

    /***
     * @param request
     *读取设计师详情
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigneavluatedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigneavluatedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取de_id,查询的条件
       String  de_id = request.getParameter("de_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(de_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("de_id不能为空");
            flag_pass = false;
        };
    /*检查参数 end*/

    /*处理逻辑 begin*/
        Desig_Evaluate de = new Desig_Evaluate();
        if (flag_pass==true) {
            try {
                de = designEvaluateService.getDesignEvaluatedetail(Long.parseLong(de_id));
                if (de!=null){
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
        appresult.setData(de);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



}

package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Acc_Recharge;
import com.morsearch.service.AccBuyService;
import com.morsearch.service.AccRechargeService;
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
import java.util.*;

/**
 * Created by zuoxiaochao on 2017/11/10.
 */

@Controller("BackAccController")
@RequestMapping("/back/")
public class BackAccController extends BaseController{

    @Resource
    private AccRechargeService accRechargeService;

    @Resource
    private AccBuyService accBuyService;


    /**
     * 余额充值展示 zuoxiaochao
     * Acc_Recharge
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getaccrechargelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getaccrechargelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Acc_Recharge> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("ar_no",request.getParameter("ar_no"));//购买单号
                map.put("ar_classcode",request.getParameter("ar_classcode"));//大类代码
                map.put("ar_classname",request.getParameter("ar_classname"));//大类名称
                map.put("ar_typename",request.getParameter("ar_typename"));//类别名称
                map.put("ar_tradecard",request.getParameter("ar_tradecard"));//交易卡号
                map.put("ar_tradeorderno",request.getParameter("ar_tradeorderno"));//交易订单号
                map.put("ar_traderefundno",request.getParameter("ar_traderefundno"));//退款单号

                //状态
                if(!CommonUtil.isEmpty(request.getParameter("ar_status"))){
                    map.put("ar_status",Byte.valueOf(request.getParameter("ar_status")));//状态
                }
                //交易订单日期,退款日期,建立日期
				/*交易订单日期的查询*/
                map.put("ar_tradeorderdate1",CommonUtil.queryTime1(request.getParameter("ar_tradeorderdate1"),request.getParameter("ar_tradeorderdate2")));
                map.put("ar_tradeorderdate2",CommonUtil.queryTime2(request.getParameter("ar_tradeorderdate1"),request.getParameter("ar_tradeorderdate2")));

                /*退款日期的查询*/
                map.put("ar_traderefunddate1",CommonUtil.queryTime1(request.getParameter("ar_traderefunddate1"),request.getParameter("ar_traderefunddate2")));
                map.put("ar_traderefunddate2",CommonUtil.queryTime2(request.getParameter("ar_traderefunddate1"),request.getParameter("ar_traderefunddate2")));

                /*建立日期的查询*/
                map.put("ar_createdate1",CommonUtil.queryTime1(request.getParameter("ar_createdate1"),request.getParameter("ar_createdate2")));
                map.put("ar_createdate2",CommonUtil.queryTime2(request.getParameter("ar_createdate1"),request.getParameter("ar_createdate2")));
                Acc_Recharge ar = new Acc_Recharge();
                //查询条件
                us = accRechargeService.getAcc_RechargeList(map);
                page.setRowcount(accRechargeService.getCountAcc_Recharge(map));
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
     * 购买订单展示 zuoxiaochao
     * Acc_Buy
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getaccbuylist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getaccbuylist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Acc_Buy> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("ab_no",request.getParameter("ab_no"));//购买单号
                map.put("ab_coincode",request.getParameter("ab_coincode"));//类别代码
                map.put("ab_coinname",request.getParameter("ab_coinname"));//类别名称
                map.put("ab_tradename",request.getParameter("ab_tradename"));//交易对象名称
                map.put("ab_tradecard",request.getParameter("ab_tradecard"));//交易卡号
                map.put("ab_tradeorderno",request.getParameter("ab_tradeorderno"));//交易订单号
                map.put("ab_traderefundno",request.getParameter("ab_traderefundno"));//退款单号

                //状态
                if(!CommonUtil.isEmpty(request.getParameter("ab_status"))){
                    map.put("ab_status",Byte.valueOf(request.getParameter("ab_status")));//状态
                }
                //交易订单日期,退款日期,建立日期
				/*交易订单日期的查询*/
                map.put("ab_tradeorderdate1",CommonUtil.queryTime1(request.getParameter("ab_tradeorderdate1"),request.getParameter("ab_tradeorderdate2")));
                map.put("ab_tradeorderdate2",CommonUtil.queryTime2(request.getParameter("ab_tradeorderdate1"),request.getParameter("ab_tradeorderdate2")));

                /*退款日期的查询*/
                map.put("ab_traderefunddate1",CommonUtil.queryTime1(request.getParameter("ab_traderefunddate1"),request.getParameter("ab_traderefunddate2")));
                map.put("ab_traderefunddate2",CommonUtil.queryTime2(request.getParameter("ab_traderefunddate1"),request.getParameter("ab_traderefunddate2")));

                /*建立日期的查询*/
                map.put("ab_createdate1",CommonUtil.queryTime1(request.getParameter("ab_createdate1"),request.getParameter("ab_createdate2")));
                map.put("ab_createdate2",CommonUtil.queryTime2(request.getParameter("ab_createdate1"),request.getParameter("ab_createdate2")));
                //查询条件
                us = accBuyService.getAcc_BuyList(map);
                page.setRowcount(accBuyService.getCountAcc_Buy(map));
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

}

package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.*;
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
 * Created by zuoxiaochao on 2017/11/3.
 */

@Controller("BackSaleController")
@RequestMapping("/back/")
public class BackSalesController extends BaseController {

    @Resource
    private SalesEvaluateService salesEvaluateService;

    @Resource
    private SalesMessageService salesMessageService;

    @Resource
    private SalesVOrderListService salesVOrderListService;

    @Resource
    private SalesAppealServicve salesAppealServicve;

    @Resource
    private OrderService orderService;
    /**
     * 业务员评价展示 zuoxiaochao
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesevaluatelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalesevaluatelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Sales_Evaluate> us = new ArrayList<>();
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

                map.put("se_orderno",request.getParameter("se_orderno"));//订单单号
                map.put("se_createno",request.getParameter("se_createno"));//制表人员,登陆账号
                map.put("se_confirmeno",request.getParameter("se_confirmeno"));//审核人员,登陆账号

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = new GregorianCalendar();

				/*注册日期的查询*/
                /*两个时间都为空的情况*/
                map.put("se_createdate1",CommonUtil.queryTime1(request.getParameter("se_createdate1"),request.getParameter("se_createdate2")));
                map.put("se_createdate2",CommonUtil.queryTime2(request.getParameter("se_createdate1"),request.getParameter("se_createdate2")));

                /*审核日期的查询*/
                /*两个时间都为空的情况*/
                map.put("se_confirmdate1",CommonUtil.queryTime1(request.getParameter("se_confirmdate1"),request.getParameter("se_confirmdate2")));
                map.put("se_confirmdate2",CommonUtil.queryTime2(request.getParameter("se_confirmdate1"),request.getParameter("se_confirmdate2")));

                Sales_Evaluate se = new Sales_Evaluate();
                //查询条件
                us = salesEvaluateService.getSales_EvaluateList(map);
                page.setRowcount(salesEvaluateService.getCountSales_Evaluate(map));
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


    /**
     * 订单对话消息展示 zuoxiaochao
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalemessagelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalemessagelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Sales_Message> us = new ArrayList<>();
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

                map.put("sm_orderno",request.getParameter("sm_orderno"));//抬头单号
                map.put("sm_content",request.getParameter("sm_content"));//拜贴内容
                map.put("sm_salername",request.getParameter("sm_salername"));//业务员名称
                map.put("sm_designername",request.getParameter("sm_designername"));//设计师名称

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = new GregorianCalendar();

				/*制表日期的查询*/
                map.put("sm_createdate1",CommonUtil.queryTime1(request.getParameter("sm_createdate1"),request.getParameter("sm_createdate2")));
                map.put("sm_createdate2",CommonUtil.queryTime2(request.getParameter("sm_createdate1"),request.getParameter("sm_createdate2")));
                //禁用标志
                map.put("sm_flagstop",CommonUtil.read_dbbit(request.getParameter("sm_flagstop")));
                Sales_Message se = new Sales_Message();
                //查询条件
                us = salesMessageService.getSales_MessageList(map);
                page.setRowcount(salesMessageService.getCountSales_Message(map));
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
     *读取订单对话消息详情
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesmessagedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getsalesmessagedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取de_id,查询的条件
        String  sm_id = request.getParameter("sm_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("sm_id不能为空");
            flag_pass = false;
        };
    /*检查参数 end*/

    /*处理逻辑 begin*/
        Sales_Message sm = new Sales_Message();
        if (flag_pass==true) {
            try {
                sm = salesMessageService.getSale_Messagedetail(Long.parseLong(sm_id));
                if (sm!=null){
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
        appresult.setData(sm);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /***
     * 订单对话消息修改,主要是停用状态
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savesalesmessagedetail", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savesalesmessagedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

       String sm_id = request.getParameter("sm_id");
       String sm_no = request.getParameter("sm_no");
        String sm_flagstop1 = request.getParameter("sm_flagstop");

/*检查参数 begin*/
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("sm_id不能为空");
            flag_pass = false;
        };
        if(CommonUtil.isEmpty(sm_flagstop1)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("sm_flagstop不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_no)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        }


/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Sales_Message sm = new Sales_Message();
                sm.setSm_id(Long.parseLong(sm_id));
                //修改状态
               if(!CommonUtil.isEmpty(request.getParameter("sm_flagstop"))){
                    sm.setSm_flagstop(CommonUtil.convert_boolean(request.getParameter("sm_flagstop")));
               }

                //修改
                int ii = salesMessageService.saveSalesMessagedetail(sm);//修改状态
                if (ii==0){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_EDIT_FAIL);
                };/*提示资料不存在*/
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 订单管理列表 zuoxiaochao
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesvorderlistlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalesvorderlistlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<SalesV_Order_List> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("of_no",request.getParameter("of_no"));//订单单号
                map.put("of_custname",request.getParameter("of_custname"));//客户名称


				/*订单日期的查询*/
                map.put("of_dateorder1",CommonUtil.queryTime1(request.getParameter("of_dateorder1"),request.getParameter("of_dateorder2")));
                map.put("of_dateorder2",CommonUtil.queryTime2(request.getParameter("of_dateorder1"),request.getParameter("of_dateorder2")));

                if(!CommonUtil.isEmpty(request.getParameter("of_status"))){
                    map.put("of_status",Byte.valueOf(request.getParameter("of_status")));//订单状态
                }
                    map.put("statusname",request.getParameter("statusname"));//名称

                /*申述日期的查询*/
                map.put("appealdate1",CommonUtil.queryTime1(request.getParameter("appealdate1"),request.getParameter("appealdate2")));
                map.put("appealdate2",CommonUtil.queryTime2(request.getParameter("appealdate1"),request.getParameter("appealdate2")));
                //申述状态的查询
                if(!CommonUtil.isEmpty(request.getParameter("of_appealstatus"))){
                    map.put("of_appealstatus",Byte.valueOf(request.getParameter("of_appealstatus")));//订单状态
                }
                SalesV_Order_List sol = new SalesV_Order_List();
                //查询条件
                us = salesVOrderListService.getSalesVOrderListList(map);
                page.setRowcount(salesVOrderListService.getCountSalesVOrderList(map));
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
     * 业务员申述表 zuoxiaochao
     * Sales_Appeal
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesappeallist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalesappeallist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Sales_Appeal> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("sp_orderno",request.getParameter("sp_orderno"));//订单单号
                map.put("sp_designerid",request.getParameter("sp_designerid"));//设计师id
                map.put("sp_contentgroup",request.getParameter("sp_contentgroup"));//申述分类
                map.put("sp_contentvalue",request.getParameter("sp_contentvalue"));//申述内容
                map.put("sp_disposevalue",request.getParameter("sp_disposevalue"));//处理结果
                if(!CommonUtil.isEmpty(request.getParameter("sp_disposemode"))){
                    map.put("sp_disposemode",CommonUtil.convert_boolean(request.getParameter("sp_disposemode")));//处理方式
                }
                //状态
                if(!CommonUtil.isEmpty(request.getParameter("sp_status"))){
                    map.put("sp_status",Byte.valueOf(request.getParameter("sp_status")));//状态
                }

                map.put("sp_createno",request.getParameter("sp_createno"));//制表人员
                map.put("sp_confirmno",request.getParameter("sp_confirmno"));//审核人员
                map.put("sp_disposeno",request.getParameter("sp_disposeno"));//处理账号


				/*制表日期的查询*/
                map.put("sp_createdate1",CommonUtil.queryTime1(request.getParameter("sp_createdate1"),request.getParameter("sp_createdate2")));
                map.put("sp_createdate2",CommonUtil.queryTime2(request.getParameter("sp_createdate1"),request.getParameter("sp_createdate2")));

                /*审核日期的查询*/
                map.put("sp_confirmdate1",CommonUtil.queryTime1(request.getParameter("sp_confirmdate1"),request.getParameter("sp_confirmdate2")));
                map.put("sp_confirmdate2",CommonUtil.queryTime2(request.getParameter("sp_confirmdate1"),request.getParameter("sp_confirmdate2")));

                /*处理日期的查询*/
                map.put("sp_disposedate1",CommonUtil.queryTime1(request.getParameter("sp_disposedate1"),request.getParameter("sp_disposedate2")));
                map.put("sp_disposedate2",CommonUtil.queryTime2(request.getParameter("sp_disposedate1"),request.getParameter("sp_disposedate2")));
                //查询条件end
                us = salesAppealServicve.getSales_AppealList(map);
                page.setRowcount(salesAppealServicve.getCountSales_Appeal(map));
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


    /***
     * 读取业务员申述表每一条
     * Sales_Appeal
     * @return
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesappealdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getsalesappealdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        //获取sp_id
        String sp_id = request.getParameter("sp_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(sp_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Sales_Appeal ar = new Sales_Appeal();

        if (flag_pass==true) {
            try {
                ar = salesAppealServicve.getSales_Appealdetail(CommonUtil.convert_Long(sp_id));
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
     *业务员申述表状态
     * Sales_Appeal
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savesalesappealstatus", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savesalesappealstatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String sp_id = request.getParameter("sp_id");//得到的id
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String type = request.getParameter("type");//这是判断更改状态的依据
        String sp_status =type;
        String sp_disposemode = request.getParameter("sp_disposemode");//处理方式:0.不通过，1.通过',
        String sp_disposevalue = request.getParameter("sp_disposevalue");//这是填写的理由
        String orderno = request.getParameter("sp_orderno");//订单号
 /*检查参数begin*/
        if (CommonUtil.isEmpty(sp_id)&&flag_pass==true) {

            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请先登录");
            flag_pass = false;
        };
        if("2".equals(type)){
            if (CommonUtil.isEmpty(sp_disposevalue)&&flag_pass==true) {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage("请填写处理结果");
                flag_pass = false;
            };
            if (CommonUtil.isEmpty(sp_disposemode)&&flag_pass==true) {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage("到底是否通过");
                flag_pass = false;
            };
        }



/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Sales_Appeal sa = new Sales_Appeal();
                sa.setSp_id(Long.valueOf(sp_id));
                sa.setSp_disposeid(Long.valueOf(sm_id));
                sa.setSp_disposeno(sm_no);
                sa.setSp_disposedate(new Date());
                if("2".equals(type)){
                    sa.setSp_disposevalue(sp_disposevalue);
                    sa.setSp_disposemode(CommonUtil.convert_boolean(sp_disposemode));//通过还是未通过
                }
                sa.setSp_status(Byte.valueOf(sp_status));
                int ii = salesAppealServicve.updateSales_Appealstatus(sa);//改为平台处理
                if("2".equals(type)){
                    if(CommonUtil.convert_boolean(sp_disposemode)){//通过
                        //订单单号,用户id,拜贴类别
                        //根据sp_id查询出所有的信息
                        Sales_Order so = orderService.getOrderMemo(orderno, 6);
                        if(Byte.valueOf("3")== so.getOf_appealstatus()){
                            int i = orderService.saveOrderRevoke(orderno, 6);
                        }else{
                            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appResult.setMessage("该用户的申述状态出现异常");
                        }

                    }
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

}

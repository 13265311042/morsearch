package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sales_Evaluate;
import com.morsearch.model.Sales_Order;
import com.morsearch.service.LableListService;
import com.morsearch.service.OrderService;
import com.morsearch.service.SalesEvaluateService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Designer_comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by ywh on 2017-11-21.
 */

@Controller("DesSalesController")
@RequestMapping("/des/")
public class DesSalesController extends BaseController{


    @Resource
    private SalesEvaluateService salesEvaluateService;
    @Resource
    private LableListService lableListService;
    @Resource
    private OrderService orderService;


    /**
     *
     * 设计师评价业务员
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savesalesmanevaluation", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savesalesmanevaluation(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/


        String  se_salesmanid = (request.getParameter("se_salesmanid"));      //业务员ID
        String userid = request.getParameter("ur_id");
        // Long l = Long.valueOf(designerid);
        /*检查参数*/
        if ((se_salesmanid==null || "".equals(se_salesmanid))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("业务员ID参数不能为空");
            flag_pass = false;
        };
        if ((userid==null || "".equals(userid))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("userid参数不能为空");
            flag_pass = false;
        };
        int se_anonymity =Integer.valueOf(request.getParameter("se_anonymity"));      //匿名评价
        String se_contentvalue = request.getParameter("se_contentvalue");   //评价内容
        String se_contentgrade = request.getParameter("se_contentgrade");   //评级等级
        String se_contentgroup = request.getParameter("se_contentgroup");//评价分类
        String orderno = request.getParameter("de_orderno"); //订单单号

        String name =commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"username");/* 登录名称*/
        String createno = commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno");//登录账号

/*
        if ((se_contentvalue==null || "".equals(se_contentvalue))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评价内容参数不能为空");
            flag_pass = false;
        };
*/

        if ((se_contentgrade==null || "".equals(se_contentgrade))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评级等级不能为空");
            flag_pass = false;
        };
        if ((se_contentgroup==null || "".equals(se_contentgroup))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评级分类不能为空");
            flag_pass = false;
        };
        if ((orderno==null || "".equals(orderno))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号码不能为空");
            flag_pass = false;
        };

        Sales_Order salesOrder = orderService.getOrderMemo(orderno,8);
        if (flag_pass==true&&salesOrder!=null&&CommonUtil.read_boolean(salesOrder.getOf_flagappraisedesi()) ==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("此订单设计师已评价");
            flag_pass = false;
        };

        if (flag_pass==true) {
            try {
                int idd = salesEvaluateService.addSales_Evaluate(Long.valueOf(se_salesmanid), se_anonymity, se_contentvalue, se_contentgrade, se_contentgroup, orderno, name, Long.valueOf(userid), createno);
                if (idd>0){
/*存入redis begin*/
                Sales_Order som = gson.fromJson(redisService.getMapRow(Constants.REDIS_ORDER_STATUS,orderno), Sales_Order.class);
                if (som==null){som=orderService.getOrderMemo(orderno,4);};
                if (som!=null) {
                    som.setOf_flagappraisedesi(true);
                    som.setOf_dateappraisedesi(new Date());
                    redisService.saveMapRow(Constants.REDIS_ORDER_STATUS, orderno, gson.toJson(som));
                };
/*存入redis end*/
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;

}

    /**
     *业务员评论列表
     *
     * */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getdesignercomments", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesignercomments(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("se_salesmanid");
        if ((id==null || "".equals(id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("业务员ID不能为空");
            flag_pass = false;
        };

        List<Sales_Evaluate> list=new ArrayList<>();
        if (flag_pass==true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("se_salesmanid",id);
               /* map.put("se_appraiser",request.getParameter("se_appraiser"));
                map.put("se_contentvalue",request.getParameter("se_contentvalue"));
                map.put("se_contentgroup",request.getParameter("se_contentgroup"));
                map.put("se_contentgrade",request.getParameter("se_contentgrade"));
                map.put("se_appraiseimage",request.getParameter("se_appraiseimage"));
                map.put("se_createdate",request.getParameter("se_createdate")); //日期*/

			/*查询条件 end*/
                list=salesEvaluateService.getSales_EvaluateList(map);
                page.setRowcount(salesEvaluateService.getCountSales_Evaluate(map));//*记录数*//*
                appresult.setPage(page);
                if (list==null){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                };

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
        /*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(list);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /**
     *
     *评论回显
     * ywh
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getcomment", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getcomment(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String orderno = request.getParameter("orderno");
        if (CommonUtil.isEmpty (orderno)==true&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单不能为空");
            flag_pass = false;
        };

        Designer_comment dc = new Designer_comment();
        if (flag_pass==true){
            try {
                List<Base_LableList> list1 = lableListService.getBl_name(2001 + "");
                List<Base_LableList> list2 = lableListService.getBl_name(2002 + "");
                dc.setList1(list1);
                dc.setList2(list1);
                dc.setOrdermemo(orderService.getOrderMemo(orderno, 5));
            }catch (Exception ex){
                logger.error(ex.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            };

        }
        appresult.setData(dc);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }
}

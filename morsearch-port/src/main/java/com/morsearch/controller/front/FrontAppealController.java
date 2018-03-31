package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sales_Appeal;
import com.morsearch.model.Sales_Order;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.service.AppealService;
import com.morsearch.service.CommService;
import com.morsearch.service.LableListService;
import com.morsearch.service.OrderService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Appeal;
import com.morsearch.vo.Base_LableList_list;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ywh on 2017-10-25.
 */
@Controller("FrontAppealController")
@RequestMapping("/front/")
public class FrontAppealController extends BaseController {

    @Resource
    private OrderService orderService;
    @Resource
    private AppealService appealService;
    @Resource
    private LableListService lableListService;

    /**
     *
     * 申诉
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savegoappeal", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savegoappeal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("userid");
        String no = request.getParameter("orderno"); //订单号
        String contentvalue = request.getParameter("contentvalue"); //申诉内容
        String  contentgroup = request.getParameter("contentgroup");//申诉分类
        String createno =commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,id,"userno");//登录账号
        if ((no==null || "".equals(id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号参数不能为空");
            flag_pass = false;
        };

        if ((no==null || "".equals(no))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号参数不能为空");
            flag_pass = false;
        };
        if ((contentgroup==null || "".equals(contentgroup))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("申诉分类不能为空");
            flag_pass = false;
        };
        if ((contentvalue==null || "".equals(contentvalue))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("申诉内容不能为空");
            flag_pass = false;
        };

        if( flag_pass = true ){
            try{
               int i =  appealService.insertSelective(no,contentgroup,contentvalue,new Date(),Long.valueOf(id),createno);
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_ADD_SUCC);
                }
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }
    /*
    * * * 申诉详情
    * ywh
    *
    */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getappealdetails", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getappealdetails(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String no = request.getParameter("orderno"); //订单号

        if (flag_pass==true&&CommonUtil.isEmpty(no)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号参数不能为空");
            flag_pass = false;
        };
        Sales_Appeal appeal = new Sales_Appeal();
        if(flag_pass==true){
            try{
                Sales_Appeal sales_appeal = appealService.selectByPrimaryNo(no);
                appeal.setSp_id(sales_appeal.getSp_id());
                //appeal.setSp_status(sales_appeal.getSp_status());
                appeal.setSp_createdate(sales_appeal.getSp_createdate()); //提交日期
                appeal.setSp_contentvalue(sales_appeal.getSp_contentvalue());
                if (sales_appeal.getSp_status()==1) {
                    appeal.setSp_status((byte)1);
                    appeal.setSp_confirmdate(sales_appeal.getSp_confirmdate());//审核日期
                }else if (sales_appeal.getSp_status()==2){
                    appeal.setSp_confirmdate(sales_appeal.getSp_confirmdate());//审核日期
                    appeal.setSp_disposedate(sales_appeal.getSp_disposedate());//处理日期
                    appeal.setSp_status((byte)2);
                    appeal.setSp_disposevalue(sales_appeal.getSp_disposevalue());//处理内容
                }
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
   /*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(appeal);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }
    /**
     *
     *显示申诉
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getappeal", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getappeal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String no1 = request.getParameter("orderno"); //订单号

        if (request.getParameter("orderno")==null||"null".equals(request.getParameter("orderno"))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号参数不能为空");
            flag_pass = false;
        };

        Appeal appeal = new Appeal();

    if (flag_pass = true){
       try {

            Sales_Order order = orderService.getOrderMemo(no1,3);
            SysV_UserFull ur = userService.getUser_FullDetail(order.getOf_custid(),7);
            List<Base_LableList> list = lableListService.getLableName("2007");

            appeal.setUr_imageurl(ur.getUr_imageurl());
            appeal.setUr_namenick(ur.getUr_namenick());
            appeal.setUe_personjob(ur.getUe_personjob());
            appeal.setList(list);
        }catch (Exception e) {
            logger.error(e.getMessage());
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }
    }
        /*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(appeal);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }

}
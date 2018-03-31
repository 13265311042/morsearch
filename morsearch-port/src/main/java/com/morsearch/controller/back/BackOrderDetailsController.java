package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.MallV_Order_Show;
import com.morsearch.model.Mall_Order;
import com.morsearch.model.Mall_Order_Detail;
import com.morsearch.model.SalesV_Order_person;
import com.morsearch.service.MallOrderDetailsService;
import com.morsearch.service.OrderDetailsService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.OrderParticulars;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ywh on 2018-1-6.
 */
@Controller("BackOrderDetails")
@RequestMapping("/back/")
public class BackOrderDetailsController extends BaseController {


    @Resource
    private OrderDetailsService orderDetailsService;
    @Resource
    private MallOrderDetailsService mallOrderDetailsService;

    /**
     * 订单列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getorderlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getorderlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/

        List<MallV_Order_Show> list = new ArrayList<MallV_Order_Show>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //String date = sdf.format(new Date());
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("mod_goodtitle", request.getParameter("mod_goodtitle"));
                map.put("mo_no", request.getParameter("mo_no"));
                map.put("mo_usernick",request.getParameter("mo_usernick"));
                map.put("mo_status",request.getParameter("mo_status"));

			/*查询条件 end*/
               list = orderDetailsService.getMallV_Order_Show(map);
               page.setRowcount(orderDetailsService.getMallV_Order_ShowCount(map));/*记录数*/
                appresult.setPage(page);

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }

    /**
     *待发货
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getgoodsreceipt", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getgoodsreceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/
       /* String id = request.getParameter("userid");
        String no = request.getParameter("mono");*/
        String no = request.getParameter("mono");

        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }

      /*  if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }*/
        OrderParticulars op = new OrderParticulars();
       // List<OrderParticulars> list = new ArrayList<>();
        if(flag_pass==true) {
            try {
                Mall_Order mo = mallOrderDetailsService.getorder(no,3);
                MallV_Order_Show mos = orderDetailsService.selectMallV_Order_Show(mo.getMo_no());
                Mall_Order_Detail mod = mallOrderDetailsService.getMallOrder(mo.getMo_no());
                op.setMo_id(mo.getMo_id());
                op.setMo_no(mo.getMo_no());
                op.setStatusname(mos.getStatusname());
                op.setMo_river(mo.getMo_river());
                op.setMo_usernick(mo.getMo_usernick());
                op.setMo_rivphone(mo.getMo_rivphone());
                op.setMo_rivaddress(mo.getMo_rivaddress());
                op.setMo_dateorder(mo.getMo_dateorder());
                op.setMo_datepay(mo.getMo_datepay());
                op.setMo_datesend(mo.getMo_datesend());
                op.setMo_datedelivery(mo.getMo_datedelivery());
                op.setMo_logisticsname(mo.getMo_logisticsname());
                op.setMo_logisticstickets(mo.getMo_logisticstickets());
                op.setMo_logisticsmsg(mo.getMo_logisticsmsg());
                op.setMo_payamtfreight(mo.getMo_payamtfreight());
                op.setMo_paybalance(mo.getMo_paybalance());
                op.setMo_traderefundamount(mo.getMo_traderefundamount());
                op.setMo_traderefunddate(mo.getMo_traderefunddate());
                op.setMo_traderefundway(mo.getMo_traderefundway());
                op.setMo_status(String.valueOf(mo.getMo_status()));
                op.setMod_qty(mod.getMod_qty());
                op.setMod_price(mod.getMod_price());
                op.setMod_goodtitle(mod.getMod_goodtitle());
                op.setMod_goodmodel(mod.getMod_goodmodel());
                op.setMod_goodimage(mod.getMod_goodimage());
                op.setMod_amount(mod.getMod_amount());
                op.setMod_goodcolor(mod.getMod_goodcolor());
                op.setMo_payamtorder(mo.getMo_payamtorder());
            //list.add(op);
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*返回数据 begin*/
        appresult.setData(op);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }


    /**
     * 查看订单状态
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getsatus", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        String no  = request.getParameter("mono");
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }

        OrderParticulars op = new OrderParticulars();
        if(flag_pass==true){
            try{
                Mall_Order mo = mallOrderDetailsService.getorder(no,3);
                op.setMo_status(String.valueOf(mo.getMo_status()));

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }

   /*返回数据 begin*/
        appresult.setData(op);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
}

    /**
     * 订单退款
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updaterefund", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String updaterefund(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String refund =request.getParameter("traderefundamount");
        String  no = request.getParameter("mono");
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(refund) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("退款数不能为空");
            flag_pass = false;
        }
        if(flag_pass==true){
            try{
                int i = mallOrderDetailsService.updateMall_Order(no,refund);
                Mall_Order mo = mallOrderDetailsService.getorder(no,3);
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("退款失败");
                }
                appresult.setData(mo);
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
     * 添加物流信息
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatelogistics", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String updatelogistics(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        String express = request.getParameter("logisticsname");
        String no = request.getParameter("mono");
        String oddnumbers = request.getParameter("logisticstickets");

        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("订单号不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(express) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("快递公司不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(oddnumbers) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("快递单号不能为空");
            flag_pass = false;
        }

        if(flag_pass==true){
            try{

                Mall_Order mo = mallOrderDetailsService.getorder(no,3);
                mo.setMo_logisticsname(express);
                mo.setMo_logisticstickets(oddnumbers);
                mo.setMo_status((byte)3);
                int  i = mallOrderDetailsService.updateByPrimaryKeySelective(mo);
                appresult.setData(mo);
      if(i==0){
          appresult.setStatus(Constants.RESULT_STATUS_FAIL);
          appresult.setMessage("添加物流信息失败");
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
}
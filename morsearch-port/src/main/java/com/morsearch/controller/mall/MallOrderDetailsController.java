package com.morsearch.controller.mall;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Acc_Wallet;
import com.morsearch.model.Mall_Order;
import com.morsearch.model.Mall_Order_Detail;
import com.morsearch.service.MallOrderDetailsService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.OrderParticulars;
import com.morsearch.vo.WaitforSign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 商城前端订单详情
 * Created by ywh on 2018-1-4.
 */

@Controller("MallOrderDetailsController")
@RequestMapping("/mall/")
public class MallOrderDetailsController extends BaseController {

    @Resource
    private MallOrderDetailsService mallOrderDetailsService;

    /**
     * 待签收
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getWaitforSign", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getWaitforSign(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("userid");
        String no = request.getParameter("mono");

        if (CommonUtil.isEmpty(userid) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }
        WaitforSign wf = new WaitforSign();
        if(flag_pass==true){
            try {
        Mall_Order mo = mallOrderDetailsService.getorder(no,0);
        Mall_Order_Detail mod = mallOrderDetailsService.getMallOrder(no);
               // wf.setMo_id(mo.getMo_id());
                wf.setMo_datepay(mo.getMo_datepay());
                wf.setMo_datesend(mo.getMo_datesend());
                wf.setMo_logisticsmsg(mo.getMo_logisticsmsg());
                wf.setMo_logisticsname(mo.getMo_logisticsname());
                wf.setMo_logisticstickets(mo.getMo_logisticstickets());
                wf.setMo_payamtfreight(mo.getMo_payamtfreight());
                wf.setMo_payamtgoods(mo.getMo_payamtgoods());
                wf.setMo_payamtorder(mo.getMo_payamtorder());
                wf.setMo_paybalance(mo.getMo_paybalance());
                wf.setMo_usernick(mo.getMo_usernick());
                wf.setMo_river(mo.getMo_river());
                wf.setMo_rivaddress(mo.getMo_rivaddress());
                wf.setMo_rivphone(mo.getMo_rivphone());
                wf.setMod_amount(mod.getMod_amount());
                wf.setMod_goodcolor(mod.getMod_goodcolor());
                wf.setMod_goodimage(mod.getMod_goodimage());
                wf.setMod_goodmodel(mod.getMod_goodmodel());
                wf.setMod_goodtitle(mod.getMod_goodtitle());
                wf.setMod_price(mod.getMod_price());
                wf.setMod_qty(mod.getMod_qty());

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(wf);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 待评价
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getstayevaluate", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getstayevaluate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("userid");
        String no = request.getParameter("mono");

        if (CommonUtil.isEmpty(userid) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }
        WaitforSign wf = new WaitforSign();
        if(flag_pass==true){
            try {
                Mall_Order mo = mallOrderDetailsService.getorder(no,1);
                Mall_Order_Detail mod = mallOrderDetailsService.getMallOrder(no);
                // wf.setMo_id(mo.getMo_id());
                wf.setMo_datepay(mo.getMo_datepay());
                wf.setMo_datesend(mo.getMo_datesend());
                wf.setMo_datedelivery(mo.getMo_datedelivery());
                wf.setMo_logisticsmsg(mo.getMo_logisticsmsg());
                wf.setMo_logisticsname(mo.getMo_logisticsname());
                wf.setMo_logisticstickets(mo.getMo_logisticstickets());
                wf.setMo_payamtfreight(mo.getMo_payamtfreight());
                wf.setMo_payamtgoods(mo.getMo_payamtgoods());
                wf.setMo_payamtorder(mo.getMo_payamtorder());
                wf.setMo_paybalance(mo.getMo_paybalance());
                wf.setMo_usernick(mo.getMo_usernick());
                wf.setMo_river(mo.getMo_river());
                wf.setMo_rivaddress(mo.getMo_rivaddress());
                wf.setMo_rivphone(mo.getMo_rivphone());
                wf.setMod_amount(mod.getMod_amount());
                wf.setMod_goodcolor(mod.getMod_goodcolor());
                wf.setMod_goodimage(mod.getMod_goodimage());
                wf.setMod_goodmodel(mod.getMod_goodmodel());
                wf.setMod_goodtitle(mod.getMod_goodtitle());
                wf.setMod_price(mod.getMod_price());
                wf.setMod_qty(mod.getMod_qty());

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(wf);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
}


    /**
     * 完成订单
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getcomplete", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getcomplete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("userid");
        String no = request.getParameter("mono");

        if (CommonUtil.isEmpty(userid) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }
        WaitforSign wf = new WaitforSign();
        if(flag_pass==true){
            try {
                Mall_Order mo = mallOrderDetailsService.getorder(no,1);
                Mall_Order_Detail mod = mallOrderDetailsService.getMallOrder(no);
                // wf.setMo_id(mo.getMo_id());
                wf.setMo_datepay(mo.getMo_datepay());
                wf.setMo_datesend(mo.getMo_datesend());
                wf.setMo_datedelivery(mo.getMo_datedelivery());
                wf.setMo_logisticsmsg(mo.getMo_logisticsmsg());
                wf.setMo_logisticsname(mo.getMo_logisticsname());
                wf.setMo_logisticstickets(mo.getMo_logisticstickets());
                wf.setMo_payamtfreight(mo.getMo_payamtfreight());
                wf.setMo_payamtgoods(mo.getMo_payamtgoods());
                wf.setMo_paybalance(mo.getMo_paybalance());
                wf.setMo_usernick(mo.getMo_usernick());
                wf.setMo_river(mo.getMo_river());
                wf.setMo_rivaddress(mo.getMo_rivaddress());
                wf.setMo_rivphone(mo.getMo_rivphone());
                wf.setMod_amount(mod.getMod_amount());
                wf.setMod_goodcolor(mod.getMod_goodcolor());
                wf.setMod_goodimage(mod.getMod_goodimage());
                wf.setMod_goodmodel(mod.getMod_goodmodel());
                wf.setMod_goodtitle(mod.getMod_goodtitle());
                wf.setMod_price(mod.getMod_price());
                wf.setMod_qty(mod.getMod_qty());

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(wf);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }


    /**
     * 订单详情
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getorderparticulars", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getorderparticulars(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("userid"); //用户ID
        String no = request.getParameter("mono");//订单号
        String in = request.getParameter("");

        if (CommonUtil.isEmpty(userid) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(no) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("no参数不能为空");
            flag_pass = false;
        }
        OrderParticulars op = new OrderParticulars();
        if(flag_pass==true){
            try {
                Acc_Wallet aw = mallOrderDetailsService.selectByPrimaryKey(Long.valueOf(userid));
                Mall_Order mo = mallOrderDetailsService.getorder(no,0);
                Mall_Order_Detail mod = mallOrderDetailsService.getMallOrder(no);
                op.setWl_integral(aw.getWl_integral());
                op.setMo_logisticsmsg(mo.getMo_logisticsmsg());
                op.setMo_payamtfreight(mo.getMo_payamtfreight());
                op.setMo_payamtgoods(mo.getMo_payamtgoods());
                op.setMo_sumqty(mo.getMo_sumqty());
                op.setMo_river(mo.getMo_river());
                op.setMo_rivaddress(mo.getMo_rivaddress());
                op.setMo_rivphone(mo.getMo_rivphone());
                op.setMo_usernick(mo.getMo_usernick());
                op.setMod_amount(mod.getMod_amount());
                op.setMod_goodcolor(mod.getMod_goodcolor());
                op.setMod_goodimage(mod.getMod_goodimage());
                op.setMod_goodmodel(mod.getMod_goodmodel());
                op.setMod_goodtitle(mod.getMod_goodtitle());
                op.setMod_price(mod.getMod_price());
                op.setMod_qty(mod.getMod_qty());

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(op);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
}
}
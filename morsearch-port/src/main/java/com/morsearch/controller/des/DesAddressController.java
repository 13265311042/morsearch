package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Mall_Address;
import com.morsearch.model.Sys_User;
import com.morsearch.service.MallAddressService;
import com.morsearch.service.UserService;
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
 * Created by ywh on 2017-12-13.
 */
@Controller("DesAddressController")
@RequestMapping("/des/")
public class DesAddressController extends BaseController {
    @Resource
    private MallAddressService mallAddressService;
    @Resource
    private UserService userService;

    /**
     * 新增地址
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveaddress", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveaddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("userid");
        String receiver = request.getParameter("receiver");
        String phone = request.getParameter("phone");
        String addarea = request.getParameter("addarea");
        String adddetailed = request.getParameter("adddetailed");
        String defaultaddress = request.getParameter("default");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        } if (flag_pass == true && (CommonUtil.isEmpty(receiver))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("收货人不能为空");
            flag_pass = false;
        } if (flag_pass == true && (CommonUtil.isEmpty(phone))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("电话不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(phone))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("地址区域不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(phone))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("详细地址不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(phone))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("设为默认不能为空");
            flag_pass = false;
        }
        Mall_Address ma = new Mall_Address();
        if (flag_pass==true){
            try{
                Sys_User su = userService.getUser_MainDetail(Long.valueOf(id));
                ma.setMa_userid(Long.valueOf(id));
                ma.setMa_receiver(receiver);
                ma.setMa_phone(phone);
                ma.setMa_addarea(addarea);
                ma.setMa_adddetailed(adddetailed);
                if (Integer.valueOf(defaultaddress)==1){
                    ma.setMa_default(true);
                }else{
                    ma.setMa_default(false);
                }
                ma.setMa_createid(Long.valueOf(id));
                ma.setMa_createno(su.getUr_no());
                ma.setMa_createdate(new Date());
                mallAddressService.insertSelective(ma);


            } catch (Exception e) {
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
     * 地址列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getaddresslist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getaddresslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        List<Mall_Address> list = new ArrayList<>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("ma_userid", request.getParameter("ma_userid"));
             /*   map.put("sp_title", request.getParameter("sp_title"));
                map.put("sp_cityname", request.getParameter("sp_cityname"));
                map.put("sp_signcode", request.getParameter("sp_signcode"));
                map.put("sp_createdate", request.getParameter("sp_createdate"));*/

			/*查询条件 end*/
                list = mallAddressService.getMall_AddressList(map);
                page.setRowcount(mallAddressService.getCountMall_Address(map));//*记录数*//*
                appresult.setPage(page);
                if (list.size()==0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;

    }

    /**
     * 修改回显
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getaddress", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getaddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("ma_id");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass==true){
            try{
                Mall_Address ma = mallAddressService.selectMall_Address(Long.valueOf(id));
                appresult.setData(ma);

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
     * 修改地址
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updateaddress", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updateaddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("ma_id");
        String receiver = request.getParameter("receiver");
        String phone = request.getParameter("phone");
        String addarea = request.getParameter("addarea");
        String adddetailed = request.getParameter("adddetailed");
        String defaultaddress = request.getParameter("default");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass==true){
            Mall_Address ma = new Mall_Address();
            ma.setMa_id(Long.valueOf(id));
            ma.setMa_receiver(receiver);
            ma.setMa_phone(phone);
            ma.setMa_addarea(addarea);
            ma.setMa_adddetailed(adddetailed);
            if (Integer.valueOf(defaultaddress)==1){
                ma.setMa_default(true);
            }else{
                ma.setMa_default(false);
            }
            mallAddressService.updateByPrimaryKeySelective(ma);

        }

        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }
}
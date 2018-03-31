package com.morsearch.controller.company;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.*;
import com.morsearch.service.BaseCompanyService;
import com.morsearch.service.BaseVCompanyUserService;
import com.morsearch.service.UserService;
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
 * Created by ywh on 2017-12-14.
 */
@Controller("CompanyblackwhiteController")
@RequestMapping("/company/")
public class CompanyblackwhiteController extends BaseController {
    @Resource
    private BaseVCompanyUserService baseVCompanyUserService;
    @Resource
    private UserService userService;
    @Resource
    private BaseCompanyService baseCompanyService;


    /**
     *白名单列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     * 类别：1.白名单，2.黑名单,3.待审核
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getbasevcompanyuser", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbasevcompanyuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String userid = request.getParameter("cy_userid");

        String type = request.getParameter("type");

        if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("userid参数不能为空");
            flag_pass = false;
        };

        if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("type参数不能为空");
            flag_pass = false;
        };

        SysV_UserFull sv = userService.getUser_FullDetail(Long.valueOf(userid),14);
        if (flag_pass==true &&"3".equals(type)&&sv!=null){ /*初始化进待审核*/
        List<Map<String,Object>>  map1 = baseCompanyService.getBaseCompanyID(sv.getUe_companyname());
        if (map1!=null){
            for (int i =0;i<map1.size();i++){
               Map<String,Object> mm=map1.get(i);
                Long uid =Long.valueOf(String.valueOf(mm.get("ur_id")));
                Base_Company_User bu = new Base_Company_User();
                bu.setBcu_userid(Long.valueOf(userid));
                bu.setBcu_type((byte)3);
                bu.setBcu_listuserid(uid);
                bu.setBcu_createdate(new Date());
                baseCompanyService.insertSelective(bu);
        }
        }};

        List<BaseV_Company_User> list = new ArrayList<>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("type",Integer.parseInt(type));
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("userid",Long.parseLong(userid));
                map.put("listusername",request.getParameter("listusername"));
                map.put("listuserphone",request.getParameter("listuserphone"));

			/*查询条件 end*/
                list = baseVCompanyUserService.getBaseV_Company_UserList(map);
                page.setRowcount(baseVCompanyUserService.getCountBaseV_Company_User(map));//*记录数*//*
                appresult.setPage(page);


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }

                /*end处理数据*/
/*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 保存名单状态
     * @param request
     * @param response
     * @return
     * @throws Exception
     *     * 类别：1.白名单，2.黑名单,3.待审核
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatebasevcompanyuser", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatebasevcompanyuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("bcu_id");
        String type = request.getParameter("bcu_type");
        if (flag_pass == true && (CommonUtil.isEmpty(id) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(type) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("type参数不能为空");
            flag_pass = false;
        }
        Base_Company_User bu= new Base_Company_User();
        if (flag_pass==true){
            try{
                bu.setBcu_id(Long.valueOf(id));
                bu.setBcu_type(Byte.valueOf(type));
                bu.setBcu_updatedate(new Date());
                baseCompanyService.updateByPrimaryKeySelective(bu);

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

}
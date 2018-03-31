package com.morsearch.controller.company;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Base_Company;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_User;
import com.morsearch.service.BaseCompanyService;
import com.morsearch.service.CommService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.CompanyMsg;
import org.apache.commons.codec.digest.DigestUtils;
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
@Controller("CompanyUserController")
@RequestMapping("/company/")
public class CompanyUserController extends BaseController {
    private String ur_id;
    @Resource
    private BaseCompanyService baseCompanyService;
    @Resource
    private CommService commService;

    /**
     *公司资料
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getbasecompany", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbasecompany(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid =request.getParameter("cy_userid");

        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        CompanyMsg cm = new CompanyMsg();
        if (flag_pass==true){
            try{
                Map<String,Object> sv = baseCompanyService.selectBase_Company(Long.valueOf(userid));
                if (sv!=null){
                    cm.setUr_id((Long) sv.get("ur_id"));
                    cm.setUr_no((String) sv.get("ur_no"));
                    cm.setCompanyname((String) sv.get("ue_companyname"));
                    cm.setCompanytype(String.valueOf(sv.get("ue_companytype")));
                    cm.setUr_register_date((Date) sv.get("ur_register_date"));
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage("公司尚未有资料，请添加.");
                }
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(cm);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 新增资料
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savebasecompany", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savebasecompany(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String userid = request.getParameter("sm_id");
        String no = request.getParameter("sm_no");
        String name = request.getParameter("cy_name");
        String trade = request.getParameter("cy_trade");
        String tagproduct = request.getParameter("cy_tagproduct");
        String remark = request.getParameter("cy_remark");
        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(no) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("账号不能为空");
            flag_pass = false;
        }

        Base_Company bc = new Base_Company();
        if (flag_pass==true){
            try{
                String code = commService.getSys_WordList(name);
                bc.setCy_userid(Long.valueOf(userid));
                bc.setCy_trade(trade);
                bc.setCy_tagproduct(tagproduct);
                bc.setCy_remark(remark);
                bc.setCy_createdate(new Date());
                baseCompanyService.insertSelective(bc);
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
     * x修改资料回显
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getbasecompany1", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbasecompany1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id  = request.getParameter("cy_id");
        if (flag_pass == true && (CommonUtil.isEmpty(id) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        if (flag_pass==true){
            try{
                Base_Company bc = baseCompanyService.getBase_Company(Long.valueOf(id));
                appresult.setData(bc);
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("请勿重复添加公司信息！");
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
     *
     * 修改保存
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatebasecompany", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatebasecompany(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String userid = request.getParameter("cy_userid");
        String trade = request.getParameter("cy_trade");
        String tagproduct = request.getParameter("cy_tagproduct");
        String remark = request.getParameter("cy_remark");

        if (flag_pass == true && (CommonUtil.isEmpty(userid) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }

        if (flag_pass==true){
            try{
                Base_Company bc =new Base_Company();
                bc.setCy_userid(Long.valueOf(userid));
                bc.setCy_tagproduct(tagproduct);
                bc.setCy_trade(trade);
                bc.setCy_remark(remark);
                baseCompanyService.updateByPrimaryKeySelective(bc);

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("请勿重复添加公司信息！");
            }

        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }


    /*
    修改密码
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "changepassword", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String changepassword(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("密码修改成功,请重新登录!");
        String rs = "";
        ur_id=request.getParameter("ur_id");
        Boolean flag_pass=true;

/*检查参数 begin*/
        if (flag_pass==true&&(ur_id==null || "".equals(ur_id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };
        String oldpwd=request.getParameter("oldpwd");
        String newpwd=request.getParameter("newpwd");

        if ((oldpwd==null || "".equals(oldpwd))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("原来密码不能为空");
            flag_pass = false;
        };
        if ((newpwd==null || "".equals(newpwd))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("新密码不能为空");
            flag_pass = false;
        };
        if (flag_pass==true&&(newpwd.equals(oldpwd))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("新密码不能与原来密码相同");
            flag_pass = false;
        };
/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try {
                SysV_UserFull uf=userService.getUser_FullDetail(Long.parseLong(ur_id),1);
                if (uf!=null) {
                    if (uf.getUr_password().equals(CommonUtil.pwdmd5t2(oldpwd))) {
                        Sys_User user = new Sys_User();
                        user.setUr_id(Long.parseLong(ur_id));
                        user.setUr_password(CommonUtil.pwdmd5t2(newpwd));
                        int ii = userService.updateByPrimaryKey(user);
                        if (ii==0){
                            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appresult.setMessage("密码修改失败");
                        };
                    }else {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage("原来密码错误");
                    };
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("无此用户");
                };
            } catch (Exception e) {
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

    /**
     *
     * 企业列表展示
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getbasevcompanylist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbasevcompanylist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        List<Base_Company> list = new ArrayList<>();
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
                map.put("cy_no",request.getParameter("cy_no"));
                map.put("cy_name",request.getParameter("cy_name"));


			/*查询条件 end*/
                list = baseCompanyService.getBase_CompanyList(map);
                page.setRowcount(baseCompanyService.getCountBase_Company(map));//*记录数*//*
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
}
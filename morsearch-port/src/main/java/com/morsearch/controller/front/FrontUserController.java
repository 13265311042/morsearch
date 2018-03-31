package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.DesigDemandService;
import com.morsearch.service.LableListService;
import com.morsearch.service.SmsService;
import com.morsearch.vo.*;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller("FrontUserController")
@RequestMapping("/front/")

public class FrontUserController extends BaseController {
    private String ur_id;/*用户表id*/


    @Resource
    private DesigDemandService desigDemandService;
    @Resource
    private LableListService lableListService;


    /*
    读取意向客户
    Leoli
    2017.10.13
    * */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getintention", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getintention(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;
/*检查参数 begin*/
        if ((ur_id == null || "".equals(ur_id)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;

/*检查参数 end*/
/*处理数据 begin*/
        UserCustomer ct = new UserCustomer();
        if (flag_pass == true) {
            try {
                SysV_UserFull uf = userService.getUser_FullDetail(Long.parseLong(ur_id), 2);/*获取用户*/
                if (uf != null) {
                    ct.setUserlist(uf);
                    Sys_WordList_list city = commService.getSys_WordList(Constants.WORD_CITY, 1, uf.getUe_willcity());/*获取城市*/
                    ct.setWillcitylist(city);
                    Base_LableList_list willtype = commService.getLableList(Constants.LABLETYPE_DESIGTYPE, uf.getUe_willtype());/*企业类别*/
                    ct.setWilltypelist(willtype);
                    Base_LableList_list majob = commService.getLableList(Constants.LABLETYPE_MAJOR, uf.getUe_willmajor());/*专业*/
                    ct.setWillmajorlist(majob);
                    Base_LableList_list jobtype = commService.getLableList(Constants.LABLETYPE_DESIGJOB, uf.getUe_willjob());/*职位*/
                    ct.setWilljoblist(jobtype);
                    Base_LableList_list level = commService.getLableList(Constants.LABLETYPE_DESIGLEVEL, uf.getUe_willlevel());/*级别*/
                    ct.setWilllevellist(level);
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("无此用户");
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(ct);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /*
        保存意向客户
        Leoli
        2017.10.13
    ur_id,city,type,major,job
        * */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveintention", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveintention(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;
/*检查参数 begin*/
        if ((ur_id == null || "".equals(ur_id)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;
        String city = request.getParameter("city");
        String type = request.getParameter("type");
        String major = request.getParameter("major");
        String job = request.getParameter("job");
        String level = request.getParameter("level");

        if (CommonUtil.isEmpty(city) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("城市列表参数不能为空");
            flag_pass = false;
        }
        ;
        if (CommonUtil.isEmpty(type) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("企业类型不能为空");
            flag_pass = false;
        }
        ;
        if (CommonUtil.isEmpty(major) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业名称不能为空");
            flag_pass = false;
        }
        ;
        if (CommonUtil.isEmpty(job) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("客户职位不能为空");
            flag_pass = false;
        }
        ;
        if (CommonUtil.isEmpty(level) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("客户级别不能为空");
            flag_pass = false;
        }
        ;

/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass == true) {
            try {
                Sys_User_Ext et =new Sys_User_Ext();//userService.getUser_ExtDetail(Long.parseLong(ur_id));//
                if (et != null) {
                    et.setUe_userid(Long.parseLong(ur_id));
                    et.setUe_willcity(city);
                    et.setUe_willtype(type);
                    et.setUe_willmajor(major);
                    et.setUe_willjob(job);
                    et.setUe_willlevel(level);
                    Sys_User ut = new Sys_User();
                    ut.setUr_id(Long.parseLong(ur_id));
                    ut.setUr_msgflag1(true);/*标记已经填写意向客户*/
                    int ii = userService.updatesave(ut, et, null);
                    redisService.saveMapRow(Constants.REDIS_USER_WILLMAJOR, ur_id, major);/*存*/

                    if (ii == 0) {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage(Constants.RESULT_EDIT_FAIL);
                    }
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("无此用户");
                }
                ;

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 修改密码
     * Leoli 2017.10.13
     * ur_id
     * oldpwd
     * newpwd
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "changeuserpwd", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String changeuserpwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("密码修改成功");
        String rs = "";
        ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;

/*检查参数 begin*/
        if (flag_pass == true && (ur_id == null || "".equals(ur_id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;
        String oldpwd = request.getParameter("oldpwd");
        String newpwd = request.getParameter("newpwd");

        if ((oldpwd == null || "".equals(oldpwd)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("原来密码不能为空");
            flag_pass = false;
        }
        ;
        if ((newpwd == null || "".equals(newpwd)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("新密码不能为空");
            flag_pass = false;
        }
        ;
        if (flag_pass == true && (newpwd.equals(oldpwd))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("新密码不能与原来密码相同");
            flag_pass = false;
        }
        ;
/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass == true) {
            try {
                SysV_UserFull uf = userService.getUser_FullDetail(Long.parseLong(ur_id), 1);
                if (uf != null) {
                    if (uf.getUr_password().equals(CommonUtil.pwdmd5t2(oldpwd))) {
                        Sys_User user = new Sys_User();
                        user.setUr_id(Long.parseLong(ur_id));
                        user.setUr_password(CommonUtil.pwdmd5t2(newpwd));
                        user.setUr_register_date(new Date());/*用于二次注册密码*/
                        int ii = userService.updateByPrimaryKey(user);
                        if (ii == 0) {
                            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appresult.setMessage("密码修改失败");
                        }
                        ;
                    } else {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage("原来密码错误");
                    }
                    ;
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("无此用户");
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 重置密码
     * ywh
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveforgotpassword", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveforgotpassword(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("密码修改成功");
        String rs = "";
        String phone = request.getParameter("phone");

        System.out.print(phone);
        String code = request.getParameter("code");
        String password = request.getParameter("psw");
        Boolean flag_pass = true;


        if (CommonUtil.isEmpty(phone) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[phone]不能为空");
            flag_pass = false;
        }
        ;
        if (CommonUtil.isEmpty(code) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[code]不能为空");
            flag_pass = false;
        }
        ;

        if (CommonUtil.isEmpty(password) == true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[password]不能为空");
            flag_pass = false;
        }
        ;
        Integer smsid=0;
        if (flag_pass == true) {
            String rut = smsService.saveSmsVerifyResult(phone, 2, code,true);
            if (!"1".equals(rut.substring(0,1))) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("验证码错误");
                flag_pass = false;
            }else{
                smsid= Integer.valueOf(rut.substring(2,rut.length()));
            };
        }

        if (flag_pass == true) {
            try {
                Long id = userService.getUserId(phone, 2);
                Sys_User user = new Sys_User();
                user.setUr_id(id);
                user.setUr_password(CommonUtil.pwdmd5t2(password));
                user.setUr_register_date(new Date());/*区分新密码的二次加密*/
                userService.updateByPrimaryKey(user);

                if (smsid!=0){/*确定*/
                    Sys_SmsVerify sms=new Sys_SmsVerify();
                    sms.setSv_id(smsid);
                    sms.setSv_status((byte) 1);
                    sms.setSv_verifytime(new Date());
                    smsService.verifyupdate(sms);
                };

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        //*处理逻辑 end*//*
        //*返回数据 begin*//*
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        //*处理数据格式*//*
        out.print(rs);
        out.close();
        //*返回数据 end*//*
        return null;

    }

    /**
     * 读取用户资料
     * ywh
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getuserdata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getuserdata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;
        /*
        * 检查参数
        * */
        if ((ur_id == null || "".equals(ur_id)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;

        /*
        * 处理数据
        * */
        UserPerfect up = new UserPerfect();
        if (flag_pass == true) {
            try {
                SysV_UserFull uf = userService.getUser_FullDetail(Long.parseLong(ur_id), 3);/*获取用户*/
                if (uf!=null) {
                    up.setUserlist(uf);
                    Sys_WordList_list city = commService.getSys_WordList(Constants.WORD_CITY, 1, uf.getUr_cityname());/*获取城市*/
                    up.setWillcitylist(city);
                    Base_LableList_list willtype = commService.getLableList(Constants.LABLETYPE_QIYETYPE, uf.getUe_companytype());/*企业类别*/
                    up.setWilltypelist(willtype);
                    Base_LableList_list majob = commService.getLableList(Constants.LABLETYPE_MAJOR, uf.getUe_personmajor());/*专业*/
                    up.setWillmajorlist(majob);
                    Base_LableList_list jobtype = commService.getLableList(Constants.LABLETYPE_JOB, uf.getUe_personjob());/*职位*/
                    up.setWilljoblist(jobtype);
                    Base_LableList_list ue_willworkage = commService.getLableList(Constants.LABLETYPE_NANXIAN, uf.getUe_personworkage());
                    up.setUe_willworkage(ue_willworkage);
                };
                if (up == null) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(up);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /*
    * 业务员完善用户资料
    * ywh
    * */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveuserdata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveuserdata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;
        /*检查参数 begin*/
        if ((ur_id == null || "".equals(ur_id)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String city = request.getParameter("city");
        String type = request.getParameter("type");
        String major = request.getParameter("major");
        String job = request.getParameter("job");
        String companyname = request.getParameter("companyname");
        String workage = request.getParameter("workage");
        String brand = request.getParameter("brand");

        if ((CommonUtil.isEmpty(name)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("姓名不能为空");
            flag_pass = false;

        }
        if ((CommonUtil.isEmpty(major)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业不能为空");
            flag_pass = false;

        }
        if ((CommonUtil.isEmpty(companyname)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司名称不能为空");
            flag_pass = false;

        }
        if ((CommonUtil.isEmpty(sex)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("性别不能为空");
            flag_pass = false;
        }
        if ((CommonUtil.isEmpty(brand)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("品牌不能为空");
            flag_pass = false;
        }
        if ((CommonUtil.isEmpty(type)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("企业类型不能为空");
            flag_pass = false;
        }
        ;

        if ((CommonUtil.isEmpty(job)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("客户职位不能为空");
            flag_pass = false;
        }
        ;

      /*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass == true) {
            try {
                Sys_User ut = new Sys_User();
                Sys_User_Ext et =new Sys_User_Ext();//userService.getUser_ExtDetail(Long.parseLong(ur_id)); //
                et.setUe_userid(Long.parseLong(ur_id));
                et.setUe_companytype(type);
                et.setUe_personmajor(major);
                et.setUe_personjob(job);
                et.setUe_companyname(companyname);
                et.setUe_personworkage(workage);
                et.setUe_companybrand(brand);
                ut.setUr_id(Long.parseLong(ur_id));
                ut.setUr_namenick(name);
                ut.setUr_sex(sex);
                ut.setUr_cityname(city);
                ut.setUr_msgflag2(true);/*标记已经完善个人信息*/
                int ii = userService.updatesave(ut, et, null);
                if (ii == 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_EDIT_FAIL);
                    flag_pass = false;
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



    /*
    *读取用户消息资料
    * userid
    * */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getusermessage", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getsalesmessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        ur_id = request.getParameter("userid");
        Boolean flag_pass = true;

/*检查参数 begin*/
        if (flag_pass == true && (CommonUtil.isEmpty(ur_id) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;
/*检查参数 end*/
/*处理数据 begin*/
        Sys_User_MsgVo uo = new Sys_User_MsgVo();
        if (flag_pass == true) {
            try {
                Sys_User_Msg um = userService.getUserMessage(Long.parseLong(ur_id));
                if (um != null){
                    for (Field field : um.getClass().getDeclaredFields()) {
                        field.setAccessible(true);
                        field.set(uo,field.get(um));
                    }
                    uo.setUm_interestdateshort(commService.getDateToShortStr(uo.getUm_interestdate()));
                    uo.setUm_lookmedateshort(commService.getDateToShortStr(uo.getUm_lookmedate()));
                }else {
                    um = new Sys_User_Msg();
                    um.setUm_userid(Long.parseLong(ur_id));
                    int ii = messageService.addUserMessage(um);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(uo);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

/*获取公司列表
*Leoli
* 2017.12.21
* */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getcompanylist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getcompanylist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String keyword = request.getParameter("keyword");
/*检查参数 begin*/

        if (flag_pass == true && (CommonUtil.isEmpty(keyword) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("keyword参数不能为空");
            flag_pass = false;
        }
        ;


/*检查参数 end*/
/*处理数据 begin*/
        List<Map<String, Object>> us = new ArrayList<Map<String, Object>>();

        if (flag_pass == true) {
            try {
                us = userService.getCompanyNameList(keyword);
                if (us == null || us.size() == 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(us);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 查询公司地址
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getaddr", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getaddr(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("userid");

        if (flag_pass == true && (CommonUtil.isEmpty(id) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (flag_pass == true) {
            try {
                SysV_UserFull uf = userService.getUser_FullDetail(Long.valueOf(id), 11);
                appresult.setData(uf);
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
     * 文件流头像上传
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveheadportrait", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveheadportrait(HttpServletRequest request, HttpServletResponse response,@RequestParam("file") CommonsMultipartFile file) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("头像上传成功");
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("userid");

        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        String filename = "";
        if(flag_pass==true){
            try {
               int i =  userService.updateT(id, file,filename);
            if (i==0){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("上传失败");
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
 *
 */
@IgnoreAuth /*不验证*/
@SuppressWarnings({"unused", "null"})
@RequestMapping(value = "getmeanslist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
public String getmeanslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
    PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
    AppResult appresult = new AppResult();
    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
    String rs = "";
    Boolean flag_pass = true;


    LablelistVo vo = new LablelistVo();
    try{
        List<Base_LableList> workage = lableListService.getworkageListname();
        List<Base_LableList> jor = lableListService.getjorListname();

        vo.setJorlist(jor);
        vo.setWorkagelist(workage);

    }catch (Exception e) {
        logger.error(e.getMessage());
        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
        appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
    }



/*返回数据 begin*/
    appresult.setData(vo);
    rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
    out.print(rs);
    out.close();
/*返回数据 end*/
    return null;

}

}

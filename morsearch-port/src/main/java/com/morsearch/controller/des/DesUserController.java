package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.InviteCodeUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.*;
import com.morsearch.service.*;
import com.morsearch.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by ywh on 2017-11-14.
 */

@Controller("DesUserController")
@RequestMapping("/des/")
public class DesUserController extends BaseController {

    @Resource
    private SalesEvaluateService salesEvaluateService;
    @Resource
    private PmArchivesService pmArchivesService;
    @Resource
    private DesigDemandService desigDemandService;
    @Resource
    private DesCollectService desCollectService;
    @Resource
    private AwardShareService awardShareService;

    @Resource
    private SmsService smsService;

    @Resource
    private UserService userService;
    /**
     * 设计师完善个人资料
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatepersonaldata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatepersonaldata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("ur_id");
        String namefirst = request.getParameter("ur_namefirst");//姓氏
        String sex = request.getParameter("ur_sex");//性别
        String namesnd = request.getParameter("ur_namesnd");//名字
        String companyname = request.getParameter("ue_companyname"); //公司名称
        String companytype = request.getParameter("ue_companytype");//公司属性
        String longitude = request.getParameter("ue_companylongitude");//经度
        String latitude = request.getParameter("ue_companylatitude");  //纬度
        String address = request.getParameter("ue_companyaddr");//地址
        String companyaddrdetailed = request.getParameter("ue_companyaddrdetailed");//详细地址
        String personjob = request.getParameter("ue_personjob"); //职称
        String personworkage = request.getParameter("ue_personworkage");//从业年限
        String personlevel = request.getParameter("ue_personlevel");//个人职级
        String personmajor = request.getParameter("ue_personmajor");//个人专业


        System.out.print("saveredis_home_base 0");


        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        if (flag_pass == true && (CommonUtil.isEmpty(companyaddrdetailed))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("详细地址不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(namefirst))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("姓氏不能为空");
            flag_pass = false;
        }

        if (flag_pass == true && (CommonUtil.isEmpty(sex))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("性别不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(companyname))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司名称不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(companytype))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司类型不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(longitude))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("经度不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(latitude))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("纬度不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(address))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司地址不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(personjob))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("职称不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(personworkage))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("从业年限不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(personmajor))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("个人专业不能为空");
            flag_pass = false;
        }
        if (flag_pass == true) {
            try {
                Sys_User ut = new Sys_User();
                Sys_User_Ext et = new Sys_User_Ext();
                ut.setUr_id(Long.valueOf(id));
                ut.setUr_namefirst(namefirst);
                ut.setUr_namesnd(namesnd);
                ut.setUr_msgflag2(true);
                if (sex.equals("1")) {
                    ut.setUr_sex(sex);
                    ut.setUr_namenick(namefirst + "先生");
                }
                if (sex.equals("2")) {
                    ut.setUr_sex(sex);
                    ut.setUr_namenick(namefirst + "女士");
                }
                ut.setUr_namefull(namefirst+namesnd);
                et.setUe_userid(Long.valueOf(id));
                et.setUe_companyaddrdetailed(companyaddrdetailed);
                et.setUe_personjob(personjob);
                et.setUe_companytype(companytype);
                et.setUe_companyname(companyname);
                et.setUe_personlevel(personlevel);
                et.setUe_personworkage(personworkage);
                et.setUe_companylatitude(latitude);
                et.setUe_companylongitude(longitude);
                et.setUe_companyaddrlocation(address);
                et.setUe_companyaddr(address+companyaddrdetailed);
                et.setUe_personmajor(personmajor);

                /*增加经纬度分组 begin*/
                Map<String,String>  mp=userService.getUserPosTeam(longitude,latitude);
                if(mp!=null){
                et.setUe_teamlongitude(mp.get("lng"));
                et.setUe_teamlatitude(mp.get("lat"));
                }
                /*增加经纬度分组 end*/

                int i = userService.updatesave(ut, et,null);

                userService.saveredis_home_base(Long.valueOf(id));/*存入redis，放在接口，数据更新后处理*/
                if (i == 0) {
                    if (i == 0) {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage(Constants.RESULT_EDIT_FAIL);
                        flag_pass = false;
                    }
                    ;
                }
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
     * 设计师读取用户资料
     * ywh
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getpersonaldata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpersonaldata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("ur_id");


        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        /*
        * 处理数据
        * */
        UserPerfect up = new UserPerfect();
        if (flag_pass == true) {
            try {
                SysV_UserFull uf = userService.getUser_FullDetail(Long.valueOf(id), 9);/*获取用户*/
                up.setUserlist(uf);
                Base_LableList_list willtype = commService.getLableList(Constants.LABLETYPE_DESIGTYPE, uf.getUe_companytype());/*企业类别*/
                up.setWilltypelist(willtype);
                Base_LableList_list jobtype = commService.getLableList(Constants.LABLETYPE_DESIGJOB, uf.getUe_personjob());/*职位*/
                up.setWilljoblist(jobtype);
                Base_LableList_list ue_willworkage = commService.getLableList(Constants.LABLETYPE_NANXIAN, uf.getUe_personworkage());
                up.setUe_willworkage(ue_willworkage);
                Base_LableList_list personlevel = commService.getLableList(Constants.LABLETYPE_DESIGLEVEL, uf.getUe_personlevel());
                up.setWilllevellist(personlevel);
                Base_LableList_list willmajor = commService.getLableList(Constants.LABLETYPE_MAJOR, uf.getUe_personjob());
                up.setWillmajorlist(willmajor);

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

        appresult.setData(up);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 设计师web端人员详情
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getpersonaldetails", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpersonaldetails(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("ur_id"); //设计师ID
        String salerid = request.getParameter("salerid");//业务员ID

        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        StylistPersonnelDetails sp = new StylistPersonnelDetails();
        if (flag_pass==true){
            try{
               SysV_UserFull uf =  userService.getUser_FullDetail(Long.valueOf(id),13);
                if(salerid!=null&&salerid!=""){
                Desig_Collect_Psn dc = desCollectService.getDesig_Collect_Psn(Long.valueOf(salerid),Long.valueOf(id));
                if (dc==null){
                    sp.setCollection(0);
                }else{
                    sp.setCollection(1);
                }
                }
                sp.setUserFull(uf);


            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appresult.setData(sp);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }


/**
 *
 * 设计师端他的资料库
 */

@SuppressWarnings({"unused", "null"})
@RequestMapping(value = "getdatabase", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdatabase(HttpServletRequest request, HttpServletResponse response) throws Exception {
    PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
    List<Pm_Archives> list=new ArrayList<>();
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
            map.put("pa_createid",request.getParameter("pa_createid"));
            map.put("pa_title",request.getParameter("pa_title"));
            map.put("pa_major",request.getParameter("pa_major"));
            map.put("pa_style",request.getParameter("pa_style"));
            map.put("pa_features",request.getParameter("pa_features"));

			/*查询条件 end*/
            list=pmArchivesService.getPmArchivesList(map);
           page.setRowcount(pmArchivesService.getPmArchivesListCount(map));//*记录数*//*
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
     * 获取邀请码
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getinvitecode", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getinvitecode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String userid = request.getParameter("userid");

        if (flag_pass == true && (CommonUtil.isEmpty(userid))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        InviteCode ii = new InviteCode();
        if (flag_pass==true){
            try{
                String c ="";
                Sys_User su = userService.getSysUserDetail(Long.valueOf(userid));
                if (su.getUr_personcode()==null){
                    Boolean bl = true;
                    while (bl==true){
                        c = InviteCodeUtils.generateInviteCode();
                        List<Sys_User> list = userService.getSysuserinvitecode(c);
                        if (list.size()>0){
                            bl =true;
                        }else {
                            bl=false;
                        }
                    }
                    su.setUr_personcode(c);
                }
                ii.setCode(su.getUr_personcode());

            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
  /*返回数据 begin*/
        appresult.setData(ii);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 获取邀请好友列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getinvitelist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getinvitelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String userid = request.getParameter("userid");
        List<AwardV_Share_Count> list = new ArrayList<AwardV_Share_Count>();
        if (flag_pass==true) {
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
                map.put("userid", userid);

			/*查询条件 end*/
                list = awardShareService.getAwardVShareCountList(map);
                page.setRowcount(awardShareService.getCountAwardVShareCount(map));//*记录数*//*
                appresult.setPage(page);
                if (list == null) {
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
     * 快速注册
     * @param request
     *
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "fastregister", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String fastregister(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("快速注册成功");
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String ur_phone=request.getParameter("ur_phone");//手机号码快速注册(检测是否注册过)
        String password=request.getParameter("password");//密码
        String message=request.getParameter("message");//得到输入的验证码
        String ur_usertype = request.getParameter("ur_usertype");//身份
        String ur_invitecode = request.getParameter("ur_invitecode");//邀请码(检测是否正确)

        String token=request.getParameter("token");//添加token值

        String ue_companyname = request.getParameter("ue_companyname");//公司名称
        String ue_companylongitude = request.getParameter("ue_companylongitude");//经度
        String ue_companylatitude = request.getParameter("ue_companylatitude");  //纬度
        String ue_companyaddrlocation = request.getParameter("ue_companyaddrlocation");//地址(有一个专门的接口)
        String ur_namefirst = request.getParameter("ur_namefirst");//姓
        String ur_namesnd = request.getParameter("ur_namesnd");//名称
        //公司门牌地址
        String ue_companyaddrdetailed = request.getParameter("ue_companyaddrdetailed");//公司门牌地址
       /* String ue_companyaddr = request.getParameter("ue_companyaddr");//公司详细地址*/
        String ue_personmajor = request.getParameter("ue_personmajor");//个人专业,(有专门的获取专业的接口)

        if (flag_pass == true && (CommonUtil.isEmpty(ur_phone))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("手机号码不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(message))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证码不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_companyname))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司名称不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_companylongitude))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("纬度不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_companylatitude))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("经度不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_companyaddrlocation))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("坐标地址不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_personmajor))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("个人专业不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ur_usertype))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("身份不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ur_invitecode))&&CommonUtil.convert_Byte(ur_usertype)==1) {//如果是业务员
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("邀请码不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ue_companyaddrdetailed))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司门牌地址不能为空");
            flag_pass = false;
        }

        if (flag_pass==true&&CommonUtil.isEmpty(token)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("Token不能为空");
            flag_pass=false;
        };
        if (flag_pass == true && (CommonUtil.isEmpty(ur_namefirst))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("姓氏不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(ur_namesnd))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("名字不能为空");
            flag_pass = false;
        }
        if (flag_pass==true&&token!=null&&token.length()<32) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("Token不能少于32位");
            appresult.setErrorcode("4");
            flag_pass=false;
        };
        if (flag_pass==true&&CommonUtil.isEmpty(password)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("登录密码不能为空");
            flag_pass=false;
        };

        if ((password!=null && password.length()<6)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("登录密码长度不能少于6位");
            flag_pass=false;
        };


        if (flag_pass==true) {
             /*注册 检验手机号重复*/
            int ic = userService.getCheckDouble(0,null, ur_phone, null, null);
            Integer diut=0;
            if (ic>0){diut=userService.getUserType(ur_phone,2);};
            if (ic>0&&diut!=4){ /*4为商城用户*/
                switch (diut) {
                    case 1:
                        appresult.setMessage("设计师端已经注册");
                        break;
                    case 2:
                        appresult.setMessage("业务员端已经注册");
                        break;
                    default:
                        appresult.setMessage("当前手机号已经注册");
                        break;
                }
                ;
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                flag_pass = false;
            }

        }
        if (flag_pass==true) {
            int ic=userService.getCheckDouble(0,null,null,null,token);
            if (ic>0){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("当前token值【"+token+"】已经存在");
                appresult.setErrorcode("4");
                flag_pass=false;
            };
        };

        //如果没有点击发送验证码,那么根本就不会有验证码,要是没有发送验证码,要提示
         if(flag_pass==true){
             //得到最后一条注册验证码
             //查询输入的手机号,看验证码表里面是否存在着条数据
             int phonesize = smsService.getSys_SmsVerify_phone_size(ur_phone);
             if(phonesize>0){//说明发送了验证码
                 Sys_SmsVerify phoneVerifylast = smsService.getPhoneVerifylast(ur_phone, 1);
                 String sv_code = phoneVerifylast.getSv_code();
                 if(!message.equals(sv_code)&&flag_pass==true){
                     appresult.setStatus(Constants.RESULT_STATUS_FAIL);//状态设置为0
                     appresult.setMessage("验证码输入错误");
                     flag_pass=false;
                 }
             }else{//说明没有发送验证码
                 appresult.setStatus(Constants.RESULT_STATUS_FAIL);//状态设置为0
                 appresult.setMessage("请发送验证码");
                 flag_pass=false;
             }
         }

        String s="";
        if(flag_pass==true&&(CommonUtil.convert_Byte(ur_usertype)==1)){
            //检测邀请码是否正确
            String randomcode = "888888".toLowerCase();  //第一个邀请码
            if(randomcode.equals(ur_invitecode)){//是原公司的验证码
                //调用生成邀请码
                 s = InviteCodeUtils.generateInviteCode();
            }else{//不是原公司的验证码,先检测存不存在数据库
                Long invuserid = userService.getSys_userinvitecode(ur_invitecode);//查出id
                String randomcode2 = "";
                //如果存在
                if(invuserid!=null){
                    //调用生成邀请码
                    s = InviteCodeUtils.generateInviteCode();
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);//邀请码输入错误,返回了0
                    appresult.setMessage("邀请码输入错误");
                    flag_pass=false;
                }
            }
        }

        if (flag_pass == true) {
            try {
                Sys_User ur = new Sys_User();
                Sys_User_Ext ue = new Sys_User_Ext();//补充表
                Sys_User_Msg um = new Sys_User_Msg();

                ur.setUr_phone(ur_phone);//手机号
                ur.setUr_token(token);//token
                if((CommonUtil.convert_Byte(ur_usertype))==1){//如果是设计师
                    ur.setUr_invitecode(ur_invitecode);//邀请码(有专门的接口)
                    ur.setUr_personcode(s);//这个是生成的个人码
                }
                ur.setUr_namefirst(ur_namefirst);//这个是姓
                ur.setUr_namesnd(ur_namesnd);//这个是名称
                ur.setUr_namenick(ur_namefirst+ur_namesnd);//设置为昵称
                ur.setUr_namefull(ur_namefirst+ur_namesnd);//真实姓名
                ur.setUr_usertype(CommonUtil.convert_Byte(ur_usertype));//这个是身份
                //密码加密
                ur.setUr_password(CommonUtil.pwdmd5t2(password));//设置密码
                ur.setUr_register_port(request.getParameter("source"));//注册来源
                ur.setUr_register_ver(request.getParameter("version"));
                ur.setUr_register_date(new Date());//注册日期

                ue.setUe_companyname(ue_companyname);//公司名称
                ue.setUe_companylongitude(ue_companylongitude);//纬度
                ue.setUe_companylatitude(ue_companylatitude);//纬度
                ue.setUe_companyaddrlocation(ue_companyaddrlocation);//坐标地址(接口)
                ue.setUe_companyaddrdetailed(ue_companyaddrdetailed);//公司门牌地址

                //公司详细地址'公司地址=坐标地址+门牌地址'
                ue.setUe_companyaddr(ue_companyaddrlocation+ue_companyaddrdetailed);//公司详细地址
                ue.setUe_personmajor(ue_personmajor);//个人专业(接口)

                /*增加经纬度分组 begin*/
                Map<String,String>  mp=userService.getUserPosTeam(ue_companylongitude,ue_companylatitude);
                if(mp!=null){
                    ue.setUe_teamlongitude(mp.get("lng"));
                    ue.setUe_teamlatitude(mp.get("lat"));
                }
                /*增加经纬度分组 end*/
                Long bdid = userService.getUserId(ur_phone,2);/*获取手机号码账号*/
                if (bdid==null){
                  userService.insertsave(ur,ue,um);
                  bdid=ur.getUr_id();
                }else{
                  ur.setUr_id(bdid);
                  ue.setUe_userid(bdid);
                  userService.updatesave(ur,ue,null);
                };
                rs=""+bdid;
            }catch (Exception e){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appresult.setData(rs);//返回id
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

}
package com.morsearch.controller.comm;

import com.morsearch.base.BaseController;
import com.morsearch.base.SDKSendSMS;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.common.util.Handlexml;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Sys_SmsMessage;
import com.morsearch.model.Sys_SmsReply;
import com.morsearch.model.Sys_SmsVerify;
import com.morsearch.service.OrderService;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Random;


/**
 * 短信接口
 */

@Controller("SmsControl")
@RequestMapping("/comm/")

public class SmsControl extends BaseController {
    private static SDKSendSMS sdkSendSMS;


    /*处理短信回调接口到数据库  begin*/
    @IgnoreAuth /*不验证*/
    @RequestMapping(value = "feedback", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public void feedback(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = request.getReader();
        try {
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1) {
                sb.append(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println(sb.toString());
        //用sax解析xml返回map
        ArrayList<Map<String, String>> list = (ArrayList<Map<String, String>>) Handlexml.ReadXML(sb.toString(), "Request");
        if (list.size() > 0) {
            Map<String, String> mapValue = list.get(0);
            Sys_SmsReply smsreply = new Sys_SmsReply();
            smsreply.setSr_content(mapValue.get("content"));
            smsreply.setSr_phone(mapValue.get("fromNum"));
            smsreply.setSr_sendtime(new Date());
            smsreply.setSr_status((byte) 0);
            smsService.save(smsreply);
        }
        //	result = "";
    }

/*处理短信回调接口到数据库  end*/





/*测试短信*/
/*
@RequestMapping(value = "feedback", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
public void feedback(HttpServletRequest request, HttpServletResponse response) throws Exception {
*/
    @IgnoreAuth /*不验证*/
    @RequestMapping(value = "submittestsms", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String submittestsms(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        String phone = request.getParameter("phone");
        String content = request.getParameter("content");

        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("发送成功");
        String rs = "";


        Sys_SmsReply smsreply = new Sys_SmsReply();
        smsreply.setSr_content(content);
        smsreply.setSr_phone(phone);
        smsreply.setSr_sendtime(new Date());
        smsreply.setSr_status((byte) 0);
        smsService.save(smsreply);

        appresult.setData("OK");
        rs = gson.toJson(appresult);
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }





    /*手机验证码
    储存到Sys_SmsVerify表，通过查询最后一条记录验证
    *Leoli 2017.10.11
    * */
    @IgnoreAuth /*不验证*/
    @RequestMapping(value = "phoneverify", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String phoneverify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        String phone = request.getParameter("phone");
        String type = request.getParameter("type");
        String usertype=request.getParameter("usertype");
        Boolean flag_pass = true;/*检查内容是否能过*/
        if (usertype==null){usertype="2";};
		/*检查参数 begin*/
        if ((phone == null || "".equals(phone)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("手机号码不能为空");
            flag_pass = false;
        }
        ;
        if ((type == null || "".equals(type)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证类别不能为空");
            flag_pass = false;
        }
        ;
        if (flag_pass == true&&usertype!=null&&"0".equals(usertype)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("用户类别不能为0");
            flag_pass = false;
        }
        ;

 /*注册 检验手机号重复*/
        if (flag_pass == true && "1".equals(type)) {
            int ic = userService.getCheckDouble(0,null, phone, null, null);
            int checkusertype=userService.getUserType(phone,2);
            if (ic > 0&&(checkusertype!=4)) {  /*4为商城用户*/
                switch (checkusertype){
                    case 1:
                        appresult.setMessage("设计师端已经注册");
                        break;
                    case 2:
                        appresult.setMessage("业务员端已经注册");
                        break;
                    default:
                        appresult.setMessage("当前手机号已经注册");
                        break;
                };
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                flag_pass = false;
            };
        };


 /*忘记密码 检验手机号是否存在*/
        if (flag_pass == true && ("2".equals(type)||"4".equals(type))) {
            int ic = userService.getCheckDouble(Integer.parseInt(usertype),null, phone, null, null);
            if (ic == 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("当前用户不存在");
                flag_pass = false;
            };
        };
 /*绑定第三方 检验手机号是否存在*/
        if (flag_pass == true && "3".equals(type) &&("1".equals(usertype)||"2".equals(usertype))) {
            Long bdid = userService.getUserId(phone,2);/*获取手机号码账号*/
            if (bdid!=null){appresult.setErrorcode("1");};/*传前端,存在账户*/
            Integer diut=userService.getUserType(phone,2);
            if (bdid!=null&&diut!=4&&diut!=Integer.parseInt(usertype)){ /*4为商城用户*/
            appresult.setErrorcode("2");/*提示用户端不同*/
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            flag_pass=false;
            if (diut==1){appresult.setMessage("此账号是设计师");};
            if (diut==2){appresult.setMessage("此账号是业务员");};
        };
        };


		/*检查参数 end*/
		/*处理逻辑 begin*/
        if (flag_pass == true) {
            String typename = "";
            String tempno = "1";
            switch (type) {
                case "1":
                    typename = "用户注册";
                    tempno = "232015";
                    break;
                case "2":
                    typename = "忘记密码";
                    tempno = "209489";

                    break;
                case "3":
                    typename = "绑定手机";
                    tempno = "208244";
                    break;
                case "4":
                    typename = "短信登录";
                    tempno = "208244";
                    break;
                case "6":
                    typename = "设置支付密码";
                    tempno = "208244";
                    break;
                case "7":
                    typename = "商城绑定验证码";
                    tempno = "208244";
                    break;
            };



            String verifyCode = "";
            try {
                Random random = new Random();
                verifyCode = ((int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000) + "";// 获取4位随机数

                int phoneCount = smsService.getPhoneCount(phone, Integer.parseInt(type), DateTimeUtil.todayMinTime(), DateTimeUtil.todayMaxTime());
                if (phoneCount <= 5) {//同一个号码动态密码
                    String smsresult = sdkSendSMS.sendMsgToPhone(phone, tempno, new String[]{verifyCode, Constants.SMS_EXPRIATIONTIME + "", Constants.COMPANY_TEL});
                    if ("1".equals(smsresult)) {
                        rs = verifyCode;
                        Sys_SmsVerify smsVerify = new Sys_SmsVerify();
                        smsVerify.setSv_phone(phone);
                        smsVerify.setSv_code(verifyCode);
                        smsVerify.setSv_sendtime(new Date());
                        smsVerify.setSv_status((byte) 0);
                        smsVerify.setSv_repeat((byte) 0);
                        smsVerify.setSv_ip(request.getRemoteAddr());
                        smsVerify.setSv_typeindex((byte) Integer.parseInt(type));
                        smsVerify.setSv_typename(typename);
                        smsService.verifysave(smsVerify);
                    } else {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage(smsresult);
                    } ;
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("24小时内发送短信超量");
                }


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }

		/*处理逻辑 end*/
		/*返回数据 begin*/
        appresult.setData(rs);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;
    }



/*比较验证码
Leoli
2018.03.12
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getphonecompare", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getphonecompare(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String phone = request.getParameter("phone");
        String type = request.getParameter("type");
        String code = request.getParameter("code");
        String usertype=request.getParameter("usertype");
        Boolean flag_pass = true;/*检查内容是否能过*/
		/*检查参数 begin*/
        if ((phone == null || "".equals(phone)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("手机号码不能为空");
            flag_pass = false;
        } ;
        if ((code == null || "".equals(code)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证码不能为空");
            flag_pass = false;
        } ;

        if ((type == null || "".equals(type)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证类别不能为空");
            flag_pass = false;
        };
        if (flag_pass == true&&usertype!=null&&"0".equals(usertype)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("用户类别不能为0");
            flag_pass = false;
        }
        ;

        if (flag_pass==true) {
        };

/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try {
                String rut=smsService.saveSmsVerifyResult(phone, Integer.parseInt(type),code,false);
                if (!"1".equals(rut.substring(0,1))){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(rut);
                };

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
      //  appresult.setData(us);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



}

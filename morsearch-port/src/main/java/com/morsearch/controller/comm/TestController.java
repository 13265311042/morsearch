package com.morsearch.controller.comm;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.common.util.umeng.UMengPushUtil;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sys_User;
import com.morsearch.service.LableListService;
import com.morsearch.sms.publisher.MessageSender;
import com.morsearch.vo.AppResult;
import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*测试资料接口
* */

@Controller("TestController")
@RequestMapping("/test/")

public class TestController extends com.morsearch.base.BaseController {

/*
    @Autowired
    private MessageSender messageSender;
*/
/*
友盟测试推送
leoli
2017.12.30
* */



    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "testum", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String testum(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String alias=request.getParameter("alias");
        String custom=request.getParameter("custom");
        Boolean flag_pass=true;

/*检查参数 begin*/
        if (flag_pass==true&&(CommonUtil.isEmpty(alias)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("alias参数不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(custom)==true){custom="type:10;orderno:2017121416064885848";};
/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try {
                rs= UMengPushUtil.sendAndroidAlias("dfsfdsf",Constants.PUSH_DEFAULT_ALIAS_TYPE,alias
                        ,Constants.PUSH_DEFAULT_TICKER,"testtest",custom,null);
                System.out.print(rs);

                rs=UMengPushUtil.sendIOSAlias(Constants.PUSH_DEFAULT_ALIAS_TYPE,alias
                        ,Constants.PUSH_DEFAULT_TICKER,"testtest",custom,null);
                System.out.print(rs);

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(rs);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

/*测试
* */



    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "sendmq", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String sendmq(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String sm_id=request.getParameter("sm_id");
        Boolean flag_pass=true;

        String aa= URLDecoder.decode(sm_id,"UTF-8");

/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/

        if (flag_pass==true) {
            try {
                rs=SequenceCreator.createNewFileName();
         //       messageSender.send(rs);


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(rs);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "testapi", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String testapi(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String value=request.getParameter("value");
        Boolean flag_pass=true;

/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try {

                String httppath=commService.getSysConfigValue("pdf_api");
//                if (CommonUtil.isEmpty(httppath)==true){return  0;};/*没设置文档服务器*/
                httppath=httppath+"/imagesapi?filename=201711241112550470.jpg";
                JSONObject jsonObject =new JSONObject(HttpConnection.get(httppath));
                System.out.print(jsonObject.get("status"));


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(rs);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping("test")
    public String test(String aa) {
      //  PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String sm_id=request.getParameter("sm_id");
        Boolean flag_pass=true;
/*检查参数 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
   //     out.print(rs);
   //     out.close();
/*返回数据 end*/
        return null;
    }




}

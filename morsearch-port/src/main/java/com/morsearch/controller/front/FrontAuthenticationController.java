package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_User_Visiting;
import com.morsearch.service.UserVisitingService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Identification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 个人认证
 * Created by ywh on 2018-1-15.
 */
@Controller("FrontPersonalAuthenticationController")
@RequestMapping("/front/")
public class FrontAuthenticationController extends BaseController {


    @Resource
    private UserVisitingService userVisitingService;

    /*
    获取认证信息
    */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getauthentication", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getauthentication(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String userid = request.getParameter("userid");

        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("用户id不能为空");
            flag_pass = false;
        };

        Identification it = new Identification();
        if (flag_pass==true){
            try{
            SysV_UserFull su = userService.getUser_FullDetail(Long.valueOf(userid),12);
            Sys_User_Visiting sv = userVisitingService.selectByPrimaryKey(Long.valueOf(userid));
                if (sv!=null){
                    it.setUserid(Long.valueOf(userid));
                    it.setUe_membertype(su.getUr_leveltype());
                    it.setUv_image(sv.getUv_image());
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("此人未认证");

                }
            }catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }

    /*begin返回数据*/
        appresult.setData(it);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }

    /**
     * 保存认证信息
     * @param request
     * @param response
     * @param photo
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveauthentication", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveauthentication(HttpServletRequest request, HttpServletResponse response,@RequestParam("photo") CommonsMultipartFile photo) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String userid = request.getParameter("userid");
        String base = request.getParameter("base64");

        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("用户id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(base)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("编码不能为空");
            flag_pass = false;
        };
        if (flag_pass==true){
            try {
                BASE64Decoder decoder = new BASE64Decoder();
                byte[] bytes = decoder.decodeBuffer(base);
                base = new String(bytes, "UTF-8");
                int i = userVisitingService.saveSys_User_Visiting(userid, base, photo);
                if (i == 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("保存失败");
                }
            }catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }

        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }
}
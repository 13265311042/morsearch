package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;

import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Base_Version;
import com.morsearch.service.AppVersionService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.AppVersion;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.data.annotation.Version;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

/**
 * App版本更新
 * Created by ywh on 2017/10/25.
 */

@Controller("FrontAppVersionController")
@RequestMapping("/front/")
public class FrontAppVersionController extends BaseController {
    @Resource
    private AppVersionService appVersionService;

    @IgnoreAuth
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getappversion", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getappversion(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/


        Base_Version version = appVersionService.getversion("1"); //安卓版
        AppVersion appVersion = new AppVersion();
        if (flag_pass == true) {
            try {
                if (version != null) {
                    appVersion.setId(version.getAv_id());
                    appVersion.setIsForceUpdate(version.getAv_action());
                    appVersion.setDownurl(version.getAv_down_url());
                    appVersion.setPreBaselineCode(version.getAv_baselinecode());
                    appVersion.setVersionName(version.getAv_versionname());
                    appVersion.setVersionCode(version.getAv_versioncode());
                    appVersion.setUpdateLog(version.getAv_info());
                    appVersion.setSize(String.valueOf(version.getAv_filesize()));

                    appVersion.setHasAffectCodes("");
                    appVersion.setCreateTime(version.getAv_createdate());
                    appVersion.setIosVersion(1);
                } else {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("无此版本");
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appresult.setData(appVersion);/*返回urid*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }


}
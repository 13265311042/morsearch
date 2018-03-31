package com.morsearch.controller.comm;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.common.util.umeng.UMengPushUtil;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Base_LableList;
import com.morsearch.service.LableListService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.UserConfig;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;

/*基本资料接口，用于公用调用或独立的接口
Leoli 2017.10.16
* */

@Controller("BaseController")
@RequestMapping("/front/")

public class CommController extends com.morsearch.base.BaseController {
    private String bl_type;
    private String bl_name;
    private String bl_index;

    @Resource
    private LableListService lableListService;

    /*增加标签库--前端
    * leoli 2017.10.16
    *ur_id,bl_type,bl_name
    * */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "lablelistaddfront", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String lablelistadd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        String ur_id = request.getParameter("ur_id");
        Boolean flag_pass = true;
        bl_type = request.getParameter("bl_type");
        bl_name = request.getParameter("bl_name");
/*检查参数 begin*/
        if (flag_pass == true && (ur_id == null || "".equals(ur_id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        ;
        if (flag_pass == true && (bl_type == null || "".equals(bl_type))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签大类不能为空");
            flag_pass = false;
        }
        ;
        if (flag_pass == true && (bl_name == null || "".equals(bl_name))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签名称不能为空");
            flag_pass = false;
        }
        ;
/**/
/*检测是否允许新增  begin*/
        if (flag_pass == true && (bl_type != null && !"".equals(bl_type))) {
            if (lableListService.getLableTypeAllow(bl_type) == false) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("标签内容不允许前端添加");
                flag_pass = false;
            }
            ;
        }
        ;
/*检测是否允许新增  end*/

/*检查名称重复*/
            if (flag_pass == true && (bl_name != null && !"".equals(bl_name))) {
                int iai = lableListService.getLableListCount(bl_type, bl_name.trim());
                if (iai > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("【" + bl_name + "】在当前类已存在");
                    flag_pass = false;
                }
                ;
        }
        ;
/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass == true) {
            try {
                int icount = lableListService.getLableListCount(bl_type, null);
                Base_LableList bl = new Base_LableList();
                bl.setBl_type(bl_type);
                bl.setBl_name(bl_name.trim());
                bl.setBl_index(icount + 1);
                bl.setBl_createno(Constants.LOGIN_TYPE_FRONT + "." + ur_id+"."+commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,ur_id,"userno"));
                bl.setBl_createdate(new Date());
               this.ichangecount = lableListService.addLableList(bl);
               if (ichangecount == 0)
                {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_ADD_FAIL);
                }

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
* 登出
* leoli
* 2017.12.08
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "loginout", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String loginout(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        try {

            if (SecurityUtils.getSubject().getSession() != null) {SecurityUtils.getSubject().logout();}/*shiro注销*/
            //   session.invalidate();/*假如没用shiro控制，则需要调用session处理*/


        } catch (Exception e) {
            logger.error(e.getMessage());
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



/*通过后台，直接调用http的get
前端需要加密为base64
leoli
2018.01.04
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "gethttpget", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String testhttp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String cs=request.getParameter("cs");
        Boolean flag_pass=true;

/*检查参数 begin*/

        if (flag_pass==true&&(CommonUtil.isEmpty(cs)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("cs参数不能为空");
            flag_pass = false;
        };


/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try {
                BASE64Decoder decoder = new BASE64Decoder();
                byte[] bytes = decoder.decodeBuffer(cs);
                String hts=new String(bytes, "UTF-8");
                if (hts.contains("{wxappid}")==true){hts=hts.replace("{wxappid}",Constants.WX_APPID_WEB);}
                if (hts.contains("{wxsecret}")==true){hts=hts.replace("{wxsecret}",Constants.WX_SECRET_WEB);}

                if (hts.contains("{miniappid}")==true){hts=hts.replace("{miniappid}",Constants.WX_APPID_MINI);}
                if (hts.contains("{minisecret}")==true){hts=hts.replace("{minisecret}",Constants.WX_SECRET_MINI);}



                rs= HttpConnection.get(hts);

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



/*获取配置环境参数
leoli
2018.01.06
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getconfiglist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getconfiglist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

/*检查参数 end*/
/*处理数据 begin*/
        UserConfig uc=new UserConfig();
      try {
          uc.setPath_image_normal(commService.getSysConfigValue("path_image_normal"));/*源图片路径*/
          uc.setPath_image_small(commService.getSysConfigValue("path_image_small"));/*小图片路径*/
          uc.setPath_pdf_source(commService.getSysConfigValue("path_pdf_source"));/*pdf源文件片路径*/
          uc.setPath_pdf_image(commService.getSysConfigValue("path_pdf_image"));/*pdf图片路径*/
//	uc.setPath_cad(commService.getSysConfigValue("path_cad"));/*cad路径*/
//	uc.setPath_bim(commService.getSysConfigValue("path_bim"));/*bim路径*/
          uc.setPath_download(commService.getSysConfigValue("path_download"));/*文件下载*/
          uc.setOrder_time_revoke(commService.getSysConfigValue("order_time_revoke"));/*允许订单撤回时间*/
          uc.setPath_imgsys_normal(commService.getSysConfigValue("path_imgsys_normal"));/*系统图片源文件*/
          uc.setPath_imgsys_small(commService.getSysConfigValue("path_imgsys_small"));/*系统图片小文件*/
          uc.setPath_accessory(commService.getSysConfigValue("path_accessory"));/*附件*/
          uc.setPath_pdf_api(commService.getSysConfigValue("pdf_api"));/*应用服务地址*/

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(uc);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



}

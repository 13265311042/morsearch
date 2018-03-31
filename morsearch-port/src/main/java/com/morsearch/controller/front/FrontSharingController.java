package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.dao.Pm_ArchivesMapper;
import com.morsearch.model.PmV_Archives_share;
import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import com.morsearch.service.*;
import com.morsearch.vo.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;


/**
 * Created by ywh on 2017-10-30.
 */
@Controller("FrontSharingController")
@RequestMapping("/front/")

public class FrontSharingController extends BaseController {

    @Resource
    private PmVArchivesShareService pmVArchivesService;
    @Resource
    private PmArchivesService pmArchivesService;
    @Resource
    private PmAttchService pmAttchService;
    @Resource
    private UserService userService;

    /**
     * 资源共享
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getresourcesharing", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getresourcesharing(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String companyname = request.getParameter("pa_companyname");//公司名称
        String id = request.getParameter("ur_id");

        if (flag_pass == true && CommonUtil.isEmpty(companyname) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司名称不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司名称不能为空");
            flag_pass = false;
        }

        if (flag_pass = true) {
            try {
                List<PmV_Archives_share> list1 = pmVArchivesService.getShare(companyname,Long.valueOf(id));

                appresult.setData(list1);
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        /*begin返回数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;

    }

    /**
     * 资料保存
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savepersonalprofile", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savepersonalprofile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("pa_id"); //文件ID
        String userid = request.getParameter("us_id");
        String createno =  commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno");//登录账号

        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(userid) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件ID不能为空");
            flag_pass = false;
        }

        if (flag_pass = true) {
            try {
               int i =  pmArchivesService.getPm_Archives(id,userid,createno);
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_ADD_FAIL);
                }
                appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                appresult.setMessage(Constants.RESULT_ADD_SUCC);


            } catch (Exception e) {
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

    /**
     * 个人资料展示
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getpersonalprofile", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpersonalprofile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String pa_createid = request.getParameter("pa_createid");
        List<Pm_Archives> list =  new ArrayList();
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
                map.put("pa_createid", request.getParameter("pa_createid"));   //登录用户的ID

	            /*查询条件 end*/
                list = pmArchivesService.getPmArchivesList(map);
                page.setRowcount(pmArchivesService.getPmArchivesListCount(map));//*记录数*//*
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
        ;
        /*处理数据 end*/
		/*返回数据 begin*/
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
		/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }

    /**
     * 删除资料展示
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "deletefile", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String deletefile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("pa_id");
        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标题不能为空");
            flag_pass = false;
        }

        if (flag_pass = true) {
            try {
                Pm_Archives pm = pmArchivesService.getPm_Archives1(Long.valueOf(id));
                pm.setPa_flagstop(true);
                pmArchivesService.updateByPrimaryKey(pm);
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
     * 上传资料
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "adduploaddata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String adduploaddata(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") CommonsMultipartFile file) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> files= multipartRequest.getFiles("file1");
        String title = request.getParameter("pa_title");   //标题s
        String major = request.getParameter("pa_major");   //专业
        String style = request.getParameter("pa_style");   //类型
        String features = request.getParameter("pa_features");//特性
        String content = request.getParameter("pa_content");//资料摘要
        String ur_id =request.getParameter("ur_id");
        String createno =commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,ur_id,"userno");//登录账号

        if (flag_pass == true && CommonUtil.isEmpty(ur_id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(title) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(major) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业不能为空");
            flag_pass = false;
        }

        if (flag_pass==true){
            try{
                //pmArchivesService.insertSelective(pmArchives);
                int i = pmArchivesService.addtPmArchives(WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext()),
                        title,major,style,features,content,Long.valueOf(ur_id),createno,file,files);
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_ADD_SUCC);
                };

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
     * 修改资料回显
     *
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getdata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("pa_id");

        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件名字不能为空");
            flag_pass = false;
        }

        PmArchives pmArchive = new PmArchives();

        if (flag_pass = true) {
            try {
                Pm_Archives pmArchives = pmArchivesService.getPm_Archives1(Long.valueOf(id));
                List<Pm_Attach> list = pmAttchService.selectByPrimaryname(pmArchives.getPa_id());
                pmArchive.setPa_title(pmArchives.getPa_title());
                pmArchive.setPa_major(pmArchives.getPa_major());
                pmArchive.setPa_style(pmArchives.getPa_style());
                pmArchive.setPa_features(pmArchives.getPa_features());
                pmArchive.setPa_content(pmArchives.getPa_content());
                pmArchive.setList(list);
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
    }
       /*处理数据 end*/
		/*返回数据 begin*/
        appresult.setData(pmArchive);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
		/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;
    }


    /**
     *
     * 修改资料保存
     *
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatedata", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatedata(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> files= multipartRequest.getFiles("file1");
        String id = request.getParameter("pa_id");
        String title = request.getParameter("pa_title");   //标题
        String major = request.getParameter("pa_major");   //专业
        String style = request.getParameter("pa_style");   //类型
        String features = request.getParameter("pa_features");//特性
        String content = request.getParameter("pa_content");//资料摘要

        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(title) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(major) == true) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("专业不能为空");
                flag_pass = false;
            }

       /* List<Pm_Archives> list = pmArchivesService.getPmarchives(title);
        if (list.size()>0){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件名字已经存在");
            flag_pass = false;
        }*/
            if (flag_pass = true) {
                try {
                    int i = pmArchivesService.updateByPrimaryKeySelective(Long.valueOf(id), title, major, style, features, content, files);
                    if (i == 0) {
                        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
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
     *
     * 已有文档
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getexisting", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getexisting(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String title = request.getParameter("pa_title");
        String id = request.getParameter("ur_id");
        //String createno = commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,id,"userno");//登录账号

        if (flag_pass == true && CommonUtil.isEmpty(id) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id不能为空");
            flag_pass = false;
        }


        if (flag_pass == true && CommonUtil.isEmpty(title) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件名字不能为空");
            flag_pass = false;
        }


        if (flag_pass = true) {
            try {
              List<Pm_Archives> pmArchives = pmAttchService.addPmattch(title,Long.valueOf(id));
                if (pmArchives.size()>0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage("文件存在");
                    appresult.setData(pmArchives);
                }

            }catch (Exception e) {
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
     *
     *删除附件
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "deleteaccessory", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String deleteaccessory(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String aid = request.getParameter("aa_id"); //主文件ID
        String filetitle = request.getParameter("aa_filetitle");//附件标题

        if (flag_pass == true && CommonUtil.isEmpty(aid)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件名字不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(filetitle)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件名字不能为空");
            flag_pass = false;
        }
        if (flag_pass = true){
        try{
            List<Pm_Attach> list =  pmAttchService.selectByPid(filetitle);
            if (list.size()>1) {
                pmAttchService.deleteBy(Long.valueOf(aid));
            }else {
                File file = new File(Constants.FILE_FUJIAN+"/"+list.get(0).getAa_filename()+list.get(0).getAa_filetitle()+list.get(0).getAa_filetype());
                if (file.exists() && file.isFile())
                file.delete();
                pmAttchService.deleteBy(Long.valueOf(aid));
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





}
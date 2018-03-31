package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.FtpUtil;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.*;
import com.morsearch.service.*;
import com.morsearch.vo.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * Created by ywh on 2017-11-21.
 */


@Controller("DesDataBaseController")
@RequestMapping("/des/")
public class DesDataBaseController extends BaseController {

    @Resource
    private LableListService lableListService;

    @Resource
    private PmArchivesService pmArchivesService;
    @Resource
    private PmAttchService pmAttchService;
    @Resource
    private DesigVsearchArchivesService desigVsearchArchivesService;
    @Resource
    private DesigVsearchSalesService desigVsearchSalesService;
    @Resource
    private DesigDemandService desigDemandService;
    @Resource
    private DesigEvaluateService desigEvaluateService;
    @Resource
    private DesCollectService desCollectService;
    @Resource
    private CommService commService;

    /**
     * 资料详情页
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getparticulars", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getparticulars(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String pid = request.getParameter("pa_id"); //文件ID
        String uid = request.getParameter("ur_id"); //上传者ID
        String userid = request.getParameter("userid");//设计师ID

        if (flag_pass == true && (CommonUtil.isEmpty(pid))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("文件ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(uid))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("上传者ID不能为空");
            flag_pass = false;
        }
        Particulars pt = new Particulars();
        if (flag_pass == true) {
            try {
                if (userid!=null&&userid!=""){
                    Desig_Collect_Pm dcp = desCollectService.getDesig_Collect_Pm(Long.valueOf(pid),Long.valueOf(userid));
                    if (dcp==null){
                        pt.setCollect("0");
                    }else {
                        pt.setCollect("1");
                    }
                }
                SysV_UserFull uf = userService.getUser_FullDetail(Long.valueOf(uid), 10);/*获取用户*/
                Pm_Archives pm = pmArchivesService.getPm_Archives1(Long.valueOf(pid));
                List<Pm_Attach> list = pmAttchService.selectByPrimaryname(Long.valueOf(pid));
                List<Desig_Evaluate> list1 = desigEvaluateService.getDesignEvaluateContentgrade(Long.valueOf(uid));
                int x = 0;
                if (list1.size()>0){
                for (int i=0;i<list1.size();i++){
                    x += Integer.valueOf(list1.get(i).getDe_contentgrade());
                }
                    pt.setContentgrade(x/(list1.size()));
                }
                Pm_Archives pmArchives = new Pm_Archives();
                pmArchives.setPa_title(pm.getPa_title());
                pmArchives.setPa_filename(pm.getPa_filename());
                pmArchives.setPa_major(pm.getPa_major());
                pmArchives.setPa_style(pm.getPa_style());
                pmArchives.setPa_features(pm.getPa_features());
                pmArchives.setPa_count_browse(pm.getPa_count_browse());
                pmArchives.setPa_createdate(pm.getPa_createdate());
                pt.setPmArchives(pmArchives);
                pt.setPmAttach(list);
                pt.setUserlist(uf);
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        appresult.setData(pt);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 产品资料
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getproductinformation", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getproductinformation(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        List<DesigV_Search_Archives> list = new ArrayList<>();
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
                map.put("keywords", request.getParameter("keywords"));
//                map.put("pa_major", request.getParameter("pa_major"));
//                map.put("pa_style", request.getParameter("pa_style"));
//                map.put("pa_features", request.getParameter("pa_features"));
//                map.put("createname", request.getParameter("createname"));
//                map.put("pa_count_browse", request.getParameter("pa_count_browse"));
//                map.put("createdate", request.getParameter("createdate")); //日期

			/*查询条件 end*/
                list = desigVsearchArchivesService.getDesigV_Search_ArchivesList(map);
                page.setRowcount(desigVsearchArchivesService.getCountDesigV_Search_Archives(map));//*记录数*//*
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
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 业务人员
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getbusinesspersonnel", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbusinesspersonnel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        List<DesigV_Search_Sales> list = new ArrayList<>();
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
                map.put("keywords", request.getParameter("keywords"));
              /*  map.put("ur_namenick", request.getParameter("ur_namenick"));
                map.put("ue_personjob", request.getParameter("ue_personjob"));
                map.put("ue_personmajor", request.getParameter("ue_personmajor"));
                map.put("ue_companybrand", request.getParameter("ue_companybrand"));
                map.put("ue_companyname", request.getParameter("ue_companyname"));
                map.put("ue_companytype", request.getParameter("ue_companytype"));*/

			/*查询条件 end*/
                list = desigVsearchSalesService.getDesigV_Search_SalesList(map);
                page.setRowcount(desigVsearchSalesService.getCountDesigV_Search_Sales(map));//*记录数*//*
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
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }


    /**
     * 发布需求
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savereleaseneed", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savereleaseneed(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("ur_id");
        String title = request.getParameter("dd_title");
        String major = request.getParameter("dd_major");
        String style = request.getParameter("dd_style");
        String features = request.getParameter("dd_features");

        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(title))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        Desig_Demand dd = new Desig_Demand();
        if (flag_pass = true) {
            try {
                String createno =commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,id,"userno");//登录账号

                dd.setDd_no(SequenceCreator.createnumber("", 5));
                dd.setDd_major(major);
                dd.setDd_title(title);
                dd.setDd_style(style);
                dd.setDd_features(features);
                dd.setDd_createid(Long.valueOf(id));
                dd.setDd_createno(createno);
                dd.setDd_createdate(new Date());
                dd.setDd_count_browse(0);
                dd.setDd_status((byte) 1);
                desigDemandService.insertSelective(dd);


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
     * 需求列表展示
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getneedlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getneedlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String dd_createid = request.getParameter("dd_createid");
        if (flag_pass == true && (CommonUtil.isEmpty(dd_createid))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        List<Desig_Demand> list=new ArrayList<>();
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
                map.put("dd_createid",dd_createid);


			/*查询条件 end*/
                list=desigDemandService.getDesig_DemandList(map);
                page.setRowcount(desigDemandService.getCountDesig_Demand(map));//*记录数*//*
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
     * 关闭需求
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updateneed", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updateneed(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("dd_id");

        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        if (flag_pass ==true){
            try{
                Desig_Demand dd = desigDemandService.selectByPrimaryKey(Long.valueOf(id));
                dd.setDd_status((byte)2);

                desigDemandService.updateByPrimaryKeySelective(dd);

            }catch (Exception e) {
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
     * 增加浏览次数
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveneedviews", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveneedviews(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("dd_id");

     /*   if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }*/

        if (flag_pass ==true){
            try {
                if(Long.valueOf(id)!=-1){
                Desig_Demand dd = desigDemandService.getDesig_DemandDetail(Long.valueOf(id), 3);
                dd.setDd_count_browse(dd.getDd_count_browse() + 1);
                desigDemandService.updateByPrimaryKeySelective(dd);
                }
            }catch (Exception e) {
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
     * 附件下载
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "downloadfile", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String downloadfile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        //String id = request.getParameter("pa_id");
        String filetitle = request.getParameter("filetitle");
        /*if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }*/
        if (flag_pass == true && (CommonUtil.isEmpty(filetitle))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        Path_Accessory pa = new Path_Accessory();
        if (flag_pass==true){
                try {
                    Properties p = new Properties();
                    InputStream is = null;
                    is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                    p.load(is);
                    String ADDRESS = p.getProperty("FTP_ADDRESS");
                    String PORT = p.getProperty("FTP_PORT");
                    String USERNAME = p.getProperty("FTP_USERNAME");
                    String PASSWORD = p.getProperty("FTP_PASSWORD");

                    FTPClient ftp = new FTPClient();
                    try{
                    int reply;
                    ftp.connect(ADDRESS, Integer.valueOf(PORT));
                    // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
                    ftp.login(USERNAME, PASSWORD);// 登录
                    reply = ftp.getReplyCode();
                    if (!FTPReply.isPositiveCompletion(reply)) {
                        ftp.disconnect();}
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    String s ="";
                    Sys_Config sc = commService.getSys_Configvalue("附件下载");
                    s = sc.getSc_value()+"/"+filetitle;
                    pa.setPathaccessory(s);

                   // Boolean result = FtpUtil.downloadFile(ADDRESS,Integer.valueOf(PORT),USERNAME,PASSWORD,"accessory",filetitle,"D:");
                    appresult.setData(pa);
                } catch (Exception ex) {
                    ex.printStackTrace();
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
     *在线预览
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "onlineope", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String onlineope(HttpServletRequest request, HttpServletResponse response,boolean isOnLine) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("pa_id");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        Path_Accessory pa = new Path_Accessory();
        if (flag_pass==true){
            try{
                Properties p = new Properties();
                InputStream is = null;
                is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);
                String ADDRESS = p.getProperty("FTP_ADDRESS");
                String PORT = p.getProperty("FTP_PORT");
                String USERNAME = p.getProperty("FTP_USERNAME");
                String PASSWORD = p.getProperty("FTP_PASSWORD");

                FTPClient ftp = new FTPClient();
                try{
                    int reply;
                    ftp.connect(ADDRESS, Integer.valueOf(PORT));
                    // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
                    ftp.login(USERNAME, PASSWORD);// 登录
                    reply = ftp.getReplyCode();
                    if (!FTPReply.isPositiveCompletion(reply)) {
                        ftp.disconnect();}
                }catch (IOException e) {

                    e.printStackTrace();
                }
               Pm_Archives pm =  pmArchivesService.getPm_Archives1(Long.valueOf(id));
                 Sys_Config sc = commService.getSys_Configvalue("pdf源文件片路径");
                String s = sc.getSc_value()+"/"+pm.getPa_filename()+".pdf";

                response.sendRedirect("https://www.baidu.com");

               pa.setPathaccessory(s);




            } catch (Exception ex) {
                ex.printStackTrace();
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }

       appresult.setData(pa);
      rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
        //处理数据格式
        out.print(rs);
        out.close();
        //返回数据 end
        return null;

    }


    /**
     * pdf图片列表展示
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getphotolist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getphotolist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;
        String id = request.getParameter("pa_id"); //文件ID
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        PdfPhoto pp= new PdfPhoto();

        if (flag_pass==true){
            try{

                Pm_Archives P = pmArchivesService.getPm_Archives1(Long.valueOf(id));
                Sys_User user  = userService.getSysUserDetail(P.getPa_createid());
                pp.setUr_phone(user.getUr_phone());


                Properties p = new Properties();
                InputStream is = null;
                is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);
                String ADDRESS = p.getProperty("FTP_ADDRESS");
                String PORT = p.getProperty("FTP_PORT");
                String USERNAME = p.getProperty("FTP_USERNAME");
                String PASSWORD = p.getProperty("FTP_PASSWORD");
                Pm_Archives pm = pmArchivesService.getPm_Archives1(Long.valueOf(id));

                String path = "";
                if (pm.getPa_sharepid()!=null){
                    path = "images_pdf/"+pm.getPa_sharepid();

                }else{
                     path = "images_pdf/"+id;
                }

                List<String> list = FtpUtil.getFileList(path,ADDRESS,Integer.valueOf(PORT),USERNAME,PASSWORD);
                //FtpUtil.(path,ADDRESS,PORT,USERNAME,PASSWORD);
                if (list!=null) {
                    pp.setList(list);

                    Pm_Archives pa = pmArchivesService.getPm_Archives1(Long.valueOf(id));
                    pp.setPa_pagecount(pa.getPa_pagecount());
                }
            }catch (Exception ex) {
                ex.printStackTrace();
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        appresult.setData(pp);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 专业添加
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveprofessional", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveprofessional(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("userid"); //设计师ID
        String no = request.getParameter("userno"); //设计师ID
        String name = request.getParameter("majorname");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }

        if (flag_pass == true && (CommonUtil.isEmpty(no))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("账号不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(name))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业名称不能为空");
            flag_pass = false;
        }
        Base_LableList bl = new Base_LableList();
        if (flag_pass==true){
            List<Base_LableList> list = lableListService.getCountIndex();
            bl.setBl_type("1002");
            bl.setBl_index((list.get(0).getBl_index())+1);
            bl.setBl_name(name);
            bl.setBl_stopflag(false);
            bl.setBl_delflag(false);
            bl.setBl_selectflag(false);
            bl.setBl_createno(no);
            bl.setBl_createdate(new Date());
            int i = lableListService.addLableList(bl);
            if (i==0){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("添加失败");

            }

        }
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }
}
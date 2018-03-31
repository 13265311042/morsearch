package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Base_Version;
import com.morsearch.model.Sys_Config;
import com.morsearch.service.CommService;
import com.morsearch.service.VersionService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.AppDatagrid;
import org.apache.commons.jexl2.UnifiedJEXL;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ValueConstants;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * Created by hyt on 2017/10/19.左小超
 */

@Controller("BackVersionController")
@RequestMapping("/back/")
public class BackVersionController extends BaseController {

    @Resource
    private VersionService versionService;

    @Resource
    private CommService commService;

    private String av_id;//版本id long

    private String av_type;//版本类型 Byte

    private String av_versioncode;//版本号 Integer

    private String av_versionname;//版本名称 String

    /**
     * 版本列表显示 zuoxiaochao
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "versionlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String versionlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,logintoken");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Credentials","true"); //是否允许浏览器携带用户身份信息（cookie）


        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
       String x= request.getParameter("av_createdate1");
        List<Base_Version> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String, Object> map = new HashMap<String, Object>();

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                if (!CommonUtil.isEmpty(request.getParameter("av_type"))) {
                    map.put("av_type", Byte.valueOf(request.getParameter("av_type")));
                }
                if (!CommonUtil.isEmpty(request.getParameter("av_versioncode"))) {
                    map.put("av_versioncode", Integer.parseInt(request.getParameter("av_versioncode")));
                }
                map.put("av_versionname", request.getParameter("av_versionname"));
                if (!CommonUtil.isEmpty(request.getParameter("av_action"))) {
                    map.put("av_action", Byte.valueOf(request.getParameter("av_action")));
                }
                map.put("av_stopflag", CommonUtil.read_dbbit(request.getParameter("av_stopflag")));
                //关于时间的查询
                map.put("av_createdate1",CommonUtil.queryTime1(request.getParameter("av_createdate1"),request.getParameter("av_createdate2")));
                map.put("av_createdate2",CommonUtil.queryTime2(request.getParameter("av_createdate1"),request.getParameter("av_createdate2")));

                //查询条件
                us = versionService.getVersionList(map);
                page.setRowcount(versionService.getCountVersion(map));
                appResult.setPage(page);

            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/

        /*begin返回数据*/
/*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 版本添加 zuoxiaochao
     */
    @RequestMapping(value = "versionadd" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String versionadd(@RequestParam(value = "myfile",required = true,defaultValue = ValueConstants.DEFAULT_NONE) MultipartFile myfile, HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        /*页面传过来的参数begin*/
        av_type=request.getParameter("av_type");
        av_versioncode = request.getParameter("av_versioncode");
        av_versionname = request.getParameter("av_versionname");
        String av_action1 = request.getParameter("av_action");
        //基本版本为1
        String av_baselinecode="1";
        String av_filesize1 = request.getParameter("av_filesize");
        String av_createdate1 = request.getParameter("av_createdate");
        /*页面传过来的参数end*/
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        /*检查参数begin*/
        if (CommonUtil.isEmpty(av_versioncode)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("版本号不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(av_versionname)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("版本名称不能为空");
            flag_pass = false;
        };
        if(myfile.isEmpty()){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文件未上传");
            flag_pass = false;
        };
        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true)
            try {
            Base_Version bv = new Base_Version();
            //封装数据
            if (!CommonUtil.isEmpty(av_type)) {
                bv.setAv_type(Byte.valueOf(request.getParameter("av_type")));
            }
            if (!CommonUtil.isEmpty(av_versioncode)) {

                bv.setAv_versioncode(Integer.parseInt(av_versioncode));
            }
            bv.setAv_versionname(av_versionname);
            if (!CommonUtil.isEmpty(av_action1)) {
                bv.setAv_action(Byte.valueOf(request.getParameter("av_action")));
            }

            bv.setAv_baselinecode(Integer.valueOf(av_baselinecode));
            if (!myfile.isEmpty()) {
                try{
                    versionService.upload(myfile);
                }catch(Exception e){
                    logger.error(e.getMessage());
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage("上传文件失败");
                }

              /*  String filepath = Constants.FILE_DOWNLOAD + "/" + myfile.getOriginalFilename();
                myfile.transferTo(new File(filepath));*/
                //文件转存路径
                //设置下载名称
                bv.setAv_down_url(myfile.getOriginalFilename());//截取后面的地址
                bv.setAv_down_file(myfile.getOriginalFilename());//设置文件名称
                bv.setAv_filesize((int) myfile.getSize());//设置大小,保存到数据库

            }

            bv.setAv_info(request.getParameter("av_info"));


            bv.setAv_createid(Integer.valueOf(sm_id));
            bv.setAv_createno(sm_no);
            bv.setAv_createdate(new Date());
            bv.setAv_stopflag(CommonUtil.convert_boolean(request.getParameter("av_stopflag")));
            int ii = versionService.addVersion(bv);
            if (ii == 0) {
                appResult.setMessage(Constants.RESULT_ADD_FAIL);
            }
            ;/*提示资料不存在*/
        } catch (Exception e) {
            //打印错误的日志
            logger.error(e.getMessage());
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }
        /*end处理数据*/

        /*begin返回数据*/

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

     /*zuoxiaochao*/
    /**
     * 删除版本
     */
    @SuppressWarnings({ "unused", "null" })
        @RequestMapping(value = "versiondelete" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String versiondelete(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i;

        //*检查内容是否能过
        Boolean flag_pass=true;


        /*获得参数begin*/
       String  av_id = request.getParameter("av_id");
       String  sm_id = request.getParameter("sm_id");//要登录才能删除
        if(CommonUtil.isEmpty(av_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("av_id不能为空");
            flag_pass = false;
        }
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = versionService.deleteVersionById(Long.parseLong(av_id));

                if(i==1){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_DEL_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_DEL_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        //*end处理数据*//*

        //*begin返回数据*//*
        //其实就是封装数据

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

    /***
     * @param request
     *读取版本明细
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "versiondetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String versiondetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取av_id
        av_id = request.getParameter("av_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(av_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("av_id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Base_Version bv = new Base_Version();
        if (flag_pass==true) {
            try {
                 bv = versionService.getVersiondetail(Long.parseLong(av_id));
                if (bv!=null){
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        appresult.setData(bv);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /*
   * version修改保存
   * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "versionupdate", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String versionupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
            Boolean flag_pass=true;

        av_id = request.getParameter("av_id");
        av_type = request.getParameter("av_type");
        av_versioncode = request.getParameter("av_versioncode");
        av_versionname = request.getParameter("av_versionname");
        String av_action1 = request.getParameter("av_action");
        String av_baselinecode1 = request.getParameter("av_baselinecode");
        String av_filesize1 = request.getParameter("av_filesize");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
/*检查参数 begin*/
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(av_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(av_type)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("版本类型不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(av_versioncode)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("版本号不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(av_versionname)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("版本名称不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Base_Version bv = new Base_Version();
                bv.setAv_id(Long.parseLong(this.av_id));
                bv.setAv_type(Byte.valueOf(av_type));
                bv.setAv_versioncode(Integer.parseInt(request.getParameter("av_versioncode")));
                bv.setAv_versionname(av_versionname);
                if(!CommonUtil.isEmpty(av_action1)){

                    bv.setAv_action(Byte.valueOf(request.getParameter("av_action")));
                }
                if(!CommonUtil.isEmpty(av_baselinecode1)){

                    bv.setAv_baselinecode(Integer.valueOf(request.getParameter("av_baselinecode")));
                }
                bv.setAv_down_url(request.getParameter("av_down_url"));
                bv.setAv_down_file(request.getParameter("av_down_file" ));
                if(!CommonUtil.isEmpty(av_filesize1)){

                    bv.setAv_filesize(Integer.valueOf(request.getParameter("av_filesize")));
                }
                bv.setAv_info(request.getParameter("av_info"));
                bv.setAv_createid(Integer.valueOf(sm_id));
                bv.setAv_createno(sm_no);
                bv.setAv_stopflag(CommonUtil.convert_boolean(request.getParameter("av_stopflag")));


                int ii = versionService.updateVersion(bv);
                    if (ii==0){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_EDIT_FAIL);
                };/*提示资料不存在*/
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    //上传文件的接口

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "versionfileupload", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String versionfileupload(@RequestParam(value = "myfile",required = true)MultipartFile myfile,HttpServletRequest  request, HttpServletResponse response)throws Exception{

        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("文件上传成功");
        String rs = "";
        Boolean flag_pass=true;
        //要定义一个上传的位置E:/text

        if(flag_pass =true){
            try {
                Base_Version bs = new Base_Version();
                if(myfile.isEmpty()){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
                } else {
                    //这是文件保存路径,文件不会重名
                    String  filepath="E:/text"+"/upload/"+UUID.randomUUID().toString().replaceAll("-","")+myfile.getOriginalFilename();
                    //文件转存路径
                    myfile.transferTo(new File(filepath));//写入磁盘

                    //设置下载名称
                    bs.setAv_down_url(filepath);
                    bs.setAv_down_file(SequenceCreator.createNewFileName()+myfile.getOriginalFilename());//设置文件名称
                    bs.setAv_filesize((int) myfile.getSize());//设置大小,保存到数据库
                    appresult.setData(bs);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        //*处理数据 end*//*
        //*返回数据 begin*//*
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
        out.print(rs);
        out.close();//*返回数据 end*//*
        return null;

    }


    //接口预览PDF
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "pdfshow", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String pdfshow(HttpServletRequest  request, HttpServletResponse response)throws Exception {
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage("文件预览成功");
        String rs = "";
        Boolean flag_pass = true;

        String pa_id = request.getParameter("pa_id");
        String filename = commService.getPmArchivesfilename(CommonUtil.convert_Long(pa_id));
        //读取配置
        try {
             commService.getSysConfigValue("path_pdf_source");
            //String path=path_pdf_source+"/"+filename+".pdf";
            String path=Constants.FILE_PDF+"/"+filename+".pdf";
            response.setContentType("application/pdf");
            FileInputStream in = new FileInputStream(new File(path));
            OutputStream out = response.getOutputStream();
            byte[] b = new byte[512];
            while ((in.read(b)) != -1) {
                out.write(b);
                out.flush();
            }
            out.close();
            in.close();
        }catch (UnifiedJEXL.Exception e){

        }
        return null;
    }


}

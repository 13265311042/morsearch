package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.common.util.ueditor.ResponseUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Msg_News;
import com.morsearch.service.MsgNewsService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by hyt on 2018/3/14
 * @author zuoxiaochao
 */
@Controller("BackMsgNewsController")
@RequestMapping("/back/")
public class BackMsgNewsController extends BaseController {

    @Resource
    private MsgNewsService msgNewsService;

    /***
     * @author  zuoxiaochao
     * 对应的数据表msg_news
     * @return List<Msg_News></>
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmsgnewslist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmsgnewslist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        //获取参数
        String mn_title = request.getParameter("mn_title");
        String mn_keyword = request.getParameter("mn_keyword");
        String mn_type = request.getParameter("mn_type");
        String mn_status = request.getParameter("mn_status");
        String mn_createdate1 = request.getParameter("mn_createdate1");
        String mn_createdate2 = request.getParameter("mn_createdate2");

        List<Msg_News> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("mn_title",mn_title);//标题
                map.put("mn_keyword",mn_keyword);//关键词
                map.put("mn_type",CommonUtil.convert_Byte(mn_type));//新闻类型
                map.put("mn_status",CommonUtil.convert_Byte(mn_status));//状态

                map.put("mn_createdate1",CommonUtil.queryTime1(mn_createdate1,mn_createdate2));//时间查询
                map.put("mn_createdate2",CommonUtil.queryTime2(mn_createdate1,mn_createdate2));

                us = msgNewsService.getBackMsg_NewsList(map);
                page.setRowcount(msgNewsService.getBackCountMsg_News(map));
                appResult.setPage(page);
                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }
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
        appResult.setData(dto);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * 小上传图片时详情
     * @param request
     * @param response
     * @throws Exception
     */
    @CrossOrigin
    @IgnoreAuth
    @RequestMapping(value = "uploadueditorimage",method ={RequestMethod.POST, RequestMethod.GET})
    public void uploadueditorimage(@RequestParam(value = "Type", required = false) String typeStr, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-cache");
        if (ResponseUtils.isEmpty(typeStr)) {
            typeStr = "File";
        }
        /*各种状态begin*/
        String STATE = "state";
        String SUCCESS = "SUCCESS";
        String URL = "url";
        String ORIGINAL = "original";
        String FILETYPE = "fileType";
        /*各种状态end*/

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 同时只上传一个文件
        MultipartFile uplFile = multipartRequest.getFileMap().entrySet().iterator().next().getValue();
        String filename = FilenameUtils.getName(uplFile.getOriginalFilename());
        String ext = FilenameUtils.getExtension(filename);
        String fileUrl = SequenceCreator.createNewFileName() +"." + ext;
        //上传文件
        CommonUtil.upload(uplFile,fileUrl,"1");
        JSONObject result = new JSONObject();
        // 加上部署路径
        result.put(STATE, SUCCESS);
        result.put(URL, fileUrl);
        result.put(ORIGINAL, filename);
        result.put(FILETYPE, "." + ext);
        JSONObject json=result;
        ResponseUtils.renderJson(response, json.toString());
    }


    /***
     * 小程序资讯列表上传视频时详情
     * @param request
     * @param response
     * @throws Exception
     */
    @CrossOrigin
    @RequestMapping(value = "uploadueditorvideo",method ={RequestMethod.POST, RequestMethod.GET})
    public void uploadueditorvideo(@RequestParam(value = "Type1", required = false) String typeStr, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-cache");
        if (ResponseUtils.isEmpty(typeStr)) {
            typeStr = "File";
        }
        /*各种状态begin*/
        String STATE = "state";
        String SUCCESS = "SUCCESS";
        String URL = "url";
        String ORIGINAL = "original";
        String FILETYPE = "fileType";
        /*各种状态end*/
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 同时只上传一个文件
        MultipartFile uplFile = multipartRequest.getFileMap().entrySet().iterator().next().getValue();
        String filename = FilenameUtils.getName(uplFile.getOriginalFilename());
        String ext = FilenameUtils.getExtension(filename);
        String fileUrl="";
        if("mp3".equals(ext)){
             fileUrl = SequenceCreator.createNewFileName() +".mp3" ;
        }else {
             fileUrl = SequenceCreator.createNewFileName() +".mp4" ;
        }
        //上传文件
        CommonUtil.upload(uplFile,fileUrl,"2");
        JSONObject result = new JSONObject();
        // 加上部署路径
        result.put(STATE, SUCCESS);
        result.put(URL, fileUrl);
        result.put(ORIGINAL, filename);
        if("mp3".equals(ext)){
            result.put(FILETYPE, "." + "mp3");
        }else{
            result.put(FILETYPE, "." + "mp4");
        }
        JSONObject json=result;
        ResponseUtils.renderJson(response, json.toString());
    }


    /**
     * 资讯添加 zuoxiaochao
     * Msg_News
     */
    @RequestMapping(value = "addmsgnews" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String addmsgnews(@RequestParam(value = "myfile",required = true,defaultValue = ValueConstants.DEFAULT_NONE) MultipartFile myfile, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

        String mn_title = request.getParameter("mn_title");//标题
        String mn_headisv = request.getParameter("mn_headisv");//标题图片是否为视频
        String mn_keyword = request.getParameter("mn_keyword");//关键词
        String mn_type = request.getParameter("mn_type");//新闻类型
        String mn_status = request.getParameter("mn_status");//状态
        String mn_content = request.getParameter("mn_content");//内容
        String mn_index = request.getParameter("mn_index");//内容排序

        if (CommonUtil.isEmpty(sm_id) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_title) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_keyword) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("关键词不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_type) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("新闻类型不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_status) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("状态不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_content) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("内容不能为空");
            flag_pass = false;
        }
        if (myfile.isEmpty()) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文件未上传");
            flag_pass = false;
        }

        if (flag_pass == true) {
            try {
                Properties p = new Properties();
                InputStream is = null;
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);

                Msg_News mn = new Msg_News();
                //封装数据
                mn.setMn_title(mn_title);
                mn.setMn_headisv(CommonUtil.convert_boolean(mn_headisv));
                //上传图片
                String URL = SequenceCreator.createNewFileName() + ".jpg";
                int i = msgNewsService.uploadsmall(myfile, URL, "1",30);//上传图片
                String realURL="";
                if(i==1){
                    realURL = p.getProperty("FTP_UEDITORIMAGE") + "small/"+URL;
                }
                mn.setMn_headpic(realURL);
                mn.setMn_content(mn_content);
                mn.setMn_keyword(mn_keyword);
                mn.setMn_headisv(CommonUtil.convert_boolean(mn_headisv));
                mn.setMn_type(CommonUtil.convert_Byte(mn_type));
                mn.setMn_createno(sm_no);
                mn.setMn_createdate(new Date());
                mn.setMn_status(CommonUtil.convert_Byte(mn_status));
                mn.setMn_index(CommonUtil.convert_Int(mn_index));//设置排序
                int ii = msgNewsService.addMsg_News(mn);
                if (ii == 0) {
                    appResult.setMessage(Constants.RESULT_ADD_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

    /***
     * Msg_News
     * 得到新闻资讯详细信息
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmsgnewsdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmsgnewsdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String  mn_id = request.getParameter("mn_id");

        if (CommonUtil.isEmpty(mn_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

        Msg_News mn = new Msg_News();
        if (flag_pass==true) {
            try {
                mn = msgNewsService.getMsg_NewsDetail(Long.parseLong(mn_id),1);//查询所有的信息
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appresult.setData(mn);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * @param request
     *修改新闻资讯
     * Msg_News
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savemsgnews", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savemsgnews(@RequestParam(value = "myfile",required = false) MultipartFile myfile,HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String mn_id = request.getParameter("mn_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

        String mn_title = request.getParameter("mn_title");//标题
        String mn_headisv = request.getParameter("mn_headisv");//标题图片是否为视频
        String mn_keyword = request.getParameter("mn_keyword");//关键词
        String mn_type = request.getParameter("mn_type");//新闻类型
        String mn_status = request.getParameter("mn_status");//状态
        String mn_content = request.getParameter("mn_content");//内容
        String mn_index = request.getParameter("mn_index");//内容排序

        //这个文件上传无所谓
        if (CommonUtil.isEmpty(mn_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_title) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_keyword) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("关键词不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_type) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("新闻类型不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_status) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("状态不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(mn_content) && flag_pass == true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("内容不能为空");
            flag_pass = false;
        }

        if (flag_pass==true) {
            try {

                Properties p = new Properties();
                InputStream is = null;
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);

                Msg_News mn = new Msg_News();
                //封装数据
                mn.setMn_id(CommonUtil.convert_Long(mn_id));
                mn.setMn_title(mn_title);
                mn.setMn_headisv(CommonUtil.convert_boolean(mn_headisv));
                String URL = SequenceCreator.createNewFileName() + ".jpg";
                String realURL="";
                if(myfile!=null){
                    if(myfile.getSize()>0){
                        int i = msgNewsService.uploadsmall(myfile, URL, "1",30);//上传图片
                        if(i==1){
                            realURL = p.getProperty("FTP_UEDITORIMAGE") + "small/"+URL;
                        }
                        mn.setMn_headpic(realURL);
                    }
                }
                mn.setMn_content(mn_content);
                mn.setMn_keyword(mn_keyword);
                mn.setMn_headisv(CommonUtil.convert_boolean(mn_headisv));
                mn.setMn_type(CommonUtil.convert_Byte(mn_type));
                mn.setMn_status(CommonUtil.convert_Byte(mn_status));
                mn.setMn_index(CommonUtil.convert_Int(mn_index));//修改排序
                int ii = msgNewsService.updateMsg_News(mn);
                if (ii==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                };/*提示资料不存在*/
            } catch (Exception e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appResult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 删除新闻资讯
     * Msg_News
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletemsgnews" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletemsgnews(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs="";
        int i=0;
        Boolean flag_pass=true;
        /*获得参数begin*/
        String mn_id = request.getParameter("mn_id");
        String sm_id = request.getParameter("sm_id");

        if(CommonUtil.isEmpty(mn_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = msgNewsService.deleteMsg_NewsById(Long.parseLong(mn_id));
                if(i==0){
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
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }





}

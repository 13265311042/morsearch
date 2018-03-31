package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.BaseV_Rotation;
import com.morsearch.model.Base_Rotation;
import com.morsearch.service.BaseRotationService;
import com.morsearch.service.MsgNewsService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ValueConstants;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by hyt on 2017/12/29.
 *有关商品轮播图的类
 *
 */
@Controller("BackBaseRotationController")
@RequestMapping("/back/")
public class BackBaseRotationController extends BaseController {

    @Resource
    private BaseRotationService baseRotationService;

    @Resource
    private MsgNewsService msgNewsService;
    /**
     * 轮播图列表展示(视图) zuoxiaochao
     * BaseV_Rotation
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbasevrotationlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getbasevrotationlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<BaseV_Rotation> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("rt_type", request.getParameter("rt_type"));//类别
            map.put("rt_title", request.getParameter("rt_title"));//标题
            map.put("rt_flagstop", CommonUtil.read_dbbit(request.getParameter("rt_flagstop")));//停止标签
            map.put("modename",request.getParameter("modename"));//模式
                /*建表日期的查询*/
            map.put("rt_createdate1", CommonUtil.queryTime1(request.getParameter("rt_createdate1"), request.getParameter("rt_createdate2")));
            map.put("rt_createdate2", CommonUtil.queryTime2(request.getParameter("rt_createdate1"), request.getParameter("rt_createdate2")));
                /*修改日期的查询*/
            map.put("rt_updatedate1", CommonUtil.queryTime1(request.getParameter("rt_updatedate1"), request.getParameter("rt_updatedate2")));
            map.put("rt_updatedate2", CommonUtil.queryTime2(request.getParameter("rt_updatedate1"), request.getParameter("rt_updatedate2")));
            //查询条件
            us = baseRotationService.getBaseV_RotationList(map);
            page.setRowcount(baseRotationService.getCountBaseV_Rotation(map));
            appResult.setPage(page);

            if (!CommonUtil.isNullOrEmpty(us) && us.size() > 0) {
                appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
            }
        } catch (Exception e) {
            //打印错误的日志
            logger.error(e.getMessage());
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
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
     * 轮播图表添加 zuoxiaochao
     * Base_Rotation
     */
    @RequestMapping(value = "addbaserotation" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String addbaserotation(@RequestParam(value = "myfile",required = true,defaultValue = ValueConstants.DEFAULT_NONE) MultipartFile myfile, HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String rt_type = request.getParameter("rt_type");//类别
        String rt_title = request.getParameter("rt_title");//标题
        String rt_mode = request.getParameter("rt_mode");//模式
        String rt_index = request.getParameter("rt_index");//模式

        String sm_id = request.getParameter("sm_id");//这是前端传过来的id
        String sm_no = request.getParameter("sm_no");//这是传过来的账号

        /*String rt_location = request.getParameter("rt_location");//定位链接*/
        String rt_flagstop = request.getParameter("rt_flagstop");//停止标签
        String rt_remark = request.getParameter("rt_remark");//备注

        //建表账号,建表日期

        /*检查参数begin*/
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(rt_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("类别不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_title)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标题不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_index)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("序号不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_mode)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("模式不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_flagstop)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("停止标签不能为空");
            flag_pass = false;
        };
        if(myfile.isEmpty()){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("banner图片未上传");
            flag_pass = false;
        };

        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {

                Properties p = new Properties();
                InputStream is = null;
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);

                Base_Rotation br = new Base_Rotation();
                //封装数据
                br.setRt_type(rt_type);
                br.setRt_title(rt_title);
                br.setRt_mode(CommonUtil.convert_Byte(rt_mode));
                br.setRt_index(CommonUtil.convert_Int(rt_index));
                String URL = SequenceCreator.createNewFileName() + ".jpg";
               /* String realURL="";
                int i = msgNewsService.uploadsmall(myfile, URL, "1",60);//上传图片
                if(i==1){
                    realURL = p.getProperty("FTP_UEDITORIMAGE") + "small/"+URL;
                }*/
                String realurl = CommonUtil.upload(myfile, URL, "1");
                br.setRt_location(realurl);//只有上传成功,才会有值
                br.setRt_flagstop(CommonUtil.convert_boolean(rt_flagstop));
                br.setRt_remark(rt_remark);
                br.setRt_createno(sm_no);
                br.setRt_createdate(new Date());
                int ii=baseRotationService.addBase_Rotation(br);
                if (ii==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);}/*添加失败*/
                else{
                  if (CommonUtil.read_boolean(br.getRt_flagstop())==false) {
                      redisService.saveMapRow(Constants.REDIS_ROTATION+rt_type.substring(0,2), br.getRt_id() + "", gson.toJson(br));
                  };
                };
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
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

    /**
     * 得到轮播图的详细信息
     * Base_Rotation
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getbaserotationdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getbaserotationdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        //获取ba_id
        String rt_id = request.getParameter("rt_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(rt_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Base_Rotation br = new Base_Rotation();

        if (flag_pass==true) {
            try {
                br = baseRotationService.getBase_Rotationdetail(CommonUtil.convert_Long(rt_id));
                if (br!=null){
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
        appresult.setData(br);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 轮播图表修改 zuoxiaochao
     * Base_Rotation
     */
    @RequestMapping(value = "savebaserotation" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String savebaserotation(@RequestParam(value = "myfile",required = false) MultipartFile myfile,HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);//资料修改成功
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        String rt_id = request.getParameter("rt_id");
        String rt_type = request.getParameter("rt_type");//类别
        String rt_title = request.getParameter("rt_title");//标题
        String rt_mode = request.getParameter("rt_mode");//模式
        String rt_index = request.getParameter("rt_index");//模式

        String sm_id = request.getParameter("sm_id");//这是前端传过来的id
        String sm_no = request.getParameter("sm_no");//这是传过来的账号

       /* String rt_location = request.getParameter("rt_location");//定位链接*/
        String rt_flagstop = request.getParameter("rt_flagstop");//停止标签
        String rt_remark = request.getParameter("rt_remark");//备注

        //建表账号,建表日期

        /*检查参数begin*/
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品id为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("类别不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_index)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("序号不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(rt_title)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(rt_mode)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("模式不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(rt_flagstop)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("停止标签不能为空");
            flag_pass = false;
        }
        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                String oldtype=baseRotationService.getBase_Rotation_typecode(Long.parseLong(rt_id));/*原来*/

                Properties p = new Properties();
                InputStream is = null;
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                p.load(is);

                //充值送魔币的逻辑
                Base_Rotation br = new Base_Rotation();
                //封装数据
                br.setRt_id(CommonUtil.convert_Long(rt_id));//主键id
                br.setRt_type(rt_type);
                br.setRt_title(rt_title);
                br.setRt_mode(CommonUtil.convert_Byte(rt_mode));

                String URL = SequenceCreator.createNewFileName() + ".jpg";
                String realURL="";
                if(myfile!=null){
                    if(myfile.getSize()>0){
                      /*  int i = msgNewsService.uploadsmall(myfile, URL, "1",60);//上传图片
                        if(i==1){
                            realURL = p.getProperty("FTP_UEDITORIMAGE") + "small/"+URL;
                        }
                        br.setRt_location(realURL);//只有上传成功,才会有值*/
                         realURL = CommonUtil.upload(myfile, URL, "1");
                        br.setRt_location(realURL);//只有上传成功,才会有值
                    }
                }
                br.setRt_index(CommonUtil.convert_Int(rt_index));
                br.setRt_flagstop(CommonUtil.convert_boolean(rt_flagstop));
                br.setRt_remark(rt_remark);
                br.setRt_updateno(sm_no);
                br.setRt_updatedate(new Date());
                int ii=baseRotationService.updateBase_Rotation(br);
                if (ii==0){appResult.setMessage(Constants.RESULT_EDIT_FAIL);}/*修改失败*/
                else{
                  redisService.removeMapRow(Constants.REDIS_ROTATION+oldtype.substring(0,2),rt_id);/*删除旧的*/
                  if (CommonUtil.read_boolean(br.getRt_flagstop())==false) {
                        redisService.saveMapRow(Constants.REDIS_ROTATION + br.getRt_type().substring(0, 2), br.getRt_id() + "", gson.toJson(br));/*存储新的*/
                  };
                };
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
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


    /**
     * 删除轮播图表
     * Base_Rotation
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletebaserotation" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletebaserotation(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i=0;

        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String rt_id = request.getParameter("rt_id");
        String sm_id = request.getParameter("sm_id");

        if(CommonUtil.isEmpty(rt_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id参数不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                String oldtype=baseRotationService.getBase_Rotation_typecode(Long.parseLong(rt_id));/*原来*/

                i = baseRotationService.deleteBase_RotationById(Long.parseLong(rt_id));/*删除*/
                if(i==1){
                    redisService.removeMapRow(Constants.REDIS_ROTATION+oldtype.substring(0,2),rt_id);/*删除redis*/

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
}

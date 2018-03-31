package com.morsearch.controller.back;

/**
 * Created by hyt on 2017/10/17.
 */

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Base_LableType;
import com.morsearch.model.Desig_Home;
import com.morsearch.service.LableListService;
import com.morsearch.service.ManagerService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ValueConstants;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller("BackLableListController")
@RequestMapping("/back/")
public class BackLableListController extends BaseController{
    private String bl_id;//标签ID


    private String bl_type;//标签大类
    private String bl_name;//标签名称

    private String bl_index;//标签序号integer

    private String bl_code;//代码
    private String bl_value;//值

    private String bl_stopflag;//停用标志boolean
    private String bl_delflag;//删除标志boolean
    private String bl_selectflag;//选择标志boolean
    private String bl_remark;//备注

    private String bl_createname;//建表人员
    private String bl_createdate;//建表日期Date

    private String bl_updatename ;//修改人员
    private String bl_updatedate;//修改日期

    private String bl_status;//状态Byte
    @Resource
    private LableListService lableListService;

    @Resource
    private ManagerService managerService;

    public BackLableListController() {
    }

    /**
     * 标签库大类显示-后端
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "labletype" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String lableType(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/

        List<Base_LableType> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出用户列表
            try {
                //如果用户存在,那么状态就可以设置为成功
                us = lableListService.getLableTypeList();

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_FAIL);
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
        //其实就是封装数据
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

    /**
     * 标签库子类显示-后端
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "lablelist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String lableList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        //获得页面传过来的参数
        String bl_type = request.getParameter("bl_type");
        String bl_index1=request.getParameter("bl_index");
        String bl_status1 = request.getParameter("bl_status");
        Boolean flag_pass=true;/*检查内容是否能过*/

        /*begin检查参数*/
        if((bl_type==null||"".equals(bl_type))&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标签大类不能为空");
            flag_pass = false;
        }
        /*end检查参数*/

        /*begin处理数据*/
        //查询出用户列表
        List<Base_LableList> us = new ArrayList<>();
        if(flag_pass == true){
            try {
                  /*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("bl_type",bl_type);
                map.put("bl_name",request.getParameter("bl_name"));
                if(CommonUtil.isEmpty(bl_index1)){
                    map.put("bl_index",request.getParameter("bl_index"));
                }
                map.put("bl_code",request.getParameter("bl_code"));
                map.put("bl_value",request.getParameter("bl_value"));
                map.put("bl_stopflag",CommonUtil.read_dbbit(request.getParameter("bl_stopflag")));
                map.put("bl_delflag",CommonUtil.convert_boolean(request.getParameter("bl_delflag")));
                map.put("bl_selectflag",CommonUtil.convert_boolean(request.getParameter("bl_selectflag")));
                map.put("bl_remark",request.getParameter("bl_remark"));
                if(!CommonUtil.isEmpty(bl_status1)){
                    map.put("bl_status",Byte.valueOf(request.getParameter("bl_status")));
                }
              /*查询条件 end*/
                //关于建表时间的查询
                map.put("bl_createdate1",CommonUtil.queryTime1(request.getParameter("bl_createdate1"),request.getParameter("bl_createdate2")));
                map.put("bl_createdate2",CommonUtil.queryTime2(request.getParameter("bl_createdate1"),request.getParameter("bl_createdate2")));

                /*关于修改时间的查询*/
                map.put("bl_updatedate1",CommonUtil.queryTime1(request.getParameter("bl_updatedate1"),request.getParameter("bl_updatedate2")));
                map.put("bl_updatedate2",CommonUtil.queryTime2(request.getParameter("bl_updatedate1"),request.getParameter("bl_updatedate2")));

                us= lableListService.getLableList(map);
                page.setRowcount(lableListService.getCountlable(map));
                appResult.setPage(page);
			    /*控制页码 end*/
                //如果用户存在,那么状态就可以设置为成功

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
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }

   /*zuoxiaochao*/
    /**
     * 删除子标签
     */
    @SuppressWarnings({ "unused", "null" })
        @RequestMapping(value = "deletelablelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletelablelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
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
        String bl_id = request.getParameter("bl_id");
        String sm_id = request.getParameter("sm_id");


        if (CommonUtil.isEmpty(bl_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("bl_id不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                 i = lableListService.deleteLableListById(Long.parseLong(bl_id));

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

    /**
     * 子标签添加
     * */
    @SuppressWarnings({ "unused", "null" })
        @RequestMapping(value = "lablelistadd", method ={RequestMethod.POST, RequestMethod.GET,RequestMethod.OPTIONS},produces ={ "application/json;charset=UTF-8" })
    public String lablelistadd(@RequestParam(value = "imgfile",required = false,defaultValue = ValueConstants.DEFAULT_NONE) MultipartFile imgfile,HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        bl_type=request.getParameter("bl_type");
        bl_name=request.getParameter("bl_name");
        String bl_index1 = request.getParameter("bl_index");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sm_no = request.getParameter("sm_no");
    /*检查参数 begin*/
        if ((bl_type==null || "".equals(bl_type))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签大类不能为空");
            flag_pass = false;
        };
        if ((bl_name==null || "".equals(bl_name))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签名称不能为空");
            flag_pass = false;
        };
        if ((sm_no==null || "".equals(sm_no)||"null".equals(sm_no))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };

/*检查参数 end*/

/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                String filename="";
                Base_LableList bl = new Base_LableList();
                bl.setBl_type(bl_type);
                bl.setBl_name(bl_name);
                if(bl_index1 !=null){
                    bl.setBl_index(Integer.parseInt(request.getParameter("bl_index")));
                }
                bl.setBl_code(request.getParameter("bl_code"));
                bl.setBl_value(request.getParameter("bl_value"));

                //上传图片
                if(imgfile.getSize()>0){
                    filename =  lableListService.saveT( imgfile);
                    bl.setBl_imageurl(filename);
                }
                bl.setBl_stopflag(CommonUtil.convert_boolean(request.getParameter("bl_stopflag")));
                bl.setBl_delflag(CommonUtil.convert_boolean(request.getParameter("bl_delflag")));
                bl.setBl_remark(request.getParameter("bl_remark"));
                bl.setBl_createno(sm_no);
                bl.setBl_createdate(new Date());


                int ii=lableListService.addLableList(bl);
                if (ii==0){appresult.setMessage(Constants.RESULT_ADD_FAIL);};/*提示资料不存在*/
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

    /* 读取标签用户明细*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "lablelistdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String lablelistdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取bl_id
        bl_id = request.getParameter("bl_id");
    /*检查参数 begin*/
        if ((bl_id==null || "".equals(bl_id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Base_LableList bl = new Base_LableList();
        if (flag_pass==true) {
            try {
                 bl = lableListService.getLableListdetail(Long.parseLong(bl_id));


                if (bl!=null){
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
        appresult.setData(bl);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /*
    * lablelist子标签修改保存
    * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "lablelistupdate", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String lablelistupdate(@RequestParam(value = "imgfile",required = false,defaultValue = ValueConstants.DEFAULT_NONE) MultipartFile imgfile,HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        bl_id = request.getParameter("bl_id");
        bl_type = request.getParameter("bl_type");
        bl_name = request.getParameter("bl_name");
         String  bl_index1 = request.getParameter("bl_index");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sm_no = request.getParameter("sm_no");
        String filename="";
/*检查参数 begin*/
        if ((this.bl_id ==null || "".equals(this.bl_id))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        };
        /*if ((bl_type==null || "".equals(bl_type))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签大类不能为空");
            flag_pass = false;
        };*/

       /* if ((bl_name==null || "".equals(bl_name))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签名称不能为空");
            flag_pass = false;
        };*/
        if ((sm_no==null || "".equals(sm_no)||"null".equals(sm_no))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Base_LableList bl = new Base_LableList();
                bl.setBl_id(Long.parseLong(this.bl_id));
                bl.setBl_type(bl_type);
                bl.setBl_name(bl_name);
                if(bl_index1 !=null){
                    bl.setBl_index(Integer.parseInt(request.getParameter("bl_index")));
                }
                bl.setBl_code(request.getParameter("bl_code"));
                bl.setBl_value(request.getParameter("bl_value"));

                if(imgfile.getSize()>0){
                    filename =  lableListService.saveT( imgfile);
                    //图片的位置
                    bl.setBl_imageurl(filename);
                }
                if(!CommonUtil.isEmpty(request.getParameter("bl_stopflag"))){
                    bl.setBl_stopflag(CommonUtil.convert_boolean(request.getParameter("bl_stopflag")));
                }
                if(!CommonUtil.isEmpty(request.getParameter("bl_delflag"))){
                    bl.setBl_delflag(CommonUtil.convert_boolean(request.getParameter("bl_delflag")));
                }
                if(!CommonUtil.isEmpty(request.getParameter("bl_selectflag"))){
                    bl.setBl_selectflag(CommonUtil.convert_boolean(request.getParameter("bl_selectflag")));
                }
                bl.setBl_remark(request.getParameter("bl_remark"));
                bl.setBl_updateno(sm_no);
                bl.setBl_updatedate(new Date());
             /*   bl.setBl_status(Byte.valueOf(request.getParameter("bl_status")));*/

               int ii = lableListService.updateLableList(bl);
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


    /**
     * 读取标签大类属性
     */
    @SuppressWarnings({ "unused", "null" })
        @RequestMapping(value = "labletypedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String labletypedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //bt_type
       String bt_type = request.getParameter("bt_type");
    /*检查参数 begin*/
        if ((bt_type==null || "".equals(bt_type))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("bt_type不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Base_LableType bl = new Base_LableType();
        if (flag_pass==true) {
            try {
                bl= lableListService.getLableTypedetail(bt_type);
                if (bl!=null){
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
        appresult.setData(bl);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /*
  * lableType修改
  * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "lableTypeupdate", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String lableTypeupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
//接受参数
        String bt_type = request.getParameter("bt_type");
        String  bt_name = request.getParameter("bt_name");
        String  bt_index = request.getParameter("bt_index");
        String bt_allowflag = request.getParameter("bt_allowflag");
        String bt_stopflag = request.getParameter("bt_stopflag");
        String sm_id = request.getParameter("sm_id");

/*检查参数 begin*/
        if (CommonUtil.isEmpty(bt_type)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标签大类不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(bt_name)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("大类名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Base_LableType bl = new Base_LableType();
                bl.setBt_type(bt_type);
                bl.setBt_name(bt_name);
                if (!CommonUtil.isEmpty(bt_index)) {
                    bl.setBt_index(Integer.parseInt(bt_index));
                }
                bl.setBt_allowflag(CommonUtil.convert_boolean(bt_allowflag));
                bl.setBt_stopflag(CommonUtil.convert_boolean(bt_stopflag));
                bl.setBt_remark(request.getParameter("bt_remark"));
                int ii =lableListService.updateLableType(bl);
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



    /**
     * 设计师首页品牌添加查询剩余id zuoxiaochao
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getlablelistidfirst", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getlablelistidfirst(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Base_LableList> us = new ArrayList<>();
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
                //查询条件
                us = lableListService.getLableListidfirst(map);
                page.setRowcount(lableListService.getCountLableListidfirst(map));
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
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 设计师首页专业添加查询剩余id zuoxiaochao
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getlablelistidlast", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getlablelistidlast(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Base_LableList> us = new ArrayList<>();
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
                //查询条件
                us = lableListService.getLableListidlast(map);
                page.setRowcount(lableListService.getCountLableListidlast(map));
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
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 标签审核(查找所有状态为0的标签)
     * Base_LableList(bl_status==0)
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getlabellistchecklist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getlabellistchecklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        //获得页面传过来的参数
        String bl_status = request.getParameter("bl_status");
        Boolean flag_pass=true;/*检查内容是否能过*/

        /*end检查参数*/

        /*begin处理数据*/
        //查询出用户列表
        List<Base_LableList> us = new ArrayList<>();
        if(flag_pass == true){
            try {
                  /*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("bl_name",request.getParameter("bl_name"));
                map.put("bl_type",request.getParameter("bl_type"));

              /*查询条件 end*/
                us= lableListService.getLableList1(map);
                page.setRowcount(lableListService.getCountlable1(map));
                appResult.setPage(page);
			    /*控制页码 end*/
                //如果用户存在,那么状态就可以设置为成功

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

        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 标签审核通过(把标签的状态为0的变为1)
     * Base_LableList
     */
    //得到的参数就是这个value
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savebaselablelistcheck", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String savebaselablelistcheck(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        //获得页面传过来的参数
        String bl_status = request.getParameter("bl_status");
        String bl_id = request.getParameter("bl_id");//标签id
        String sm_id = request.getParameter("sm_id");//标签id
        Boolean flag_pass=true;/*检查内容是否能过*/
        /*end检查参数*/
        if (CommonUtil.isEmpty(bl_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("标签id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        /*begin处理数据*/
        //查询出用户列表
        Base_LableList bl = new Base_LableList();
        if(flag_pass == true){
            try {
                bl.setBl_id(CommonUtil.convert_Long(bl_id));
                bl.setBl_status(CommonUtil.convert_Byte(bl_status));
                int ii = lableListService.updateBase_LableListcheck(bl);
                if(ii==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_EDIT_FAIL);
            }
        }
        /*end处理数据*/
        /*begin返回数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 标签审核通过(把标签的状态为0的变为1),多选,勾选的都通过
     * Base_LableList
     */
    @RequestMapping(value = "savelabellistcheckall" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String savelabellistcheckall( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        /*页面传过来的参数begin*/
        String bl_ids = request.getParameter("bl_ids");//对应ID,(必传)
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        /*页面传过来的参数end*/
        String bl_status = request.getParameter("bl_status");
        /*检查参数begin*/
        if (CommonUtil.isEmpty(bl_ids)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("对应ID不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        /*检查参数end*/
        /*begin处理数据*/
        if(flag_pass == true){
            try {
                String[] split = bl_ids.split(",");
                for (int i = 0; i < split.length; i++) {//循坏添加
                    Base_LableList bl = new Base_LableList();
                    bl.setBl_id(CommonUtil.convert_Long(split[i]));//对应id
                    bl.setBl_status(CommonUtil.convert_Byte(bl_status));
                    int ii = lableListService.updateBase_LableListcheck(bl);
                    if (ii==0){
                        appResult.setMessage(Constants.RESULT_ADD_FAIL);};
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
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }
}
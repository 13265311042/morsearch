package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.DesigV_Demand;
import com.morsearch.model.Desig_Demand;
import com.morsearch.model.Desig_Project;
import com.morsearch.service.DesigDemandService;
import com.morsearch.service.DesigProjectService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by zuoxiaochao on 2017/11/28.
 */
@Controller("BackDesDemandController")
@RequestMapping("/back/")

public class BackDesDemandController extends BaseController{

    @Resource
    private DesigDemandService desigDemandService;

    @Resource
    private DesigProjectService desigProjectService;
    /**
     * 设计师需求列表展示 zuoxiaochao
     * Desig_Demand
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigdemandbacklist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigdemandbacklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Desig_Demand> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("dd_no", request.getParameter("dd_no"));//需求编号
            map.put("dd_title", request.getParameter("dd_title"));//标题
            map.put("dd_major", request.getParameter("dd_major"));//所属专业
            map.put("dd_style", request.getParameter("dd_style"));//产品类型

            map.put("dd_createno", request.getParameter("dd_createno"));//建立用户名称
            if (!CommonUtil.isEmpty(request.getParameter("dd_status"))) {
                map.put("dd_status", Byte.valueOf(request.getParameter("dd_status")));//状态查询条件
            }
                /*建立日期的查询*/
            map.put("dd_createdate1", CommonUtil.queryTime1(request.getParameter("dd_createdate1"), request.getParameter("dd_createdate2")));
            map.put("dd_createdate2", CommonUtil.queryTime2(request.getParameter("dd_createdate1"), request.getParameter("dd_createdate2")));
                /*审核日期的查询*/
            map.put("dd_confirmdate1", CommonUtil.queryTime1(request.getParameter("dd_confirmdate1"), request.getParameter("dd_confirmdate2")));
            map.put("dd_confirmdate2", CommonUtil.queryTime2(request.getParameter("dd_confirmdate1"), request.getParameter("dd_confirmdate2")));
            //查询条件
            us = desigDemandService.getDesig_DemandBackList(map);//后台的查询方法
            page.setRowcount(desigDemandService.getCountDesig_DemandBack(map));//后台的查询方法,与前端稍微有点区别
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

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
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
     * 设计师项目列表展示 zuoxiaochao
     * Desig_Project
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigprojectbacklist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigprojectbacklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Desig_Project> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("sp_no", request.getParameter("sp_no"));//项目单号
            map.put("sp_title", request.getParameter("sp_title"));//项目名称
            map.put("sp_citycode", request.getParameter("sp_citycode"));//城市code
            map.put("sp_cityname", request.getParameter("sp_cityname"));//城市名称

            map.put("sp_createno", request.getParameter("sp_createno"));//建立用户名称
            if (!CommonUtil.isEmpty(request.getParameter("sp_status"))) {
                map.put("sp_status", Byte.valueOf(request.getParameter("sp_status")));//单据状态
            }
                /*建立日期的查询*/
            map.put("sp_createdate1", CommonUtil.queryTime1(request.getParameter("sp_createdate1"), request.getParameter("sp_createdate2")));
            map.put("sp_createdate2", CommonUtil.queryTime2(request.getParameter("sp_createdate1"), request.getParameter("sp_createdate2")));
                /*审核日期的查询*/
            map.put("sp_confirmdate1", CommonUtil.queryTime1(request.getParameter("sp_confirmdate1"), request.getParameter("sp_confirmdate2")));
            map.put("sp_confirmdate2", CommonUtil.queryTime2(request.getParameter("sp_confirmdate1"), request.getParameter("sp_confirmdate2")));
            //查询条件
            us = desigProjectService.getDesig_ProjectBackList(map);//后台的查询方法
            page.setRowcount(desigProjectService.getCountDesig_ProjectBack(map));//后台的查询方法,与前端稍微有点区别
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
/*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        /*begin返回数据*/
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /***
     * Desig_Demand
     * 得到设计师需求详细信息
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigdemanddetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigdemanddetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取bl_id
         String  dd_id = request.getParameter("dd_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(dd_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Desig_Demand bl = new Desig_Demand();
        if (flag_pass==true) {
            try {
                bl = desigDemandService.getDesig_DemandDetail(Long.parseLong(dd_id),1);
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


    /***
     * 设计师需求状态改变
     * Desig_Demand
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savedesigdemand", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savedesigdemand( HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String  dd_id = request.getParameter("dd_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String dd_adminremark = request.getParameter("dd_adminremark");
        String  dd_status = request.getParameter("dd_status");
        if(CommonUtil.isEmpty(dd_status)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("状态不能为空");
            flag_pass = false;
        }
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        }
        if(!CommonUtil.isEmpty(dd_status)&&dd_status.equals("4")&&flag_pass==true&&CommonUtil.isEmpty(dd_adminremark)){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请填写审核");
            flag_pass = false;
        }

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) try {
            Desig_Demand dd = new Desig_Demand();
            dd.setDd_id(Long.valueOf(dd_id));
            dd.setDd_confirmid(Long.valueOf(sm_id));
            dd.setDd_confirmno(sm_no);
            dd.setDd_confirmdate(new Date());
            dd.setDd_status(Byte.valueOf(dd_status));
            dd.setDd_adminremark(dd_adminremark);
            int ii = desigDemandService.updateDesig_Demand(dd);
            if (ii == 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_EDIT_FAIL);
            }
            ;/*提示资料不存在*/
        } catch (Exception e) {
            logger.error(e.getMessage());
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
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


    /***
     * Desig_Project
     * 得到设计师项目详细信息
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigprojectdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigprojectdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取bl_id
        String  sp_id = request.getParameter("sp_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(sp_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Desig_Project bl = new Desig_Project();
        if (flag_pass==true) {
            try {
                bl = desigProjectService.getDesig_ProjectDetail(Long.parseLong(sp_id),2);
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



    /***
     * 设计师项目状态改变
     * Desig_Project
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savedesigproject", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savedesigproject( HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String  sp_id = request.getParameter("sp_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        String  sp_status = request.getParameter("sp_status");
        String  sp_adminremark = request.getParameter("sp_adminremark");
        if(CommonUtil.isEmpty(sp_status)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("状态不能为空");
            flag_pass = false;
        }
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        }

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Desig_Project dd = new Desig_Project();
                dd.setSp_id(Long.valueOf(sp_id));
                dd.setSp_confirmid(Long.valueOf(sm_id));
                dd.setSp_confirmno(sm_no);
                dd.setSp_confirmdate(new Date());
                dd.setSp_status(Byte.valueOf(sp_status));
                if (!"".equals(sp_adminremark)&&sp_adminremark!=null){
                dd.setSp_adminremark(sp_adminremark);
                }
                int ii = desigProjectService.updateDesig_Project(dd);
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
     * 设计师需求审核列表展示
     * DesigV_Demand
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigvdemandbacklist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigvdemandbacklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<DesigV_Demand> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("dd_title", request.getParameter("dd_title"));//项目名称
            map.put("dd_cityname", request.getParameter("dd_cityname"));//所在城市
            map.put("dd_createno", request.getParameter("dd_createno"));//提交人
            if (!CommonUtil.isEmpty(request.getParameter("dd_signcode"))) {
                map.put("dd_signcode", Byte.valueOf(request.getParameter("dd_signcode")));//项目状态,其实就是活动状态
            }
            if (!CommonUtil.isEmpty(request.getParameter("dd_status"))) {
                map.put("dd_status", Byte.valueOf(request.getParameter("dd_status")));//审核状态
            }
                /*提交时间的查询*/
            map.put("dd_createdate1", CommonUtil.queryTime1(request.getParameter("dd_createdate1"), request.getParameter("dd_createdate2")));
            map.put("dd_createdate2", CommonUtil.queryTime2(request.getParameter("dd_createdate1"), request.getParameter("dd_createdate2")));
            //查询条件
            us = desigDemandService.getDesigV_DemandList(map);//
            page.setRowcount(desigDemandService.getCountDesigV_Demand(map));//
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


    /***
     * DesigV_Demand
     * 得到需求审核详细信息
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigvdemanddetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigvdemanddetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //dd_id
        String  dd_id = request.getParameter("dd_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(dd_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        DesigV_Demand bl = new DesigV_Demand();
        if (flag_pass==true) {
            try {
                bl = desigDemandService.getDesigV_DemandDetail(Long.parseLong(dd_id));
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


    /**
     * 设计师需求审核查看
     * DesigV_Demand
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigvdemanddetaillist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigvdemanddetaillist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String dd_id = request.getParameter("dd_id");
        if (CommonUtil.isEmpty(dd_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID参数不能为空");
            flag_pass = false;
        };
        List<DesigV_Demand> us = new ArrayList<>();
        //查询出版本列表
        if(flag_pass == true) try {
            AppPage page = new AppPage();
            page.setPageindex(request.getParameter("pageindex"));/*当前页*/
            page.setPagesize(request.getParameter("pagesize"));/*分页*/
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("pagestart", page.getPagestart());
            map.put("pagesize", page.getPagesize());

            map.put("dd_id",Long.valueOf(dd_id));
            us = desigDemandService.getDesigV_DemandList(map);//
            page.setRowcount(desigDemandService.getCountDesigV_Demand(map));//
            appResult.setPage(page);

            if (!CommonUtil.isNullOrEmpty(us) && us.size() > 0) {
                appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
            } else {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_FAIL);
            }
        } catch (Exception e) {
            //打印错误的日志
            logger.error(e.getMessage());
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
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

}

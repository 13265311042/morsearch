package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.*;
import com.morsearch.service.DesVHomeService;
import com.morsearch.service.LableListService;
import com.morsearch.service.PmArchivesService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.DesHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by zuoxiaochao on 2017/11/22.
 * 设计师首页分类
 */

@Controller("DesHomeController")
@RequestMapping("/des/")
public class DesHomeController extends BaseController{

    @Resource
    private DesVHomeService desVHomeService;

    @Resource
    private PmArchivesService pmArchivesService;

    @Resource
    private LableListService lableListService;

    /**
     * zuoxiaochao
     * DesigV_Home_Archives
     * 设计师首页文档
     * 设计师首页文档显示列表
     */
    @RequestMapping(value = "desigvhomearchiveslist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String desigvhomearchiveslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String dh_stopflag = request.getParameter("dh_stopflag");//停用状态
		/*处理逻辑 begin*/
        List<DesigV_Home_Archives> list=new ArrayList<DesigV_Home_Archives>();

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

                map.put("dh_stopflag",CommonUtil.read_dbbit(dh_stopflag));//停用状态的查询

                map.put("pa_title",request.getParameter("pa_title"));//标题
                map.put("pa_major",request.getParameter("pa_major"));//所属专业
                map.put("pa_style",request.getParameter("pa_style"));//产品类型
                map.put("pa_features",request.getParameter("pa_features"));//产品特性
                //建表日期的查询
                map.put("dh_createdate1",CommonUtil.queryTime1(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                map.put("dh_createdate2",CommonUtil.queryTime2(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                //修改日期的查询
                map.put("dh_updatedate1",CommonUtil.queryTime1(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
                map.put("dh_updatedate2",CommonUtil.queryTime2(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
			/*查询条件 end*/
                list=desVHomeService.getDesigV_Home_ArchivesList(map);
                page.setRowcount(desVHomeService.getDesigV_Home_ArchivesListCount(map));/*记录数*/
                appresult.setPage(page);
                if (!CommonUtil.isNullOrEmpty(list) && list.size() > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
		/*处理逻辑 end*/
		/*返回数据 begin*/
        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/

        rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }


    /**
     * zuoxiaochao
     * DesigV_Home_Brand
     * 设计师首页品牌
     * 设计师首页品牌显示列表
     */
    @RequestMapping(value = "desigvhomebrandlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String desigvhomebrandlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String dh_stopflag = request.getParameter("dh_stopflag");
		/*处理逻辑 begin*/
        List<DesigV_Home_Brand> list=new ArrayList<DesigV_Home_Brand>();

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

                map.put("dh_stopflag",CommonUtil.read_dbbit(dh_stopflag));//停用状态的查询
                map.put("bl_name",request.getParameter("bl_name"));//标签名称

                //建表日期的查询
                map.put("dh_createdate1",CommonUtil.queryTime1(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                map.put("dh_createdate2",CommonUtil.queryTime2(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                //修改日期的查询
                map.put("dh_updatedate1",CommonUtil.queryTime1(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
                map.put("dh_updatedate2",CommonUtil.queryTime2(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
			/*查询条件 end*/
                list=desVHomeService.getDesigV_Home_BrandList(map);
                page.setRowcount(desVHomeService.getDesigV_Home_BrandListCount(map));/*记录数*/
                appresult.setPage(page);
                if (!CommonUtil.isNullOrEmpty(list) && list.size() > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
		/*处理逻辑 end*/
		/*返回数据 begin*/

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }


    /**
     * zuoxiaochao
     * DesigV_Home_Majob
     * 设计师首页专业
     * 设计师首页专业显示列表
     */
    @RequestMapping(value = "desigvhomemajoblist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String desigvhomemajoblist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String dh_stopflag = request.getParameter("dh_stopflag");
		/*处理逻辑 begin*/
        List<DesigV_Home_Majob> list=new ArrayList<DesigV_Home_Majob>();

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

                map.put("dh_stopflag",CommonUtil.read_dbbit(dh_stopflag));//停用状态的查询
                map.put("bl_name",request.getParameter("bl_name"));//标签名称

                //建表日期的查询
                map.put("dh_createdate1",CommonUtil.queryTime1(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                map.put("dh_createdate2",CommonUtil.queryTime2(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                //修改日期的查询
                map.put("dh_updatedate1",CommonUtil.queryTime1(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
                map.put("dh_updatedate2",CommonUtil.queryTime2(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
			/*查询条件 end*/
                list=desVHomeService.getDesigV_Home_MajobList(map);
                page.setRowcount(desVHomeService.getDesigV_Home_MajobListCount(map));/*记录数*/
                appresult.setPage(page);
                if (!CommonUtil.isNullOrEmpty(list) && list.size() > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
		/*处理逻辑 end*/
		/*返回数据 begin*/

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }



    /**
     * zuoxiaochao
     * DesigV_Home_Sales
     * 设计师首页业务员
     * 设计师首页业务员显示列表
     */
    @RequestMapping(value = "desigvhomesaleslist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String desigvhomesaleslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String dh_stopflag = request.getParameter("dh_stopflag");
		/*处理逻辑 begin*/
        List<DesigV_Home_Sales> list=new ArrayList<DesigV_Home_Sales>();

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

                map.put("dh_stopflag",CommonUtil.read_dbbit(dh_stopflag));//停用状态的查询
                map.put("ue_personjob",request.getParameter("ue_personjob"));//个人职位
                map.put("ue_personmajor",request.getParameter("ue_personmajor"));//个人专业

                //建表日期的查询
                map.put("dh_createdate1",CommonUtil.queryTime1(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                map.put("dh_createdate2",CommonUtil.queryTime2(request.getParameter("dh_createdate1"),request.getParameter("dh_createdate2")));
                //修改日期的查询
                map.put("dh_updatedate1",CommonUtil.queryTime1(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
                map.put("dh_updatedate2",CommonUtil.queryTime2(request.getParameter("dh_updatedate1"),request.getParameter("dh_updatedate2")));
			/*查询条件 end*/
                list=desVHomeService.getDesigV_Home_SalesList(map);
                page.setRowcount(desVHomeService.getDesigV_Home_SalesListCount(map));/*记录数*/
                appresult.setPage(page);
                if (!CommonUtil.isNullOrEmpty(list) && list.size() > 0) {
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
		/*处理逻辑 end*/
		/*返回数据 begin*/

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }

    /**
     * 设计师首页分类添加 zuoxiaochao
     * Desig_Home
     */
    @RequestMapping(value = "adddesighome" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String adddesighome( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        /*页面传过来的参数begin*/
        String dh_type=request.getParameter("dh_type");// '分类:1.专业，2.文档,3.业务员,4.品牌',
        String dh_dyids = request.getParameter("dh_dyids");//对应ID,(必传)
        String dh_index  = request.getParameter("dh_index");//序号(可以传,可以不传)
        String dh_remark = request.getParameter("dh_remark");//备注(可以传,可以不传)
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
        /*页面传过来的参数end*/

        /*检查参数begin*/
        if (CommonUtil.isEmpty(dh_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分类不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(dh_dyids)&&flag_pass==true) {
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
                String[] split = dh_dyids.split(",");
                for (int i = 0; i < split.length; i++) {//循坏添加
                    Desig_Home dh = new Desig_Home();
                    dh.setDh_type(dh_type);//类型
                    dh.setDh_dyid(Long.valueOf(split[i]));//对应id
                    if (!CommonUtil.isEmpty(dh_index)){//序号
                        dh.setDh_index(Integer.valueOf(dh_index));
                    }
                    dh.setDh_remark(dh_remark);//备注
                    if(!CommonUtil.isEmpty(request.getParameter("dh_stopflag"))){//停用标志
                        dh.setDh_stopflag(CommonUtil.convert_boolean(request.getParameter("dh_stopflag")));
                    }
                    dh.setDh_createno(sm_no);//建表人员
                    dh.setDh_createdate(new Date());//建表日期
                    int ii=desVHomeService.addDesig_Home(dh);
                    if (ii==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*提示资料不存在*/
                }

/*                1.Majob专业，2.Archives文档,3.Sales业务员,4.Brand品牌*/
                if ("1".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_MAJOB); /*删除redis*/};
                if ("2".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_ARCHIVES); /*删除redis*/};
                if ("3".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_SALES); /*删除redis*/};
                if ("4".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_BRAND); /*删除redis*/};

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


    /**
     * 设计师首页分类删除
     * Desig_Home
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletedesighome" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletedesighome(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i;
        //*检查内容是否能过
        Boolean flag_pass=true;
        String sm_id = request.getParameter("sm_id");
        /*获得参数begin*/
        String  dh_id = request.getParameter("dh_id");
        if(CommonUtil.isEmpty(dh_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("首页ID不能为空");
            flag_pass = false;
        }
        String dh_type=request.getParameter("dh_type");// '分类:1.专业，2.文档,3.业务员,4.品牌',
        if (CommonUtil.isEmpty(dh_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分类不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }


        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = desVHomeService.deleteDesig_HomeById(Long.parseLong(dh_id));

/*                1.Majob专业，2.Archives文档,3.Sales业务员,4.Brand品牌*/
                if ("1".equals(dh_type)){redisService.removeMapRow(Constants.REDIS_DESHOME_MAJOB,dh_id); /*删除redis*/};
                if ("2".equals(dh_type)){redisService.removeMapRow(Constants.REDIS_DESHOME_ARCHIVES,dh_id); /*删除redis*/};
                if ("3".equals(dh_type)){redisService.removeMapRow(Constants.REDIS_DESHOME_SALES,dh_id); /*删除redis*/};
                if ("4".equals(dh_type)){redisService.removeMapRow(Constants.REDIS_DESHOME_BRAND,dh_id); /*删除redis*/};

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
     *读取设计师首页分类
     * Desig_Home
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesighomedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesighomedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取av_id
       String  dh_id = request.getParameter("dh_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(dh_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("dh_id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Desig_Home bv = new Desig_Home();
        if (flag_pass==true) {
            try {
                bv = desVHomeService.getDesig_Homedetail(Long.parseLong(dh_id));
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
    * Desig_Home修改保存
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savedesighome", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savedesighome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;
        String dh_id=request.getParameter("dh_id");
        String dh_dyid = request.getParameter("dh_dyid");//对应ID,(必传),这个是要修改的东西
        String dh_index  = request.getParameter("dh_index");//序号(可以传,可以不传)
        String dh_remark = request.getParameter("dh_remark");//备注(可以传,可以不传)
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

/*检查参数 begin*/
        /*检查参数begin*/
        if (CommonUtil.isEmpty(dh_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("首页ID不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(dh_dyid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("对应ID不能为空");
            flag_pass = false;
        };
        String dh_type=request.getParameter("dh_type");// '分类:1.专业，2.文档,3.业务员,4.品牌',
        if (CommonUtil.isEmpty(dh_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("分类不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }



/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Desig_Home dh = new Desig_Home();
                dh.setDh_id(Long.valueOf(dh_id));
                if(!CommonUtil.isEmpty(dh_dyid)){
                    dh.setDh_dyid(Long.valueOf(dh_dyid));//对应id
                }
                if (!CommonUtil.isEmpty(dh_index)){//序号
                    dh.setDh_index(Integer.valueOf(dh_index));
                }
                dh.setDh_updateno(sm_no);
                dh.setDh_updatedate(new Date());
                dh.setDh_remark(dh_remark);//备注
                if(!CommonUtil.isEmpty(request.getParameter("dh_stopflag"))){//停用标志
                    dh.setDh_stopflag(CommonUtil.convert_boolean(request.getParameter("dh_stopflag")));
                }
                int ii = desVHomeService.updateDesig_Home(dh);

/*                1.Majob专业，2.Archives文档,3.Sales业务员,4.Brand品牌*/
                if ("1".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_MAJOB); /*删除redis*/};
                if ("2".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_ARCHIVES); /*删除redis*/};
                if ("3".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_SALES); /*删除redis*/};
                if ("4".equals(dh_type)){redisService.deleteValue(Constants.REDIS_DESHOME_BRAND); /*删除redis*/};

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
     *查找出文档对应的所有的pa_id
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmarchivesidlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpmarchivesidlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

/*处理逻辑 begin*/
        List<Long> ids = new ArrayList<>();
        if (flag_pass==true) {
            try {
                ids = pmArchivesService.getPm_Archivesidlist();
                if (ids!=null){
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
        appresult.setData(ids);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     *查找出品牌对应的所有的bl_id
     * bl_type=1007
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getlablelist1idlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getlablelist1idlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String bl_type = request.getParameter("bl_type");
        Boolean flag_pass=true;

/*处理逻辑 begin*/
        List<Long> ids = new ArrayList<>();
        if (flag_pass==true) {
            try {
                ids = lableListService.getLableList1idlist(bl_type);
                if (ids!=null){
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
        appresult.setData(ids);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


/*获取设计师首页
leoli
2017.12.05
* */
   @IgnoreAuth
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdeshome", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdeshome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

/*检查参数 begin*/
/*
        if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };
*/

/*检查参数 end*/
/*处理数据 begin*/
        DesHome dh = new DesHome();
        int iisize=0;
     //   if (flag_pass==true)
        {
            try {

                dh.setPath_image_normal(commService.getSysConfigValue("path_image_normal"));/*源图片路径*/
                dh.setPath_image_small(commService.getSysConfigValue("path_image_small"));/*小图片路径*/

/*文档*/

                Map<String, String> mpa=redisService.getMapValue(Constants.REDIS_DESHOME_ARCHIVES);
                List<DesigV_Home_Archives_List> mpalist=new ArrayList<DesigV_Home_Archives_List>();
                if (mpa!=null&&mpa.size()>0){
                    for (String vv : mpa.values()) {
                        DesigV_Home_Archives_List dv= gson.fromJson(vv, DesigV_Home_Archives_List.class);
                        mpalist.add(dv);
                    }
                }else
                {
                    mpalist=desVHomeService.getDesHomePage_Archives();
                    iisize=mpalist.size();
                    mpa = new HashMap<>();
                    for(int ii=0;ii<iisize;ii++){
                        mpa.put((Long)mpalist.get(ii).getDh_id()+"",gson.toJson(mpalist.get(ii)));
                    };
                    redisService.saveMapValue(Constants.REDIS_DESHOME_ARCHIVES,mpa,0);
                };
                dh.setArchiveslist(mpalist);

/*品牌*/

                Map<String, String> mpb=redisService.getMapValue(Constants.REDIS_DESHOME_BRAND);
                List<DesigV_Home_Brand_List> mpblist=new ArrayList<DesigV_Home_Brand_List>();
                if (mpb!=null&&mpb.size()>0){
                    for (String vv : mpb.values()) {
                        DesigV_Home_Brand_List dv= gson.fromJson(vv, DesigV_Home_Brand_List.class);
                        mpblist.add(dv);
                    }

                }else
                {
                    mpblist=desVHomeService.getDesHomePage_Brand();
                    iisize=mpblist.size();
                    mpb = new HashMap<>();
                    for(int ii=0;ii<iisize;ii++){
                        mpb.put((Long)mpblist.get(ii).getDh_id()+"",gson.toJson(mpblist.get(ii)));
                    };
                    redisService.saveMapValue(Constants.REDIS_DESHOME_BRAND,mpb,0);
                };
                dh.setBrandlist(mpblist);


/*专业*/

                Map<String, String> mpm=redisService.getMapValue(Constants.REDIS_DESHOME_MAJOB);
                List<DesigV_Home_Majob_List> mpmlist=new ArrayList<DesigV_Home_Majob_List>();
                if (mpm!=null&&mpm.size()>0){
                    for (String vv : mpm.values()) {
                        DesigV_Home_Majob_List dv= gson.fromJson(vv, DesigV_Home_Majob_List.class);
                        mpmlist.add(dv);
                    }

                }else
                {
                    mpmlist=desVHomeService.getDesHomePage_Majob();
                    iisize=mpmlist.size();
                    mpm = new HashMap<>();
                    for(int ii=0;ii<iisize;ii++){
                        mpm.put((Long)mpmlist.get(ii).getDh_id()+"",gson.toJson(mpmlist.get(ii)));
                    };
                    redisService.saveMapValue(Constants.REDIS_DESHOME_MAJOB,mpm,0);
                };

                dh.setMajoblist(mpmlist);


/*业务员*/
                Map<String, String> mps=redisService.getMapValue(Constants.REDIS_DESHOME_SALES);
                List<DesigV_Home_Sales_List> mpslist=new ArrayList<DesigV_Home_Sales_List>();
                if (mps!=null&&mps.size()>0){
                    for (String vv : mps.values()) {
                        DesigV_Home_Sales_List dv= gson.fromJson(vv, DesigV_Home_Sales_List.class);
                        mpslist.add(dv);
                    }
                }else
                {
                    mpslist=desVHomeService.getDesHomePage_Sales();
                    iisize=mpslist.size();
                    mps = new HashMap<>();
                    for(int ii=0;ii<iisize;ii++){
                        mps.put((Long)mpslist.get(ii).getDh_id()+"",gson.toJson(mpslist.get(ii)));
                    };
                    redisService.saveMapValue(Constants.REDIS_DESHOME_SALES,mps,0);
                };
                dh.setSaleslist(mpslist);


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(e.getMessage());
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(dh);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



/*获取设计师首页--单个产品
leoli
2017.12.05
* */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdeshomespma", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdeshomespma(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String majob=request.getParameter("majob");
        Boolean flag_pass=true;
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(majob)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[majob]参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
        List<DesigV_Home_Archives_List> mpalist = new ArrayList<DesigV_Home_Archives_List>();
        if (flag_pass==true) {
            try {
                Map<String, String> mpa=redisService.getMapValue(Constants.REDIS_DESHOME_ARCHIVES);
                if (mpa!=null&&mpa.size()>0){
                    for (String vv : mpa.values()) {
                        DesigV_Home_Archives_List dv= gson.fromJson(vv, DesigV_Home_Archives_List.class);
                        if (majob.equals(dv.getPa_major())){mpalist.add(dv);};
                    }
                }


            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(mpalist);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



/*获取设计师首页--单个业务员
leoli
2017.12.05
* */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdeshomessale", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdeshomessale(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String majob=request.getParameter("majob");
        Boolean flag_pass=true;
/*检查参数 begin*/
        if (flag_pass==true&&(CommonUtil.isEmpty(majob)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[majob]参数不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理数据 begin*/
        List<DesigV_Home_Sales_List> mpslist = new ArrayList<DesigV_Home_Sales_List>();
        if (flag_pass==true) {
            try {
                Map<String, String> mps=redisService.getMapValue(Constants.REDIS_DESHOME_SALES);
                if (mps!=null&&mps.size()>0){
                    for (String vv : mps.values()) {
                        DesigV_Home_Sales_List dv= gson.fromJson(vv, DesigV_Home_Sales_List.class);
                        if (majob.equals(dv.getUe_personmajor())){mpslist.add(dv);};
                    }
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(mpslist);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



}

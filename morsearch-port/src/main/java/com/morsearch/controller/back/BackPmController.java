package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_Style;
import com.morsearch.service.*;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zuoxiaochao on 2017/11/8.
 */

@Controller("BackPmController")
@RequestMapping("/back/")
public class BackPmController extends BaseController{

    @Resource
    private PmArchivesService pmArchivesService;

    @Resource
    private PmFeaturesService pmFeaturesService;

    @Resource
    private PmStyleService pmStyleService;

    @Resource
    private ProductTypeService productTypeService;

    @Resource
    private LableListService lableListService;
    /**
     * 产品档案展示 zuoxiaochao
     * Pm_Ar
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmarchiveslist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpmarchiveslist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Pm_Archives> us = new ArrayList<>();
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
                map.put("pa_title",request.getParameter("pa_title"));//标题
                map.put("pa_major",request.getParameter("pa_major"));//专业
                map.put("pa_companyname",request.getParameter("pa_companyname"));//公司名称
                map.put("pa_filename",request.getParameter("pa_filename"));//文件名称
                //停用标识
                map.put("pa_flagstop",CommonUtil.read_dbbit(request.getParameter("pa_flagstop"))) ;
                //建表日期的查询

				/*注册日期的查询*/
                map.put("pa_createdate1",CommonUtil.queryTime1(request.getParameter("pa_createdate1"),request.getParameter("pa_createdate2")));
                map.put("pa_createdate2",CommonUtil.queryTime2(request.getParameter("pa_createdate1"),request.getParameter("pa_createdate2")));

                /*审核日期的查询*/
                map.put("pa_confirmdate1",CommonUtil.queryTime1(request.getParameter("pa_confirmdate1"),request.getParameter("pa_confirmdate2")));
                map.put("pa_confirmdate2",CommonUtil.queryTime2(request.getParameter("pa_confirmdate1"),request.getParameter("pa_confirmdate2")));
                //状态
                if(!CommonUtil.isEmpty(request.getParameter("pa_status"))){
                    map.put("pa_status",Byte.valueOf(request.getParameter("pa_status")));//状态
                }
                //查询条件
                us = pmArchivesService.getPm_ArchivesList(map);
                page.setRowcount(pmArchivesService.getCountPm_Archives(map));
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
     * @param request
     * zuoxiaochao
     *读取产品档案详细信息
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmarchivesdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpmarchivesdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取pm_id
        String pa_id = request.getParameter("pa_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(pa_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pa_id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Pm_Archives bv = new Pm_Archives();
        if (flag_pass==true) {
            try {
                bv = pmArchivesService.getPm_Archives1(Long.valueOf(pa_id));
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


    /***
     * @param request
     * zuoxiaochao
     *修改产品档案(主要是停用状态)
     * */

    @SuppressWarnings({ "unused", "null" })
        @RequestMapping(value = "updatepmarchives", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatepmarchives(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取pm_id
        String pa_id = request.getParameter("pa_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(pa_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pa_id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(request.getParameter("pa_flagstop"))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pa_flagstop不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/

        if (flag_pass==true) {
            try {
                Pm_Archives pm = new Pm_Archives();
                pm.setPa_id(Long.valueOf(pa_id));
                pm.setPa_confirmid(Long.valueOf(sm_id));
                pm.setPa_confirmno(sm_no);
                pm.setPa_confirmdate(new Date());
                if(!CommonUtil.isEmpty(request.getParameter("pa_flagstop"))){//得到停用信息
                    pm.setPa_flagstop(CommonUtil.convert_boolean(request.getParameter("pa_flagstop")));
                }
                int ii = pmArchivesService.updatePm_Archives(pm);
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
     * 产品特性列表 zuoxiaochao
     * Pm_Features
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmfeatureslist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getpmfeatureslist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Pm_Features> us = new ArrayList<>();
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
                map.put("pf_name",request.getParameter("pf_name"));//特性名称
                map.put("pf_stylename",request.getParameter("pf_stylename"));//类型名称
                map.put("pf_createno",request.getParameter("pf_createno"));//建表人员
                map.put("pf_updateno",request.getParameter("pf_updateno"));//修改人员
                //停用标识
                map.put("pf_stopflag",CommonUtil.read_dbbit(request.getParameter("pf_stopflag"))) ;

				/*建表日期的查询*/
                map.put("pf_createdate1",CommonUtil.queryTime1(request.getParameter("pf_createdate1"),request.getParameter("pf_createdate2")));
                map.put("pf_createdate2",CommonUtil.queryTime2(request.getParameter("pf_createdate1"),request.getParameter("pf_createdate2")));

				/*修改日期的查询*/
                map.put("pf_updatedate1",CommonUtil.queryTime1(request.getParameter("pf_updatedate1"),request.getParameter("pf_updatedate2")));
                map.put("pf_updatedate2",CommonUtil.queryTime2(request.getParameter("pf_updatedate1"),request.getParameter("pf_updatedate2")));
                //状态
                if(!CommonUtil.isEmpty(request.getParameter("pf_status"))){
                    map.put("pf_status",Byte.valueOf(request.getParameter("pf_status")));//状态
                }
                //查询条件end
                us = pmFeaturesService.getPm_FeaturesList(map);
                page.setRowcount(pmFeaturesService.getCountPm_Features(map));
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
     * 产品特性的添加
     *Pm_Features
     */
    @RequestMapping(value = "addpmfeatures", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String addpmfeatures(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass=true;

       String sm_id=request.getParameter("sm_id");
       String sm_no=request.getParameter("sm_no");
       String pf_name=request.getParameter("pf_name");//特性名称
       String pf_styleid=request.getParameter("pf_styleid");//类型id
       String pf_stylename=request.getParameter("pf_stylename");//类型名称
/*检查参数 begin*/
        if (CommonUtil.isEmpty(sm_id)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(pf_name)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("特性名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(pf_styleid)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("类型id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(pf_stylename)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("类型名称不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*检查重复名称*/
        if (flag_pass == true && (pf_name != null && !"".equals(pf_name))) {
            int iai = pmFeaturesService.getFeaturesListCount(Long.valueOf(pf_styleid),pf_name.trim());
            if (iai > 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("【" + pf_name + "】在当前类已存在");
                flag_pass = false;
            }
        }
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                int i = pmFeaturesService.getFeaturesListCount(Long.valueOf(pf_styleid),null);
                Pm_Features pf=new Pm_Features();
                pf.setPf_name(pf_name);
                pf.setPf_styleid(CommonUtil.convert_Long(pf_styleid));
                pf.setPf_stylename(pf_stylename);
                pf.setPf_index(i+1);
                pf.setPf_stopflag(CommonUtil.convert_boolean(request.getParameter("pf_stopflag")));
                pf.setPf_delflag(CommonUtil.convert_boolean(request.getParameter("pf_delflag")));
                pf.setPf_selectflag(CommonUtil.convert_boolean(request.getParameter("pf_selectflag")));
                pf.setPf_remark(request.getParameter("pf_remark"));
                pf.setPf_createno(sm_no);
                pf.setPf_createdate(new Date());
                pf.setPf_status(CommonUtil.convert_Byte(request.getParameter("pf_status")));

                int ii=pmFeaturesService.addPm_Features(pf);
                if (ii==0){appresult.setMessage(Constants.RESULT_ADD_FAIL);};
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

    /***
     * @param request
     * zuoxiaochao
     *读取产品特性详细信息
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmfeaturesdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpmfeaturesdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取pf_id
        String pf_id = request.getParameter("pf_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(pf_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pf_id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Pm_Features bv = new Pm_Features();
        if (flag_pass==true) {
            try {
                bv = pmFeaturesService.getPm_Features(Long.valueOf(pf_id));
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


    /***
     * @param request
     * zuoxiaochao
     *修改产品特性(主要是停用状态)
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "updatepmfeatures", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatepmfeatures(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取pm_id
        String pf_id = request.getParameter("pf_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(pf_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pf_id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(request.getParameter("pf_stopflag"))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pf_stopflag不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        }
/*检查参数 end*/
/*处理逻辑 begin*/

        if (flag_pass==true) {
            try {
                Pm_Features pf = new Pm_Features();
                pf.setPf_name(request.getParameter("pf_name"));
                pf.setPf_id(Long.valueOf(pf_id));
                pf.setPf_updateno(sm_no);
                pf.setPf_updatedate(new Date());
                if(!CommonUtil.isEmpty(request.getParameter("pf_stopflag"))){//得到停用信息
                    pf.setPf_stopflag(CommonUtil.convert_boolean(request.getParameter("pf_stopflag")));
                }
                int ii = pmFeaturesService.updatePm_Features(pf);
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
     * 产品类型列表 zuoxiaochao
     * Pm_Style
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmstylelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getpmstylelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Pm_Style> us = new ArrayList<>();
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

                map.put("ps_name",request.getParameter("ps_name"));//类型名称
                map.put("ps_majorname",request.getParameter("ps_majorname"));//专业名称
                map.put("ps_remark",request.getParameter("ps_remark"));//备注
                map.put("ps_createno",request.getParameter("ps_createno"));//建表人员
                map.put("ps_updateno",request.getParameter("ps_updateno"));//修改人员
                //停用标识
                map.put("ps_stopflag",CommonUtil.read_dbbit(request.getParameter("ps_stopflag"))) ;


				/*建表日期的查询*/
                map.put("ps_createdate1",CommonUtil.queryTime1(request.getParameter("ps_createdate1"),request.getParameter("ps_createdate2")));
                map.put("ps_createdate2",CommonUtil.queryTime2(request.getParameter("ps_createdate1"),request.getParameter("ps_createdate2")));

                /*修改日期的查询*/
                map.put("ps_updatedate1",CommonUtil.queryTime1(request.getParameter("ps_updatedate1"),request.getParameter("ps_updatedate2")));
                map.put("ps_updatedate2",CommonUtil.queryTime2(request.getParameter("ps_updatedate1"),request.getParameter("ps_updatedate2")));
                //状态
                if(!CommonUtil.isEmpty(request.getParameter("ps_status"))){
                    map.put("ps_status",Byte.valueOf(request.getParameter("ps_status")));//状态
                }
                //查询条件end
                us = pmStyleService.getPm_StyleList(map);
                page.setRowcount(pmStyleService.getCountPm_Style(map));
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
/*返回数据 end*/
        return null;
    }


    /***
     * 产品类型的添加
     *Pm_Style
     *
     *
     */
    @RequestMapping(value = "addpmstyle", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String addpmstyle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String sm_id=request.getParameter("sm_id");
        String sm_no=request.getParameter("sm_no");
        String ps_name=request.getParameter("ps_name");//类型名称
        String ps_majorid=request.getParameter("ps_majorid");//专业id
        String ps_majorname=request.getParameter("ps_majorname");//专业名称
/*检查参数 begin*/
        if (CommonUtil.isEmpty(sm_id)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ps_name)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("类型名称不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ps_majorid)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(ps_majorname)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("专业名称不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*检测名称重复*/
         /*检查名称重复*/
        if (flag_pass == true && (ps_name != null && !"".equals(ps_name))) {
            int iai = pmStyleService.getPmStylenamelist(Long.valueOf(ps_majorid),ps_name.trim());
            if (iai > 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("【" + ps_name + "】在当前类已存在");
                flag_pass = false;
            }
        }

/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                int i = productTypeService.getStyleListCount(Long.valueOf(ps_majorid), null);
                Pm_Style ps=new Pm_Style();
                ps.setPs_name(ps_name);
                ps.setPs_majorid(CommonUtil.convert_Long(ps_majorid));
                ps.setPs_majorname(ps_majorname);
                ps.setPs_index(i+1);
                ps.setPs_stopflag(CommonUtil.convert_boolean(request.getParameter("ps_stopflag")));
                ps.setPs_delflag(CommonUtil.convert_boolean(request.getParameter("ps_delflag")));
                ps.setPs_selectflag(CommonUtil.convert_boolean(request.getParameter("ps_selectflag")));
                ps.setPs_remark(request.getParameter("ps_remark"));
                ps.setPs_createno(sm_no);
                ps.setPs_createdate(new Date());
                ps.setPs_status(CommonUtil.convert_Byte(request.getParameter("ps_status")));

                int ii=pmStyleService.addPm_Style(ps);
                if (ii==0){appresult.setMessage(Constants.RESULT_ADD_FAIL);};
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


    /***
     * @param request
     * zuoxiaochao
     *读取产品类型详细信息
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmstyledetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpmstyledetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取ps_id
        String ps_id = request.getParameter("ps_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(ps_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ps_id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Pm_Style bv = new Pm_Style();
        if (flag_pass==true) {
            try {
                bv = pmStyleService.getPm_Style(Long.valueOf(ps_id));
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


    /***
     * @param request
     * zuoxiaochao
     *修改产品类型(主要是停用状态)
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "updatepmstyle", method ={RequestMethod.POST, RequestMethod.GET}, produces ={ "application/json;charset=UTF-8" })
    public String updatepmstyle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        Boolean flag_pass=true;
        String rs="";
        //获取ps_id
        String ps_id = request.getParameter("ps_id");
        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(ps_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ps_id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(request.getParameter("ps_stopflag"))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ps_stopflag不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("请登录");
            flag_pass = false;
        }


/*检查参数 end*/
/*处理逻辑 begin*/

        if (flag_pass==true) {
            try {
                Pm_Style ps = new Pm_Style();
                ps.setPs_name(request.getParameter("ps_name"));
                ps.setPs_id(Long.parseLong(ps_id));
                ps.setPs_updatedate(new Date());
                ps.setPs_updateno(sm_no);
                if(!CommonUtil.isEmpty(request.getParameter("ps_stopflag"))){//得到停用信息
                    ps.setPs_stopflag(CommonUtil.convert_boolean(request.getParameter("ps_stopflag")));
                }
                int ii = pmStyleService.updatePm_Style(ps);
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
     * 设计师首页产品档案添加查询(剩余id) zuoxiaochao
     * Pm_Ar
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpmarchiveslistid" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getpmarchiveslistid(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Pm_Archives> us = new ArrayList<>();
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
                us = pmArchivesService.getPm_ArchivesListid(map);
                page.setRowcount(pmArchivesService.getCountPm_Archivesid(map));
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
 * 得到类型的名称
 * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getstylename" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getstylename(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/

        List<Pm_Style> list = new ArrayList<>();
        List<Map> hostlist = new ArrayList<Map>();
        JSONArray resultStr = null;


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

                //查询条件end
                list = pmStyleService.getPm_StyleListname(map);
                page.setRowcount(pmStyleService.getCountPm_Style(map));
                appResult.setPage(page);

                for (int i = 0; i < list.size(); i++) {
                    Map<String, String> jsonMap = new HashMap<String, String>();
                    jsonMap.put("psid", (list.get(i).getPs_id().toString()));
                    jsonMap.put("psname", list.get(i).getPs_name());
                    hostlist.add(jsonMap);
                }
                resultStr = JSONArray.fromObject(hostlist);
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        out.print(resultStr);
        out.close();
        return null;
    }


    /**
     * 得到专业的名称
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getlablelistname" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getlablelistname(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/
        List<Base_LableList> list = new ArrayList<>();
        List<Map> hostlist = new ArrayList<Map>();

        JSONArray resultStr = null;
        if (flag_pass == true) {
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String, Object> map = new HashMap<String, Object>();
                 /*查询条件 begin*/
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());

                //查询条件end

                list = lableListService.getLableListname(map);
                page.setRowcount(lableListService.getCountlable(map));
                appResult.setPage(page);

                for (int i = 0; i < list.size(); i++) {
                    Map<String, String> jsonMap = new HashMap<String, String>();
                    jsonMap.put("blid", (list.get(i).getBl_id().toString()));
                    jsonMap.put("blname", list.get(i).getBl_name());
                    hostlist.add(jsonMap);
                }
                resultStr = JSONArray.fromObject(hostlist);

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
        /*end返回数据*/

        //处理数据格式
        out.print(resultStr);
        out.close();
        return null;
    }


    /**
     * 产品类型删除
     * Pm_style
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletepmstyle" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletepmstyle(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs="";
        int i;
        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String  ps_id = request.getParameter("ps_id");
        String  sm_id = request.getParameter("sm_id");
        if(CommonUtil.isEmpty(ps_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
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
                i = pmStyleService.deletePm_style(Long.parseLong(ps_id));

                if(i==1){
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
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 产品类型删除
     * Pm_feature
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletepmfeature" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletepmfeature(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs="";
        int i;
        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String  pf_id = request.getParameter("pf_id");
        String  sm_id = request.getParameter("sm_id");
        if(CommonUtil.isEmpty(pf_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
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
                i = pmFeaturesService.deletePm_feature (Long.parseLong(pf_id));

                if(i==1){
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
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

}

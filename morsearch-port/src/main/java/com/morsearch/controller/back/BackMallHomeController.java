package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.MallV_Home;
import com.morsearch.model.Mall_Home;
import com.morsearch.service.MallHomeService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by hyt on 2017/12/25.
 */
@Controller("BackMallHomeController")
@RequestMapping("/back/")
public class BackMallHomeController extends BaseController {

    @Resource
    private MallHomeService mallHomeService;



    //首页商品的新增
    /***
     * Mall_Home
     */

    @RequestMapping(value = "addmallhome" ,method ={RequestMethod.GET,RequestMethod.POST},produces = "text/html; charset=utf-8")
    public String addmallhome( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        //前端给这个type
        String mh_type = request.getParameter("mh_type");//类别：1.热门，2.品牌
        String mh_goodids = request.getParameter("mh_goodids");//对应ID,(必传),多个id添加

        String mh_remark = request.getParameter("mh_remark");//应该是备注吧
        String mh_stopflag = request.getParameter("mh_stopflag");//停用标志

        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

        /*检查参数begin*/
        if (CommonUtil.isEmpty(mh_type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("类别不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mh_goodids)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品id不能为空");
            flag_pass = false;
        };
        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                String[] split = mh_goodids.split(",");
                for (int i = 0; i < split.length; i++) {//循坏添加
                    Mall_Home mh = new Mall_Home();
                    mh.setMh_type(CommonUtil.convert_Byte(mh_type));
                    mh.setMh_goodid(CommonUtil.convert_Long(split[i]));
                    mh.setMh_index(CommonUtil.convert_Int(request.getParameter("mh_index")));
                    mh.setMh_remark(mh_remark);
                    mh.setMh_stopflag(CommonUtil.convert_boolean(mh_stopflag));
                    mh.setMh_createno(sm_no);
                    mh.setMh_createdate(new Date());
                    int ii=mallHomeService.addMall_Home(mh);
                    if (ii>0){
                        List<MallV_Home>  mvh=mallHomeService.getMallV_Home_show(1,mh.getMh_id());
                        redisService.saveMapRow(Constants.REDIS_MALL_HOME,mh.getMh_id()+"",gson.toJson(mvh.get(0)));/*存*/
                    }else{
                        appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*添加失败*/
                }
                //封装数据
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


    /***
     * MallV_Home列表
     */

    /**
     * 商城商品 zuoxiaochao
     * MallV_Home//商城商品有哪些,用来做商城首页热门物品的添加,这个主要是展示
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallvhomelist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallvhomelist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String mh_type = request.getParameter("mh_type");//这个是用来查询的
        List<MallV_Home> us = new ArrayList<>();
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

                map.put("mh_type",mh_type);//这个是用来查询首页的
                map.put("mh_stopflag",CommonUtil.read_dbbit(request.getParameter("mh_stopflag")));//停用标志,这个是用来条件查询

                map.put("mg_title",request.getParameter("mg_title"));//商品标题
                map.put("mg_subhead",request.getParameter("mg_subhead"));//小标题
                map.put("mg_statusname",request.getParameter("mg_statusname"));//状态
                //建表日期
                map.put("mh_createdate1", CommonUtil.queryTime1(request.getParameter("mh_createdate1"), request.getParameter("mh_createdate2")));//条件查询
                map.put("mh_createdate2", CommonUtil.queryTime2(request.getParameter("mh_createdate1"), request.getParameter("mh_createdate2")));
                /*修改日期的查询*/
                map.put("mh_updatedate1", CommonUtil.queryTime1(request.getParameter("mh_updatedate1"), request.getParameter("mh_updatedate2")));//条件查询
                map.put("mh_updatedate2", CommonUtil.queryTime2(request.getParameter("mh_updatedate1"), request.getParameter("mh_updatedate2")));
                //状态
                us = mallHomeService.getMallV_HomeList(map);
                page.setRowcount(mallHomeService.getCountMallV_Home(map));
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
     * 商城首页删除
     * Mall_Home(肯定是原始表)
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletemallhome" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletemallhome(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs="";
        int i;

        String sm_id = request.getParameter("sm_id");
        //*检查内容是否能过
        Boolean flag_pass=true;


        /*获得参数begin*/
        String  mh_id = request.getParameter("mh_id");//首页id
        if(CommonUtil.isEmpty(mh_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("首页ID不能为空");
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
                redisService.removeMapRow(Constants.REDIS_MALL_HOME,mh_id+"");/*存*/

                i =mallHomeService.deleteMall_HomeById(Long.parseLong(mh_id));
                if(i==1){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_DEL_SUCC);
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
    * Mall_Home修改
    * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savemallhome", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
    public String savemallhome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appResult=new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String mh_id=request.getParameter("mh_id");//首页id
        String mh_goodid = request.getParameter("mh_goodid");//对应ID,(必传),这个是要修改的东西
        String mh_type = request.getParameter("mh_type");

        String mh_index  = request.getParameter("mh_index");//序号(可以传,可以不传)
        String mh_remark = request.getParameter("mh_remark");//备注(可以传,可以不传)

        String mh_stopflag = request.getParameter("mh_stopflag");//停用标志

        String sm_id = request.getParameter("sm_id");
        String sm_no = request.getParameter("sm_no");

/*检查参数 begin*/
        /*检查参数begin*/
        if (CommonUtil.isEmpty(mh_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("首页ID不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mh_goodid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("对应ID不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        if (flag_pass==true) {
            try {
                Mall_Home mh = new Mall_Home();
                mh.setMh_id(CommonUtil.convert_Long(mh_id));
                mh.setMh_type(CommonUtil.convert_Byte(mh_type));
                mh.setMh_goodid(CommonUtil.convert_Long(mh_goodid));
                mh.setMh_index(CommonUtil.convert_Int(mh_index));
                mh.setMh_remark(mh_remark);
                mh.setMh_stopflag(CommonUtil.convert_boolean(mh_stopflag));
                mh.setMh_updateno(sm_no);
                mh.setMh_updatedate(new Date());

                int ii = mallHomeService.updateMall_Home(mh);
                if (ii>0){
                    List<MallV_Home>  mvh=mallHomeService.getMallV_Home_show(1,mh.getMh_id());
                    redisService.saveMapRow(Constants.REDIS_MALL_HOME,mh.getMh_id()+"",gson.toJson(mvh.get(0)));/*存*/
                }else{
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


    /***
     * @param request
     *读取商城首页详情
     * Mall_Home
     * */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallhomedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallhomedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取av_id
        String mh_id = request.getParameter("mh_id");
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(mh_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("主id不能为空");
            flag_pass = false;
        };

/*检查参数 end*/
/*处理逻辑 begin*/
        Mall_Home mh = new Mall_Home();
        if (flag_pass==true) {
            try {
                mh = mallHomeService.getMall_Homedetail(Long.parseLong(mh_id));
                if (mh!=null){
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
        appresult.setData(mh);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }
}

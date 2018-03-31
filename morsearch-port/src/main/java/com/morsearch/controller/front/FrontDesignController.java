package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.dao.Sys_UserMapper;
import com.morsearch.model.*;
import com.morsearch.service.*;
import com.morsearch.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;


@Controller("FrontDesignController")
@RequestMapping("/front/")

public class FrontDesignController extends BaseController {
    private String ur_id;/*用户表id*/

    @Resource
    private DesigDemandService desigDemandService;
    @Resource
    private DesignAssessService designAssessService;
    @Autowired
    private UserService userService;
    @Autowired
    private DesigEvaluateService desigEvaluateService;
    @Resource
    private OrderService orderService;
    @Resource
    private LableListService lableListService;

    @Resource
    private DesCollectService desCollectService;
    @Resource
    private DesVHomeService desVHomeService;
    /**
     *
     * 人员详情
     *<Ywh>
     */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpersondetails", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpersondetails()throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);

        String rs = "";
        Boolean flag_pass=true;/*检查是否能过*/
        String salerid = request.getParameter("salerid");
        String desigid = request.getParameter("desigid");

       /*检查参数*/
/*
        if (flag_pass==true && CommonUtil.isEmpty(salerid)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("salerid参数不能为空");
            flag_pass = false;
        };
*/

        if (flag_pass==true && CommonUtil.isEmpty(desigid)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("desigid参数不能为空");
            flag_pass = false;
        };

        UserPerson up = new UserPerson();
        if (flag_pass==true) {
            try {
                Desig_Demand desig_demand = desigDemandService.selectByPrimaryID(Long.valueOf(desigid));
                SysV_UserFull uf=userService.getUser_FullDetail(Long.parseLong(desigid),4);/*获取用户*/
                up.setDemand(desig_demand);
                up.setUserlist(uf);

                if (CommonUtil.isEmpty(salerid)==false){/*登录状态*/
                Sales_Collect_Psn psn =desCollectService.getSales_Collect_Psn(Long.valueOf(desigid),Long.valueOf(salerid));
                if (psn==null){
                    up.setCollection(0);
                }else{
                    up.setCollection(1);
                }

                List<Sales_Order> order=orderService.getOrderPsnDetail(Long.parseLong(salerid),Long.parseLong(desigid), (byte) 1, (byte) 0,1);
                if (order!=null&&order.size()>0){
                    up.setOrdernewno(order.get(0).getOf_no());
                    up.setOrdernewdate(order.get(0).getOf_dateorder());
                };
                };


                if (up==null) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
      /*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(up);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /**
     * 设计师评价
     *  <Ywh>
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesignassess", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesignassess(HttpServletRequest request, HttpServletResponse response)throws  Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);

        String rs = "";
        Boolean flag_pass=true;/*检查是否能过*/
        List<Desig_Evaluate> list=new ArrayList<>();
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
                map.put("de_designerid",request.getParameter("de_designerid"));
                map.put("de_appraiser",request.getParameter("de_appraiser"));
                map.put("de_contentvalue",request.getParameter("de_contentvalue"));
                map.put("de_contentgroup",request.getParameter("de_contentgroup"));
                map.put("de_contentgrade",request.getParameter("de_contentgrade"));
                map.put("de_appraiseimage",request.getParameter("de_appraiseimage"));
                map.put("de_createdate",request.getParameter("de_createdate")); //日期

			/*查询条件 end*/
                list=designAssessService.getDesigList(map);
                page.setRowcount(designAssessService.getDesigListCount(map));//*记录数*//*
                appresult.setPage(page);
                if (list==null){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                };

            } catch (Exception e) {
                logger.error(e.getMessage());

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
     * 业务员评论设计师
     * （ywh）
     *
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "addcomment", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String addcomment(HttpServletRequest request, HttpServletResponse response)throws  Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);

        String rs = "";
        Boolean flag_pass=true;/*检查是否能过*/
        String userid = request.getParameter("ur_id"); //业务员ID
        String  designerid = (request.getParameter("designerid"));      //设计师ID
       // Long l = Long.valueOf(designerid);
        /*检查参数*/
        if ((designerid==null || "".equals(designerid))&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID参数不能为空");
            flag_pass = false;
        };
        int anonymity =Integer.valueOf(request.getParameter("de_anonymity"));      //匿名评价
        String contentvalue = request.getParameter("contentvalue");   //评价内容
        String contentgrade = request.getParameter("contentgrade");   //评级级等
        String de_contentgroup = request.getParameter("de_contentgroup");//评价分类
        String orderno = request.getParameter("de_orderno"); //订单单号

        if ((CommonUtil.isEmpty(contentvalue)==true) &&(flag_pass==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评价内容不能为空");
            flag_pass = false;
        };
        if ((CommonUtil.isEmpty(contentgrade)==true) &&(flag_pass==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评级等级不能为空");
            flag_pass = false;
        };
        if ((CommonUtil.isEmpty(de_contentgroup)==true) &&(flag_pass==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("评级分类不能为空");
            flag_pass = false;
        };

        if ((CommonUtil.isEmpty(userid)==true) &&(flag_pass==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ur_id不能为空");
            flag_pass = false;
        };

        Sales_Order salesOrder = orderService.getOrderMemo(orderno,8);
        if (flag_pass==true&&salesOrder!=null&&CommonUtil.read_boolean(salesOrder.getOf_flagappraisesale()) ==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("此订单业务员已评价");
            flag_pass = false;
        };

/*
        Desig_Evaluate de = desigEvaluateService.getDesignEvaluateNo(orderno);
        if ((flag_pass==true)&&(de!=null)){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("已评价订单号");
            flag_pass = false;
        };
*/

        if (flag_pass==true){
           try{
               int idd = desigEvaluateService.addDesig_Evaluate(Long.valueOf(designerid),anonymity,contentvalue,contentgrade,de_contentgroup,orderno,Long.valueOf(userid));
               if (idd>0){
/*存入redis begin*/
               Sales_Order som = gson.fromJson(redisService.getMapRow(Constants.REDIS_ORDER_STATUS,orderno), Sales_Order.class);
               if (som==null){som=orderService.getOrderMemo(orderno,4);};
               som.setOf_flagappraisesale(true);
               som.setOf_dateappraisesale(new Date());
               redisService.saveMapRow(Constants.REDIS_ORDER_STATUS, orderno, gson.toJson(som));
/*存入redis end*/
               }else{
                   appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                   appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
               }

           }catch (Exception e) {
               logger.error(e.getMessage());
               appresult.setStatus(Constants.RESULT_STATUS_FAIL);
               appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
           }
        }

     /*处理数据 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /**
     *
     * 评价分类
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getclassify", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getclassify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/


        Contentgroup ct = new Contentgroup();
        if(flag_pass=true){
            try {
                List<Base_LableList> list = lableListService.getBl_name(2001+"");
                List<Base_LableList> list1 = lableListService.getBl_name(2002+"");
                ct.setList1(list);
                ct.setList2(list1);



            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        appresult.setData(ct);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

    /**
     *评论设计师资料
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getdesigmessage", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigmessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("userid"); //业务员ID
        String no = request.getParameter("orderno"); //订单号

        if (CommonUtil.isEmpty(id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id不能为空");
            flag_pass = false;

        };
        if (CommonUtil.isEmpty(no)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("id不能为空");
            flag_pass = false;
        };
        SysV_UserFull su = new SysV_UserFull();
        if(flag_pass=true){
            try {
                Sales_Order so = orderService.getOrderMemo(no, 7);
                su = userService.getUser_FullDetail(so.getOf_custid(), 7);
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appresult.setData(su);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 文档浏览次数
     * pa_count_browse
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "addpacountbrowse", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String addpacountbrowse(HttpServletRequest request, HttpServletResponse response)throws  Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);

        String rs = "";
        Boolean flag_pass=true;/*检查是否能过*/

        //传过来的文档pa_id,这个pa_id一定是表格里面要有的
        String pa_id = request.getParameter("pa_id");

        if(CommonUtil.isEmpty(pa_id)&&flag_pass==true){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("pa_id不能为空");
            flag_pass = false;
        }
        if (flag_pass==true){
            try{
                //查出这个对象
                int i=  desigEvaluateService.insertcountByPm_Archives(Long.parseLong(pa_id));
                if (i>0){
                    /*增加redis的浏览次数 Leo begin*/
                    Long hid=desVHomeService.getDesHomePage_Archives_homeid(Long.parseLong(pa_id));
                    String vv=redisService.getMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"");
                    DesigV_Home_Archives_List hal= gson.fromJson(vv, DesigV_Home_Archives_List.class);
                    if (hal!=null){
                        hal.setPa_count_browse(CommonUtil.read_int(hal.getPa_count_browse())+1);
                        redisService.saveMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"",gson.toJson(hal));
                    };
                    /*增加redis的浏览次数 Leo end*/
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage("浏览次数加1");
                };
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }

     /*处理数据 end*/
/*返回数据 begin*/
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 设计师收藏文档列表 zuoxiaochao
     * DesigV_Collect_Pm
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigvcollectpmlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigvcollectpmlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        String dm_createid = request.getParameter("dm_createid");
        Boolean flag_pass=true;/*检查内容是否能过*/

        if(CommonUtil.isEmpty(dm_createid)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("dm_createid不能为空");
            flag_pass = false;
        }
        List<DesigV_Collect_Pm> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("dm_createid",Long.valueOf(dm_createid));

                DesigV_Collect_Pm dcp = new DesigV_Collect_Pm();
                //查询条件
                us =desCollectService.getDesigV_Collect_PmList(map);
                page.setRowcount(desCollectService.getCountDesigV_Collect_Pm(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appResult.setData(us);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 设计师收藏人员列表 zuoxiaochao
     * DesigV_Collect_Psn
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getdesigvcollectpsnlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigvcollectpsnlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String ds_createid = request.getParameter("ds_createid");
        if(CommonUtil.isEmpty(ds_createid)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ds_createid不能为空");
            flag_pass = false;
        }
        List<DesigV_Collect_Psn> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("ds_createid", Long.valueOf(ds_createid));

                DesigV_Collect_Psn dcp = new DesigV_Collect_Psn();
                //查询条件
                us =desCollectService.getDesigV_Collect_PsnList(map);
                page.setRowcount(desCollectService.getCountDesigV_Collect_Psn(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appResult.setData(us);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 业务员收藏文档列表展示 zuoxiaochao
     * SalesV_Collect_Pm
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesvcollectpmlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalesvcollectpmlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        String sm_createid = request.getParameter("sm_createid");
        Boolean flag_pass=true;/*检查内容是否能过*/

        if(CommonUtil.isEmpty(sm_createid)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("sm_createid不能为空");
            flag_pass = false;
        }
        List<SalesV_Collect_Pm> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("sm_createid",Long.valueOf(sm_createid));

                SalesV_Collect_Pm dcp = new SalesV_Collect_Pm();
                //查询条件
                us =desCollectService.getSalesV_Collect_PmList(map);
                page.setRowcount(desCollectService.getCountSalesV_Collect_Pm(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appResult.setData(us);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 业务员收藏设计师列表展示 zuoxiaochao
     * SalesV_Collect_Psn
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalesvcollectpsnlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalesvcollectpsnlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        String ss_createid = request.getParameter("ss_createid");
        Boolean flag_pass=true;/*检查内容是否能过*/

        if(CommonUtil.isEmpty(ss_createid)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ss_createid不能为空");
            flag_pass = false;
        }
        List<SalesV_Collect_Psn> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/

                Map<String,Object> map=new HashMap<String,Object>();
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                map.put("ss_createid",Long.valueOf(ss_createid));

                SalesV_Collect_Psn dcp = new SalesV_Collect_Psn();
                //查询条件
                us =desCollectService.getSalesV_Collect_PsnList(map);
                page.setRowcount(desCollectService.getCountSalesV_Collect_Psn(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        appResult.setData(us);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }
}




package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.DesCollectService;
import com.morsearch.service.DesVHomeService;
import com.morsearch.service.PmArchivesService;
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
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by zuoxiaochao on 2017/11/14.
 * 关于收藏的类
 */
@Controller("DesCollectController")
@RequestMapping("/des/")
public class DesCollectController extends BaseController{

    @Resource
    private DesCollectService desCollectService;
    @Resource
    private DesVHomeService desVHomeService;
    @Resource
    private CommService commService;

    @Resource
    private PmArchivesService pmarchivesservice;


    /**
     * zuoxiaochao
     * Desig_Collect_Pm
     * 设计师收藏文档
     */
    //getdesigcollectpm
    @RequestMapping(value = "adddesigcollectpm" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String adddesigcollectpm( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/


        String type = request.getParameter("type");//是否收藏的参数
        String documentid=request.getParameter("documentid");//文档id
        String designerid=request.getParameter("designerid");//设计师id
           /*检查参数begin*/
         /*页面传过来的参数begin*/
        if (CommonUtil.isEmpty(type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("是否收藏不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(documentid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文档id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("设计师id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                 /*检查参数end*/
                if("1".equals(type)) {//这个就要收藏,添加记录
                    int i=desCollectService.countDesig_Collect_PmByDm_archivesid(
                            Long.parseLong(documentid),Long.parseLong(designerid));
                    //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                    if (i>0) {
                        //如果存在,不做任何处理
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage("资料已经存在");
                    } else {
                        //如果不存在,那就添加
                        Desig_Collect_Pm dcp = new Desig_Collect_Pm();
                        dcp.setDm_archivesid( Long.parseLong(documentid));//文档id
                        dcp.setDm_createid(Long.parseLong(designerid));//设计师id

                        //根据设计师id查出设计师的账号
                        String dm_createno = commService.getDm_createno(Long.parseLong(designerid));
                        dcp.setDm_createno(dm_createno);//制表人员
                        dcp.setDm_createdate(new Date());//收藏日期
                        int ii = desCollectService.addDesig_Collect_Pm(dcp);
                        if (ii >0) {

/*LeoLi 增加谁对我感兴趣 begin*/
                            Pm_Archives ads=pmarchivesservice.getArchivesDetail(Long.parseLong(documentid),4);
                            if (ads!=null){
                                Long salesmanid=ads.getPa_createid();
                                Sales_Interest lm=new Sales_Interest();
                                lm.setSi_salesmanid(salesmanid);
                                lm.setSi_desginerid(Long.valueOf(designerid));
                                lm.setSi_createdate(new Date()); /*保存最新日期*/
                                lm.setSi_pmid(dcp.getDm_archivesid());
                                lm.setSi_pmtitle(ads.getPa_title());/*获取档案title*/
                                String skey="SalesInterest"+DateTimeUtil.getStrFormat(new Date(),"yyyyMMdd")+"."+salesmanid+"."+designerid;/*key值*/
                                int iadd=0;
                                String svalue=redisService.getStringValue(skey);
                                if (svalue==null){
                                    iadd=messageService.addSalesInterest(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,designerid,"name.job"));
                                }else{
                                    lm.setSi_id(Long.parseLong(svalue));/*读取ID*/
                                    iadd=messageService.updateSalesInterest(lm,commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,designerid,"name.job"));
                                };
                                redisService.saveStringValue(skey,lm.getSi_id()+"",60*60*24);/*保留24小时*/
                            };
/*LeoLi 增加谁对我感兴趣 end*/

                    /*增加redis的浏览次数 Leo begin*/
                            Long hid=desVHomeService.getDesHomePage_Archives_homeid(Long.parseLong(documentid));
                            String vv=redisService.getMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"");
                            DesigV_Home_Archives_List hal= gson.fromJson(vv, DesigV_Home_Archives_List.class);
                            if (hal!=null){
                                hal.setPa_count_collect(CommonUtil.read_int(hal.getPa_count_collect())+1);
                                redisService.saveMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"",gson.toJson(hal));
                            };
                    /*增加redis的浏览次数 Leo end*/
                        }
                    }
                }
                if("0".equals(type)){//这个就不用收藏,删除记录
                    //查找到这个对象,然后删除这个对象即可
                    int ii = desCollectService.deleteDesig_Collect_PmByDm_archivesid(
                            Long.parseLong(documentid),Long.parseLong(designerid));
                    if (ii>0) {
                    /*增加redis的浏览次数 Leo begin*/
                        Long hid=desVHomeService.getDesHomePage_Archives_homeid(Long.parseLong(documentid));
                        String vv=redisService.getMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"");
                        DesigV_Home_Archives_List hal= gson.fromJson(vv, DesigV_Home_Archives_List.class);
                        if (hal!=null){
                            hal.setPa_count_collect(CommonUtil.read_int(hal.getPa_count_collect())-1);
                            if (CommonUtil.read_int(hal.getPa_count_collect())<0){hal.setPa_count_collect(0);};
                            redisService.saveMapRow(Constants.REDIS_DESHOME_ARCHIVES,hid+"",gson.toJson(hal));
                        };
                    /*增加redis的浏览次数 Leo end*/
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage(Constants.RESULT_DEL_SUCC);
                        /*资料删除成功*/
                    }
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }



        /**
         * 收藏zuoxiaochao
         * 设计师收藏业务员
         * Desig_Collect_Psn
         */
        @RequestMapping(value = "adddesigcollectpsn" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
        public String adddesigcollectpsn( HttpServletRequest request, HttpServletResponse response) throws Exception{
            PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
            //设置几个默认的状态
            AppResult appResult = new AppResult();
            appResult.setStatus(Constants.RESULT_STATUS_SUCC);
            appResult.setMessage(Constants.RESULT_ADD_SUCC);
            String rs="";
            Boolean flag_pass=true;/*检查内容是否能过*/

            String type = request.getParameter("type");//是否收藏的参数
            String salerid=request.getParameter("salerid");//业务员id
            String designerid=request.getParameter("designerid");//设计师id
           /*检查参数begin*/
           /*页面传过来的参数begin*/
            if (CommonUtil.isEmpty(type)&&flag_pass==true) {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage("是否收藏不能为空");
                flag_pass = false;
            };

            if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage("业务员id不能为空");
                flag_pass = false;
            };
            if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage("设计师id不能为空");
                flag_pass = false;
            };

            /*begin处理数据*/
            if(flag_pass == true){
                try {
                 /*检查参数end*/
                    if("1".equals(type)) {//这个就要收藏,添加记录

                        //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                        int i=desCollectService.countDesig_Collect_PsnByDm_archivesid(
                                Long.parseLong(salerid),Long.parseLong(designerid));
                        if (i > 0) {
                            //如果存在,不做任何处理
                            appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                            appResult.setMessage("资料已经存在");
                        } else {
                            //如果不存在,那就添加
                            Desig_Collect_Psn dcp = new Desig_Collect_Psn();
                            dcp.setDs_salerid(Long.parseLong(salerid));//业务员id
                            dcp.setDs_createid(Long.parseLong(designerid));//设计师id
                            //根据设计师id查询出设计师的昵称
                            String ds_createno = commService.getDm_createno(Long.parseLong(designerid));
                            dcp.setDs_createno(ds_createno);//制表人员
                            dcp.setDs_createdate(new Date());//收藏日期
                            int ii = desCollectService.addDesig_Collect_Psn(dcp);
                            if (ii == 0) {
                                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                                appResult.setMessage(Constants.RESULT_ADD_FAIL);
                                /*添加失败*/
                            }
                        }
                    }
                    if("0".equals(type)){//这个就不用收藏,删除记录
                        //查找到这个对象,然后删除这个对象即可
                        int ii = desCollectService.deleteDesig_Collect_PsnByByDs_salerid(
                                Long.parseLong(salerid),Long.parseLong(designerid));
                        if (ii == 1) {
                            appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                            appResult.setMessage(Constants.RESULT_DEL_SUCC);
                            /*资料删除成功*/
                        }
                    }
                } catch (Exception e) {
                    //打印错误的日志
                    logger.error(e.getMessage());
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
                }
            }
            rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
            out.print(rs);
            out.close();
            return null;
        }


    /**
     * 收藏zuoxiaochao
     * Sales_Collect_Pm
     * 业务员收藏文档
     */
    @RequestMapping(value = "addsalescollectpm" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String addsalescollectpm( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/


        String type = request.getParameter("type");//是否收藏的参数
        String documentid=request.getParameter("documentid");//文档id
        String salerid=request.getParameter("salerid");//业务员id
           /*检查参数begin*/
         /*页面传过来的参数begin*/
        if (CommonUtil.isEmpty(type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("是否收藏不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(documentid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文档id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("业务员id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                 /*检查参数end*/
                if("1".equals(type)) {//这个就要收藏,添加记录
                    //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                    int i = desCollectService.countSales_Collect_PmBySm_archivesid(
                            Long.parseLong(documentid),Long.parseLong(salerid));
                    if (i > 0) {
                        //如果存在,不做任何处理
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage("资料已经存在");
                    } else {
                        //如果不存在,那就添加
                        Sales_Collect_Pm dcp = new Sales_Collect_Pm();
                        dcp.setSm_archivesid( Long.parseLong(documentid));//文档id
                        dcp.setSm_createid(Long.parseLong(salerid));//业务员id

                        //根据业务员id查询出业务员的昵称
                        String dm_createno = commService.getDm_createno(Long.parseLong(salerid));
                        dcp.setSm_createno(dm_createno);//制表人员
                        dcp.setSm_createdate(new Date());//收藏日期
                        int ii = desCollectService.addSales_Collect_Pm(dcp);
                        if (ii == 0) {
                            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appResult.setMessage(Constants.RESULT_ADD_FAIL);
                            /*添加失败*/
                        }
                    }
                }
                if("0".equals(type)){//这个就不用收藏,删除记录
                    //查找到这个对象,然后删除这个对象即可
                    int ii = desCollectService.deleteSales_Collect_PmBySm_archivesid(
                            Long.parseLong(documentid),Long.parseLong(salerid));
                    if (ii == 1) {
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage(Constants.RESULT_DEL_SUCC);
                            /*资料删除成功*/
                    }
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 业务员收藏设计师zuoxiaochao
     * Sales_Collect_Psn
     */
    @RequestMapping(value = "addsalescollectpsn" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String addsalescollectpsn( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/


        String type = request.getParameter("type");//是否收藏的参数
        String designerid=request.getParameter("designerid");
        String salerid=request.getParameter("salerid");
           /*检查参数begin*/
         /*页面传过来的参数begin*/
        if (CommonUtil.isEmpty(type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("是否收藏不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("设计师id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("业务员id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                 /*检查参数end*/
                if("1".equals(type)) {//这个就要收藏,添加记录
                    //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                    int i = desCollectService.countSales_Collect_PsnBySales_designerid(
                            Long.parseLong(designerid),Long.parseLong(salerid));
                    if (i > 0) {
                        //如果存在,不做任何处理
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage("资料已经存在");
                    } else {
                        //如果不存在,那就添加
                        Sales_Collect_Psn dcp = new Sales_Collect_Psn();
                        dcp.setSs_designerid(Long.parseLong(designerid));//设计师id
                        dcp.setSs_createid(Long.parseLong(salerid));//业务员id

                        //根据业务员id查询出业务员的昵称
                        String dm_createno = commService.getDm_createno(Long.parseLong(salerid));
                        dcp.setSs_createno(dm_createno);//制表人员
                        dcp.setSs_createdate(new Date());//收藏日期
                        int ii = desCollectService.addSales_Collect_Psn(dcp);
                        if (ii == 0) {
                            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appResult.setMessage(Constants.RESULT_ADD_FAIL);
                            /*添加失败*/
                        }
                    }
                }
                if("0".equals(type)){//这个就不用收藏,删除记录
                    //查找到这个对象,然后删除这个对象即可
                    int ii = desCollectService.deleteSales_Collect_PsnBySs_designerid(
                            Long.parseLong(designerid), Long.parseLong(salerid));
                    if (ii == 1) {
                        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                        appResult.setMessage(Constants.RESULT_DEL_SUCC);
                            /*资料删除成功*/
                    }
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * zuoxiaochao
     * Desig_Collect_Pm
     * 设计师是否收藏了文档,如果收藏了显示1,没有收藏显示0
     */
    @RequestMapping(value = "getdesigcollectpm" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String getdesigcollectpm( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);//资料获取成功
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/


        String documentid=request.getParameter("documentid");//文档id
        String designerid=request.getParameter("designerid");//设计师id
        /*页面传过来的参数begin*/

        if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("设计师id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(documentid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文档id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {

                int i=desCollectService.selectDesig_Collect_PmByDm_archivesid1(
                        Long.parseLong(documentid),Long.parseLong(designerid));
                //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                if (i > 0) {
                    //如果存在,不做任何处理
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料已经收藏");
                    appResult.setData(1);
                } else {
                    //如果不存在
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料未收藏");
                    appResult.setData(0);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());//打印错误的日志
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * zuoxiaochao
     * Desig_Collect_Psn
     * 设计师是否收藏了业务员,如果收藏了显示1,没有收藏显示0
     */
    @RequestMapping(value = "getdesigcollectpsn" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String getdesigcollectpsn( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);//资料获取成功
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/

        String salerid=request.getParameter("salerid");//业务员id
        String designerid=request.getParameter("designerid");//设计师id
        /*页面传过来的参数begin*/

        if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("设计师id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("业务员id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                int i = desCollectService.selectDesig_Collect_PsnByDs_salerid1(
                        Long.parseLong(salerid),Long.parseLong(designerid));
                //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                if (i > 0) {
                    //如果存在,不做任何处理
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料已经收藏");
                    appResult.setData(1);
                } else {
                    //如果不存在
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料未收藏");
                    appResult.setData(0);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());//打印错误的日志
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * zuoxiaochao
     * Sales_Collect_Pm
     * 业务员是否收藏了文档,如果收藏了显示1,没有收藏显示0
     */
    @RequestMapping(value = "getsalescollectpm" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String getsalescollectpm( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);//资料获取成功
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/


        String documentid=request.getParameter("documentid");//文档id
        String salerid=request.getParameter("salerid");//业务员id
        /*页面传过来的参数begin*/

        if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("业务员id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(documentid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("文档id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                int i = desCollectService.selectSales_Collect_PmBySm_archivesid1(
                        Long.parseLong(documentid), Long.parseLong(salerid));
                //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                if (i > 0) {
                    //如果存在,不做任何处理
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料已经收藏");
                    appResult.setData(1);
                } else {
                    //如果不存在
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料未收藏");
                    appResult.setData(0);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());//打印错误的日志
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * zuoxiaochao
     * Sales_Collect_Psn
     * 业务员是否收藏了业务员,如果收藏了显示1,没有收藏显示0
     */
    @RequestMapping(value = "getsalescollectpsn" ,method ={RequestMethod.GET,RequestMethod.POST}, produces = "text/html; charset=utf-8")
    public String getsalescollectpsn( HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);//资料获取成功
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        String designerid=request.getParameter("designerid");//设计师id
        String salerid=request.getParameter("salerid");//业务员id
        /*页面传过来的参数begin*/

        if (CommonUtil.isEmpty(salerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("业务员id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(designerid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("设计师id不能为空");
            flag_pass = false;
        };

        /*begin处理数据*/
        if(flag_pass == true){
            try {
               int i = desCollectService.selectSales_Collect_PsnBySales_designerid1(
                       Long.parseLong(designerid), Long.parseLong(salerid));
                //查看数据库中是否存在相同的文档id,也就是查看这个对象是否为空
                if (i > 0) {
                    //如果存在,不做任何处理
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料已经收藏");
                    appResult.setData(1);
                } else {
                    //如果不存在
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("资料未收藏");
                    appResult.setData(0);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());//打印错误的日志
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
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

        Boolean flag_pass=true;/*检查内容是否能过*/
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

                if(!CommonUtil.isEmpty(request.getParameter("dm_archivesid"))){//文档ID
                   map.put("dm_archivesid",Long.valueOf(request.getParameter("dm_archivesid"))) ;
                }
                if(!CommonUtil.isEmpty(request.getParameter("dm_createid"))){//设计师ID
                    map.put("dm_createid",Long.valueOf(request.getParameter("dm_createid"))) ;
                }
                map.put("dm_createno",request.getParameter("dm_createno"));//制表人员
                map.put("pa_title",request.getParameter("pa_title"));//标题
              /*  map.put("pa_userid",request.getParameter("pa_userid"));//*/
                map.put("pa_username",request.getParameter("pa_username"));//昵称

				/*收藏日期的查询*/
                map.put("dm_createdate1",CommonUtil.queryTime1(request.getParameter("dm_createdate1"),request.getParameter("dm_createdate2")));
                map.put("dm_createdate2",CommonUtil.queryTime2(request.getParameter("dm_createdate1"),request.getParameter("dm_createdate2")));
                DesigV_Collect_Pm dcp = new DesigV_Collect_Pm();
                //查询条件
                us =desCollectService.getDesigV_Collect_PmList(map);
                page.setRowcount(desCollectService.getCountDesigV_Collect_Pm(map));
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

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
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

                if(!CommonUtil.isEmpty(request.getParameter("ds_salerid"))){//业务员ID
                    map.put("ds_salerid",Long.valueOf(request.getParameter("ds_salerid"))) ;
                }
                if(!CommonUtil.isEmpty(request.getParameter("ds_createid"))){//设计师ID
                    map.put("ds_createid",Long.valueOf(request.getParameter("ds_createid"))) ;
                }
                map.put("ds_createno",request.getParameter("ds_createno"));//制表人员
                map.put("ur_namenick",request.getParameter("ur_namenick"));//呢称

				/*收藏日期的查询*/
                map.put("ds_createdate1",CommonUtil.queryTime1(request.getParameter("ds_createdate1"),request.getParameter("ds_createdate2")));
                map.put("ds_createdate2",CommonUtil.queryTime2(request.getParameter("ds_createdate1"),request.getParameter("ds_createdate2")));
                DesigV_Collect_Psn dcp = new DesigV_Collect_Psn();
                //查询条件
                us =desCollectService.getDesigV_Collect_PsnList(map);
                page.setRowcount(desCollectService.getCountDesigV_Collect_Psn(map));
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

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }


    /**
     * 业务员收藏文档列表 zuoxiaochao
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

        Boolean flag_pass=true;/*检查内容是否能过*/
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

                if(!CommonUtil.isEmpty(request.getParameter("sm_archivesid"))){//文档ID
                    map.put("sm_archivesid",Long.valueOf(request.getParameter("sm_archivesid"))) ;
                }
                if(!CommonUtil.isEmpty(request.getParameter("sm_createid"))){//设计师ID
                    map.put("sm_createid",Long.valueOf(request.getParameter("sm_createid"))) ;
                }
                map.put("sm_createno",request.getParameter("sm_createno"));//制表人员
                map.put("pa_title",request.getParameter("pa_title"));//标题
                map.put("pa_createno",request.getParameter("pa_createno"));//建表账号


				/*收藏日期的查询*/
                map.put("sm_createdate1",CommonUtil.queryTime1(request.getParameter("sm_createdate1"),request.getParameter("sm_createdate2")));
                map.put("sm_createdate2",CommonUtil.queryTime2(request.getParameter("sm_createdate1"),request.getParameter("sm_createdate2")));

                SalesV_Collect_Pm dcp = new SalesV_Collect_Pm();
                //查询条件
                us =desCollectService.getSalesV_Collect_PmList(map);
                page.setRowcount(desCollectService.getCountSalesV_Collect_Pm(map));
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

        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 业务员收藏人员列表 zuoxiaochao
     * SalesV_Collect_Psn
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsalescollectpsnlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsalescollectpsnlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
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

                if(!CommonUtil.isEmpty(request.getParameter("ss_designerid"))){//业务员ID
                    map.put("ss_designerid",Long.valueOf(request.getParameter("ss_designerid"))) ;
                }
                if(!CommonUtil.isEmpty(request.getParameter("ss_createid"))){//设计师ID
                    map.put("ss_createid",Long.valueOf(request.getParameter("ss_createid"))) ;
                }
                map.put("ss_createno",request.getParameter("ss_createno"));//制表人员
                map.put("ur_namenick",request.getParameter("ur_namenick"));//呢称
                /*关于时间的查询*/
                map.put("ss_createdate1",CommonUtil.queryTime1(request.getParameter("ss_createdate1"),request.getParameter("ss_createdate2")));
                map.put("ss_createdate2",CommonUtil.queryTime2(request.getParameter("ss_createdate1"),request.getParameter("ss_createdate2")));
                SalesV_Collect_Psn scp = new SalesV_Collect_Psn();
                //查询条件
                us =desCollectService.getSalesV_Collect_PsnList(map);
                page.setRowcount(desCollectService.getCountSalesV_Collect_Psn(map));
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
        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        out.print(rs);
        out.close();
        return null;
    }
}

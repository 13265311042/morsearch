package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Acc_Largess;
import com.morsearch.service.AccLargessService;
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
 * Created by ywh on 2017-11-30.
 */

@Controller("BackAccLargessController")
@RequestMapping("/back/")
public class BackAccLargessController extends BaseController {


    @Resource
    private AccLargessService accLargessService;

    /**
     *
     * 赠送条件列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getgrantconditionslist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getgrantconditionslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        List<Acc_Largess> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                //      map.put("pagestart",page.getPagestart());

                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());

                map.put("al_type",request.getParameter("al_type"));
                map.put("al_team",request.getParameter("al_team"));
                map.put("al_datebegin",request.getParameter("al_datebegin"));
                map.put("al_flagstop",CommonUtil.read_dbbit(request.getParameter("al_flagstop")));

				/*注册日期的查询*/
               // map.put("ur_register_date1",CommonUtil.queryTime1(request.getParameter("ur_register_date1"),request.getParameter("ur_register_date2")));
              //  map.put("ur_register_date2",CommonUtil.queryTime2(request.getParameter("ur_register_date1"),request.getParameter("ur_register_date2")));

				/*登陆日期的查询*/
               // map.put("ur_login_date1",CommonUtil.queryTime1(request.getParameter("ur_login_date1"),request.getParameter("ur_login_date2")));
               // map.put("ur_login_date2",CommonUtil.queryTime2(request.getParameter("ur_login_date1"),request.getParameter("ur_login_date2")));
                //查询条件
                us = accLargessService.getAcc_LargessList(map);
                page.setRowcount(accLargessService.getCountAcc_Largess(map));
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

    /**
     *
     *修改赠送条件
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getgrantconditions", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getgrantconditions(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String id = request.getParameter("al_id");
        if (CommonUtil.isEmpty(id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };

        Acc_Largess al = new Acc_Largess();
        if (flag_pass==true) {
            try{
                Acc_Largess  all = accLargessService.getAcc_Largess(Long.valueOf(id));
                appResult.setData(all);
        }catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
}

    /**
     * 增加赠送条件
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "addgrantconditions", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String addgrantconditions(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/

        String id = request.getParameter("createid");
        String createno = request.getParameter("createno");
        String type = request.getParameter("type");
        String team = request.getParameter("team");
        String datebegin = request.getParameter("datebegin");
        String dateend = request.getParameter("dateend");
        String valuemin = request.getParameter("valuemin");
        String valuemax = request.getParameter("valuemax");
        String addmode = request.getParameter("addmode");
        String addbase = request.getParameter("addbase");
        String addcoinqty = request.getParameter("addcoinqty");
        String addamount = request.getParameter("addamount");
        String addintegral = request.getParameter("addintegral");
        String flagstop = request.getParameter("flagstop");
        String remark = request.getParameter("remark");
        if (CommonUtil.isEmpty(id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(createno)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("createno不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(addmode)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("addmode不能为空");
            flag_pass = false;
        };

        if (flag_pass==true){
            try{
                Acc_Largess al = new Acc_Largess();
                al.setAl_type(type);
                al.setAl_team(team);
                al.setAl_datebegin(datebegin);
                al.setAl_dateend(dateend);
                al.setAl_valuemax(Integer.valueOf(valuemax));
                al.setAl_valuemin(Integer.valueOf(valuemin));
                al.setAl_addmode(Byte.parseByte(addmode));
                al.setAl_addbase(Integer.valueOf(addbase));
                al.setAl_addcoinqty(Integer.valueOf(addcoinqty));
                al.setAl_addamount(Integer.valueOf(addamount));
                al.setAl_addintegral(Integer.valueOf(addintegral));
                al.setAl_flagstop(Boolean.parseBoolean(flagstop));
                al.setAl_remark(remark);
                al.setBa_createid(Long.valueOf(id));
                al.setBa_createno(createno);
                al.setBa_createdate(new Date());
                accLargessService.insertSelective(al);

            }catch (Exception e) {
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

    /**
     *
     * 修改保存
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updategrantconditions", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String updategrantconditions(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String alid = request.getParameter("al_id");
        String id = request.getParameter("createid");
        String createno = request.getParameter("createno");
        String type = request.getParameter("al_type");
        String team = request.getParameter("al_team");
        String datebegin = request.getParameter("al_datebegin");
        String dateend = request.getParameter("al_dateend");
        String valuemin = request.getParameter("al_valuemin");
        String valuemax = request.getParameter("al_valuemax");
        String addmode = request.getParameter("al_addmode");
        String addbase = request.getParameter("al_addbase");
        String addcoinqty = request.getParameter("al_addcoinqty");
        String addamount = request.getParameter("al_addamount");
        String addintegral = request.getParameter("al_addintegral");
        String flagstop = request.getParameter("al_flagstop");
        String remark = request.getParameter("al_remark");
        String sm_id = request.getParameter("sm_id");

        if (CommonUtil.isEmpty(alid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(type)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("类型不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(team)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("组别不能为空");
            flag_pass = false;
        };

        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        if (flag_pass==true){
            try{
                Acc_Largess al = new Acc_Largess();
                al.setAl_id(Integer.valueOf(alid));
                al.setAl_type(type);
                al.setAl_team(team);
                al.setAl_datebegin(datebegin);
                al.setAl_dateend(dateend);
                al.setAl_valuemin(Integer.valueOf(valuemin));
                al.setAl_valuemax(Integer.valueOf(valuemax));
                al.setAl_addmode(Byte.parseByte(addmode));
                al.setAl_addbase(Integer.valueOf(addbase));
                al.setAl_addcoinqty(Integer.valueOf(addcoinqty));
                al.setAl_addamount(Integer.valueOf(addamount));
                al.setAl_addintegral(Integer.valueOf(addintegral));
                al.setAl_flagstop(Boolean.parseBoolean(flagstop));
                al.setAl_remark(remark);
                al.setBa_updateid(Long.valueOf(id));
                al.setBa_updateno(createno);
                al.setBa_updatedate(new Date());
                accLargessService.updateByPrimaryKeySelective(al);

            }catch (Exception e) {
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

    /**
     * 删除赠送
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "deletegrantconditions", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletegrantconditions(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        String id = request.getParameter("al_id");
        String sm_id = request.getParameter("sm_id");

        if (CommonUtil.isEmpty(id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("id不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        if (flag_pass==true){
            try{

            accLargessService.deleteByAcc_Largess(Integer.valueOf(id));

            }catch (Exception e) {
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
}
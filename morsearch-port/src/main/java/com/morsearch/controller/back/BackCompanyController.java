package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.AccV_MemoAmt;
import com.morsearch.model.Acc_Additional;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.service.AccAdditionalService;
import com.morsearch.service.ManagerService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by ywh on 2018-1-30.
 */
@Controller("BackCompanyController")
@RequestMapping("/back/")
public class BackCompanyController extends BaseController {
    @Resource
    private AccAdditionalService accAdditionalService;
    @Resource
    private ManagerService managerService;


    /**
     * 企业用户列表
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getcompanyuserlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getcompanyuserlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/

        List<SysV_UserFull> list = new ArrayList<>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
               /* map.put("bcu_cyid", bc.getCy_id());
                map.put("createname", request.getParameter("createname"));
                map.put("orderno", request.getParameter("orderno"));
*/

			/*查询条件 end*/
                list = userService.getSysV_UserFullList(map);
                page.setRowcount(userService.getCountSysV_UserFull(map));//*记录数*//*
                appresult.setPage(page);
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;

    }

    /**
     * 企业用户新增
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "savecompanyuser", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String savecompanyuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/
        String userid = request.getParameter("sm_id");
        String urno = request.getParameter("urno");
        String pwd  = request.getParameter("urpwd");
        String companyname = request.getParameter("companyname");
        String companybrand = request.getParameter("companybrand");
        String tagproduct = request.getParameter("tagproduct");
        String namenick = request.getParameter("namenick");
        String remark = request.getParameter("remark");
        if (flag_pass == true && (CommonUtil.isEmpty(urno) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("账号不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(remark) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("备注不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(pwd) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("密码不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(namenick) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司简称不能为空");
            flag_pass = false;
        }

        if (flag_pass == true && (CommonUtil.isEmpty(companyname) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司全称不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(companybrand) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("公司品牌不能为空");
            flag_pass = false;
        }
/*
        if (flag_pass == true && (CommonUtil.isEmpty(tagproduct) == true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("产品标签不能为空");
            flag_pass = false;
        }
*/

/*检查重复*/
        if (flag_pass==true) {
            int ic = userService.getCheckDouble(0, urno, null, null, null);
            if (ic > 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("账号已经存在");
                flag_pass = false;
            }         ;
        };


        if (flag_pass==true){

            try{
                int i = userService.saveCompanyuser(urno,pwd,namenick,companyname,companybrand,tagproduct,remark);
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("新增失败");
                }
            }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }


        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     * 企业用户导出
     * SysV_UserFull
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getsysvuserfullenterprisererxport" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getsysvuserfullenterprisererxport(HttpServletRequest request, HttpServletResponse response) throws Exception{
       /* PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");*/

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        String sm_id=request.getParameter("sm_id");

        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }
        //查询出版本列表
        if(flag_pass == true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));
                page.setPagesize(request.getParameter("pagesize"));
                Map<String, Object> map = new HashMap<String, Object>();

                String[] excelheader = new String[]{"账号", "公司简称","公司全称", "公司品牌", "备注",
                        "注册时间"};//27
                String[] excelkey = new String[]{"ur_no", "ur_namenick","ue_companyname", "ue_companybrand", "ue_remark",
                        "ur_register_date" };//相对应
                OutputStream outs = null;
                List<Object[]> resultexcel = null;

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", 100000);//这里设置的是下载的条数,可以无限大

                List<Map<String, Object>> sos =CommonUtil.objectsToMaps(userService.getSysV_UserFullList(map));
//*处理对应位置*//*
                resultexcel = ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
//*加入输出流*//*
                outs = response.getOutputStream();
//*返回内容*//*
                response.reset();
                response.setContentType("application/vnd.ms-excel;charset=utf-8");
                response.setCharacterEncoding("utf-8");
                String filename = new StringBuilder(SequenceCreator.createNewFileName()+".xls").toString();//"repairorderpayment_export.xls";
                response.setHeader("Content-disposition", "attachment; filename=" + filename);
                Locale locale = null;
                if (locale != null && locale == Locale.TRADITIONAL_CHINESE) {
                    ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
                } else {
                    ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage("文档导出成功");
                }
            } catch (IOException e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        };
        //*begin返回数据*//*
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //*end返回数据

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }
    /**
     * 企业充值
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "companyRecharge", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String companyRecharge(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage("充值已成功，请等待审核");
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/

        String smid = request.getParameter("sm_id"); //创建人ID
        String smno = request.getParameter("sm_no"); //创建人ID
        String userid= request.getParameter("cy_id");//v充值用户id
        String account = request.getParameter("aa_account"); //充值金额


        if (CommonUtil.isEmpty(smid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID不能为空");
            flag_pass = false;
        }

        if (CommonUtil.isEmpty(smno)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("账号不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("充值ID不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(account)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("充值金额不能为空不能为空");
            flag_pass = false;
        }

        if (flag_pass==true) {
            try{
                SysV_UserFull  sf = userService.getUser_FullDetail(Long.valueOf(userid),11);
                String sm_name = managerService.getManagerDetail(CommonUtil.convert_Int(smid)).getSm_name();
                int i = accAdditionalService.addRecharge(smid,userid,account,smno,sm_name);
                if(i==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage("充值失败");

                }

            }catch (Exception e){
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }
        };
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     *审核充值
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "rechargeauditing", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String rechargeauditing(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage("审核通过");
        String rs = "";

        Boolean flag_pass = true;/*检查内容是否能过*/
        String aid = request.getParameter("aa_id");
        String  userid = request.getParameter("sm_id");
       // String status = request.getParameter("1");


        if (CommonUtil.isEmpty(aid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID不能为空");
            flag_pass = false;
        }

        if (CommonUtil.isEmpty(userid)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("审核ID不能为空");
            flag_pass = false;
        }



        if (flag_pass==true) {
            try{

                String sm_name = managerService.getManagerDetail(CommonUtil.convert_Int(userid)).getSm_name();

                int i = accAdditionalService.updaterecharge(aid,userid,sm_name);

                if(i==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage("审核失败");

                }

            }catch (Exception e){
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }
        };
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;

}

    /**
     * 充值列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "companrechargelist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String companrechargelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/


        List<Acc_Additional> list = new ArrayList<>();
        if (flag_pass == true) {
            try {
			/*控制页码 begin*/
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());
                map.put("aa_type", 1);
                map.put("aa_useraccount", request.getParameter("aa_useraccount"));
                map.put("aa_username", request.getParameter("aa_username"));

			/*查询条件 end*/
                list = accAdditionalService.getAcc_AdditionalList(map);
                page.setRowcount(accAdditionalService.getCountAcc_Additional(map));//*记录数*//*
                appresult.setPage(page);
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(list);
        dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appresult.setData(dto); /*us*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }
}
package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.DesigV_Project;
import com.morsearch.model.Desig_Project;
import com.morsearch.service.DesigProjectService;
import com.morsearch.service.DesigVProjectService;
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
 * Created by ywh on 2017-12-11.
 */
@Controller("BackDesigProjectController")
@RequestMapping("/back/")
public class BackDesigProjectController extends BaseController {

    @Resource
    private DesigProjectService desigProjectService;
    @Resource
    private DesigVProjectService desigVProjectService;


    /**
     *
     * 项目列表
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getdesigprojectlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String getdesigprojectlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查内容是否能过*/
        List<DesigV_Project> list = new ArrayList<>();
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
                //map.put("sp_createid", request.getParameter("sp_createid"));
                map.put("sp_title", request.getParameter("sp_title"));
                map.put("sp_cityname", request.getParameter("sp_cityname"));
                map.put("sp_signname", request.getParameter("sp_signname"));
                map.put("sp_createno", request.getParameter("sp_createno"));
                map.put("sp_createdate", request.getParameter("sp_createdate"));
                map.put("statusname", request.getParameter("statusname"));
                map.put("sp_status", request.getParameter("sp_status"));

			/*查询条件 end*/
                list = desigVProjectService.getDesigV_ProjectBackList(map);
                page.setRowcount(desigVProjectService.getCountDesigV_ProjectBack(map));//*记录数*//*
                appResult.setPage(page);
                if (list.size()==0) {
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appResult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }

    /**
     *
     * 项目详情
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getdesigproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getdesigproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("sp_id");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        DesigV_Project Dp = new DesigV_Project();
        if (flag_pass == true) {
            try {
               DesigV_Project dp = desigVProjectService.selectDesigV_Project(Long.valueOf(id));
                appresult.setData(dp);
            } catch (Exception e) {
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
     * 项目保存
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updatedesigproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updatedesigproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String id = request.getParameter("sp_id");
        String uid = request.getParameter("sm_id");
        String uno = request.getParameter("sm_no");
        String status = request.getParameter("sp_status");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        } if (flag_pass == true && (CommonUtil.isEmpty(uid))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("审核ID不能为空");
            flag_pass = false;
        } if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("审核账号不能为空");
            flag_pass = false;
        }

        Desig_Project dp = new Desig_Project();
        if (flag_pass == true) {
            try {
                dp.setSp_id(Long.valueOf(id));
                dp.setSp_confirmid(Long.valueOf(uid));
                dp.setSp_confirmno(uno);
                dp.setSp_confirmdate(new Date());
                dp.setSp_status(Byte.valueOf(status));
                desigProjectService.updateByPrimaryKeySelective(dp);


            } catch (Exception e) {
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
}
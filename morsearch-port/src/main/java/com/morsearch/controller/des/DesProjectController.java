package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.DesigV_Search_Sales;
import com.morsearch.model.Desig_Project;
import com.morsearch.service.DesigProjectService;
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
 * Created by ywh on 2017-11-22.
 */
@Controller("DesProjectController")
@RequestMapping("/des/")
public class DesProjectController extends BaseController {

    @Resource
    private DesigProjectService desigProjectService;

    /**
     * 新增项目
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "saveproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String saveproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("ur_id");
        String sp_title = request.getParameter("sp_title");
        String sp_cityname = request.getParameter("sp_cityname");
        String sp_signcode = request.getParameter("sp_signcode");
        String createno =commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,id,"userno");//登录账号


        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_title))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_cityname))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("城市不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_signcode))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("项目状态不能为空");
            flag_pass = false;
        }
        Desig_Project Dp = new Desig_Project();
        if (flag_pass == true) {
            try {
                int sp = Integer.valueOf(sp_signcode);
                if (sp == 0) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("未开始");
                } else if (sp == 1) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("进行中");
                } else if (sp == 2) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("已结束");
                }
                Dp.setSp_title(sp_title);
                Dp.setSp_no(SequenceCreator.createnumber("", 5));
                Dp.setSp_cityname(sp_cityname);
                Dp.setSp_citycode(desigProjectService.getWordTypeCode(sp_cityname));
                Dp.setSp_count_browse(0);
                Dp.setSp_createid(Long.valueOf(id));
                Dp.setSp_createno(createno);
                Dp.setSp_createdate(new Date());
                Dp.setSp_status((byte) 1);
                desigProjectService.insertSelective(Dp);
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
     * 项目修改 回显
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
        Desig_Project Dp = new Desig_Project();
        if (flag_pass == true) {
            try {
                Desig_Project dp = desigProjectService.selectByDesig_Project(Long.valueOf(id));
                Dp.setSp_cityname(dp.getSp_cityname());
                Dp.setSp_title(dp.getSp_title());
                Dp.setSp_signcode(dp.getSp_signcode());
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        appresult.setData(Dp);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 项目修改 保存
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "updateproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String updateproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("sp_id");
        String sp_title = request.getParameter("sp_title");
        String sp_cityname = request.getParameter("sp_cityname");
        String sp_signcode = request.getParameter("sp_signcode");

        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_title))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("标题不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_cityname))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("城市不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && (CommonUtil.isEmpty(sp_signcode))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("项目状态不能为空");
            flag_pass = false;
        }

        if(flag_pass==true){
            try{
                Desig_Project Dp = new Desig_Project();
                Dp.setSp_id(Long.valueOf(id));
                Dp.setSp_title(sp_title);
                int sp = Integer.valueOf(sp_signcode);
                if (sp == 0) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("未开始");
                } else if (sp == 1) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("进行中");
                } else if (sp == 2) {
                    Dp.setSp_signcode((byte) sp);
                    Dp.setSp_signname("已结束");
                }
                Dp.setSp_cityname(sp_cityname);
                Dp.setSp_citycode(desigProjectService.getWordTypeCode(sp_cityname));

                desigProjectService.updateByPrimaryKeySelective(Dp);

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
     *
     * 项目删除
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "deleteproject", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String deleteproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_DEL_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("sp_id");
        if (flag_pass == true && (CommonUtil.isEmpty(id))) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("ID不能为空");
            flag_pass = false;
        }
        if (flag_pass==true){
            try{
               int i =  desigProjectService.deleteByPrimaryKey(Long.valueOf(id));
                if (i==0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_DEL_FAIL);
                }
                appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                appresult.setMessage(Constants.RESULT_DEL_SUCC);
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
     * 项目列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getprojectList", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getprojectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        List<Desig_Project> list = new ArrayList<>();
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
                map.put("sp_createid", request.getParameter("sp_createid"));
                map.put("sp_title", request.getParameter("sp_title"));
                map.put("sp_cityname", request.getParameter("sp_cityname"));
                map.put("sp_signcode", request.getParameter("sp_signcode"));
                map.put("sp_createdate", request.getParameter("sp_createdate"));

			/*查询条件 end*/
                list = desigProjectService.getDesig_ProjectList(map);
                page.setRowcount(desigProjectService.getCountDesig_Project(map));//*记录数*//*
                appresult.setPage(page);
                if (list.size()==0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
                }
                ;
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

            }

        }
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
         /*处理数据格式*/
        out.print(rs);
        out.close();
        /*返回数据 end*/
        return null;
    }
}
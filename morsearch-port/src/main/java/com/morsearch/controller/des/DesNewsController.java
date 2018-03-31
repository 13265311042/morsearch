package com.morsearch.controller.des;

import com.cloopen.rest.sdk.utils.encoder.BASE64Encoder;
import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Msg_News;
import com.morsearch.service.MsgNewsService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 资讯
 * Created by ywh on 2018-3-13.
 */

@Controller("DesNewsController")
@RequestMapping("/des/")

public class DesNewsController extends BaseController {


    @Resource
    private MsgNewsService msgNewsService;

    /**
     *
     * 资讯列表
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getnewslist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getnewslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        List<Msg_News> list = new ArrayList<>();
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
                map.put("mn_type",request.getParameter("type"));

			/*查询条件 end*/
                list = msgNewsService.getMsg_NewsList(map);
                page.setRowcount(msgNewsService.getCountMsg_News(map));//*记录数*//*
                appresult.setPage(page);
                if (list == null) {
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
        ;
        /*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

    }

    /**
     * 资讯详情
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getnews", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getnews(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        String id = request.getParameter("mnid");
        if (CommonUtil.isEmpty(id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("资讯id不能为空");
            flag_pass = false;
        };
        Msg_News mn = new Msg_News();
        try{
            Msg_News  Mn = msgNewsService.getMsg_News(Long.valueOf(id));
            BASE64Encoder be = new BASE64Encoder();
            String rut = Mn.getMn_content();
             rut = be.encode(rut.getBytes("UTF-8")); /* 转为baes64,内容太长，及有特殊符号*/

            mn.setMn_id(Mn.getMn_id());
            mn.setMn_headpic(Mn.getMn_headpic());
            mn.setMn_headisv(Mn.getMn_headisv());
            mn.setMn_title(Mn.getMn_title());
            mn.setMn_content(rut);
            mn.setMn_createdate(Mn.getMn_createdate());
            mn.setMn_clickqty(Mn.getMn_clickqty());

        }catch (Exception e){
            logger.error(e.getMessage());
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }

        appresult.setData(mn);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }


    /**
     * 新闻资讯点击次数添加
     * Msg_News
     */
    @IgnoreAuth
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "addmsgnewsmnclickqty" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String addmsgnewsmnclickqty(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        int i=0;
        Boolean flag_pass=true;
        /*获得参数begin*/
        String mn_id = request.getParameter("mn_id");
        if(CommonUtil.isEmpty(mn_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("ID参数不能为空");
            flag_pass = false;
        }
        if(flag_pass == true){
            //查询出用户列表
            try {
               /* Msg_News mn = new Msg_News();
                mn.setMn_id(Long.parseLong(mn_id));*/
                i = msgNewsService.addMsg_Newsmnclickqty(Long.parseLong(mn_id));
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
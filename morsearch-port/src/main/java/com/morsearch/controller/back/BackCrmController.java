package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.dao.Sys_User_ExtMapper;
import com.morsearch.dao.Sys_User_MsgMapper;
import com.morsearch.model.Acc_Largess;
import com.morsearch.model.Sys_User;
import com.morsearch.model.Sys_User_Ext;
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
 * Created by ywh on 2017-12-11.
 */
@Controller("BackCrmController")
@RequestMapping("/back/")
public class BackCrmController extends BaseController {

    @Resource
    private Sys_User_MsgMapper sys_user_msgMapper;
    @Resource
    private Sys_User_ExtMapper sys_user_extMapper;


    /**
     * 公司业务员列表
     */
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getsaleslist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getsaleslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        String id = request.getParameter("ur_id");
        Sys_User_Ext se = sys_user_extMapper.selectByPrimaryKey(Long.valueOf(id));


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

                map.put("ue_companyname",se.getUe_companyname());
                map.put("ur_namenick",request.getParameter("ur_namenick"));
                map.put("ur_phone",request.getParameter("ur_phone"));
                if(!CommonUtil.isEmpty(request.getParameter("al_flagstop"))){
                    map.put("al_flagstop",CommonUtil.convert_boolean(request.getParameter("al_flagstop")));
                }

                //us = accLargessService.getAcc_LargessList(map);
               // page.setRowcount(accLargessService.getCountAcc_Largess(map));
                appresult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/

        /*begin返回数据*/
        appresult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


}
package com.morsearch.controller.mall;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Mall_Evaluate;
import com.morsearch.model.Mall_Goods;
import com.morsearch.service.MallEvaluateService;
import com.morsearch.service.MallGoodsService;
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
 * Created by hyt on 2018/1/9.
 */

//前端商城商品

@Controller("MallGoodsController")
@RequestMapping("/mall/")
public class MallGoodsController extends BaseController {

    @Resource
    private MallGoodsService mallGoodsService;

    @Resource
    private MallEvaluateService mallEvaluateService;
    /***
     * @param request
     *Mall_Goods
     * 商城商品详细信息(每一种商品)
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallgoodsdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallgoodsdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取de_id,查询的条件
        String  mg_id = request.getParameter("mg_id");//商品id
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(mg_id)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("商品id不能为空");
            flag_pass = false;
        };
    /*检查参数 end*/

    /*处理逻辑 begin*/
        Mall_Goods mg = new Mall_Goods();
        if (flag_pass==true) {
            try {
                mg = mallGoodsService.getMall_Goodsdetail(Long.parseLong(mg_id),1);
                if (mg!=null){
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
        appresult.setData(mg);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }



    /***
     * @param request
     *Mall_Evaluate//商品评价
     * 商城商品详细信息(每一种商品)的所有评价
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallevaluatelist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallevaluatelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        //获取de_id,查询的条件
        String  se_goodid = request.getParameter("se_goodid");//商品id
    /*检查参数 begin*/
        if (CommonUtil.isEmpty(se_goodid)&&flag_pass==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("商品id不能为空");
            flag_pass = false;
        };
    /*检查参数 end*/

    /*处理逻辑 begin*/
        List<Mall_Evaluate> me = new ArrayList<>();
        if (flag_pass==true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String, Object> map = new HashMap<String, Object>();

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());

                map.put("se_goodid", CommonUtil.convert_Long(request.getParameter("se_goodid")));//商品id
                me = mallEvaluateService.getMall_EvaluateList(map);//list列表
                page.setRowcount(mallEvaluateService.getCountMall_Evaluate(map));//list的大小
                appresult.setPage(page);
                if(!CommonUtil.isNullOrEmpty(me)&&me.size()>0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
/*处理逻辑 end*/
/*返回数据 begin*/
        appresult.setData(me);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }

}

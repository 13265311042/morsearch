package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_Style;
import com.morsearch.service.LableListService;
import com.morsearch.service.PmFeaturesService;
import com.morsearch.service.ProductTypeService;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Pm_Features_list;
import com.morsearch.vo.Pm_Style_list;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by ywh on 2017-10-27.
 */


@Controller("FrontProductTypeController")
@RequestMapping("/front/")
public class FrontProductController extends BaseController{


    @Resource
    private LableListService lableListService;

    @Resource
    private ProductTypeService productTypeService;

    @Resource
    private PmFeaturesService pmFeaturesService;

    /**
     *产品类型读取
     *
     */
    @IgnoreAuth
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getproducttype", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getproducttype(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        //获得页面传过来的参数
        String majorname = request.getParameter("ps_majorname");
        if (flag_pass == true && CommonUtil.isEmpty(majorname) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("名称参数不能为空");
            flag_pass = false;
        }
        ;
        String[] name ={majorname};

        if (majorname.indexOf("|")>0){
            name= majorname.split("\\|");};

        if (majorname.indexOf(";")>0){
            name=majorname.split("\\;");};


        String s = "";

        Pm_Style_list list = new Pm_Style_list();

            if (flag_pass == true) {
                try {
                    for (int i = 0; i < name.length; i++) {
                        s = name[i];
                        Base_LableList base_lableList = lableListService.getLableId(s);
                         List<Pm_Style> pmStyle = productTypeService.getStyList(base_lableList.getBl_id());

                    switch (i){
                        case 0: {
                            list.setList1(pmStyle);
                            list.setBase_lableList1(base_lableList);
                            break;
                        }
                        case 1:{
                            list.setList2(pmStyle);
                            list.setBase_lableList2(base_lableList);
                         break;
                        }
                        case 2 :{
                            list.setList3(pmStyle);
                            list.setBase_lableList3(base_lableList);
                            break;
                        }
                        case 3: {
                            list.setList4(pmStyle);
                            list.setBase_lableList4(base_lableList);
                            break;
                        }
                        case 4: {
                            list.setList5(pmStyle);
                            list.setBase_lableList5(base_lableList);
                            break;
                        }
                        case 5 :{
                            list.setList6(pmStyle);
                            list.setBase_lableList6(base_lableList);
                            break;
                        }
                        case 6: {
                            list.setList7(pmStyle);
                            list.setBase_lableList7(base_lableList);
                            break;
                        }
                    };
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
        appresult.setData(list);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
        }



/**
 * 产品类型增加
 *
 */
@SuppressWarnings({ "unused", "null" })
@RequestMapping(value = "saveproducttype", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
public String saveproducttype(HttpServletRequest request, HttpServletResponse response) throws Exception {
    PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
    AppResult appresult = new AppResult();
    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
    appresult.setMessage(Constants.RESULT_ADD_SUCC);
    String rs = "";
    Boolean flag_pass = true;/*检查是否能过*/
    //获得页面传过来的参数

    String name = request.getParameter("ps_name");
    String majorid = request.getParameter("ps_majorid");
    String majorname = request.getParameter("ps_majorname");
    String userid = request.getParameter("userid");

    if (flag_pass == true && CommonUtil.isEmpty(userid) == true) {
        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
        appresult.setMessage("userid参数不能为空");
        flag_pass = false;
    };

    if (flag_pass == true && CommonUtil.isEmpty(name) == true) {
        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
        appresult.setMessage("类型名称参数不能为空");
        flag_pass = false;
    };


    /*检查名称重复*/
    if (flag_pass == true && (name != null && !"".equals(name))) {
        int iai = productTypeService.getStyleListCount(Long.valueOf(majorid), name.trim());
        if (iai > 0) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("【" + name + "】在当前类已存在");
            flag_pass = false;
        }
        ;

        if (flag_pass == true) {
            try {
                int i = productTypeService.getStyleListCount(Long.valueOf(majorid), null);
                Pm_Style pmStyle = new Pm_Style();
                pmStyle.setPs_name(name);
                pmStyle.setPs_index(i + 1);
                pmStyle.setPs_majorid(Long.valueOf(majorid));
                pmStyle.setPs_majorname(majorname);
                pmStyle.setPs_createno(userid+"."+commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno"));
                pmStyle.setPs_createdate(new Date());


                productTypeService.insertSelective(pmStyle);

            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }

    }
    rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
    out.print(rs);
    out.close();
    return null;
}
    /**
     * 产品特性添加
     *ywh
     *
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savefeatures", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String savefeatures(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/
        //获得页面传过来的参数
        String name = request.getParameter("pf_name");
        String styleid = request.getParameter("pf_styleid");
        String stylename = request.getParameter("pf_stylename");

        String userid = request.getParameter("userid");

        if (flag_pass == true && CommonUtil.isEmpty(userid) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("userid参数不能为空");
            flag_pass = false;
        };

        if (flag_pass == true && CommonUtil.isEmpty(name) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("特性名称参数不能为空");
            flag_pass = false;
        }
        if (flag_pass == true && CommonUtil.isEmpty(styleid) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("类型ID参数不能为空");
            flag_pass = false;
        }

        if (flag_pass == true && CommonUtil.isEmpty(stylename) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("类型名称参数不能为空");
            flag_pass = false;
        }
    /*检查名称重复*/
        if (flag_pass == true && (name != null && !"".equals(name))) {
            int iai = pmFeaturesService.getFeaturesListCount(Long.valueOf(styleid),name.trim());
            if (iai > 0) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("【" + name + "】在当前类已存在");
                flag_pass = false;
            }
        }

        if (flag_pass == true) {
            try {
                int i = pmFeaturesService.getFeaturesListCount(Long.valueOf(styleid),null);
                Pm_Features pm_features = new Pm_Features();
                pm_features.setPf_name(name);
                pm_features.setPf_index(i + 1);
                pm_features.setPf_styleid(Long.valueOf(styleid));
                pm_features.setPf_stylename(stylename);
                pm_features.setPf_createno(Constants.LOGIN_TYPE_FRONT +commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno"));
                pm_features.setPf_createdate(new Date());

                pmFeaturesService.insertSelective(pm_features);

            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }


    /**
     *
     * 产品特性获取
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getproductfeatures", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getproductfeatures(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        String stylename = request.getParameter("pf_stylename");

        if (flag_pass == true && CommonUtil.isEmpty(stylename) == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("名称参数不能为空");
            flag_pass = false;
        }
        String[] name ={stylename};

        if (stylename.indexOf("|")>0){
            name= stylename.split("\\|");};

        if (stylename.indexOf(";")>0){
            name=stylename.split("\\;");};

        String s = "";

        Pm_Features_list pmFeaturesList = new Pm_Features_list();
        if (flag_pass==true) {
            try {
                for (int i = 0; i < name.length; i++) {
                    s = name[i];
                    Pm_Style pmStyle = productTypeService.getStyId(s);
                    List<Pm_Features> list = pmFeaturesService.getFeaturesList(pmStyle.getPs_id());
                    switch (i){
                        case 0: {
                            pmFeaturesList.setList(pmStyle);
                            pmFeaturesList.setList1(list);
                            break;
                        }
                        case 1:{
                            pmFeaturesList.setList(pmStyle);
                            pmFeaturesList.setList2(list);}
                            break;
                        }
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
        appresult.setData(pmFeaturesList);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }

    /**
     *
     * 获取专业
     */
    @IgnoreAuth
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getmajor", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmajor(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;/*检查是否能过*/

        if (flag_pass==true){
            try{
                List<Base_LableList> list = lableListService.getLableName("1002");
                appresult.setData(list);
            }catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
         /*begin返回数据*/
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
        /*end返回数据*/
        out.print(rs);
        out.close();
        return null;
    }


}


package com.morsearch.controller.des;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Base_Rotation;
import com.morsearch.service.RotationService;
import com.morsearch.vo.AppResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by ywh on 2018-3-30.
 */
@Controller("DesCarouselController")
@RequestMapping("/des/")
public class DesCarouselController extends BaseController{

@Resource
    private RotationService rotationService;


    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "getRotationlist", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getRotationlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass = true;

        try{
            List<Base_Rotation> list = rotationService.getRotationlist("11:设计师");
            if (list.size()<=0){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("没有资料");

            }
            appresult.setData(list);
        }catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);

        }
       /*处理数据 end*/
/*返回数据 begin*/

        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;

}
}

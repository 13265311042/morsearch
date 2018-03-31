package com.morsearch.controller.mall;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Base_Rotation;
import com.morsearch.model.MallV_Home;
import com.morsearch.model.Sys_User;
import com.morsearch.service.BaseRotationService;
import com.morsearch.service.MallHomeService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.MallHome;
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

//商城首页


@Controller("MallHomeController")
@RequestMapping("/mall/")

public class MallHomeController extends BaseController {
	@Resource
	private BaseRotationService baserotationservice;
	@Resource
	private MallHomeService mallhomeservice;

/*获取商城首页
leoli
2018.01.08
* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getmallhome", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getmallhome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;

/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/
		MallHome ml = new MallHome();

		if (flag_pass==true) {
			try {
				ml.setPath_image_normal(commService.getSysConfigValue("path_image_normal"));/*源图片路径*/
				ml.setPath_image_small(commService.getSysConfigValue("path_image_small"));/*小图片路径*/
				ml.setRotationlist(baserotationservice.getRotationListshow("01",false));/*获取轮播图*/
/*获取商品*/
				Map<String, String> mpsp=redisService.getMapValue(Constants.REDIS_MALL_HOME);
				List<MallV_Home> mpsplist=new ArrayList<MallV_Home>();
				int icount=0;
				if (mpsp!=null&&mpsp.size()>0){
					for (String vv : mpsp.values()) {
						MallV_Home dv= gson.fromJson(vv, MallV_Home.class);
						mpsplist.add(dv);
					}
				}else
				{
					mpsplist=mallhomeservice.getMallV_Home_show(1,null);
					icount=mpsplist.size();
					mpsp = new HashMap<>();
					for(int ii=0;ii<icount;ii++){
						mpsp.put((Long)mpsplist.get(ii).getMh_id()+"",gson.toJson(mpsplist.get(ii)));
					};
					redisService.saveMapValue(Constants.REDIS_MALL_HOME,mpsp,0);
				};
				List<MallV_Home> bdlist=new ArrayList<MallV_Home>();/*品牌*/
				List<MallV_Home> hotlist=new ArrayList<MallV_Home>();/*热销*/
				icount=mpsplist.size();
				for(int ii=0;ii<icount;ii++){
				if (mpsplist.get(ii).getMh_type()==1){hotlist.add(mpsplist.get(ii));};/*热门*/
				if (mpsplist.get(ii).getMh_type()==2){bdlist.add(mpsplist.get(ii));};/*品牌*/
				};
				ml.setBrandlist(bdlist);
				ml.setHotlist(hotlist);


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(ml);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}






}

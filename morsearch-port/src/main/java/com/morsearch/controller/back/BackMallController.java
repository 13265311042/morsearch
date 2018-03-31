package com.morsearch.controller.back;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.MallV_Evaluate;
import com.morsearch.model.MallV_Goods_List;
import com.morsearch.model.Mall_Goods;
import com.morsearch.service.MallEvaluateService;
import com.morsearch.service.MallGoodsService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.util.WebUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by hyt on 2017/12/19.
 */
@Controller("BackMallController")
@RequestMapping("/back/")
public class BackMallController extends BaseController{

    @Resource
    private MallGoodsService mallGoodsService;

    @Resource
    private MallEvaluateService mallEvaluateService;

    /**
     * 新增商品 zuoxiaochao
     * Mall_Goods
     */
    @RequestMapping(value = "addmallgoods" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String addmallgoods(@RequestParam(value = "files")MultipartFile[] files, HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        //5张图片怎么添加type="file" name="files"
        //还有一个text文件 name="file"
        /*页面传过来的参数begin*/
        String mg_title = request.getParameter("mg_title");//产品标题
        String mg_subhead = request.getParameter("mg_subhead");//小标题
        String av_createdate1 = request.getParameter("av_createdate");//商品图片五张
        String mg_color = request.getParameter("mg_color");//产品颜色
        String mg_model = request.getParameter("mg_model");//产品型号
        String mg_price = request.getParameter("mg_price");//商品价格
        String mg_stockqty = request.getParameter("mg_stockqty");//商品库存
        String mg_period = request.getParameter("mg_period");//收货周期
        String mg_logistics = request.getParameter("mg_logistics");//物流服务
        String mg_content = request.getParameter("myContent");//产品详情信息,也就是text
        /*页面传过来的参数end*/
        String sm_id = request.getParameter("sm_id");//建立用户id

        String sm_no = request.getParameter("sm_no");//建立用户名称

        String mg_status = request.getParameter("mg_status");//这个是状态,是否上架
        mg_status="0";
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        /*检查参数begin*/
        if (CommonUtil.isEmpty(mg_title)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("产品标题不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_subhead)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("小标题不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_color)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品颜色不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_model)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品型号不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(mg_price)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品价格不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(mg_stockqty)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("产品库存不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_period)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("收货周期不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_logistics)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("物流服务不能为空");
            flag_pass = false;
        };

        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                Mall_Goods mg = new Mall_Goods();
                //封装数据
                mg.setMg_title(mg_title);
                mg.setMg_subhead(mg_subhead);
                //商品图片地址都存到list集合里面
                List list = mallGoodsService.getfilenames(files);

                mg.setMg_img1((String) list.get(0));
                mg.setMg_img2((String) list.get(1));
                mg.setMg_img3((String) list.get(2));
                mg.setMg_img4((String) list.get(3));
                mg.setMg_img5((String) list.get(4));

                mg.setMg_color(mg_color);
                mg.setMg_model(mg_model);
                mg.setMg_price(CommonUtil.convert_bigdecimal(mg_price));
                mg.setMg_stockqty(CommonUtil.convert_bigdecimal(mg_stockqty));
                mg.setMg_period(CommonUtil.convert_Int(mg_period));
                mg.setMg_logistics(mg_logistics);
                //上传的文件的名称应该是
                mg.setMg_content(mg_content);//截取
                mg.setMg_createid(CommonUtil.convert_Long(sm_id));
                mg.setMg_createno(sm_no);
                mg.setMg_createdate( new Date());
                mg.setMg_status(CommonUtil.convert_Byte(mg_status));//状态


                int ii=mallGoodsService.addMall_Goods(mg);
                if (ii==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*提示资料不存在*/
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);

                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
        /*begin返回数据*/
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


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
                mg = mallGoodsService.getMall_Goodsdetail(Long.parseLong(mg_id),2);//删除数据库数据的同时还需要删除服务器上传的图片
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


    /**
     * 编辑商品 zuoxiaochao
     * Mall_Goods
     */
    @RequestMapping(value = "savemallgoods" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
    public String savemallgoods(@RequestParam(value = "files")MultipartFile[] files, HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_EDIT_SUCC);
        String rs="";
        Boolean flag_pass=true;/*检查内容是否能过*/
        //5张图片怎么添加type="file" name="files"
        //还有一个text文件 name="file"
        /*页面传过来的参数begin*/
        String mg_id = request.getParameter("mg_id");//产品id

        String mg_title = request.getParameter("mg_title");//产品标题
        String mg_color = request.getParameter("mg_color");//产品颜色
        String mg_model = request.getParameter("mg_model");//产品型号
        String mg_price = request.getParameter("mg_price");//商品价格
        String mg_stockqty = request.getParameter("mg_stockqty");//商品库存
        String mg_period = request.getParameter("mg_period");//收货周期
        String mg_logistics = request.getParameter("mg_logistics");//物流服务
        String mg_content = request.getParameter("mg_content");//产品详情信息,也就是text
        /*页面传过来的参数end*/
        String sm_id = request.getParameter("sm_id");//建立用户id
        String sm_no = request.getParameter("sm_no");//建立用户名称

        String mg_status = request.getParameter("mg_status");//这个是状态,是否上架
        mg_status="0";
        if (CommonUtil.isEmpty(mg_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请传入商品id");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        };
        /*检查参数begin*/
        if (CommonUtil.isEmpty(mg_title)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("产品标题不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_color)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品颜色不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_model)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品型号不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(mg_price)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品价格不能为空");
            flag_pass = false;
        };if (CommonUtil.isEmpty(mg_stockqty)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("产品库存不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_period)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("收货周期不能为空");
            flag_pass = false;
        };
        if (CommonUtil.isEmpty(mg_logistics)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("物流服务不能为空");
            flag_pass = false;
        };

        /*检查参数end*/

        /*begin处理数据*/
        if(flag_pass == true){
            try {
                Mall_Goods mg = new Mall_Goods();
                //封装数据,其实就是更新
                mg.setMg_id(CommonUtil.convert_Long(mg_id));
                mg.setMg_title(mg_title);

                //先查出来这几个filename,查询详细信息
                Mall_Goods mgd = mallGoodsService.getMall_Goodsdetail(CommonUtil.convert_Long(mg_id), 1);//用来查询图片的几个地址
                List list=mallGoodsService.getupdatefilename(files,mgd);

                mg.setMg_img1((String) list.get(0));
                mg.setMg_img2((String) list.get(1));
                mg.setMg_img3((String) list.get(2));
                mg.setMg_img4((String) list.get(3));
                mg.setMg_img5((String) list.get(4));

                mg.setMg_color(mg_color);
                mg.setMg_model(mg_model);
                mg.setMg_price(CommonUtil.convert_bigdecimal(mg_price));
                mg.setMg_stockqty(CommonUtil.convert_bigdecimal(mg_stockqty));
                mg.setMg_period(CommonUtil.convert_Int(mg_period));
                mg.setMg_logistics(mg_logistics);
                //产品详情
                mg.setMg_content(mg_content);
                mg.setMg_updateid(CommonUtil.convert_Long(sm_id));
                mg.setMg_updateno(sm_no);
                mg.setMg_updatedate( new Date());


                int ii=mallGoodsService.updateMall_Goods(mg);
                if (ii==0){appResult.setMessage(Constants.RESULT_ADD_FAIL);};/*提示资料不存在*/
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);

                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/
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
     * 商城商品 zuoxiaochao
     * MallV_Goods_List//后台展示
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallvgoodslistlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallvgoodslistlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<MallV_Goods_List> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                //状态
                if(!CommonUtil.isEmpty(request.getParameter("mg_status"))){
                    map.put("mg_status",Byte.valueOf(request.getParameter("mg_status")));//状态
                }
                map.put("mg_title",request.getParameter("mg_title"));//商品标题
                //查询条件
                us = mallGoodsService.getMallV_Goods_ListList(map);
                page.setRowcount(mallGoodsService.getCountMallV_Goods_List(map));
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

        /*begin返回数据*/
       /*转换easyui读取格式 begin*/
        AppDatagrid dto=new AppDatagrid();
        dto.setRows(us);
        dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

        appResult.setData(dto); /*us*/
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


     /*zuoxiaochao*/
    /**Mall_Goods
     * 删除商品
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "deletemallgoods" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String deletemallgoods(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";
        int i;
        String sm_id = request.getParameter("sm_id");
        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String  mg_id = request.getParameter("mg_id");
        if(CommonUtil.isEmpty(mg_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品id不能为空");
            flag_pass = false;
        }
        if(CommonUtil.isEmpty(sm_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                i = mallGoodsService.deleteMall_GoodsById(CommonUtil.convert_Long(mg_id));
                if(i==1){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_DEL_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_DEL_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        //*end处理数据*//*

        //*begin返回数据*//*
        //其实就是封装数据

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }


    /**Mall_Goods
     * 上架商品
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "savemallgoodsstatus" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String savemallgoodsstatus(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage("商品操作成功");
        String rs="";
        int i;
        //*检查内容是否能过
        Boolean flag_pass=true;
        /*获得参数begin*/
        String  mg_id = request.getParameter("mg_id");
        String  sm_id = request.getParameter("sm_id");
        if(CommonUtil.isEmpty(mg_id)&&flag_pass==true){
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("商品id不能为空");
            flag_pass = false;
        }
        if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
            appResult.setStatus(Constants.RESULT_STATUS_FAIL);
            appResult.setMessage("请登录");
            flag_pass = false;
        }

        /*获得参数end*/
        if(flag_pass == true){
            //查询出用户列表
            try {
                Mall_Goods mg = new Mall_Goods();
                mg.setMg_id(CommonUtil.convert_Long(mg_id));
                mg.setMg_status(CommonUtil.convert_Byte(request.getParameter("mg_status")));
                i = mallGoodsService.updateMall_GoodsByStatus(mg);
                if (i==0){
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_EDIT_FAIL);
                };
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }

        }
        //*end处理数据*//*

        //*begin返回数据*//*
        //其实就是封装数据

        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        //*end返回数据*//*
        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

    //上传图片的地址
    @ResponseBody
    @RequestMapping(value = "uploadimage" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS}, produces = "text/html; charset=utf-8")
    public Object uploadimage(@RequestParam(value = "upfile")MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception{
	//    public Object uploadimage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        //设置几个默认的状态
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=UTF-8"); //application/json text/html
        JSONObject json=new JSONObject();
        logger.info("上传图片开始");
        String  filepath1="";
        try {
            if(file!=null){
            //   filepath1="D:/umeditor/image/"+file.getOriginalFilename();
            //   file.transferTo(new File(filepath1));//写入磁盘
            }else{
            }
            json.put("state", "SUCCESS");
            json.put("title", file.getOriginalFilename());
            json.put("url","http://testback.morsearch.com/um/2017.jpg");//修改为自己的图片保存路径
            json.put("original", file.getOriginalFilename());
            json.put("size",file.getSize());
            json.put("type",file.getContentType());
            json.put("physicsPath","");
            json.put("type","image/jpeg");
            out.print(json.toString());
	//	redisService.saveStringValue("aaa", String.valueOf(json),0);
		    
       //     String aa="<script>window.name='"+json.toString()+"'"+"</script>";
       //     aa="<script> window.name =\"{\"name\":\"hanzichi\", \"age\":10}\"; </script>";
      //      out.print(aa);
        } catch (Exception e) {
            json.put("state", "上传图片出错");
            out.print(json.toString());
            logger.error("上传图片出错",e);
        }
        /*end返回数据*/
        //处理数据格式
        out.close();
        return null;
    }

/*umeditor上传图片
leoli
2018.01.15
* */
    @ResponseBody
    @RequestMapping(value = "uploadimageum" ,method ={RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS}, produces = "text/html; charset=utf-8")
    public Object uploadimageum( HttpServletRequest request, HttpServletResponse response) throws Exception{
  //    public Object uploadimageum(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String type=request.getParameter("type");
        String sid=request.getParameter("sid");
        Boolean flag_pass=true;
        if (flag_pass==true&&(CommonUtil.isEmpty(sid)==true)) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("sid参数不能为空");
            flag_pass = false;
        };
        if (flag_pass==true) {
            try {
                if ("0".equals(type)) {
                    MultipartHttpServletRequest multipartRequest =WebUtils.getNativeRequest(request, MultipartHttpServletRequest.class);
                    MultipartFile file = multipartRequest.getFile("upfile");

                    JSONObject json = new JSONObject();
                    //上传的方法
                    String fileUrl = SequenceCreator.createNewFileName() +".jpg";
                    CommonUtil.upload(file,fileUrl,"1");

                   /* String filepath1 = "D:/umeditor/image/" + file.getOriginalFilename();
                    file.transferTo(new File(filepath1));//写入磁盘*/
                    Properties p = new Properties();
                    InputStream is = null;
                    is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
                    p.load(is);
                    String filename = p.getProperty("FTP_UEDITORIMAGE");

                    json.put("url",filename + fileUrl);//修改为自己的图片保存路径 "http://testback.morsearch.com/um/2017.jpg"
                    json.put("state", "SUCCESS");
                    json.put("title", fileUrl);
                    json.put("original",fileUrl);
                    json.put("size", file.getSize());
                    json.put("type", file.getContentType());
                    json.put("physicsPath", "");
                    json.put("type", "image/jpeg");
                    rs = json.toString();
                    redisService.saveStringValue(sid, String.valueOf(json),300);
                };

                if ("1".equals(type)) {
                  rs=redisService.getStringValue(sid);
                  redisService.deleteValue(sid);
                };
            } catch (Exception e) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(rs);
        rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }




    /***
     * @param request
     *MallV_Evaluate//商品评价
     * 订单评价列表(视图)
     * */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallvevaluatelist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallvevaluatelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

    /*处理逻辑 begin*/
        List<MallV_Evaluate> me = new ArrayList<>();
        if (flag_pass==true) {
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String, Object> map = new HashMap<String, Object>();

                map.put("pagestart", page.getPagestart());
                map.put("pagesize", page.getPagesize());

                map.put("se_orderno",request.getParameter("se_orderno"));//订单单号
                map.put("se_appraiser",request.getParameter("se_appraiser"));//评价人名称

                map.put("se_status",CommonUtil.convert_Byte(request.getParameter("se_status")));//状态
                map.put("statusname",CommonUtil.convert_Byte(request.getParameter("statusname")));//也是状态,这是是视图的状态
                //制表日期,审核日期
                //关于制表时间的查询
                map.put("se_createdate1",CommonUtil.queryTime1(request.getParameter("se_createdate1"),request.getParameter("se_createdate2")));
                map.put("se_createdate2",CommonUtil.queryTime2(request.getParameter("se_createdate1"),request.getParameter("se_createdate2")));
                //关于审核时间的查询
                map.put("se_confirmdate1",CommonUtil.queryTime1(request.getParameter("se_confirmdate1"),request.getParameter("se_confirmdate2")));
                map.put("se_confirmdate2",CommonUtil.queryTime2(request.getParameter("se_confirmdate1"),request.getParameter("se_confirmdate2")));


                me = mallEvaluateService.getMallV_EvaluateList(map);//list列表
                page.setRowcount(mallEvaluateService.getCountMallV_Evaluate(map));//list的大小
                appresult.setPage(page);
                if(!CommonUtil.isNullOrEmpty(me)&&me.size()>0){
                    appresult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
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



    /**
     * 商城商品 zuoxiaochao
     * Mall_Goods//商城商品有哪些,用来做商城首页热门物品的添加
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallgoodslistid1" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallgoodslistid1(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Mall_Goods> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                //状态,首先是查询这个id不在列表里面的
                us = mallGoodsService.getMall_GoodsListid1(map);
                page.setRowcount(mallGoodsService.getCountMall_Goodsid1(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/

        /*begin返回数据*/
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }



    /**
     * 商城商品 zuoxiaochao
     * Mall_Goods//商城商品有哪些,用来做商城首页品牌商品的展示
     */
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getmallgoodslistid2" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getmallgoodslistid2(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

        //设置几个默认的状态
        AppResult appResult = new AppResult();
        appResult.setStatus(Constants.RESULT_STATUS_SUCC);
        appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs="";

        Boolean flag_pass=true;/*检查内容是否能过*/
        List<Mall_Goods> us = new ArrayList<>();
        if(flag_pass == true){
            //查询出版本列表
            try {
                AppPage page = new AppPage();
                page.setPageindex(request.getParameter("pageindex"));/*当前页*/
                page.setPagesize(request.getParameter("pagesize"));/*分页*/
                Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
                map.put("pagestart",page.getPagestart());
                map.put("pagesize",page.getPagesize());
                //状态,首先是查询这个id不在列表里面的
                us = mallGoodsService.getMall_GoodsListid2(map);
                page.setRowcount(mallGoodsService.getCountMall_Goodsid2(map));
                appResult.setPage(page);

                if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
                    appResult.setStatus(Constants.RESULT_STATUS_SUCC);
                    appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
                }else{
                    appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appResult.setMessage(Constants.RESULT_MESSAGE_FAIL);
                }
            } catch (Exception e) {
                //打印错误的日志
                logger.error(e.getMessage());
                appResult.setStatus(Constants.RESULT_STATUS_FAIL);
                appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        }
        /*end处理数据*/

        /*begin返回数据*/
        appResult.setData(us);
        //转化为json格式()
        rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

        //处理数据格式
        out.print(rs);
        out.close();
        return null;
    }

}

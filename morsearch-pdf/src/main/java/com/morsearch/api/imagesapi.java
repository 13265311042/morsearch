package com.morsearch.api;

import com.alibaba.fastjson.JSONObject;
import com.morsearch.redis.RedisUtil;
import com.morsearch.util.CMYK;
import com.morsearch.util.Constants;
import com.morsearch.util.ImageTools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


/*图像处理切割
* leoli
* type  images=普通切割 ,shop=商城切割
* filename
* 2018.01.05*/


public class imagesapi extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        http://localhost:8220/imagesapi?imagefilename=201711241112550470.jpg
		String result="";
		HashMap<String, Object> maprut=new HashMap<String, Object>();
        maprut.put("status", "1");
        maprut.put("message", "OK");

        Boolean flag=true;
        String type=request.getParameter("type");
        String filename=request.getParameter("filename");

        Integer intcompress=30;//默认是0.3
        String compress=request.getParameter("compress");//压缩比
        if(compress!=null){
            intcompress=Integer.valueOf(compress);//传多少就压缩多少
        }
        if (type==null){type="images";};
        if (filename==null||"".equals(filename.trim())){
            maprut.put("status", "0");
            maprut.put("message", "无[filename]参数");
            flag=false;
        }
        if (flag==true){
		try
        {
            if (filename.toString().contains(".")==false){filename=filename+".jpg";};
            String itrut ="";
            if ("images".equals(type)){
                itrut=ImageTools.scaleImageL(Constants.FILE_IMAGES + "/" + filename, Constants.FILE_IMAGES + "/small/" + filename, intcompress);}
            if ("shop".equals(type)){
                itrut=ImageTools.scaleImageL(Constants.SHOP_IMAGES + "/" + filename, Constants.SHOP_IMAGES + "/small/" + filename, intcompress);}
/*
            if (itrut == false) {
                CMYK.readImage(Constants.FILE_IMAGES + "/" + filename);
                itrut = ImageTools.scaleImageL(Constants.FILE_IMAGES + "/" + filename, Constants.FILE_IMAGES + "/small/" + filename, 30);
              };
*/
            if (!"succ".equals(itrut)) {
                maprut.put("status", "0");
                maprut.put("message",itrut);
            };


        }
        catch (Exception ex)
        {
            maprut.put("status", "0");
            maprut.put("message",ex.getMessage());
			ex.printStackTrace();
        }
        };

        JSONObject json=new JSONObject();
        json.putAll(maprut);
        result=json.toString();

		response.setHeader("Content-type", "text/html;charset=UTF-8");
        BufferedWriter bw=new BufferedWriter(response.getWriter());
        bw.write(result);
        bw.flush();		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}

package com.morsearch.api;

import com.alibaba.fastjson.JSONObject;
import com.morsearch.redis.RedisUtil;
import com.morsearch.util.Constants;
import com.morsearch.util.PdfboxUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;

/*读取文档
* leoli
* 2018.02.02*/

public class readpmapi extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result="";
		HashMap<String, Object> maprut=new HashMap<String, Object>();

        Boolean flag=true;
        String filename=request.getParameter("filename");
        if (filename==null||"".equals(filename.trim())){
            maprut.put("status", "0");
            maprut.put("message", "无[filename]参数");
            flag=false;
        };

        if (flag==true){
		try
        {

            String aa="";//PdfboxUtil.getTextFromPDF(Constants.FILE_PDF+"/"+filename+".pdf");


            maprut.put("status", "1");
            maprut.put("message",aa);

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


;

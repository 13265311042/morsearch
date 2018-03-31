package com.morsearch.api;

import com.alibaba.fastjson.JSONObject;
import com.morsearch.db.JdbcExec;
import com.morsearch.redis.RedisUtil;
import com.morsearch.util.CommonUtil;
import com.morsearch.util.Constants;
import com.morsearch.util.ImageTools;
import com.morsearch.util.PdfboxUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/*文档处理切割
* leoli
* 2018.01.05*/

public class archivesapi extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result="";
		HashMap<String, Object> maprut=new HashMap<String, Object>();

        Boolean flag=true;
        String filename=request.getParameter("filename");
        String fid=request.getParameter("fid");
        if (filename==null||"".equals(filename.trim())){
            maprut.put("status", "0");
            maprut.put("message", "无[filename]参数");
            flag=false;
        };
        if (fid==null||"".equals(fid.trim())){
            maprut.put("status", "0");
            maprut.put("message", "无[fid]参数");
            flag=false;
        };


        if (flag==true&&(RedisUtil.getMapRow(Constants.REDIS_ARCHIVES,fid)!=null)) {
                maprut.put("status", "0");
                maprut.put("message", "当前文件正在处理，不必重复提交");
                flag=false;
        };


        if (flag==true){
		try
        {
            RedisUtil.saveMapRow(Constants.REDIS_ARCHIVES,fid,"1");

            ThreadPdf tpdf=new ThreadPdf(filename,fid);
            tpdf.start();

            maprut.put("status", "1");
            maprut.put("message", "服务器已接受处理，请稍等...");

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

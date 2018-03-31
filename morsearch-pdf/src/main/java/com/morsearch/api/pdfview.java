package com.morsearch.api;

import com.alibaba.fastjson.JSONObject;
import com.morsearch.util.Constants;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;


/*图像处理切割
* leoli
* 2018.01.05*/


public class pdfview extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        http://localhost:8220/imagesapi?imagefilename=201711241112550470.jpg
		String result="";
		HashMap<String, Object> maprut=new HashMap<String, Object>();
        maprut.put("status", "1");
        maprut.put("message", "OK");

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
            response.setContentType("application/pdf");
            FileInputStream in = new FileInputStream(new File(Constants.FILE_PDF+"/"+filename+".pdf"));
            OutputStream out = response.getOutputStream();
            byte[] b = new byte[512];
            while ((in.read(b)) != -1) {
                out.write(b);
            }
            out.flush();
            out.close();
            in.close();
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

		//response.setHeader("Content-type", "text/html;charset=UTF-8");
        BufferedWriter bw=new BufferedWriter(response.getWriter());
        bw.write(result);
        bw.flush();		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}

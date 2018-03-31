package com.morsearch.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ControllerUtils {
	/**
	 * 获取PrintWriter
	 * @param response
	 * @param logger2
	 * @param logmsg
	 * @return PrintWriter
	 * @throws Exception
	 */
	public static PrintWriter getPrintWriter(HttpServletResponse response, Logger logger2, String logmsg) throws Exception {
		if (response != null) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=UTF-8"); //application/json
			response.setHeader("cache-control", "no-cache");
/*解决vue post请求 begin*/
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Max-Age", "3600");
			response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,logintoken");
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
			response.setHeader("Access-Control-Allow-Credentials","true"); //是否允许浏览器携带用户身份信息（cookie）
/*
			response.setHeader("Access-Control-Allow-Origin","*");
			response.setHeader("Access-Control-Allow-Credentials","true");
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
			response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
*/


/*解决vue post请求 end*/


			if (logger2.isInfoEnabled()) {
				logger2.info(logmsg);
			}
			return response.getWriter();
		}
		return null;
	}

	
   /**
    * 通过请求路径获取json数据
    * @param url
    * @return
    */
	
	public static String loadJson (String url) {  
	        StringBuilder json = new StringBuilder();  
	        try {  
	            URL urlObject = new URL(url);  
	            URLConnection uc = urlObject.openConnection();  
	            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));  
	            String inputLine = null;  
	            while ( (inputLine = in.readLine()) != null) {  
	                json.append(inputLine);  
	            }  
	            in.close();  
	        } catch (MalformedURLException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        return json.toString();  
	   }  

}

package com.morsearch.base;


import com.cloopen.rest.sdk.CCPRestSmsSDK;
import com.morsearch.common.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;


public class SDKSendSMS {
	/** FIXME */
    private static Logger logger = LoggerFactory.getLogger(SDKSendSMS.class);
       
    /** 初始化的参数 */
    /**初始化服务器地址*/
    public static String serverIP = "app.cloopen.com";//"sandboxapp.cloopen.com";//开发测试
    /**初始化服务器端口*/
    public static String serverPort = "8883";

    public static String accountSid = "8a216da85e7e4bbd015e9d083c820c2b";/**初始化主帐号*/
	public static String accountToken ="7bdf1777ca1441589f498a9aba65f061"; /**初始化主帐号令牌*/
	public static String appId = "8a216da85e7e4bbd015e9e7f7cbf0ea1";/**初始化初始化应用ID*/

    /**初始化模板ID，在平台上创建的短信模板的ID值；测试的时候可以使用系统的默认模板，id为1*/
    public static String templateId = "1";//"1";
    /**返回成功代码*/
    private static final String SUCCESSCODE = "000000";
    /**返回状态代码*/
    private static final String STATUSCODE = "statusCode";
    /**返回状态消息*/
    private static final String STATUSMSG = "statusMsg";
   
    
    public static void sendMsg(String to, String templateId, String[] datas) {
		HashMap<String, Object> result = null;

		//初始化SDK
		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
		
		//******************************注释*********************************************
		//*初始化服务器地址和端口                                                       *
		//*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
		//*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
		//*******************************************************************************
		restAPI.init(serverIP, serverPort);
		
		//******************************注释*********************************************
		//*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
		//*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
		//*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
		//*******************************************************************************
		restAPI.setAccount(accountSid, accountToken);		
		
		//******************************注释*********************************************
		//*初始化应用ID                                                                 *
		//*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
		//*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
		//*******************************************************************************
		restAPI.setAppId(appId);
		result = restAPI.sendTemplateSMS(to, templateId, datas);
	
		if(!SUCCESSCODE.equals(result.get(STATUSCODE))){			
			//异常返回输出错误码和错误信息
            logger.error("出错信息：", "错误码=" + result.get(STATUSCODE) +" 错误信息= "+result.get(STATUSMSG));
		}
	}
	
    
    public static String sendMsgToPhone(String to, String templateId, String[] datas) {
    	if(CommonUtil.isEmpty(to)) {//如果电话为空，则返回失败
    		return "电话号码为空";
    	}
		HashMap<String, Object> result = null;
		//初始化SDK
		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
		//******************************注释*********************************************
		//*初始化服务器地址和端口                                                       *
		//*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
		//*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
		//*******************************************************************************
		restAPI.init(serverIP, serverPort);
		//******************************注释*********************************************
		//*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
		//*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
		//*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
		//*******************************************************************************
		restAPI.setAccount(accountSid, accountToken);		
		//******************************注释*********************************************
		//*初始化应用ID                                                                 *
		//*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
		//*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
		//*******************************************************************************
		restAPI.setAppId(appId);
		result = restAPI.sendTemplateSMS(to, templateId, datas);
		if(!SUCCESSCODE.equals(result.get(STATUSCODE))){
			//异常返回输出错误码和错误信息
        //    logger.error("出错信息：", "错误码=" + result.get(STATUSCODE) +" 错误信息= "+result.get(STATUSMSG));
            System.out.println("SMS Send Error:"+"errorCode=" + result.get(STATUSCODE) +" errorMsg= "+result.get(STATUSMSG));
            return (String) result.get(STATUSMSG);
		}else{
			return "1";
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//******************************注释****************************************************************
		//*调用发送模板短信的接口发送短信                                                                  *
		//*参数顺序说明：                                                                                  *
		//*第一个参数:是要发送的手机号码，可以用逗号分隔，一次最多支持100个手机号                          *
		//*第二个参数:是模板ID，在平台上创建的短信模板的ID值；测试的时候可以使用系统的默认模板，id为1。    *
		//*系统默认模板的内容为“【云通讯】您使用的是云通讯短信模板，您的验证码是{1}，请于{2}分钟内正确输入”*
		//*第三个参数是要替换的内容数组。																														       *
		//**************************************************************************************************
		//**************************************举例说明***********************************************************************
		//*假设您用测试Demo的APP ID，则需使用默认模板ID 1，发送手机号是13800000000，传入参数为6532和5，则调用方式为           *
		//*result = restAPI.sendTemplateSMS("13800000000","1" ,new String[]{"6532","5"});																		  *
		//*则13800000000手机号收到的短信内容是：【云通讯】您使用的是云通讯短信模板，您的验证码是6532，请于5分钟内正确输入     *
		//*********************************************************************************************************************
		String verificationCode = String.valueOf(genVerCode());
		sendMsgToPhone("13113623020", "1", new String[]{"1111", "2222" });

	}
	
	public static int genVerCode() {
		return(int)((Math.random()*9+1)*100000);
	}
}

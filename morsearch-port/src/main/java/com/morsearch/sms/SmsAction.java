package com.morsearch.sms;

import com.morsearch.base.BaseController;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class SmsAction extends BaseController {
	private String result;
	/** FIXME */
	/**
	 * 
	 */
/*
	private static final long serialVersionUID = 1L;
	private SmsreplyService smsreplyService;
	private String phoneno;
	private String content;
	MessageByAjax msgBean;
	

	public MessageByAjax getMsgBean() {
		return msgBean;
	}

	public void setMsgBean(MessageByAjax msgBean) {
		this.msgBean = msgBean;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SmsreplyService getSmsreplyService() {
		return smsreplyService;
	}

	public void setSmsreplyService(SmsreplyService smsreplyService) {
		this.smsreplyService = smsreplyService;
	}

	public String getResult() {

		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void feedback() throws IOException {

		HttpServletRequest req = ServletActionContext.getRequest();
		StringBuilder sb = new StringBuilder();
		req.setCharacterEncoding("utf8");
		BufferedReader reader = req.getReader();
		try {
			char[] buff = new char[1024];
			int len;
			while ((len = reader.read(buff)) != -1) {
				sb.append(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println(sb.toString());
		//用sax解析xml返回map
		ArrayList<Map<String, String>> list = (ArrayList<Map<String, String>>) Myhandler.ReadXML(sb.toString(),
				"Request");
		if (list.size() > 0) {
			Map<String, String> mapValue = list.get(0);
			Smsreply smsreply = new Smsreply();
			smsreply.setContent(mapValue.get("content"));
			smsreply.setTel(mapValue.get("fromNum"));
			smsreply.setCrttime(new Date());
			smsreply.setStatus(0);
			smsreplyService.save(smsreply);
		}

		result = "";
		
	}
	public String displayTestSms() {
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("phone", req.getSession().getAttribute("sms.test.phone"));
		return ActionSupport.SUCCESS;
	}
	public String submitTestSms() {
		HttpServletRequest req = ServletActionContext.getRequest();
		req.getSession().setAttribute("sms.test.phone", this.getPhoneno());
		Smsreply smsreply = new Smsreply();				
		smsreply.setContent(this.getContent());
		smsreply.setTel(this.getPhoneno());
		smsreply.setCrttime(new Date());
		smsreply.setStatus(0);
		smsreplyService.save(smsreply);		
		msgBean=new MessageByAjax();
		msgBean.setSuccess(true);
		msgBean.setMessage("发送成功!");
		return ActionSupport.SUCCESS;
	}
	public String test() {

		return ActionSupport.SUCCESS;
	}
*/

}

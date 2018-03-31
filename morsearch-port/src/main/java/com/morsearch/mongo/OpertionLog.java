package com.morsearch.mongo;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Entity;
/**
 * 操作日志model
 * @author shimingbo
 *
 */
@Entity("admin_OpertionLog")
public class OpertionLog {

	@Id
    private ObjectId id;
	//功能模块
    private String menuName;
    //操作类型
    private String opertionType;
  //操作人员id
    private String userid;
	private String username;
    //操作内容
    private String opertionContent;
    //操作时间
    private Date logTime;
    
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getOpertionType() {
		return opertionType;
	}
	public void setOpertionType(String opertionType) {
		this.opertionType = opertionType;
	}
	public String getOpertionContent() {
		return opertionContent;
	}
	public void setOpertionContent(String opertionContent) {
		this.opertionContent = opertionContent;
	}
	public Date getLogTime() {
		return logTime;
	}
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

package com.zll.entity.user;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class UserLoginLog extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户id   
	private int userId;
	//loginIp   
	private String loginIp;
	//loginTime   
	private Date loginTime;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setLoginIp(String value) {
		this.loginIp = value;
	}
	
	public String getLoginIp() {
		return this.loginIp;
	}
	public String getLoginTimeString() {
		return DateUtil.formatDatetime(getLoginTime());
	}
	public void setLoginTimeString(String value) {
		setLoginTime(DateUtil.parseDatetime(value));
	}
	
	public void setLoginTime(Date value) {
		this.loginTime = value;
	}
	
	public Date getLoginTime() {
		return this.loginTime;
	}

}


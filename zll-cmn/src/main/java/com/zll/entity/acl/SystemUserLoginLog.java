package com.zll.entity.acl;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class SystemUserLoginLog extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//系统用户id   
	private int adminId;
	//loginIp   
	private String loginIp;
	//loginTime   
	private Date loginTime;

	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
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


package com.zll.entity.common;

import javacommon.base.BaseEntity;

public class SystemOperateLog extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//操作类型   
	private String operateType;
	//类型id   
	private int operateTypeId;
	//操作的内容   
	private String content;
	//0：管理员用户，1：会员用户
	private int userType;
	//操作人id   
	private int userTypeId;

	
	public void setOperateType(String value) {
		this.operateType = value;
	}
	
	public String getOperateType() {
		return this.operateType;
	}
	
	public int getOperateTypeId() {
		return operateTypeId;
	}

	public void setOperateTypeId(int operateTypeId) {
		this.operateTypeId = operateTypeId;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	
}


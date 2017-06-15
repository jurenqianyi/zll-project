package com.zll.entity.common;

import javacommon.base.BaseEntity;


public class SystemRemark extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//备注类型   
	private String remarkType;
	//类型id   
	private int remarkTypeId;
	//备注的内容   
	private String content;
	//操作人id   
	private String actionUser;

	
	public void setRemarkType(String value) {
		this.remarkType = value;
	}
	
	public String getRemarkType() {
		return this.remarkType;
	}
	
	public int getRemarkTypeId() {
		return remarkTypeId;
	}

	public void setRemarkTypeId(int remarkTypeId) {
		this.remarkTypeId = remarkTypeId;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}

	public String getActionUser() {
		return actionUser;
	}

	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}
	
}


package com.zll.entity.common;

import javacommon.base.BaseEntity;


public class Remark extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//备注类型   
	private String remarkType;
	//类型id   
	private int remarkTypeId;
	//备注的内容   
	private String content;
	//操作人id   
	private int adminId;

	
	public void setRemarkType(String value) {
		this.remarkType = value;
	}
	
	public String getRemarkType() {
		return this.remarkType;
	}
	
	public void setRemarkTypeId(int value) {
		this.remarkTypeId = value;
	}
	
	public int getRemarkTypeId() {
		return this.remarkTypeId;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


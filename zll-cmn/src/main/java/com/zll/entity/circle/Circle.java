package com.zll.entity.circle;

import javacommon.base.BaseEntity;


public class Circle extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//圈子名称   
	private int name;
	//图片   
	private String imgUrl;
	//描述   
	private String content;
	//浏览量   
	private int pv;
	//状态   
	private int status;
	//创建人id   
	private int userId;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setName(int value) {
		this.name = value;
	}
	
	public int getName() {
		return this.name;
	}
	
	public void setImgUrl(String value) {
		this.imgUrl = value;
	}
	
	public String getImgUrl() {
		return this.imgUrl;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


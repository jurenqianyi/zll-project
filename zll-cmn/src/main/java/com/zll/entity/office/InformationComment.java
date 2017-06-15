package com.zll.entity.office;

import javacommon.base.BaseEntity;


public class InformationComment extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//动态信息id   
	private int informationId;
	//律师id   
	private int lawyerId;
	//评论内容   
	private String content;

	
	public void setInformationId(int value) {
		this.informationId = value;
	}
	
	public int getInformationId() {
		return this.informationId;
	}
	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}

}


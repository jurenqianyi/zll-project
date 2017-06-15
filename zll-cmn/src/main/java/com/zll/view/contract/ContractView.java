package com.zll.view.contract;

import javacommon.view.Body;

public class ContractView implements Body {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 类型id
	private int typeId;
	// 标题
	private String title;
	// 简介
	private String summary;
	// 内容
	private String content;
	// 路径
	private String fileUrl;
	// 价格
	private String price;
	
	public int getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(int value) {
		this.typeId = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getFileUrl() {
		return this.fileUrl;
	}
	
	public void setFileUrl(String value) {
		this.fileUrl = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
}


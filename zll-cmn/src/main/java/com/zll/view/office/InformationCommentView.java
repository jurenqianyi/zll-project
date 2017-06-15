package com.zll.view.office;

import javacommon.view.Body;

public class InformationCommentView implements Body {

	// 动态信息id
	private int informationId;
	// 律师id
	private int lawyerId;
	// 评论内容
	private String content;

	public int getInformationId() {
		return this.informationId;
	}
	
	public void setInformationId(int value) {
		this.informationId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
}


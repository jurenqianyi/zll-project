package com.zll.view.circle;

import javacommon.view.Body;


public class CircleAskRecordView implements Body {
	
	private static final long serialVersionUID = 1L;
	
	//提问表id   
	private int askId;
	//内容   
	private String content;

	
	public void setAskId(int value) {
		this.askId = value;
	}
	
	public int getAskId() {
		return this.askId;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}

}


package com.zll.view.circle;

import javacommon.view.Body;


public class CircleAskView implements Body {
	
	private static final long serialVersionUID = 1L;
	
	//圈子id
	private int circleId;
	//领域一级   
	private int fieldId1;
	//领域二级   
	private int fieldId2;
	private String askTitle;
	private String askSummary;
	//咨询内容   
	private String askContent;
	//打赏金额   
	private String price;
	
	public int getCircleId() {
		return circleId;
	}

	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}

	public void setFieldId1(int value) {
		this.fieldId1 = value;
	}
	
	public int getFieldId1() {
		return this.fieldId1;
	}
	
	public String getAskTitle() {
		return askTitle;
	}

	public void setAskTitle(String askTitle) {
		this.askTitle = askTitle;
	}

	public void setFieldId2(int value) {
		this.fieldId2 = value;
	}
	
	public int getFieldId2() {
		return this.fieldId2;
	}
	
	public String getAskSummary() {
		return askSummary;
	}

	public void setAskSummary(String askSummary) {
		this.askSummary = askSummary;
	}

	public void setAskContent(String value) {
		this.askContent = value;
	}
	
	public String getAskContent() {
		return this.askContent;
	}

	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
}


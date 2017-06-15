package com.zll.view.lawyer;

import javacommon.view.Body;


public class LawyerQuestionRecordView implements Body {
	
	//提问表id   
	private int questionId;
	//内容   
	private String content;
	//回复律师id
	private int lawyerId;

	public void setQuestionId(int value) {
		this.questionId = value;
	}
	
	public int getQuestionId() {
		return this.questionId;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}

	public int getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}

}


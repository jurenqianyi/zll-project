package com.zll.view.lawyer;

import javacommon.base.BaseEntity;
import javacommon.view.Body;


public class LawyerQuestionView implements Body {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//提问人用户id（用户表的主键user_id）   
	private int userId;
	//领域一级   
	private int fieldId1;
	//领域二级   
	private int fieldId2;
	//问题   
	private String question;
	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setFieldId1(int value) {
		this.fieldId1 = value;
	}
	
	public int getFieldId1() {
		return this.fieldId1;
	}
	
	public void setFieldId2(int value) {
		this.fieldId2 = value;
	}
	
	public int getFieldId2() {
		return this.fieldId2;
	}
	
	public void setQuestion(String value) {
		this.question = value;
	}
	
	public String getQuestion() {
		return this.question;
	}

}


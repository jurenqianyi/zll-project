package com.zll.view.lawyer;

import javacommon.view.Body;

public class LawyerAppointView implements Body {

	// 律师Id
	private java.lang.Integer lawyerId;
	// 约见方式 0:见面 1:电话约谈
	private int method;
	// 请教问题
	private java.lang.String ask;
	// 电话
	private java.lang.String phone;
	
	public java.lang.Integer getLawyerId() {
		return this.lawyerId;
	}
	
	public void setLawyerId(java.lang.Integer value) {
		this.lawyerId = value;
	}
	
	public int getMethod() {
		return this.method;
	}
	
	public void setMethod(int value) {
		this.method = value;
	}
	
	public java.lang.String getAsk() {
		return this.ask;
	}
	
	public void setAsk(java.lang.String value) {
		this.ask = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
}


package com.zll.view.trade;

import javacommon.view.Body;


public class UserWithdrawView implements Body {

	// 银行类型
	private java.lang.Integer bankType;
	// 卡号
	private java.lang.String bankNo;
	// 持卡人姓名
	private java.lang.String name;
	// 开户地址
	private java.lang.String adress;
	// 提现金额
	private String money;
	// 属性
	private java.lang.String attr;
	
	// 0:不可用 1:可用
	private int enableFlag;
	
	public java.lang.Integer getBankType() {
		return this.bankType;
	}
	
	public void setBankType(java.lang.Integer value) {
		this.bankType = value;
	}
	
	public java.lang.String getBankNo() {
		return this.bankNo;
	}
	
	public void setBankNo(java.lang.String value) {
		this.bankNo = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getAdress() {
		return this.adress;
	}
	
	public void setAdress(java.lang.String value) {
		this.adress = value;
	}
	
	public String getMoney() {
		return this.money;
	}
	
	public void setMoney(String value) {
		this.money = value;
	}
	
	public java.lang.String getAttr() {
		return this.attr;
	}
	
	public void setAttr(java.lang.String value) {
		this.attr = value;
	}
	
}


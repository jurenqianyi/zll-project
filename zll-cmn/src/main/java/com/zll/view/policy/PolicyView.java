package com.zll.view.policy;

import javacommon.view.Body;

public class PolicyView implements Body {

	//被保姓名   
	private String name;
	//被保人电话   
	private String phone;
	//被保人身份（0：个人 1：企业）   
	private int type;
	//保险公司id
	private int insurerId;
	private String policyAmount;
	//提交内容   
	private String files1;
	private String attr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getInsurerId() {
		return insurerId;
	}
	public void setInsurerId(int insurerId) {
		this.insurerId = insurerId;
	}
	public String getFiles1() {
		return files1;
	}
	public void setFiles1(String files1) {
		this.files1 = files1;
	}
	public String getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(String policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	
	
}


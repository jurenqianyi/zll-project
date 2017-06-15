package com.zll.entity.policy;

import javacommon.base.BaseEntity;


public class Policy extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//保单号   
	private String policyNo;
	//保单创建人用户类型（0：太保人员 1：业务律师）   
	private int userType;
	//用户类型id   
	private int userTypeId;
	//用户层级
	private String level;
	//被保姓名   
	private String name;
	//被保人电话   
	private String phone;
	//被保人身份（0：个人 1：企业）   
	private int type;
	//提交内容   
	private String files1;
	//承保意见   
	private String files2;
	private String files3;
	private String files4;
	//风险评分   
	private String grade;
	//保费
	private String amount;
	private String tradeNo;
	private String policyAmount;
	//保单状态   
	private int status;
	private int policyStatus;
	private String attr;
	private int insurerId;
	private String describe;
	
	public void setPolicyNo(String value) {
		this.policyNo = value;
	}
	
	public String getPolicyNo() {
		return this.policyNo;
	}
	
	public void setUserType(int value) {
		this.userType = value;
	}
	
	public int getUserType() {
		return this.userType;
	}
	
	public void setUserTypeId(int value) {
		this.userTypeId = value;
	}
	
	public int getUserTypeId() {
		return this.userTypeId;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	
	public void setFiles1(String value) {
		this.files1 = value;
	}
	
	public String getFiles1() {
		return this.files1;
	}
	
	public void setFiles2(String value) {
		this.files2 = value;
	}
	
	public String getFiles2() {
		return this.files2;
	}
	
	public String getFiles4() {
		return files4;
	}

	public void setFiles4(String files4) {
		this.files4 = files4;
	}

	public void setGrade(String value) {
		this.grade = value;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(String policyAmount) {
		this.policyAmount = policyAmount;
	}

	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}

	public String getFiles3() {
		return files3;
	}

	public void setFiles3(String files3) {
		this.files3 = files3;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public int getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(int policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public int getInsurerId() {
		return insurerId;
	}

	public void setInsurerId(int insurerId) {
		this.insurerId = insurerId;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}


}


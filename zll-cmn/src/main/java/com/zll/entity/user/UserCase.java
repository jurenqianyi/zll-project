package com.zll.entity.user;

import javacommon.base.BaseEntity;


public class UserCase extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//领域id   
	private int fieldId1;
	//领域id   
	private int fieldId2;
	//案件类型（0：原告 1：被告）   
	private int caseType;
	//标题   
	private String title;
	//联系电话   
	private String phone;
	//省   
	private int provinceId;
	//市   
	private int cityId;
	//区   
	private int areaId;
	//涉案金额   
	private String amount;
	//特殊要求   
	private String demand;
	//案件简介   
	private String summary;
	//案件详情   
	private String content;
	//委托状态（0：普通 1：紧急）   
	private int entrustStatus;
	//置顶   
	private int isTop;
	//推荐   
	private int isPush;
	//首页   
	private int isIndex;
	//状态 0：默认 1：通过 2：不通过   
	private int status;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
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
	
	public void setCaseType(int value) {
		this.caseType = value;
	}
	
	public int getCaseType() {
		return this.caseType;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setProvinceId(int value) {
		this.provinceId = value;
	}
	
	public int getProvinceId() {
		return this.provinceId;
	}
	
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	
	public void setAreaId(int value) {
		this.areaId = value;
	}
	
	public int getAreaId() {
		return this.areaId;
	}
	
	public void setAmount(String value) {
		this.amount = value;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setDemand(String value) {
		this.demand = value;
	}
	
	public String getDemand() {
		return this.demand;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setEntrustStatus(int value) {
		this.entrustStatus = value;
	}
	
	public int getEntrustStatus() {
		return this.entrustStatus;
	}
	
	public void setIsTop(int value) {
		this.isTop = value;
	}
	
	public int getIsTop() {
		return this.isTop;
	}
	
	public void setIsPush(int value) {
		this.isPush = value;
	}
	
	public int getIsPush() {
		return this.isPush;
	}
	
	public void setIsIndex(int value) {
		this.isIndex = value;
	}
	
	public int getIsIndex() {
		return this.isIndex;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


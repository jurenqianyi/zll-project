package com.zll.entity.finance;

import javacommon.base.BaseEntity;


public class Finance extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//userId   
	private int userId;
	//申请人名称   
	private String applyName;
	//联系人手机   
	private String contactPhone;
	//联系人名称   
	private String contactName;
	private String amount;
	//省   
	private int provinceId;
	//市   
	private int cityId;
	//区   
	private int areaId;
	//案由   
	private String describe;
	//案件描述   
	private String content;
	//状态（0：默认 1：在线 2：忙碌）   
	private int status;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setApplyName(String value) {
		this.applyName = value;
	}
	
	public String getApplyName() {
		return this.applyName;
	}
	
	public void setContactPhone(String value) {
		this.contactPhone = value;
	}
	
	public String getContactPhone() {
		return this.contactPhone;
	}
	
	public void setContactName(String value) {
		this.contactName = value;
	}
	
	public String getContactName() {
		return this.contactName;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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
	
	public void setDescribe(String value) {
		this.describe = value;
	}
	
	public String getDescribe() {
		return this.describe;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}

}


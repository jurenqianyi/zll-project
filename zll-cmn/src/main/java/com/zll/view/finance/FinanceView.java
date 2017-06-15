package com.zll.view.finance;

import javacommon.view.Body;


public class FinanceView implements Body {

	// 申请人名称
	private String applyName;
	// 联系人手机
	private String contactPhone;
	// 联系人名称
	private String contactName;
	private String amount;
	// 省
	private Integer provinceId;
	// 市
	private Integer cityId;
	// 区
	private Integer areaId;
	// 案由
	private String describe;
	// 案件描述
	private String content;

	public String getApplyName() {
		return this.applyName;
	}
	
	public void setApplyName(String value) {
		this.applyName = value;
	}
	
	public String getContactPhone() {
		return this.contactPhone;
	}
	
	public void setContactPhone(String value) {
		this.contactPhone = value;
	}
	
	public String getContactName() {
		return this.contactName;
	}
	
	public void setContactName(String value) {
		this.contactName = value;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}
	
	public void setProvinceId(Integer value) {
		this.provinceId = value;
	}
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	public Integer getAreaId() {
		return this.areaId;
	}
	
	public void setAreaId(Integer value) {
		this.areaId = value;
	}
	
	public String getDescribe() {
		return this.describe;
	}
	
	public void setDescribe(String value) {
		this.describe = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
}


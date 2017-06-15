package com.zll.entity.law;

import javacommon.base.BaseEntity;


public class LawUnion extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师姓名   
	private String name;
	//logo   
	private String logoUrl;
	//公司网址   
	private String website;
	//律所人员规模（来自dictonary的主键id）   
	private int personScopeId;
	//律所资金规模id   
	private int moneyScopeId;
	//省   
	private int provinceId;
	//市   
	private int cityId;
	//区   
	private int areaId;
	//详细地址   
	private String adress;
	//邮箱   
	private String email;
	//联系人   
	private String contacts;
	//联系电话   
	private String phone;
	//加盟金额   
	private int amount;
	//营业领域   
	private String field;
	//其他信息   
	private String content;
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

	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLogoUrl(String value) {
		this.logoUrl = value;
	}
	
	public String getLogoUrl() {
		return this.logoUrl;
	}
	
	public void setWebsite(String value) {
		this.website = value;
	}
	
	public String getWebsite() {
		return this.website;
	}
	
	public void setPersonScopeId(int value) {
		this.personScopeId = value;
	}
	
	public int getPersonScopeId() {
		return this.personScopeId;
	}
	
	public void setMoneyScopeId(int value) {
		this.moneyScopeId = value;
	}
	
	public int getMoneyScopeId() {
		return this.moneyScopeId;
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
	
	public void setAdress(String value) {
		this.adress = value;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setContacts(String value) {
		this.contacts = value;
	}
	
	public String getContacts() {
		return this.contacts;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setAmount(int value) {
		this.amount = value;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setField(String value) {
		this.field = value;
	}
	
	public String getField() {
		return this.field;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
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


package com.zll.entity.user;

import javacommon.base.BaseEntity;


public class UserBaseinfo extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户id   
	private int userId;
	//姓名   
	private String name;
	//电话   
	private String phone;
	//email   
	private String email;
	//头像   
	private String headUrl;
	//性别 0：男 1：女   
	private int sex;
	//身份证号   
	private String idNo;
	//省   
	private int provinceId;
	//市   
	private int cityId;
	//区   
	private int areaId;
	//详细地址   
	private String adress;
	//操作员   
	private int adminId;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
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
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setHeadUrl(String value) {
		this.headUrl = value;
	}
	
	public String getHeadUrl() {
		return this.headUrl;
	}
	
	public void setSex(int value) {
		this.sex = value;
	}
	
	public int getSex() {
		return this.sex;
	}
	
	public void setIdNo(String value) {
		this.idNo = value;
	}
	
	public String getIdNo() {
		return this.idNo;
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
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


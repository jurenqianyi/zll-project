package com.zll.view.user;

import javacommon.view.Body;


public class UserBaseinfoView implements Body {

	// 主键id
	private java.lang.Integer id;
	// 用户id
	private java.lang.Integer userId;
	// 姓名
	private java.lang.String name;
	// 电话
	private java.lang.String phone;
	// email
	private java.lang.String email;
	// 头像
	private java.lang.String headUrl;
	// 性别 0：男 1：女
	private int sex;
	// 身份证号
	private java.lang.String idNo;
	// 省
	private java.lang.Integer provinceId;
	// 市
	private java.lang.Integer cityId;
	// 区
	private java.lang.Integer areaId;
	// 详细地址
	private java.lang.String adress;
	// 操作员
	private java.lang.Integer adminId;
	// 创建时间
	private java.lang.String createTimeBegin;
	private java.lang.String createTimeEnd;
	// 更新时间
	private java.lang.String updateTimeBegin;
	private java.lang.String updateTimeEnd;
	// 0:不可用 1:可用
	private int enableFlag;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getHeadUrl() {
		return this.headUrl;
	}
	
	public void setHeadUrl(java.lang.String value) {
		this.headUrl = value;
	}
	
	public int getSex() {
		return this.sex;
	}
	
	public void setSex(int value) {
		this.sex = value;
	}
	
	public java.lang.String getIdNo() {
		return this.idNo;
	}
	
	public void setIdNo(java.lang.String value) {
		this.idNo = value;
	}
	
	public java.lang.Integer getProvinceId() {
		return this.provinceId;
	}
	
	public void setProvinceId(java.lang.Integer value) {
		this.provinceId = value;
	}
	
	public java.lang.Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(java.lang.Integer value) {
		this.cityId = value;
	}
	
	public java.lang.Integer getAreaId() {
		return this.areaId;
	}
	
	public void setAreaId(java.lang.Integer value) {
		this.areaId = value;
	}
	
	public java.lang.String getAdress() {
		return this.adress;
	}
	
	public void setAdress(java.lang.String value) {
		this.adress = value;
	}
	
	public java.lang.Integer getAdminId() {
		return this.adminId;
	}
	
	public void setAdminId(java.lang.Integer value) {
		this.adminId = value;
	}
	
	public java.lang.String getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	public void setCreateTimeBegin(java.lang.String value) {
		this.createTimeBegin = value;
	}	
	
	public java.lang.String getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	public void setCreateTimeEnd(java.lang.String value) {
		this.createTimeEnd = value;
	}
	
	public java.lang.String getUpdateTimeBegin() {
		return this.updateTimeBegin;
	}
	
	public void setUpdateTimeBegin(java.lang.String value) {
		this.updateTimeBegin = value;
	}	
	
	public java.lang.String getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}
	
	public void setUpdateTimeEnd(java.lang.String value) {
		this.updateTimeEnd = value;
	}
	
	public int getEnableFlag() {
		return this.enableFlag;
	}
	
	public void setEnableFlag(int value) {
		this.enableFlag = value;
	}
	

	
}


package com.zll.view.register;

import javacommon.view.Body;

public class LawyerView implements Body {

	// 电话
	private String phone;
	// 验证码
	private String code;
	// 密码
	private String password;
	// 名称
	private String name;
	// 律师证号
	private String lawyerNo;
	// 所在律所
	private String lawName;
	// 省
	private int provinceId;
	// 市
	private int cityId;
	// 区
	private int areaId;
	private int source;
	
	//是否校验
	private boolean isValidate;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLawyerNo() {
		return lawyerNo;
	}

	public void setLawyerNo(String lawyerNo) {
		this.lawyerNo = lawyerNo;
	}

	public String getLawName() {
		return lawName;
	}

	public void setLawName(String lawName) {
		this.lawName = lawName;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public boolean isValidate() {
		return isValidate;
	}

	public void setValidate(boolean isValidate) {
		this.isValidate = isValidate;
	}

}

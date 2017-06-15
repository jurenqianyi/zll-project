package com.zll.entity.cms;

import javacommon.base.BaseEntity;


public class Meet extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//orderNo   
	private String orderNo;
	//1：學生 2：律師 3：普通   
	private int type;
	//price   
	private String price;
	private int num;
	//手機   
	private String phone;
	//名称   
	private String name;
	//學校   
	private String school;
	//專業   
	private String major;
	//律所   
	private String law;
	//律師証   
	private String lawyerNo;
	//email   
	private String email;
	//企業名稱   
	private String company;
	//職位   
	private String job;
	//fileUrl   
	private String fileUrl;
	//状态（0：默认 1：在线 2：忙碌）   
	private int status;
	
	private String seat;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLaw() {
		return law;
	}
	public void setLaw(String law) {
		this.law = law;
	}
	public String getLawyerNo() {
		return lawyerNo;
	}
	public void setLawyerNo(String lawyerNo) {
		this.lawyerNo = lawyerNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

}


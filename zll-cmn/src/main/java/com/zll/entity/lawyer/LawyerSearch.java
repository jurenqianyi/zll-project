package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerSearch extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//律师姓名   
	private String name;
	//联系电话   
	private String phone;
	//擅长领域id串（来自dictonary的主键id）   
	private String field;
	//执业律所   
	private String lawName;
	//职位   
	private String job;
	//详细地址   
	private String adress;
	//律师执业证号   
	private String lawyerNo;
	//关键词（SEO推广）   
	private String keyword;
	//执业感言   
	private String feel;
	//简介（纯文本）   
	private String summary;
	//介绍（富文本）   
	private String content;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
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
	
	public void setField(String value) {
		this.field = value;
	}
	
	public String getField() {
		return this.field;
	}
	
	public String getLawName() {
		return lawName;
	}

	public void setLawName(String lawName) {
		this.lawName = lawName;
	}

	public void setJob(String value) {
		this.job = value;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setAdress(String value) {
		this.adress = value;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setLawyerNo(String value) {
		this.lawyerNo = value;
	}
	
	public String getLawyerNo() {
		return this.lawyerNo;
	}
	
	public void setKeyword(String value) {
		this.keyword = value;
	}
	
	public String getKeyword() {
		return this.keyword;
	}
	
	public void setFeel(String value) {
		this.feel = value;
	}
	
	public String getFeel() {
		return this.feel;
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

}


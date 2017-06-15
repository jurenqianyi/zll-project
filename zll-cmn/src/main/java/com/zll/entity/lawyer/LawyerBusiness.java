package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerBusiness extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//是否支持见面 0:默认 1:支持   
	private int isMeet;
	//是否支持电话 0:默认 1:支持   
	private int isTel;
	//是否接收案件 0:默认 1:支持   
	private int isCase;
	//见面预约次数   
	private int meetCount;
	//电话预约次数   
	private int telCount;
	//接收案例个数   
	private int caseCount;
	//咨询个数   
	private int askCount;
	//赞数   
	private int likeCount;
	//关注个数   
	private int careCount;
	//收益
	private String income;
	//见面原价   
	private String meetPrice;
	//见面优惠价   
	private String meetReducedPrice;
	//见面时长（小时为单位）   
	private String meetDuration;
	//电话原价   
	private String telPrice;
	//电话优惠价   
	private String telReducedPrice;
	//电话时长（小时为单位）   
	private String telDuration;
	//访问次数pv   
	private int pv;
	//评分   
	private String grade;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setIsMeet(int value) {
		this.isMeet = value;
	}
	
	public int getIsMeet() {
		return this.isMeet;
	}
	
	public void setIsTel(int value) {
		this.isTel = value;
	}
	
	public int getIsTel() {
		return this.isTel;
	}
	
	public void setIsCase(int value) {
		this.isCase = value;
	}
	
	public int getIsCase() {
		return this.isCase;
	}
	
	public void setMeetCount(int value) {
		this.meetCount = value;
	}
	
	public int getMeetCount() {
		return this.meetCount;
	}
	
	public void setTelCount(int value) {
		this.telCount = value;
	}
	
	public int getTelCount() {
		return this.telCount;
	}
	
	public void setCaseCount(int value) {
		this.caseCount = value;
	}
	
	public int getCaseCount() {
		return this.caseCount;
	}
	
	public void setAskCount(int value) {
		this.askCount = value;
	}
	
	public int getAskCount() {
		return this.askCount;
	}
	
	public void setLikeCount(int value) {
		this.likeCount = value;
	}
	
	public int getLikeCount() {
		return this.likeCount;
	}
	
	public void setCareCount(int value) {
		this.careCount = value;
	}
	
	public int getCareCount() {
		return this.careCount;
	}
	
	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public void setMeetPrice(String value) {
		this.meetPrice = value;
	}
	
	public String getMeetPrice() {
		return this.meetPrice;
	}
	
	public void setMeetReducedPrice(String value) {
		this.meetReducedPrice = value;
	}
	
	public String getMeetReducedPrice() {
		return this.meetReducedPrice;
	}
	
	public void setMeetDuration(String value) {
		this.meetDuration = value;
	}
	
	public String getMeetDuration() {
		return this.meetDuration;
	}
	
	public void setTelPrice(String value) {
		this.telPrice = value;
	}
	
	public String getTelPrice() {
		return this.telPrice;
	}
	
	public void setTelReducedPrice(String value) {
		this.telReducedPrice = value;
	}
	
	public String getTelReducedPrice() {
		return this.telReducedPrice;
	}
	
	public void setTelDuration(String value) {
		this.telDuration = value;
	}
	
	public String getTelDuration() {
		return this.telDuration;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public void setGrade(String value) {
		this.grade = value;
	}
	
	public String getGrade() {
		return this.grade;
	}

}


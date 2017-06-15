package com.zll.entity.circle;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class CircleAskRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//提问表id   
	private int askId;
	//用户类型（0：用户 1：律师）   
	private int userType;
	//用户id与律师id   
	private int userTypeId;
	//内容   
	private String content;
	//回复时间   
	private Date time;
	//是否采纳（0：默认，1：采纳）   
	private int isAdopt;
	//采纳时间   
	private Date adoptTime;
	//打赏金额   
	private String price;
	private int likeCount;
	//状态   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setAskId(int value) {
		this.askId = value;
	}
	
	public int getAskId() {
		return this.askId;
	}
	
	public void setUserType(int value) {
		this.userType = value;
	}
	
	public int getUserType() {
		return this.userType;
	}
	
	public void setUserTypeId(int value) {
		this.userTypeId = value;
	}
	
	public int getUserTypeId() {
		return this.userTypeId;
	}
	
	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	public String getTimeString() {
		return DateUtil.formatDatetime(getTime());
	}
	public void setTimeString(String value) {
		setTime(DateUtil.parseDatetime(value));
	}
	
	public void setTime(Date value) {
		this.time = value;
	}
	
	public Date getTime() {
		return this.time;
	}
	
	public void setIsAdopt(int value) {
		this.isAdopt = value;
	}
	
	public int getIsAdopt() {
		return this.isAdopt;
	}
	public String getAdoptTimeString() {
		return DateUtil.formatDatetime(getAdoptTime());
	}
	public void setAdoptTimeString(String value) {
		setAdoptTime(DateUtil.parseDatetime(value));
	}
	
	public void setAdoptTime(Date value) {
		this.adoptTime = value;
	}
	
	public Date getAdoptTime() {
		return this.adoptTime;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
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


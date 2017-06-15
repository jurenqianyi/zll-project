package com.zll.entity.circle;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class CircleAsk extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//提问人用户id（用户表的主键user_id）   
	private int userId;
	//圈子id
	private int circleId;
	//领域一级   
	private int fieldId1;
	//领域二级   
	private int fieldId2;
	private String askTitle;
	//咨询内容   
	private String askContent;
	//提问时间   
	private Date askTime;
	//咨询人姓名   
	private String askName;
	//咨询人地址   
	private String askAdress;
	//打赏金额   
	private String price;
	//是否采纳（0：默认，1：采纳）   
	private int isAdopt;
	//回复个数   
	private int replyCount;
	//用户未读个数   
	private int unread;
	//浏览量   
	private int pv;
	private String contentSearch;
	//状态（0：待支付，1：已支付）   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public int getCircleId() {
		return circleId;
	}

	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}

	public void setFieldId1(int value) {
		this.fieldId1 = value;
	}
	
	public int getFieldId1() {
		return this.fieldId1;
	}
	
	public void setFieldId2(int value) {
		this.fieldId2 = value;
	}
	
	public int getFieldId2() {
		return this.fieldId2;
	}
	
	public String getAskTitle() {
		return askTitle;
	}

	public void setAskTitle(String askTitle) {
		this.askTitle = askTitle;
	}

	public void setAskContent(String value) {
		this.askContent = value;
	}
	
	public String getAskContent() {
		return this.askContent;
	}
	public String getAskTimeString() {
		return DateUtil.formatDatetime(getAskTime());
	}
	public void setAskTimeString(String value) {
		setAskTime(DateUtil.parseDatetime(value));
	}
	
	public void setAskTime(Date value) {
		this.askTime = value;
	}
	
	public Date getAskTime() {
		return this.askTime;
	}
	
	public void setAskName(String value) {
		this.askName = value;
	}
	
	public String getAskName() {
		return this.askName;
	}
	
	public void setAskAdress(String value) {
		this.askAdress = value;
	}
	
	public String getAskAdress() {
		return this.askAdress;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setIsAdopt(int value) {
		this.isAdopt = value;
	}
	
	public int getIsAdopt() {
		return this.isAdopt;
	}
	
	public void setReplyCount(int value) {
		this.replyCount = value;
	}
	
	public int getReplyCount() {
		return this.replyCount;
	}
	
	public void setUnread(int value) {
		this.unread = value;
	}
	
	public int getUnread() {
		return this.unread;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public String getContentSearch() {
		return contentSearch;
	}

	public void setContentSearch(String contentSearch) {
		this.contentSearch = contentSearch;
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


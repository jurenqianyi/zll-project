package com.zll.entity.common;

import javacommon.base.BaseEntity;


public class Message extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//发起人用户ID,系统用户ID=1   
	private int fromUserId;
	//发送人名称   
	private String fromUserName;
	//接收人用户ID   
	private int toUserId;
	//消息类别ID   
	private int msgTypeId;
	//消息类别名:   
	private String msgTypeName;
	//相关业务ID   
	private int relateId;
	//消息标题   
	private String msgTitle;
	//消息正文内容   
	private String msgContent;
	//是否群发消息   
	private int isGroup;
	//是否已阅读 1-是  0-否   
	private int isRead;
	//重要标记(用户打重要标记)   
	private int isImportant;

	
	public void setFromUserId(int value) {
		this.fromUserId = value;
	}
	
	public int getFromUserId() {
		return this.fromUserId;
	}
	
	public void setFromUserName(String value) {
		this.fromUserName = value;
	}
	
	public String getFromUserName() {
		return this.fromUserName;
	}
	
	public void setToUserId(int value) {
		this.toUserId = value;
	}
	
	public int getToUserId() {
		return this.toUserId;
	}
	
	public void setMsgTypeId(int value) {
		this.msgTypeId = value;
	}
	
	public int getMsgTypeId() {
		return this.msgTypeId;
	}
	
	public void setMsgTypeName(String value) {
		this.msgTypeName = value;
	}
	
	public String getMsgTypeName() {
		return this.msgTypeName;
	}
	
	public void setRelateId(int value) {
		this.relateId = value;
	}
	
	public int getRelateId() {
		return this.relateId;
	}
	
	public void setMsgTitle(String value) {
		this.msgTitle = value;
	}
	
	public String getMsgTitle() {
		return this.msgTitle;
	}
	
	public void setMsgContent(String value) {
		this.msgContent = value;
	}
	
	public String getMsgContent() {
		return this.msgContent;
	}
	
	public void setIsGroup(int value) {
		this.isGroup = value;
	}
	
	public int getIsGroup() {
		return this.isGroup;
	}
	
	public void setIsRead(int value) {
		this.isRead = value;
	}
	
	public int getIsRead() {
		return this.isRead;
	}
	
	public void setIsImportant(int value) {
		this.isImportant = value;
	}
	
	public int getIsImportant() {
		return this.isImportant;
	}

}


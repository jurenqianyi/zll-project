package com.zll.entity.question;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class AskSearch extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//问题类型   
	private String askType;
	//提问类型id   
	private int askTypeId;
	//分类名称   
	private String typeName;
	//标题   
	private String askTitle;
	//内容   
	private String askContent;
	//提问时间   
	private Date askTime;
	//回复内容   
	private String replyContent;
	//回复时间   
	private Date replyTime;
	//回复人名称   
	private String replyName;
	//回复个数   
	private int replyCount;
	//请求地址   
	private String url;
	//检索字段   
	private String contentSearch;
	//0：未回复 1：已回复   
	private int isAnswer;

	
	public void setAskType(String value) {
		this.askType = value;
	}
	
	public String getAskType() {
		return this.askType;
	}
	
	public void setAskTypeId(int value) {
		this.askTypeId = value;
	}
	
	public int getAskTypeId() {
		return this.askTypeId;
	}
	
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getTypeName() {
		return this.typeName;
	}
	
	public void setAskTitle(String value) {
		this.askTitle = value;
	}
	
	public String getAskTitle() {
		return this.askTitle;
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
	
	public void setReplyContent(String value) {
		this.replyContent = value;
	}
	
	public String getReplyContent() {
		return this.replyContent;
	}
	public String getReplyTimeString() {
		return DateUtil.formatDatetime(getReplyTime());
	}
	public void setReplyTimeString(String value) {
		setReplyTime(DateUtil.parseDatetime(value));
	}
	
	public void setReplyTime(Date value) {
		this.replyTime = value;
	}
	
	public Date getReplyTime() {
		return this.replyTime;
	}
	
	public void setReplyName(String value) {
		this.replyName = value;
	}
	
	public String getReplyName() {
		return this.replyName;
	}
	
	public void setReplyCount(int value) {
		this.replyCount = value;
	}
	
	public int getReplyCount() {
		return this.replyCount;
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public void setContentSearch(String value) {
		this.contentSearch = value;
	}
	
	public String getContentSearch() {
		return this.contentSearch;
	}
	
	public void setIsAnswer(int value) {
		this.isAnswer = value;
	}
	
	public int getIsAnswer() {
		return this.isAnswer;
	}

}


package com.zll.entity.ask;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Ask extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//问题来源   
	private String askSource;
	//来源id   
	private String askSourceId;
	//分类名称   
	private String typeName;
	//标题   
	private String askTitle;
	//咨询内容   
	private String askContent;
	//提问时间   
	private Date askTime;
	//咨询人姓名   
	private String askName;
	//咨询人地址   
	private String askAdress;
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

	
	public void setAskSource(String value) {
		this.askSource = value;
	}
	
	public String getAskSource() {
		return this.askSource;
	}
	
	public void setAskSourceId(String value) {
		this.askSourceId = value;
	}
	
	public String getAskSourceId() {
		return this.askSourceId;
	}
	
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getTypeName() {
		return this.typeName;
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


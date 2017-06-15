package com.zll.entity.common;

import javacommon.base.BaseEntity;


public class Templates extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//模板的编码   
	private String code;
	//模板的名称   
	private String name;
	//站内信接收开关   
	private int messageSwitch;
	//站内信消息内容   
	private String messageContent;
	//模板参数说明   
	private String messageParameter;
	//短信接收开关   
	private int shortSwitch;
	//短信接收内容   
	private String shortContent;
	//模板参数说明   
	private String shortParameter;
	//邮件接收开关   
	private int mailSwitch;
	//邮件标题   
	private String mailSubject;
	//邮件内容   
	private String mailContent;
	//模板参数说明   
	private String mailParameter;
	//状态（0：关闭，1：打开）   
	private int status;
	//创建人用户id   
	private int adminId;

	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setMessageSwitch(int value) {
		this.messageSwitch = value;
	}
	
	public int getMessageSwitch() {
		return this.messageSwitch;
	}
	
	public void setMessageContent(String value) {
		this.messageContent = value;
	}
	
	public String getMessageContent() {
		return this.messageContent;
	}
	
	public void setMessageParameter(String value) {
		this.messageParameter = value;
	}
	
	public String getMessageParameter() {
		return this.messageParameter;
	}
	
	public void setShortSwitch(int value) {
		this.shortSwitch = value;
	}
	
	public int getShortSwitch() {
		return this.shortSwitch;
	}
	
	public void setShortContent(String value) {
		this.shortContent = value;
	}
	
	public String getShortContent() {
		return this.shortContent;
	}
	
	public void setShortParameter(String value) {
		this.shortParameter = value;
	}
	
	public String getShortParameter() {
		return this.shortParameter;
	}
	
	public void setMailSwitch(int value) {
		this.mailSwitch = value;
	}
	
	public int getMailSwitch() {
		return this.mailSwitch;
	}
	
	public void setMailSubject(String value) {
		this.mailSubject = value;
	}
	
	public String getMailSubject() {
		return this.mailSubject;
	}
	
	public void setMailContent(String value) {
		this.mailContent = value;
	}
	
	public String getMailContent() {
		return this.mailContent;
	}
	
	public void setMailParameter(String value) {
		this.mailParameter = value;
	}
	
	public String getMailParameter() {
		return this.mailParameter;
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


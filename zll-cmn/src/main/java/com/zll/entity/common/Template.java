package com.zll.entity.common;

import javacommon.util.DateUtil;

public class Template {
	
    //邮件模板自增id       db_column: template_id 
	private java.lang.Integer templateId;
    //模板的编码       db_column: template_code 
	private java.lang.String templateCode;
    //模板的主题       db_column: template_title 
	private java.lang.String templateTitle;
    //模板的内容       db_column: template_content 
	private java.lang.String templateContent;
    //类型；1；短信，2；站内信       db_column: template_type 
	private java.lang.String templateType;
    //使用场景说明       db_column: msg 
	private java.lang.String msg;
	private java.lang.String content;
    //创建人用户id       db_column: user_id 
	private java.lang.Integer userId;
	private int status;
    //更新时间       db_column: update_time 
	private java.util.Date updateTime;
    //创建时间       db_column: create_time 
	private java.util.Date createTime;
    //0:不可用 1:可用       db_column: enable_flag 
	private Integer enableFlag;

	public Template(){
	}

	public void setTemplateId(java.lang.Integer value) {
		this.templateId = value;
	}
	
	public java.lang.Integer getTemplateId() {
		return this.templateId;
	}
	public void setTemplateCode(java.lang.String value) {
		this.templateCode = value;
	}
	
	public java.lang.String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateTitle(java.lang.String value) {
		this.templateTitle = value;
	}
	
	public java.lang.String getTemplateTitle() {
		return this.templateTitle;
	}
	public void setTemplateContent(java.lang.String value) {
		this.templateContent = value;
	}
	
	public java.lang.String getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateType(java.lang.String value) {
		this.templateType = value;
	}
	
	public java.lang.String getTemplateType() {
		return this.templateType;
	}
	public void setMsg(java.lang.String value) {
		this.msg = value;
	}
	
	public java.lang.String getContent() {
		return content;
	}

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.String getMsg() {
		return this.msg;
	}
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public String getUpdateTimeString() {
		return DateUtil.formatDatetime(getUpdateTime());
	}
	public void setUpdateTimeString(String value) {
		setUpdateTime(DateUtil.parseDatetime(value));
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public String getCreateTimeString() {
		return DateUtil.formatDatetime(getCreateTime());
	}
	public void setCreateTimeString(String value) {
		setCreateTime(DateUtil.parseDatetime(value));
	}
	
	public void setEnableFlag(Integer value) {
		this.enableFlag = value;
	}
	
	public Integer getEnableFlag() {
		return this.enableFlag;
	}

}


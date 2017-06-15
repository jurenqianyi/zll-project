package com.zll.entity.office;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Information extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//类型（1：日志 2：小时单 3：任务）   
	private int type;
	//标题   
	private String title;
	//内容   
	private String content;
	//文件地址   
	private String fileUrls;
	//分享范围   
	private String range;
	//关联项目id   
	private int projectId;
	//小时单开始时间   
	private Date startTime;
	//小时单结束时间   
	private Date endTime;
	private String sureLawyer;
	//小时单工作小时   
	private int times;
	//小时单状态   
	private String timesStatus;
	//任务截至时间   
	private Date taskEndTime;
	//任务优先级   
	private String priority;
	//任务责任律师   
	private String headLawyer;
	//任务参与律师   
	private String joinLawyer;
	//任务状态   
	private String taskStatus;
	//备注   
	private String remark;
	private String showRange;
	//状态   
	private int status;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setFileUrls(String value) {
		this.fileUrls = value;
	}
	
	public String getFileUrls() {
		return this.fileUrls;
	}
	
	public void setRange(String value) {
		this.range = value;
	}
	
	public String getRange() {
		return this.range;
	}
	
	public String getSureLawyer() {
		return sureLawyer;
	}

	public void setSureLawyer(String sureLawyer) {
		this.sureLawyer = sureLawyer;
	}

	public void setProjectId(int value) {
		this.projectId = value;
	}
	
	public int getProjectId() {
		return this.projectId;
	}
	public String getStartTimeString() {
		return DateUtil.formatDatetime(getStartTime());
	}
	public void setStartTimeString(String value) {
		setStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	public String getEndTimeString() {
		return DateUtil.formatDatetime(getEndTime());
	}
	public void setEndTimeString(String value) {
		setEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	
	public void setTimes(int value) {
		this.times = value;
	}
	
	public int getTimes() {
		return this.times;
	}
	
	public void setTimesStatus(String value) {
		this.timesStatus = value;
	}
	
	public String getTimesStatus() {
		return this.timesStatus;
	}
	public String getTaskEndTimeString() {
		return DateUtil.formatDatetime(getTaskEndTime());
	}
	public void setTaskEndTimeString(String value) {
		setTaskEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setTaskEndTime(Date value) {
		this.taskEndTime = value;
	}
	
	public Date getTaskEndTime() {
		return this.taskEndTime;
	}
	
	public void setPriority(String value) {
		this.priority = value;
	}
	
	public String getPriority() {
		return this.priority;
	}
	
	public void setHeadLawyer(String value) {
		this.headLawyer = value;
	}
	
	public String getHeadLawyer() {
		return this.headLawyer;
	}
	
	public void setJoinLawyer(String value) {
		this.joinLawyer = value;
	}
	
	public String getJoinLawyer() {
		return this.joinLawyer;
	}
	
	public void setTaskStatus(String value) {
		this.taskStatus = value;
	}
	
	public String getTaskStatus() {
		return this.taskStatus;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public String getShowRange() {
		return showRange;
	}

	public void setShowRange(String showRange) {
		this.showRange = showRange;
	}

	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}

}


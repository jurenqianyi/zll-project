package com.zll.view.office;

import javacommon.view.Body;

public class InformationView implements Body {

	// 律师id
	private int lawyerId;
	// 类型（1：日志 2：小时单 3：任务）
	private int type;
	// 标题
	private String title;
	// 内容
	private String content;
	// 文件地址
	private String fileUrls;
	// 分享范围
	private String range;
	// 关联项目id
	private int projectId;
	// 小时单开始时间
	private String startTimeString;
	// 小时单结束时间
	private String endTimeString;
	// 小时单工作小时
	private int times;
	private String sureLawyer;
	// 任务截至时间
	private String taskEndTimeString;
	// 任务优先级
	private String priority;
	// 任务责任律师
	private String headLawyer;
	// 任务参与律师
	private String joinLawyer;
	// 备注
	private String remark;
	
	public int getLawyerId() {
		return lawyerId;
	}
	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}
	public int getType() { 
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileUrls() {
		return fileUrls;
	}
	public void setFileUrls(String fileUrls) {
		this.fileUrls = fileUrls;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getStartTimeString() {
		return startTimeString;
	}
	public void setStartTimeString(String startTimeString) {
		this.startTimeString = startTimeString;
	}
	public String getEndTimeString() {
		return endTimeString;
	}
	public void setEndTimeString(String endTimeString) {
		this.endTimeString = endTimeString;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public String getSureLawyer() {
		return sureLawyer;
	}
	public void setSureLawyer(String sureLawyer) {
		this.sureLawyer = sureLawyer;
	}
	public String getTaskEndTimeString() {
		return taskEndTimeString;
	}
	public void setTaskEndTimeString(String taskEndTimeString) {
		this.taskEndTimeString = taskEndTimeString;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getHeadLawyer() {
		return headLawyer;
	}
	public void setHeadLawyer(String headLawyer) {
		this.headLawyer = headLawyer;
	}
	public String getJoinLawyer() {
		return joinLawyer;
	}
	public void setJoinLawyer(String joinLawyer) {
		this.joinLawyer = joinLawyer;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}


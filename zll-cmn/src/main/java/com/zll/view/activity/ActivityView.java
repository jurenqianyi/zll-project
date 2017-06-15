package com.zll.view.activity;

import java.util.Date;

import javacommon.view.Body;

public class ActivityView implements Body {

	// 主键id
	private java.lang.Integer id;
	// 活动标题
	private java.lang.String title;
	// banner图片
	private java.lang.String bannerUrl;
	// 报名开始时间
	private Date enrollStartTime;
	// 报名结束时间
	private Date enrollEndTime;
	// 投票开始时间
	private Date voteStartTime;
	// 投票结束时间
	private Date voteEndTime;
	// 评委裁定时间
	private java.lang.String judgeTimeBegin;
	private java.lang.String judgeTimeEnd;
	// 奖励时间
	private java.lang.String rewardTimeBegin;
	private java.lang.String rewardTimeEnd;
	// 活动简介
	private java.lang.String summary;
	// 活动规则
	private java.lang.String rule;
	// 详情
	private java.lang.String content;
	// 浏览量
	private java.lang.Integer pv;
	// 参与投票用户数
	private java.lang.Integer userNum;
	// 状态
	private int status;
	// 操作人id（来自system_user表的主键id）
	private java.lang.Integer adminId;
	// 更新时间
	private java.lang.String updateTimeBegin;
	private java.lang.String updateTimeEnd;
	// 创建时间
	private java.lang.String createTimeBegin;
	private java.lang.String createTimeEnd;
	// 是否可用
	private int enableFlag;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getBannerUrl() {
		return this.bannerUrl;
	}
	
	public void setBannerUrl(java.lang.String value) {
		this.bannerUrl = value;
	}
	
	public Date getEnrollStartTime() {
		return this.enrollStartTime;
	}
	
	public void setEnrollStartTime(Date value) {
		this.enrollStartTime = value;
	}
	
	public Date getEnrollEndTime() {
		return this.enrollEndTime;
	}
	
	public void setEnrollEndTime(Date value) {
		this.enrollEndTime = value;
	}
	
	public Date getVoteStartTime() {
		return this.voteStartTime;
	}
	
	public void setVoteStartTime(Date value) {
		this.voteStartTime = value;
	}
	
	public Date getVoteEndTime() {
		return this.voteEndTime;
	}
	
	public void setVoteEndTime(Date value) {
		this.voteEndTime = value;
	}
	
	public java.lang.String getJudgeTimeBegin() {
		return this.judgeTimeBegin;
	}
	
	public void setJudgeTimeBegin(java.lang.String value) {
		this.judgeTimeBegin = value;
	}	
	
	public java.lang.String getJudgeTimeEnd() {
		return this.judgeTimeEnd;
	}
	
	public void setJudgeTimeEnd(java.lang.String value) {
		this.judgeTimeEnd = value;
	}
	
	public java.lang.String getRewardTimeBegin() {
		return this.rewardTimeBegin;
	}
	
	public void setRewardTimeBegin(java.lang.String value) {
		this.rewardTimeBegin = value;
	}	
	
	public java.lang.String getRewardTimeEnd() {
		return this.rewardTimeEnd;
	}
	
	public void setRewardTimeEnd(java.lang.String value) {
		this.rewardTimeEnd = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getRule() {
		return this.rule;
	}
	
	public void setRule(java.lang.String value) {
		this.rule = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.Integer getPv() {
		return this.pv;
	}
	
	public void setPv(java.lang.Integer value) {
		this.pv = value;
	}
	
	public java.lang.Integer getUserNum() {
		return this.userNum;
	}
	
	public void setUserNum(java.lang.Integer value) {
		this.userNum = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public java.lang.Integer getAdminId() {
		return this.adminId;
	}
	
	public void setAdminId(java.lang.Integer value) {
		this.adminId = value;
	}
	
	public java.lang.String getUpdateTimeBegin() {
		return this.updateTimeBegin;
	}
	
	public void setUpdateTimeBegin(java.lang.String value) {
		this.updateTimeBegin = value;
	}	
	
	public java.lang.String getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}
	
	public void setUpdateTimeEnd(java.lang.String value) {
		this.updateTimeEnd = value;
	}
	
	public java.lang.String getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	public void setCreateTimeBegin(java.lang.String value) {
		this.createTimeBegin = value;
	}	
	
	public java.lang.String getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	public void setCreateTimeEnd(java.lang.String value) {
		this.createTimeEnd = value;
	}
	
	public int getEnableFlag() {
		return this.enableFlag;
	}
	
	public void setEnableFlag(int value) {
		this.enableFlag = value;
	}
	

	
}


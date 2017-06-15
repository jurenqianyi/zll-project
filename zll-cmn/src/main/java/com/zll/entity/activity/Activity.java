package com.zll.entity.activity;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Activity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//活动标题   
	private String title;
	//banner图片   
	private String bannerUrl;
	//报名开始时间   
	private Date enrollStartTime;
	//报名结束时间   
	private Date enrollEndTime;
	//投票开始时间   
	private Date voteStartTime;
	//投票结束时间   
	private Date voteEndTime;
	//评委裁定时间   
	private Date judgeTime;
	//奖励时间   
	private Date rewardTime;
	//活动简介   
	private String summary;
	//活动规则   
	private String rule;
	//详情   
	private String content;
	//浏览量   
	private int pv;
	//参与投票用户数   
	private int userNum;
	//状态   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setBannerUrl(String value) {
		this.bannerUrl = value;
	}
	
	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public String getEnrollStartTimeString() {
		return DateUtil.formatDatetime(getEnrollStartTime());
	}
	public void setEnrollStartTimeString(String value) {
		setEnrollStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setEnrollStartTime(Date value) {
		this.enrollStartTime = value;
	}
	
	public Date getEnrollStartTime() {
		return this.enrollStartTime;
	}
	public String getEnrollEndTimeString() {
		return DateUtil.formatDatetime(getEnrollEndTime());
	}
	public void setEnrollEndTimeString(String value) {
		setEnrollEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setEnrollEndTime(Date value) {
		this.enrollEndTime = value;
	}
	
	public Date getEnrollEndTime() {
		return this.enrollEndTime;
	}
	public String getVoteStartTimeString() {
		return DateUtil.formatDatetime(getVoteStartTime());
	}
	public void setVoteStartTimeString(String value) {
		setVoteStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setVoteStartTime(Date value) {
		this.voteStartTime = value;
	}
	
	public Date getVoteStartTime() {
		return this.voteStartTime;
	}
	public String getVoteEndTimeString() {
		return DateUtil.formatDatetime(getVoteEndTime());
	}
	public void setVoteEndTimeString(String value) {
		setVoteEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setVoteEndTime(Date value) {
		this.voteEndTime = value;
	}
	
	public Date getVoteEndTime() {
		return this.voteEndTime;
	}
	public String getJudgeTimeString() {
		return DateUtil.formatDatetime(getJudgeTime());
	}
	public void setJudgeTimeString(String value) {
		setJudgeTime(DateUtil.parseDatetime(value));
	}
	
	public void setJudgeTime(Date value) {
		this.judgeTime = value;
	}
	
	public Date getJudgeTime() {
		return this.judgeTime;
	}
	public String getRewardTimeString() {
		return DateUtil.formatDatetime(getRewardTime());
	}
	public void setRewardTimeString(String value) {
		setRewardTime(DateUtil.parseDatetime(value));
	}
	
	public void setRewardTime(Date value) {
		this.rewardTime = value;
	}
	
	public Date getRewardTime() {
		return this.rewardTime;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public void setRule(String value) {
		this.rule = value;
	}
	
	public String getRule() {
		return this.rule;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public void setUserNum(int value) {
		this.userNum = value;
	}
	
	public int getUserNum() {
		return this.userNum;
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


package com.zll.entity.activity;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class ActivityMember extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//活动id   
	private int activityId;
	//成员名称   
	private String name;
	//手机   
	private String phone;
	//机构名称   
	private String orgName;
	//列表图   
	private String listUrl;
	//详情图   
	private String detailUrl;
	//投票数   
	private int voteNum;
	//活动简介   
	private String summary;
	//详情   
	private String content;
	//浏览量   
	private int pv;
	//状态   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setActivityId(int value) {
		this.activityId = value;
	}
	
	public int getActivityId() {
		return this.activityId;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setOrgName(String value) {
		this.orgName = value;
	}
	
	public String getOrgName() {
		return this.orgName;
	}
	
	public void setListUrl(String value) {
		this.listUrl = value;
	}
	
	public String getListUrl() {
		return this.listUrl;
	}
	
	public void setDetailUrl(String value) {
		this.detailUrl = value;
	}
	
	public String getDetailUrl() {
		return this.detailUrl;
	}
	
	public void setVoteNum(int value) {
		this.voteNum = value;
	}
	
	public int getVoteNum() {
		return this.voteNum;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return this.summary;
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


package com.zll.entity.activity;

import javacommon.base.BaseEntity;


public class ActivityVote extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//活动id   
	private int activityId;
	//用户id   
	private int userId;
	
	private int activityMemberId;

	
	public void setActivityId(int value) {
		this.activityId = value;
	}
	
	public int getActivityId() {
		return this.activityId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}

	public int getActivityMemberId() {
		return activityMemberId;
	}

	public void setActivityMemberId(int activityMemberId) {
		this.activityMemberId = activityMemberId;
	}

}


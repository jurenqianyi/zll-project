package com.zll.entity.policy;

import javacommon.base.BaseEntity;
import javacommon.view.HashMapView;


public class PolicyInvite extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private int policyId;
	//邀请人id   
	private int inviteId;
	//用户id   
	private int userId;
	//奖励金额   
	private String moeny1;
	//奖励金额   
	private String moeny2;
	//状态   
	private int status;

	private HashMapView user;
	
	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public void setInviteId(int value) {
		this.inviteId = value;
	}
	
	public int getInviteId() {
		return this.inviteId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setMoeny1(String value) {
		this.moeny1 = value;
	}
	
	public String getMoeny1() {
		return this.moeny1;
	}
	
	public void setMoeny2(String value) {
		this.moeny2 = value;
	}
	
	public String getMoeny2() {
		return this.moeny2;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}

	public HashMapView getUser() {
		return user;
	}

	public void setUser(HashMapView user) {
		this.user = user;
	}

}


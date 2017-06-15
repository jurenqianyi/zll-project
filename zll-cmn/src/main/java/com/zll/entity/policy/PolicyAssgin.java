package com.zll.entity.policy;

import javacommon.base.BaseEntity;


public class PolicyAssgin extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//保单id   
	private int policyId;
	//分配的类型   
	private int assginType;
	//被分配用户类型id   
	private int assginTypeId;
	//状态（0：默认 1：接收 2：拒绝 ）
	private int status;
	//分配操作人id   
	private int adminId;

	
	public void setPolicyId(int value) {
		this.policyId = value;
	}
	
	public int getPolicyId() {
		return this.policyId;
	}
	
	public void setAssginType(int value) {
		this.assginType = value;
	}
	
	public int getAssginType() {
		return this.assginType;
	}
	
	public void setAssginTypeId(int value) {
		this.assginTypeId = value;
	}
	
	public int getAssginTypeId() {
		return this.assginTypeId;
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


package com.zll.entity.policy;

import javacommon.base.BaseEntity;


public class PolicyAction extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//保单id   
	private int policyId;
	//流程状态   
	private int status;
	//操作内容   
	private String content;
	//操作该次的人员   
	private String actionUser;

	
	public void setPolicyId(int value) {
		this.policyId = value;
	}
	
	public int getPolicyId() {
		return this.policyId;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setActionUser(String value) {
		this.actionUser = value;
	}
	
	public String getActionUser() {
		return this.actionUser;
	}

}


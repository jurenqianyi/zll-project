package com.zll.entity.contract;

import javacommon.base.BaseEntity;


public class ContractCollect extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//合同id   
	private int contractId;
	//用户id   
	private int collectUserId;
	//标题   
	private String title;
	//状态   
	private int status;

	
	public void setContractId(int value) {
		this.contractId = value;
	}
	
	public int getContractId() {
		return this.contractId;
	}
	
	public int getCollectUserId() {
		return collectUserId;
	}

	public void setCollectUserId(int collectUserId) {
		this.collectUserId = collectUserId;
	}

	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}

}


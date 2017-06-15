package com.zll.entity.oa;

import javacommon.base.BaseEntity;


public class WorkFlowAction extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//工作流对象id   
	private int workFlowId;
	//状态 0:默认 1:通过 2:未通过 3:留言   
	private int status;
	//状态值   
	private String statusName;
	//操作备注   
	private String remark;
	//文件   
	private String files;
	//操作该次的人员   
	private String actionUser;

	
	public void setWorkFlowId(int value) {
		this.workFlowId = value;
	}
	
	public int getWorkFlowId() {
		return this.workFlowId;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatusName(String value) {
		this.statusName = value;
	}
	
	public String getStatusName() {
		return this.statusName;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setFiles(String value) {
		this.files = value;
	}
	
	public String getFiles() {
		return this.files;
	}
	
	public void setActionUser(String value) {
		this.actionUser = value;
	}
	
	public String getActionUser() {
		return this.actionUser;
	}

}


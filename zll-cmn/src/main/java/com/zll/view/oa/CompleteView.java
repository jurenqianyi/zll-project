package com.zll.view.oa;

import javacommon.view.Body;

public class CompleteView implements Body {

	private int workFlowId;
	private String taskId;
	private int status;
	private String files;
	private String content;
	
	public int getWorkFlowId() {
		return workFlowId;
	}
	public void setWorkFlowId(int workFlowId) {
		this.workFlowId = workFlowId;
	}
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}

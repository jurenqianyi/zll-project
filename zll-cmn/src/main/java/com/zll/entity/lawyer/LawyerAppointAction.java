package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerAppointAction extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//约见记录id   
	private int appointId;
	//流程状态 0：待支付 1：待大咖确认 2：待用户确认 3：待评价 4:结束   
	private int status;
	//操作内容   
	private String content;
	//操作该次的人员   
	private String actionUser;

	
	public void setAppointId(int value) {
		this.appointId = value;
	}
	
	public int getAppointId() {
		return this.appointId;
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


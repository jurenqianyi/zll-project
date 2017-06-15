package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerAppoint extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户id   
	private int userId;
	//律师Id   
	private int lawyerId;
	//约见方式 0:见面 1:电话约谈   
	private int method;
	//请教问题   
	private String ask;
	//电话   
	private String phone;
	//审核内容   
	private String checkContent;
	//流程状态 0：待支付 1：待大咖确认 2：待用户确认 3：待评价 4:结束   
	private int status;
	//用户是否关闭（0：关闭 1：正常）   
	private int isUserClose;
	//律师是否关闭（0：关闭 1：正常）   
	private int isLawyerClose;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setMethod(int value) {
		this.method = value;
	}
	
	public int getMethod() {
		return this.method;
	}
	
	public void setAsk(String value) {
		this.ask = value;
	}
	
	public String getAsk() {
		return this.ask;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getCheckContent() {
		return checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setIsUserClose(int value) {
		this.isUserClose = value;
	}
	
	public int getIsUserClose() {
		return this.isUserClose;
	}
	
	public void setIsLawyerClose(int value) {
		this.isLawyerClose = value;
	}
	
	public int getIsLawyerClose() {
		return this.isLawyerClose;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


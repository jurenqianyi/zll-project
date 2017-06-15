package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerQuestionRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//提问表id   
	private int questionId;
	//用户类型（0：用户 1：律师）   
	private int userType;
	private int userTypeId;
	//内容   
	private String content;
	private int isAdopt;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	public void setQuestionId(int value) {
		this.questionId = value;
	}
	
	public int getQuestionId() {
		return this.questionId;
	}
	
	public void setUserType(int value) {
		this.userType = value;
	}
	
	public int getUserType() {
		return this.userType;
	}
	
	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public int getIsAdopt() {
		return isAdopt;
	}

	public void setIsAdopt(int isAdopt) {
		this.isAdopt = isAdopt;
	}

	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


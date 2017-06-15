package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerCase extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//领域id   
	private int fieldId1;
	//领域id   
	private int fieldId2;
	//案件类型（0：原告 1：被告）   
	private int caseType;
	//标题   
	private String title;
	//法院   
	private String court;
	private Date caseTime;
	private String caseTimeString;
	//案例简介   
	private String summary;
	//案例详情   
	private String content;
	private int pv;
	//置顶   
	private int isTop;
	//推荐   
	private int isPush;
	//首页   
	private int isIndex;
	//状态 0：默认 1：通过 2：不通过   
	private int status;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setFieldId1(int value) {
		this.fieldId1 = value;
	}
	
	public int getFieldId1() {
		return this.fieldId1;
	}
	
	public void setFieldId2(int value) {
		this.fieldId2 = value;
	}
	
	public int getFieldId2() {
		return this.fieldId2;
	}
	
	public void setCaseType(int value) {
		this.caseType = value;
	}
	
	public int getCaseType() {
		return this.caseType;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setCourt(String value) {
		this.court = value;
	}
	
	public String getCourt() {
		return this.court;
	}
	
	public Date getCaseTime() {
		return caseTime;
	}

	public void setCaseTime(Date caseTime) {
		this.caseTime = caseTime;
	}
	
	public String getCaseTimeString() {
		return DateUtil.formatDate(getCaseTime());
	}
	
	public void setCaseTimeString(String value) {
		setCaseTime(DateUtil.parseDate(value));
	}

	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setIsTop(int value) {
		this.isTop = value;
	}
	
	public int getIsTop() {
		return this.isTop;
	}
	
	public void setIsPush(int value) {
		this.isPush = value;
	}
	
	public int getIsPush() {
		return this.isPush;
	}
	
	public void setIsIndex(int value) {
		this.isIndex = value;
	}
	
	public int getIsIndex() {
		return this.isIndex;
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


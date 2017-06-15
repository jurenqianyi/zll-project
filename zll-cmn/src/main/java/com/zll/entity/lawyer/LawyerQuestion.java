package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerQuestion extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//提问人用户id（用户表的主键user_id）   
	private int userId;
	//领域一级   
	private int fieldId1;
	//领域二级   
	private int fieldId2;
	//问题   
	private String question;
	//提问时间   
	private Date questionTime;
	//回复   
	private String answer;
	//回复时间   
	private Date answerTime;
	//用户未读个数
	private int unread;
	private int pv;
	private int replyCount;
	//状态   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
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
	
	public void setQuestion(String value) {
		this.question = value;
	}
	
	public String getQuestion() {
		return this.question;
	}
	public String getQuestionTimeString() {
		return DateUtil.formatDatetime(getQuestionTime());
	}
	public void setQuestionTimeString(String value) {
		setQuestionTime(DateUtil.parseDatetime(value));
	}
	
	public void setQuestionTime(Date value) {
		this.questionTime = value;
	}
	
	public Date getQuestionTime() {
		return this.questionTime;
	}
	
	public void setAnswer(String value) {
		this.answer = value;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	public String getAnswerTimeString() {
		return DateUtil.formatDatetime(getAnswerTime());
	}
	public void setAnswerTimeString(String value) {
		setAnswerTime(DateUtil.parseDatetime(value));
	}
	
	public void setAnswerTime(Date value) {
		this.answerTime = value;
	}
	
	public Date getAnswerTime() {
		return this.answerTime;
	}
	
	public int getUnread() {
		return unread;
	}

	public void setUnread(int unread) {
		this.unread = unread;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
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


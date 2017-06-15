package com.zll.entity.lawyer;

import javacommon.base.BaseEntity;

public class LawyerQuestionAssgin extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 问题id
	private int questionId;
	// 律师id
	private int lawyerId;
	// 未读个数
	private int unread;

	public void setQuestionId(int value) {
		this.questionId = value;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setLawyerId(int value) {
		this.lawyerId = value;
	}

	public int getLawyerId() {
		return this.lawyerId;
	}

	public void setUnread(int value) {
		this.unread = value;
	}

	public int getUnread() {
		return this.unread;
	}

}

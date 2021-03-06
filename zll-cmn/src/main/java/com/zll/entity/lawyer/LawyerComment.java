package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class LawyerComment extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//律师id   
	private int lawyerId;
	//评论类型   
	private String commentType;
	//类型ID   
	private int commentTypeId;
	//用户表的主键user_id   
	private int userId;
	//评论内容   
	private String content;
	//态度评分   
	private int score1;
	//专业评分   
	private int score2;
	//响应评分   
	private int score3;
	//操作人id（来自system_user表的主键id）   
	private int adminId;

	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
	}
	
	public void setCommentType(String value) {
		this.commentType = value;
	}
	
	public String getCommentType() {
		return this.commentType;
	}
	
	public void setCommentTypeId(int value) {
		this.commentTypeId = value;
	}
	
	public int getCommentTypeId() {
		return this.commentTypeId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setScore1(int value) {
		this.score1 = value;
	}
	
	public int getScore1() {
		return this.score1;
	}
	
	public void setScore2(int value) {
		this.score2 = value;
	}
	
	public int getScore2() {
		return this.score2;
	}
	
	public void setScore3(int value) {
		this.score3 = value;
	}
	
	public int getScore3() {
		return this.score3;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


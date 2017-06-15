package com.zll.entity.contract;

import javacommon.base.BaseEntity;
import javacommon.view.HashMapView;


public class Contract extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private int userId;
	//编号   
	private String contractNo;
	//类型id   
	private int typeId;
	//标题   
	private String title;
	//简介   
	private String summary;
	//内容   
	private String content;
	//路径   
	private String fileUrl;
	//价格   
	private String price;
	//下载次数   
	private int downCount;
	//浏览量   
	private int pv;
	//评论数   
	private int commentCount;
	//置顶   
	private int isTop;
	//推荐   
	private int isPush;
	//首页   
	private int isIndex;
	//状态（0：默认，1：已发布， 2：审核通过， 3：审核未通过）   
	private int status;
	//操作人id（来自system_user表的主键id）   
	private int adminId;
	
	private HashMapView userMap;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setContractNo(String value) {
		this.contractNo = value;
	}
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setTypeId(int value) {
		this.typeId = value;
	}
	
	public int getTypeId() {
		return this.typeId;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
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
	
	public void setFileUrl(String value) {
		this.fileUrl = value;
	}
	
	public String getFileUrl() {
		return this.fileUrl;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setDownCount(int value) {
		this.downCount = value;
	}
	
	public int getDownCount() {
		return this.downCount;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public void setCommentCount(int value) {
		this.commentCount = value;
	}
	
	public int getCommentCount() {
		return this.commentCount;
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

	public HashMapView getUserMap() {
		return userMap;
	}

	public void setUserMap(HashMapView userMap) {
		this.userMap = userMap;
	}

}


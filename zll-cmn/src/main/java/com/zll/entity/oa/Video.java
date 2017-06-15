package com.zll.entity.oa;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Video extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//类型 0：直播 1：点播   
	private int type;
	//名称   
	private String title;
	//开始时间   
	private Date startTime;
	//结束时间   
	private Date endTime;
	//时间   
	private String times;
	//视频地址   
	private String videoUrl;
	//图片地址   
	private String imageUrl;
	//描述   
	private String content;
	//pv   
	private int pv;
	//用户id   
	private int userId;

	
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getStartTimeString() {
		return DateUtil.formatDatetime(getStartTime());
	}
	public void setStartTimeString(String value) {
		setStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public String getEndTimeString() {
		return DateUtil.formatDatetime(getEndTime());
	}
	public void setEndTimeString(String value) {
		setEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	
	public void setTimes(String value) {
		this.times = value;
	}
	
	public String getTimes() {
		return this.times;
	}
	
	public void setVideoUrl(String value) {
		this.videoUrl = value;
	}
	
	public String getVideoUrl() {
		return this.videoUrl;
	}
	
	public void setImageUrl(String value) {
		this.imageUrl = value;
	}
	
	public String getImageUrl() {
		return this.imageUrl;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setPv(int value) {
		this.pv = value;
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}

}


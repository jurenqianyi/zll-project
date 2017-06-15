package com.zll.entity.cms;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class CmsConferences extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
    //会议标题       db_column: title 
	private java.lang.String title;
    //会议内容       db_column: content 
	private java.lang.String content;
    //路演项目       db_column: outcome 
	private java.lang.String outcome;
    //会议流程       db_column: schedule 
	private java.lang.String schedule;
	//联系人       db_column: contacts 
	private java.lang.String contacts;
    //邮箱       db_column: email 
	private java.lang.String email;
    //联系电话       db_column: phone 
	private java.lang.String phone;
    //详细地址       db_column: address 
	private java.lang.String address;
    //价格       db_column: price 
	private java.lang.Integer price;
    //访问量       db_column: pv 
	private java.lang.Integer pv;
    //上线状态 0:下线 1:上线       db_column: status 
	private Integer status;
    //1:置顶 0:默认       db_column: is_top 
	private Integer isTop;
    //1:推荐 0:默认       db_column: is_push 
	private Integer isPush;
    //1:首页 0:默认       db_column: is_index 
	private Integer isIndex;
    //会议容纳的人数       db_column: capacity 
	private Integer capacity;
    //实际报名人数       db_column: count 
	private Integer count;
    //海报       db_column: image_url 
	private java.lang.String imageUrl;
    //会议宣传图片       db_column: image_url1 
	private java.lang.String imageUrl1;
    //会议主办方       db_column: image_url2 
	private java.lang.String imageUrl2;
	//活动文档
	private java.lang.String imageUrl3;
    //合作机构       db_column: image_urls 
	private java.lang.String imageUrls;
    //会议播报视频       db_column: play_url 
	private java.lang.String playUrl;
	//主办方
	private java.lang.String sponsor;
    //开始时间       db_column: start_time 
	private java.util.Date startTime;
    //结束时间       db_column: end_time 
	private java.util.Date endTime;
    //报名开始时间       db_column: sign_start_time 
	private java.util.Date signStartTime;
    //报名结束时间       db_column: sign_end_time 
	private java.util.Date signEndTime;
	//播报个数
	private Integer countNew;
    //关键字       db_column: keyword 
	private java.lang.String keyword;
    //描述       db_column: description 
	private java.lang.String summary;
    //企业用户id       db_column: user_id 
	private Integer userId;
    //管理用户id       db_column: admin_id 
	private Integer adminId;
   

	public CmsConferences(){
	}

	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public java.lang.String getSponsor() {
		return sponsor;
	}

	public void setSponsor(java.lang.String sponsor) {
		this.sponsor = sponsor;
	}

	public java.lang.String getTitle() {
		return this.title;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setOutcome(java.lang.String value) {
		this.outcome = value;
	}
	
	public java.lang.String getOutcome() {
		return this.outcome;
	}
	public void setSchedule(java.lang.String value) {
		this.schedule = value;
	}
	
	public java.lang.String getSchedule() {
		return this.schedule;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public java.lang.String getImageUrl3() {
		return imageUrl3;
	}

	public void setImageUrl3(java.lang.String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}

	public Integer getStatus() {
		return this.status;
	}
	public void setIsTop(Integer value) {
		this.isTop = value;
	}
	
	public Integer getIsTop() {
		return this.isTop;
	}
	public void setIsPush(Integer value) {
		this.isPush = value;
	}
	
	public Integer getCountNew() {
		return countNew;
	}

	public void setCountNew(Integer countNew) {
		this.countNew = countNew;
	}

	public Integer getIsPush() {
		return this.isPush;
	}
	public void setIsIndex(Integer value) {
		this.isIndex = value;
	}
	
	public Integer getIsIndex() {
		return this.isIndex;
	}
	public void setCapacity(Integer value) {
		this.capacity = value;
	}
	
	public Integer getCapacity() {
		return this.capacity;
	}
	public void setCount(Integer value) {
		this.count = value;
	}
	
	public java.lang.String getContacts() {
		return contacts;
	}

	public void setContacts(java.lang.String contacts) {
		this.contacts = contacts;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public Integer getCount() {
		return this.count;
	}
	public void setImageUrl(java.lang.String value) {
		this.imageUrl = value;
	}
	
	public java.lang.String getImageUrl() {
		return this.imageUrl;
	}
	public void setPlayUrl(java.lang.String value) {
		this.playUrl = value;
	}
	
	public java.lang.String getPlayUrl() {
		return this.playUrl;
	}
	public String getStartTimeString() {
		return DateUtil.formatDatetime(getStartTime());
	}
	public void setStartTimeString(String value) {
		setStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setStartTime(java.util.Date value) {
		this.startTime = value;
	}
	
	public java.util.Date getStartTime() {
		return this.startTime;
	}
	public String getEndTimeString() {
		return DateUtil.formatDatetime(getEndTime());
	}
	public void setEndTimeString(String value) {
		setEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setEndTime(java.util.Date value) {
		this.endTime = value;
	}
	
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	public String getSignStartTimeString() {
		return DateUtil.formatDatetime(getSignStartTime());
	}
	public void setSignStartTimeString(String value) {
		setSignStartTime(DateUtil.parseDatetime(value));
	}
	
	public void setSignStartTime(java.util.Date value) {
		this.signStartTime = value;
	}
	
	public java.util.Date getSignStartTime() {
		return this.signStartTime;
	}
	public String getSignEndTimeString() {
		return DateUtil.formatDatetime(getSignEndTime());
	}
	public void setSignEndTimeString(String value) {
		setSignEndTime(DateUtil.parseDatetime(value));
	}
	
	public void setSignEndTime(java.util.Date value) {
		this.signEndTime = value;
	}
	
	public java.util.Date getSignEndTime() {
		return this.signEndTime;
	}
	public void setKeyword(java.lang.String value) {
		this.keyword = value;
	}
	
	public java.lang.String getKeyword() {
		return this.keyword;
	}
	
	public java.lang.String getSummary() {
		return summary;
	}

	public void setSummary(java.lang.String summary) {
		this.summary = summary;
	}

	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	public void setAdminId(Integer value) {
		this.adminId = value;
	}
	
	public Integer getAdminId() {
		return this.adminId;
	}
	public String getCreateTimeString() {
		return DateUtil.formatDatetime(getCreateTime());
	}
	public void setCreateTimeString(String value) {
		setCreateTime(DateUtil.parseDatetime(value));
	}
	
	public java.lang.Integer getPrice() {
		return price;
	}

	public void setPrice(java.lang.Integer price) {
		this.price = price;
	}

	public java.lang.String getImageUrl1() {
		return imageUrl1;
	}

	public void setImageUrl1(java.lang.String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}

	public java.lang.String getImageUrl2() {
		return imageUrl2;
	}

	public void setImageUrl2(java.lang.String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}

	public java.lang.String getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(java.lang.String imageUrls) {
		this.imageUrls = imageUrls;
	}

}


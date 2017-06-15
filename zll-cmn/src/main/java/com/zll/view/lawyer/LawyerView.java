package com.zll.view.lawyer;

import java.util.List;
import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;
import javacommon.view.Body;


public class LawyerView implements Body {
	
	//律师姓名   
	private String name;
	//头像   
	private String headUrl;
	//背景图   
	private String bgUrl;
	//联系电话   
	private String phone;
	//擅长领域一级id串（来自dictonary的主键id）   
	private String fieldId1s;
	//擅长领域二级id串（来自dictonary的主键id）   
	private String fieldId2s;
	private String fieldIds;
	//执业律所   
	private String lawName;
	//职位   
	private String job;
	//省   
	private int provinceId;
	//市   
	private int cityId;
	//区   
	private int areaId;
	//详细地址   
	private String adress;
	//学历   
	private int degreeId;
	//微信（号）   
	private String weixin;
	//邮箱   
	private String email;
	//律师执业证号   
	private String lawyerNo;
	//工作期限   
	private int workPeriodId;
	//服务时间（分类id）   
	private int serviceTimeId;
	//服务区域   
	private String serviceRegion;
	//名片url   
	private String cardUrl;
	//排序（数字越大越靠前）   
	private int sort;
	//来源id（来自dictionary表的主键id）   
	private int sourceId;
	//关键词（SEO推广）   
	private String keyword;
	//描述（SEO推广）   
	private String description;
	//执业感言   
	private String feel;
	//联系方式   
	private String contactWay;
	//简介（纯文本）   
	private String summary;
	//介绍（富文本）   
	private String content;
	//经度   
	private String mapX;
	//纬度   
	private String mapY;
	
	//性别
	private int sex;
	
	private int isMeet;
	//是否支持电话 0:默认 1:支持   
	private int isTel;
	//是否接收案件 0:默认 1:支持   
	private int isCase;
	//见面原价   
	private String meetPrice;
	//见面时长（小时为单位）   
	private String meetDuration;
	//电话原价   
	private String telPrice;
	//电话时长（小时为单位）   
	private String telDuration;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHeadUrl(String value) {
		this.headUrl = value;
	}
	
	public String getHeadUrl() {
		return this.headUrl;
	}
	
	public void setBgUrl(String value) {
		this.bgUrl = value;
	}
	
	public String getBgUrl() {
		return this.bgUrl;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setFieldId1s(String value) {
		this.fieldId1s = value;
	}
	
	public String getFieldId1s() {
		return this.fieldId1s;
	}
	
	public void setFieldId2s(String value) {
		this.fieldId2s = value;
	}
	
	public String getFieldId2s() {
		return this.fieldId2s;
	}
	
	public void setLawName(String value) {
		this.lawName = value;
	}
	
	public String getLawName() {
		return this.lawName;
	}
	
	public void setJob(String value) {
		this.job = value;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setProvinceId(int value) {
		this.provinceId = value;
	}
	
	public int getProvinceId() {
		return this.provinceId;
	}
	
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	
	public void setAreaId(int value) {
		this.areaId = value;
	}
	
	public int getAreaId() {
		return this.areaId;
	}
	
	public void setAdress(String value) {
		this.adress = value;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setDegreeId(int value) {
		this.degreeId = value;
	}
	
	public int getDegreeId() {
		return this.degreeId;
	}
	
	public void setWeixin(String value) {
		this.weixin = value;
	}
	
	public String getWeixin() {
		return this.weixin;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setLawyerNo(String value) {
		this.lawyerNo = value;
	}
	
	public String getLawyerNo() {
		return this.lawyerNo;
	}
	
	public String getFieldIds() {
		return fieldIds;
	}

	public void setFieldIds(String fieldIds) {
		this.fieldIds = fieldIds;
	}

	public void setWorkPeriodId(int value) {
		this.workPeriodId = value;
	}
	
	public int getWorkPeriodId() {
		return this.workPeriodId;
	}
	
	public void setServiceTimeId(int value) {
		this.serviceTimeId = value;
	}
	
	public int getServiceTimeId() {
		return this.serviceTimeId;
	}
	
	public void setServiceRegion(String value) {
		this.serviceRegion = value;
	}
	
	public String getServiceRegion() {
		return this.serviceRegion;
	}
	
	public void setCardUrl(String value) {
		this.cardUrl = value;
	}
	
	public String getCardUrl() {
		return this.cardUrl;
	}
	
	public void setSort(int value) {
		this.sort = value;
	}
	
	public int getSort() {
		return this.sort;
	}
	
	public void setSourceId(int value) {
		this.sourceId = value;
	}
	
	public int getSourceId() {
		return this.sourceId;
	}
	
	public void setKeyword(String value) {
		this.keyword = value;
	}
	
	public String getKeyword() {
		return this.keyword;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setFeel(String value) {
		this.feel = value;
	}
	
	public String getFeel() {
		return this.feel;
	}
	
	public void setContactWay(String value) {
		this.contactWay = value;
	}
	
	public String getContactWay() {
		return this.contactWay;
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
	
	public void setMapX(String value) {
		this.mapX = value;
	}
	
	public String getMapX() {
		return this.mapX;
	}
	
	public void setMapY(String value) {
		this.mapY = value;
	}
	
	public String getMapY() {
		return this.mapY;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getIsMeet() {
		return isMeet;
	}

	public void setIsMeet(int isMeet) {
		this.isMeet = isMeet;
	}

	public int getIsTel() {
		return isTel;
	}

	public void setIsTel(int isTel) {
		this.isTel = isTel;
	}

	public int getIsCase() {
		return isCase;
	}

	public void setIsCase(int isCase) {
		this.isCase = isCase;
	}

	public String getMeetPrice() {
		return meetPrice;
	}

	public void setMeetPrice(String meetPrice) {
		this.meetPrice = meetPrice;
	}

	public String getMeetDuration() {
		return meetDuration;
	}

	public void setMeetDuration(String meetDuration) {
		this.meetDuration = meetDuration;
	}

	public String getTelPrice() {
		return telPrice;
	}

	public void setTelPrice(String telPrice) {
		this.telPrice = telPrice;
	}

	public String getTelDuration() {
		return telDuration;
	}

	public void setTelDuration(String telDuration) {
		this.telDuration = telDuration;
	}
	
}


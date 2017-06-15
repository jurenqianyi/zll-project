package com.zll.entity.lawyer;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Lawyer extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//创建人用户id   
	private int userId;
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
	//是否认证 0：默认 1：已认证   
	private int isAuth;
	//置顶   
	private int isTop;
	//推荐   
	private int isPush;
	//首页   
	private int isIndex;
	//是否风评律师（0：否 1：是）
	private int isPolicy;
	private int isOnline;
	//状态 0：默认 1：通过 2：不通过   
	private int status;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;
	//审核人id   
	private int checkAdminId;
	//审核时间   
	private Date checkTime;
	//审核内容   
	private String checkContent;

	private int sex;
	private String fieldIds;
	private String fieldName;
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
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
	
	public void setIsAuth(int value) {
		this.isAuth = value;
	}
	
	public int getIsAuth() {
		return this.isAuth;
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
	
	public int getIsPolicy() {
		return isPolicy;
	}

	public void setIsPolicy(int isPolicy) {
		this.isPolicy = isPolicy;
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

	public int getCheckAdminId() {
		return checkAdminId;
	}

	public void setCheckAdminId(int checkAdminId) {
		this.checkAdminId = checkAdminId;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	
	public String getCheckTimeString() {
		return DateUtil.formatDatetime(getCheckTime());
	}
	public void setCheckTimeString(String value) {
		setCheckTime(DateUtil.parseDatetime(value));
	}

	public String getCheckContent() {
		return checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getFieldIds() {
		return fieldIds;
	}

	public void setFieldIds(String fieldIds) {
		this.fieldIds = fieldIds;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}

}


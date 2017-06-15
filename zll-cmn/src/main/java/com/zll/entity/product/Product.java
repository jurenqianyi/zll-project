package com.zll.entity.product;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Product extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//分类id串（数据字典id）   
	private String typeIds;
	//产品名称   
	private String name;
	//市场价   
	private String price;
	//优惠价格   
	private String reducedPrice;
	private String earnestPrice;
	//列表图片   
	private String listUrl;
	//详情图片   
	private String detailUrl;
	//属性1 
	private String attr1;
	//属性2   
	private String attr2;
	//简介   
	private String summary;
	//详情   
	private String content;
	private String team;
	private String cases;
	//是否属性1（0：否 1：是）   
	private int isAttr1;
	//是否属性2（0：否 1：是）   
	private int isAttr2;
	//是否属性3（0：否 1：是）   
	private int isAttr3;
	//置顶   
	private int isTop;
	//推荐   
	private int isPush;
	//首页   
	private int isIndex;
	//状态 0：默认 1：通过 2：不通过   
	private int status;
	//审核人id   
	private int checkAdminId;
	//审核时间   
	private Date checkTime;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;

	
	public void setTypeIds(String value) {
		this.typeIds = value;
	}
	
	public String getTypeIds() {
		return this.typeIds;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setReducedPrice(String value) {
		this.reducedPrice = value;
	}
	
	public String getReducedPrice() {
		return this.reducedPrice;
	}
	
	public void setListUrl(String value) {
		this.listUrl = value;
	}
	
	public String getListUrl() {
		return this.listUrl;
	}
	
	public void setDetailUrl(String value) {
		this.detailUrl = value;
	}
	
	public String getDetailUrl() {
		return this.detailUrl;
	}
	
	public void setAttr1(String value) {
		this.attr1 = value;
	}
	
	public String getAttr1() {
		return this.attr1;
	}
	
	public void setAttr2(String value) {
		this.attr2 = value;
	}
	
	public String getAttr2() {
		return this.attr2;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public String getEarnestPrice() {
		return earnestPrice;
	}

	public void setEarnestPrice(String earnestPrice) {
		this.earnestPrice = earnestPrice;
	}

	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCases() {
		return cases;
	}

	public void setCases(String cases) {
		this.cases = cases;
	}

	public void setIsAttr1(int value) {
		this.isAttr1 = value;
	}
	
	public int getIsAttr1() {
		return this.isAttr1;
	}
	
	public void setIsAttr2(int value) {
		this.isAttr2 = value;
	}
	
	public int getIsAttr2() {
		return this.isAttr2;
	}
	
	public void setIsAttr3(int value) {
		this.isAttr3 = value;
	}
	
	public int getIsAttr3() {
		return this.isAttr3;
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
	
	public void setCheckAdminId(int value) {
		this.checkAdminId = value;
	}
	
	public int getCheckAdminId() {
		return this.checkAdminId;
	}
	public String getCheckTimeString() {
		return DateUtil.formatDatetime(getCheckTime());
	}
	public void setCheckTimeString(String value) {
		setCheckTime(DateUtil.parseDatetime(value));
	}
	
	public void setCheckTime(Date value) {
		this.checkTime = value;
	}
	
	public Date getCheckTime() {
		return this.checkTime;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


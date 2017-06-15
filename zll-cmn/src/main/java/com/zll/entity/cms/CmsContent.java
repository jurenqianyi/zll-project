package com.zll.entity.cms;

import javacommon.base.BaseEntity;

public class CmsContent extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 分类id（数据字典id）
	private int typeId;
	// 标题
	private String title;
	private String summary;
	// 内容
	private String content;
	// 图片路径
	private String imgUrl;
	// 访问链接
	private String url;
	// isTop
	private int isTop;
	// isIndex
	private int isIndex;
	// isPush
	private int isPush;
	private int pv;
	// 操作人id
	private int adminId;
	
	private String attr1;
	private String attr2;
	private String attr3;

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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setContent(String value) {
		this.content = value;
	}

	public String getContent() {
		return this.content;
	}

	public void setImgUrl(String value) {
		this.imgUrl = value;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setUrl(String value) {
		this.url = value;
	}

	public String getUrl() {
		return this.url;
	}

	public void setIsTop(int value) {
		this.isTop = value;
	}

	public int getIsTop() {
		return this.isTop;
	}

	public void setIsIndex(int value) {
		this.isIndex = value;
	}

	public int getIsIndex() {
		return this.isIndex;
	}

	public void setIsPush(int value) {
		this.isPush = value;
	}

	public int getIsPush() {
		return this.isPush;
	}

	public void setAdminId(int value) {
		this.adminId = value;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

}

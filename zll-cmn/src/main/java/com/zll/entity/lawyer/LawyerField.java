package com.zll.entity.lawyer;

import javacommon.base.BaseEntity;

public class LawyerField extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 上级id
	private int pid;
	// 名称
	private String name;
	// 关键字内容
	private String keyword;
	// 排序
	private int sort;
	// 0：默认 1：推荐
	private int isPush;
	// 操作人id（来自system_user表的主键id）
	private int adminId;

	public void setPid(int value) {
		this.pid = value;
	}

	public int getPid() {
		return this.pid;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}

	public void setKeyword(String value) {
		this.keyword = value;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setSort(int value) {
		this.sort = value;
	}

	public int getSort() {
		return this.sort;
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

}

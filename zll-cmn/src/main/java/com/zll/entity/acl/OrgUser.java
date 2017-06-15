package com.zll.entity.acl;

import javacommon.base.BaseEntity;


public class OrgUser extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//分类id（数据字典id）   
	private int typeId;
	//管理用户id   
	private int adminId;
	//角色（admin：管理角色 user:普通用户）   
	private int role;
	//层级   
	private String level;

	
	public void setTypeId(int value) {
		this.typeId = value;
	}
	
	public int getTypeId() {
		return this.typeId;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}
	
	public void setRole(int value) {
		this.role = value;
	}
	
	public int getRole() {
		return this.role;
	}
	
	public void setLevel(String value) {
		this.level = value;
	}
	
	public String getLevel() {
		return this.level;
	}

}


package com.zll.entity.acl;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class OrgAssgin extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//管理用户id   
	private int adminId;
	//分类id（数据字典id，管理员管理的分类）   
	private int typeId;
	//层级   
	private String level;

	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}
	
	public void setTypeId(int value) {
		this.typeId = value;
	}
	
	public int getTypeId() {
		return this.typeId;
	}
	
	public void setLevel(String value) {
		this.level = value;
	}
	
	public String getLevel() {
		return this.level;
	}

}


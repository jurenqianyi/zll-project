package com.zll.entity.oa;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class DepUser extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//分类id（数据字典id）   
	private int depId;
	//用户id   
	private int userId;
	//律师id   
	private int lawyerId;
	//角色（1：管理角色 0:普通用户）   
	private int role;
	//层级   
	private String level;

	
	public void setDepId(int value) {
		this.depId = value;
	}
	
	public int getDepId() {
		return this.depId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setLawyerId(int value) {
		this.lawyerId = value;
	}
	
	public int getLawyerId() {
		return this.lawyerId;
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


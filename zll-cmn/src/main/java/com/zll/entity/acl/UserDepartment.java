package com.zll.entity.acl;

import javacommon.base.BaseEntity;


public class UserDepartment extends BaseEntity {
	
    //部门名称       
	private String name;
    //描述       
	private String description;

	public UserDepartment(){
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}

}


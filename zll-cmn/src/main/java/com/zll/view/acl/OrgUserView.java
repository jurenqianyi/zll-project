package com.zll.view.acl;

import javacommon.view.Body;


public class OrgUserView implements Body {
	
	private static final long serialVersionUID = 1L;
	
	//分类id（数据字典id）   
	private int typeId;
	//角色（admin：管理角色 user:普通用户）   
	private int role;
	//层级   
	private String level;
    //真实姓名       
	private String realName;
    //密码       
	private String password;
    //phone      
	private String phone;

	
	public void setTypeId(int value) {
		this.typeId = value;
	}
	
	public int getTypeId() {
		return this.typeId;
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}


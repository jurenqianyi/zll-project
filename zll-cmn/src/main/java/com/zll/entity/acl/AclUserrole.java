/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zll.entity.acl;

import javacommon.base.BaseEntity;

public class AclUserrole extends BaseEntity {
	
    //用户id       
	private int userId;
    //角色id      
	private int roleId;
    //优先级    
	private int level;

	public AclUserrole(){
	}

	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	public void setRoleId(int value) {
		this.roleId = value;
	}
	
	public int getRoleId() {
		return this.roleId;
	}
	public void setLevel(int value) {
		this.level = value;
	}
	
	public int getLevel() {
		return this.level;
	}

}


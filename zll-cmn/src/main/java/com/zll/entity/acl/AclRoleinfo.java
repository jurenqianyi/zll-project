/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zll.entity.acl;

import javacommon.base.BaseEntity;


public class AclRoleinfo extends BaseEntity {
	
    //角色名称       
	private String name;
    //角色编码       
	private String coding;
	//描述
	private String description;

	public AclRoleinfo(){
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setCoding(String value) {
		this.coding = value;
	}
	
	public String getCoding() {
		return this.coding;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}


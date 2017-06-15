/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zll.entity.acl;

import javacommon.base.BaseEntity;

public class AclFunction extends BaseEntity {
	
    //功能名称     
	private java.lang.String name;
    //权限级别      
	private java.lang.Integer levels;
    //模块id      
	private java.lang.Integer moduleId;
	//url
	private java.lang.String url;

	public AclFunction(){
	}

	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setLevels(java.lang.Integer value) {
		this.levels = value;
	}
	
	public java.lang.Integer getLevels() {
		return this.levels;
	}
	public void setModuleId(java.lang.Integer value) {
		this.moduleId = value;
	}
	
	public java.lang.Integer getModuleId() {
		return this.moduleId;
	}
	
	public java.lang.String getUrl() {
		return url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

}


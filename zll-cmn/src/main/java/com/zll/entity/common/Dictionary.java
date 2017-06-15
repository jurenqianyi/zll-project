/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zll.entity.common;

import java.io.Serializable;

public class Dictionary implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//columns START
    /**
     * 自增ID号       db_column: id 
     */	
	private java.lang.Integer id;
    /**
     * 名称       db_column: name 
     */	
	private java.lang.String name;
    /**
     * 编码       db_column: coding 
     */	
	private java.lang.String coding;
    /**
     * 父id       db_column: pid 
     */	
	private java.lang.Integer pid;
	//columns END

	public Dictionary(){
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setCoding(java.lang.String value) {
		this.coding = value;
	}
	
	public java.lang.String getCoding() {
		return this.coding;
	}
	public void setPid(java.lang.Integer value) {
		this.pid = value;
	}
	
	public java.lang.Integer getPid() {
		return this.pid;
	}

}


/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zll.entity.acl;

import java.util.List;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class AclModuleinfo extends BaseEntity {
	
    //pid       
	private int pid;
    //模块名称      
	private String name;
    //模块地址       
	private String url;
    //模块类型       
	private String sn;
    //图片路径       
	private String path;
    //状态      
	private int status;
    //所属系统       
	private String system;
    //排序      
	private String sorting;
	
	private AclModuleinfo parent;
	private List children;
	private List functions;

	public AclModuleinfo(){
	}

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
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return this.url;
	}
	public void setSn(String value) {
		this.sn = value;
	}
	
	public String getSn() {
		return this.sn;
	}
	public void setPath(String value) {
		this.path = value;
	}
	
	public String getPath() {
		return this.path;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setSystem(String value) {
		this.system = value;
	}
	
	public String getSystem() {
		return this.system;
	}
	public void setSorting(String value) {
		this.sorting = value;
	}
	
	public String getSorting() {
		return this.sorting;
	}

	public AclModuleinfo getParent() {
		return parent;
	}

	public void setParent(AclModuleinfo parent) {
		this.parent = parent;
	}

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public List getFunctions() {
		return functions;
	}

	public void setFunctions(List functions) {
		this.functions = functions;
	}

}


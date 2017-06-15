package com.zll.entity.acl;

import java.util.List;

public class AclView {


	// 模块id
	private java.lang.Integer moduleId;
	// 操作是否有效
	private java.lang.Integer acltristate;
	//权限列表
	private List<Integer> aclList;
	
	public java.lang.Integer getModuleId() {
		return moduleId;
	}
	public void setModuleId(java.lang.Integer moduleId) {
		this.moduleId = moduleId;
	}
	public java.lang.Integer getAcltristate() {
		return acltristate;
	}
	public void setAcltristate(java.lang.Integer acltristate) {
		this.acltristate = acltristate;
	}
	public List<Integer> getAclList() {
		return aclList;
	}
	public void setAclList(List<Integer> aclList) {
		this.aclList = aclList;
	}
	
}


/*
 * Copyright 2008 [rapid-framework], Inc. All rights reserved.
 * Website: http://www.rapid-framework.org.cn
 */

package com.zll.entity.acl;



import java.util.*;

import javacommon.base.BaseEntity;

public class Acl extends BaseEntity {
	
	public static final String TYPE_ROLE = "role";
	public static final String TYPE_USER = "user";
	
	public static final int ACL_TRI_STATE_EXTENDS = 0xFFFFFFFF;
	
	public static final int ACL_TRI_STATE_UNEXTENDS = 0;
	
	public static final int ACL_YES = 1;
	
	public static final int ACL_NO = 0;
	
	public static final int ACL_NEUTRAL = -1;
	
    //主体类型     
	private java.lang.String principalType;
    //主体id     
	private java.lang.Integer principalId;
    //模块id       
	private java.lang.Integer moduleId;
    //操作权限      
	private java.lang.Integer aclstate;
    //操作是否有效     
	private java.lang.Integer acltristate;

	public Acl(){
	}

	public java.lang.String getPrincipalType() {
		return principalType;
	}

	public void setPrincipalType(java.lang.String principalType) {
		this.principalType = principalType;
	}

	public java.lang.Integer getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(java.lang.Integer principalId) {
		this.principalId = principalId;
	}

	public java.lang.Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(java.lang.Integer moduleId) {
		this.moduleId = moduleId;
	}

	public void setAclstate(java.lang.Integer value) {
		this.aclstate = value;
	}
	
	public java.lang.Integer getAclstate() {
		return this.aclstate;
	}
	public void setAcltristate(java.lang.Integer value) {
		this.acltristate = value;
	}
	
	public java.lang.Integer getAcltristate() {
		return this.acltristate;
	}

	public void setPermission(int permission,boolean yes){
		if(aclstate == null) {
			aclstate = 0;
		}
		int temp = 1;
		temp = temp << permission;
		if(yes){
			aclstate |= temp;
		}else{
			aclstate &= ~temp;
		}
	}
	
	public int getPermission(int permission){
		if(aclstate == null) {
			aclstate = 0;
		}
		if(acltristate == null) {
			acltristate = 0;
		}
		if(acltristate == ACL_TRI_STATE_EXTENDS){
			return ACL_NEUTRAL;
		}
		
		int temp = 1;
		temp = temp << permission;
		temp &= aclstate;
		if(temp != 0){
			return ACL_YES;
		}
		return ACL_NO;
	}
	
	public void setExtends(boolean yes){
		if(yes){
			acltristate = ACL_TRI_STATE_EXTENDS;
		}else{
			acltristate = ACL_TRI_STATE_UNEXTENDS;
		}
	}
}


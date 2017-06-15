package com.zll.entity.acl;

import java.util.Date;
import java.util.List;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class SystemUser extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户名       
	private String userName;
    //真实姓名       
	private String realName;
    //头像       
	private String headUrl;
    //邮箱       
	private String email;
    //密码       
	private String password;
    //状态（0未激活 1 激活 2 冻结）   
	private Integer status;
    //loginTime      
	private Date loginTime;
    //loginIp      
	private String loginIp;
    //loginTotal     
	private int loginTotal;
    //最后登录时间     
	private Date lastLoginTime;
    //最后登录ip       
	private String lastLoginIp;
    //部门id      
	private int departmentId;
    //phone      
	private String phone;
	//角色名称
	private String roleName;
	//部门
	private String departmentName;
	//律师id
	private int lawyerId;
	
	//用户安全组id数组
	private Integer[] roleIds;
	
	private List<String> roleNameList;
		
	public SystemUser(){
	}

	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setRealName(String value) {
		this.realName = value;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public String getLoginTimeString() {
		return DateUtil.formatDatetime(getCreateTime());
	}
	public void setLoginTimeString(String value) {
		setLoginTime(DateUtil.parseDatetime(value));
	}
	
	public void setLoginTime(Date value) {
		this.loginTime = value;
	}
	
	public Date getLoginTime() {
		return this.loginTime;
	}
	public void setLoginIp(String value) {
		this.loginIp = value;
	}
	
	public String getLoginIp() {
		return this.loginIp;
	}
	public void setLoginTotal(int value) {
		this.loginTotal = value;
	}
	
	public int getLoginTotal() {
		return this.loginTotal;
	}
	public String getLastLoginTimeString() {
		return DateUtil.formatDatetime(getLastLoginTime());
	}
	public void setLastLoginTimeString(String value) {
		setLastLoginTime(DateUtil.parseDatetime(value));
	}
	
	public void setLastLoginTime(Date value) {
		this.lastLoginTime = value;
	}
	
	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	public void setLastLoginIp(String value) {
		this.lastLoginIp = value;
	}
	
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}
	public void setDepartmentId(int value) {
		this.departmentId = value;
	}
	
	public int getDepartmentId() {
		return this.departmentId;
	}
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer[] getRoleIds() {
		if(roleIds == null) {
			return new Integer[0];
		}
		return roleIds;
	}

	public void setRoleIds(Integer[] roleIds) {
		this.roleIds = roleIds;
	}

	public List<String> getRoleNameList() {
		return roleNameList;
	}

	public void setRoleNameList(List<String> roleNameList) {
		this.roleNameList = roleNameList;
	}
	
	public int getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}

	public String getRoleNames() {
		String roleNames = "";
		for(int i=0; i<this.getRoleNameList().size(); i++) {
			roleNames += this.getRoleNameList().get(i) + ",";
		}
		if(roleNames.length() > 0) {
			roleNames = roleNames.substring(0, roleNames.length()-1);
		}
		return roleNames;
	}

}


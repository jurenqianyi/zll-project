package com.zll.entity.user;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class User extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户名   
	private String userName;
	//密码   
	private String password;
	//用户类型（0：普通用户 1：律师用户）   
	private int userType;
	//registerTime   
	private Date registerTime;
	//registerIp   
	private String registerIp;
	//loginTime   
	private Date loginTime;
	//loginIp   
	private String loginIp;
	//最后登录时间   
	private Date lastLoginTime;
	//最后登录ip   
	private String lastLoginIp;
	//登录次数   
	private int loginTotal;
	//是否实名认证 1 是   
	private int isRealnameAuth;
	//安全等级   
	private int safeLevel;
	//是否认证手机   
	private int isPhone;
	//是否绑定邮箱   
	private int isEmail;
	//是否身份证认证   
	private int isCard;
	//注册来源（0：pc 1：h5 2：app）   
	private int source;
	private int megNum;
	private String message;

	//状态（0未激活 1 激活 2 冻结）   
	private int status;
	//操作员   
	private int adminId;
	//律师id(登陆自动传入)
	private int lawyerId;
	private int policyAdminId;
	private String ddUserId;
	private UserBaseinfo userBaseinfo;
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setUserType(int value) {
		this.userType = value;
	}
	
	public int getUserType() {
		return this.userType;
	}
	public String getRegisterTimeString() {
		return DateUtil.formatDatetime(getRegisterTime());
	}
	public void setRegisterTimeString(String value) {
		setRegisterTime(DateUtil.parseDatetime(value));
	}
	
	public void setRegisterTime(Date value) {
		this.registerTime = value;
	}
	
	public Date getRegisterTime() {
		return this.registerTime;
	}
	
	public void setRegisterIp(String value) {
		this.registerIp = value;
	}
	
	public String getRegisterIp() {
		return this.registerIp;
	}
	public String getLoginTimeString() {
		return DateUtil.formatDatetime(getLoginTime());
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
	
	public void setLoginTotal(int value) {
		this.loginTotal = value;
	}
	
	public int getLoginTotal() {
		return this.loginTotal;
	}
	
	public void setIsRealnameAuth(int value) {
		this.isRealnameAuth = value;
	}
	
	public int getIsRealnameAuth() {
		return this.isRealnameAuth;
	}
	
	public void setSafeLevel(int value) {
		this.safeLevel = value;
	}
	
	public int getSafeLevel() {
		return this.safeLevel;
	}
	
	public void setIsPhone(int value) {
		this.isPhone = value;
	}
	
	public int getIsPhone() {
		return this.isPhone;
	}
	
	public void setIsEmail(int value) {
		this.isEmail = value;
	}
	
	public int getIsEmail() {
		return this.isEmail;
	}
	
	public void setIsCard(int value) {
		this.isCard = value;
	}
	
	public int getIsCard() {
		return this.isCard;
	}
	
	public void setSource(int value) {
		this.source = value;
	}
	
	public int getSource() {
		return this.source;
	}
	
	public int getMegNum() {
		return megNum;
	}

	public void setMegNum(int megNum) {
		this.megNum = megNum;
	}

	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

	public int getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}

	public UserBaseinfo getUserBaseinfo() {
		return userBaseinfo;
	}

	public void setUserBaseinfo(UserBaseinfo userBaseinfo) {
		this.userBaseinfo = userBaseinfo;
	}

	public int getPolicyAdminId() {
		return policyAdminId;
	}

	public void setPolicyAdminId(int policyAdminId) {
		this.policyAdminId = policyAdminId;
	}

	public String getDdUserId() {
		return ddUserId;
	}

	public void setDdUserId(String ddUserId) {
		this.ddUserId = ddUserId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}


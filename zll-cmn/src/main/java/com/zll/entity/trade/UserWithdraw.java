package com.zll.entity.trade;

import java.util.Date;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class UserWithdraw extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户id   
	private int userId;
	//银行类型   
	private int bankType;
	//卡号   
	private String bankNo;
	//持卡人姓名   
	private String name;
	//开户地址   
	private String adress;
	//提现金额   
	private String money;
	//属性   
	private String attr;
	//状态   
	private int status;
	//操作人id   
	private int adminId;
	//提现时间   
	private Date times;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setBankType(int value) {
		this.bankType = value;
	}
	
	public int getBankType() {
		return this.bankType;
	}
	
	public void setBankNo(String value) {
		this.bankNo = value;
	}
	
	public String getBankNo() {
		return this.bankNo;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAdress(String value) {
		this.adress = value;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setMoney(String value) {
		this.money = value;
	}
	
	public String getMoney() {
		return this.money;
	}
	
	public void setAttr(String value) {
		this.attr = value;
	}
	
	public String getAttr() {
		return this.attr;
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
	public String getTimesString() {
		return DateUtil.formatDatetime(getTimes());
	}
	public void setTimesString(String value) {
		setTimes(DateUtil.parseDatetime(value));
	}
	
	public void setTimes(Date value) {
		this.times = value;
	}
	
	public Date getTimes() {
		return this.times;
	}

}


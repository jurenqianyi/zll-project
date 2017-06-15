package com.zll.entity.trade;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class UserAccount extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//userId   
	private int userId;
	//帐户可用余额   
	private String amount;
	//累计收入   
	private String income;
	//累计提现   
	private String withdraw;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setAmount(String value) {
		this.amount = value;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setIncome(String value) {
		this.income = value;
	}
	
	public String getIncome() {
		return this.income;
	}
	
	public void setWithdraw(String value) {
		this.withdraw = value;
	}
	
	public String getWithdraw() {
		return this.withdraw;
	}

}


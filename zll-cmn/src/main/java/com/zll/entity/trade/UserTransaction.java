package com.zll.entity.trade;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class UserTransaction extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//用户id   
	private int userId;
	//交易标题   
	private String title;
	//交易类型   
	private String tradeType;
	//交易的资源id   
	private int tradeTypeId;
	//交易单号   
	private String tradeNo;
	//交易类型1，收入2，支出   
	private int type;
	//交易金额   
	private String amount;
	//是否展示（0：不显示，1：显示）   
	private int isShow;
	//状态   
	private int status;
	//备注说明   
	private String remark;
	//操作该次记录的操作人   
	private String actionUser;

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTradeType(String value) {
		this.tradeType = value;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeTypeId(int value) {
		this.tradeTypeId = value;
	}
	
	public int getTradeTypeId() {
		return this.tradeTypeId;
	}
	
	public void setTradeNo(String value) {
		this.tradeNo = value;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	
	public void setAmount(String value) {
		this.amount = value;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setIsShow(int value) {
		this.isShow = value;
	}
	
	public int getIsShow() {
		return this.isShow;
	}
	
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setActionUser(String value) {
		this.actionUser = value;
	}
	
	public String getActionUser() {
		return this.actionUser;
	}

}


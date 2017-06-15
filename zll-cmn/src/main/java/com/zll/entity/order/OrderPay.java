package com.zll.entity.order;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class OrderPay extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//订单id   
	private int orderId;
	//支付方式 1:支付宝 2:微信支付 3:手机支付宝   
	private int payWay;
	private String payPrice;
	private int payStatus;
	//第三方业务号   
	private String tradeNo;
	//交易时间   
	private Date tradeTime;
	//属性   
	private String attr;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;

	
	public void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	
	public void setPayWay(int value) {
		this.payWay = value;
	}
	
	public int getPayWay() {
		return this.payWay;
	}
	
	public String getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

	public int getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}

	public void setTradeNo(String value) {
		this.tradeNo = value;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	public String getTradeTimeString() {
		return DateUtil.formatDatetime(getTradeTime());
	}
	public void setTradeTimeString(String value) {
		setTradeTime(DateUtil.parseDatetime(value));
	}
	
	public void setTradeTime(Date value) {
		this.tradeTime = value;
	}
	
	public Date getTradeTime() {
		return this.tradeTime;
	}
	
	public void setAttr(String value) {
		this.attr = value;
	}
	
	public String getAttr() {
		return this.attr;
	}
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

}


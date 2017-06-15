package com.zll.view.order;


public class OrderItemView {

	// 订单类型
	private String orderType;
	// 订购的资源id
	private int orderTypeId;
	// 订购的数量
	private String num;
	// 属性
	private String attr;
	//是否定金支付 1：是
	private int isEarnest;
	
	public String getOrderType() {
		return this.orderType;
	}
	
	public void setOrderType(String value) {
		this.orderType = value;
	}
	
	public int getOrderTypeId() {
		return this.orderTypeId;
	}
	
	public void setOrderTypeId(int value) {
		this.orderTypeId = value;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public void setNum(String value) {
		this.num = value;
	}
	
	public String getAttr() {
		return this.attr;
	}
	
	public void setAttr(String value) {
		this.attr = value;
	}

	public int getIsEarnest() {
		return isEarnest;
	}

	public void setIsEarnest(int isEarnest) {
		this.isEarnest = isEarnest;
	}
	
}


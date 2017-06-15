package com.zll.entity.order;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class OrderAction extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//被操作的交易号   
	private int orderId;
	//订单状态   
	private int orderStatus;
	//支付状态 0:未支付 1:已支付   
	private int payStatus;
	//操作备注   
	private String remark;
	//操作该次的人员   
	private String actionUser;

	
	public void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	
	public void setOrderStatus(int value) {
		this.orderStatus = value;
	}
	
	public int getOrderStatus() {
		return this.orderStatus;
	}
	
	public void setPayStatus(int value) {
		this.payStatus = value;
	}
	
	public int getPayStatus() {
		return this.payStatus;
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


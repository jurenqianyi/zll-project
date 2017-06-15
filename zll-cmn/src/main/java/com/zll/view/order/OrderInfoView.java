package com.zll.view.order;

import java.util.Date;
import java.util.List;

import javacommon.view.Body;
import javacommon.view.HashMapView;


public class OrderInfoView implements Body {

	private int orderId;
	//订单号   
	private String orderNo;
	//订购的总价   
	private String orderTotalPrice;
	//订单状态   
	private int orderStatus;
	//支付状态 0:未支付 1:已支付   
	private int payStatus;
	//支付方式 1:新浪支付 2:微信支付 3:支付宝   
	private int payWay;
	// 创建时间 
	private String createTime;
	private List<HashMapView> items;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}
	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public int getPayWay() {
		return payWay;
	}
	public void setPayWay(int payWay) {
		this.payWay = payWay;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public List<HashMapView> getItems() {
		return items;
	}
	public void setItems(List<HashMapView> items) {
		this.items = items;
	}

}


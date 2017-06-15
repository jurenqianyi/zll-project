package com.zll.view.order;

import java.util.List;

import javacommon.view.Body;


public class OrderView implements Body {

	private String orderType;
	private String phone;
	private int source;
	private List<OrderItemView> items;

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public List<OrderItemView> getItems() {
		return items;
	}

	public void setItems(List<OrderItemView> items) {
		this.items = items;
	}
	
}


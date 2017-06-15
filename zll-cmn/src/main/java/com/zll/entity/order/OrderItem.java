package com.zll.entity.order;

import javacommon.base.BaseEntity;

import com.zll.entity.product.Product;


public class OrderItem extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//订单id   
	private int orderId;
	//订单类型   
	private String orderType;
	//订购的资源id   
	private int orderTypeId;
	private String title;
	private String summary;
	//订购的资源的（订购时）价格   
	private String price;
	//订购的数量   
	private String num;
	private int isEarnest;
	private String originalPrice;
	//属性   
	private String attr;
	private int isComment;

	private Product product;
	
	public void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	
	public void setOrderType(String value) {
		this.orderType = value;
	}
	
	public String getOrderType() {
		return this.orderType;
	}
	
	public void setOrderTypeId(int value) {
		this.orderTypeId = value;
	}
	
	public int getOrderTypeId() {
		return this.orderTypeId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setNum(String value) {
		this.num = value;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public int getIsEarnest() {
		return isEarnest;
	}

	public void setIsEarnest(int isEarnest) {
		this.isEarnest = isEarnest;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public void setAttr(String value) {
		this.attr = value;
	}
	
	public String getAttr() {
		return this.attr;
	}

	public int getIsComment() {
		return isComment;
	}

	public void setIsComment(int isComment) {
		this.isComment = isComment;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}


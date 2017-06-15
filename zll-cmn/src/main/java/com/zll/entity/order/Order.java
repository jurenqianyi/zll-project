package com.zll.entity.order;

import java.util.Date;
import java.util.List;

import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Order extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//订单标题   
	private String orderTitle;
	//订单号   
	private String orderNo;
	//userId   
	private int userId;
	//订单来源   
	private int source;
	//订单类型   
	private String orderType;
	//订购的资源id   
	private int orderTypeId;
	//订购的资源的（订购时）价格   
	private String orderPrice;
	//订购的数量   
	private String orderNum;
	//订购的总价   
	private String orderTotalPrice;
	private String orderPayPrice;
	//订单状态   
	private int orderStatus;
	//支付状态 0:未支付 1:已支付   
	private int payStatus;
	//支付方式 1:新浪支付 2:微信支付 3:支付宝   
	private int payWay;
	//第三方业务号   
	private String tradeNo;
	//交易时间   
	private Date tradeTime;
	//管理用户id（来自system_user表的主键id）   
	private int adminId;
	private String attr;
	
	private List<OrderItem> items;

	
	public void setOrderTitle(String value) {
		this.orderTitle = value;
	}
	
	public String getOrderTitle() {
		return this.orderTitle;
	}
	
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setSource(int value) {
		this.source = value;
	}
	
	public int getSource() {
		return this.source;
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
	
	public void setOrderPrice(String value) {
		this.orderPrice = value;
	}
	
	public String getOrderPrice() {
		return this.orderPrice;
	}
	
	public String getOrderPayPrice() {
		return orderPayPrice;
	}

	public void setOrderPayPrice(String orderPayPrice) {
		this.orderPayPrice = orderPayPrice;
	}

	public void setOrderNum(String value) {
		this.orderNum = value;
	}
	
	public String getOrderNum() {
		return this.orderNum;
	}
	
	public void setOrderTotalPrice(String value) {
		this.orderTotalPrice = value;
	}
	
	public String getOrderTotalPrice() {
		return this.orderTotalPrice;
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
	
	public void setPayWay(int value) {
		this.payWay = value;
	}
	
	public int getPayWay() {
		return this.payWay;
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
	
	public void setAdminId(int value) {
		this.adminId = value;
	}
	
	public int getAdminId() {
		return this.adminId;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

}


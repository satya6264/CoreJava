package com.vidvaan.costum.serialization;

import java.io.Serializable;

public class Orders extends Product implements Serializable {

	private String orderName;
	private String orderStatus;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderName, String orderStatus) {
		super();
		this.orderName = orderName;
		this.orderStatus = orderStatus;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderName=" + orderName + ", orderStatus=" + orderStatus + "]";
	}
	
	
}

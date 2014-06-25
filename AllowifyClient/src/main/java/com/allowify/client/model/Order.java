package com.allowify.client.model;

import java.io.Serializable;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Customer customer;
	private Address billingAddress;
	private Address shippingAddress;
	private String ipAddress;
	
	private long orderID;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public long getOrderID() {
		return orderID;
	}
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer +", orderID="+orderID+"]";
	}
	
}
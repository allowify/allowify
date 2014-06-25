package com.allowify.client.AllowifyClient;

import com.allowify.client.model.Address;
import com.allowify.client.model.Customer;
import com.allowify.client.model.Order;

public class TestHelper {
	
	public static Order buildOrder(String facebookID) {
		return buildOrder(facebookID, "John", "Smith","john.smith@gmail.com");
	}

	public static Order buildOrder(String facebookID,String firstName,String lastName,String email) {
		Order order = new Order();              

		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setFacebookID(facebookID);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);

		Address billingAddress = new Address();
		billingAddress.setAddress1("4914 N. Milwaukee Ave.");
		billingAddress.setAddress2("");
		billingAddress.setCity("Chicago");
		billingAddress.setState("IL");
		billingAddress.setZip("60630");
		billingAddress.setLatitude("41.969859");
		billingAddress.setLongitude("-87.763028");

		order.setCustomer(customer);
		order.setBillingAddress(billingAddress);
		order.setShippingAddress(billingAddress);
		order.setIpAddress("100.200.30.42");

		return order;
	}
	
	
}

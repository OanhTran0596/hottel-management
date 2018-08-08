package com.imodel;

import java.util.List;

import com.entity.Customer;

public interface ICustomerModel {
	public abstract boolean addCustomer(List<Customer> listCustomer, Customer customer);

	public abstract boolean editCustomer(List<Customer> listCustomer, int identifyCard);

	public abstract boolean deleteCustomer(List<Customer> listCustomer, int identifyCard);

	public abstract List<Customer> showCustomer(List<Customer> listCustomer);
}

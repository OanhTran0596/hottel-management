package com.iview;

import java.util.List;

import com.entity.Customer;
import com.entity.Room;

public interface ICustomerView {
	public abstract Customer addCustomer(Customer customer);

	public abstract int editCustomer(int identifyCard);

	public abstract int deleteCustomer(int identifyCard);

	public abstract void showCustomer(Customer customer);

	public abstract void showCustomerList(List<Customer> listCustomer);

	public abstract void showMessage(String messgae);

}

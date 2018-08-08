package com.view;

import java.util.List;

import com.entity.Customer;
import com.iview.ICustomerView;
import com.iview.ImpInputData;

public class CustomerView implements ICustomerView {
	ImpInputData data = new InputData();

	@Override
	public Customer addCustomer(Customer customer) {

		customer.setIdentifyCard(data.inputInt("\nEnter identify card: "));
		customer.setName(data.inputString("\nEnter name: "));
		customer.setAge(data.inputInt("\nEnter age: "));
		customer.setPhone(data.inputString("\nEnter phone number: "));

		return customer;

	}

	@Override
	public int editCustomer(int identifyCard) {
		identifyCard = data.inputInt("\nEnter identify card: ");

		return identifyCard;

	}

	@Override
	public int deleteCustomer(int identifyCard) {
		identifyCard = data.inputInt("Enter identify card: ");

		return identifyCard;

	}

	@Override
	public void showCustomer(Customer customer) {
		System.out.println("Customer identify card: "
				+ customer.getIdentifyCard());
		System.out.println("Customer name: " + customer.getName());
		System.out.println("Customer age: " + customer.getAge());
		System.out.println("Customer phone number: " + customer.getPhone());
		System.out.println("-------------------------------------");

	}

	@Override
	public void showCustomerList(List<Customer> listCustomer) {
		for (Customer customer : listCustomer) {
			this.showCustomer(customer);
		}

	}
	
	@Override
	public void showMessage(String message) {
		System.out.println(message);

	}

}

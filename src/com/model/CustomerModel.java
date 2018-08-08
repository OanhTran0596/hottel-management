package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.entity.Customer;
import com.imodel.ICustomerModel;
import com.view.InputData;

public class CustomerModel implements ICustomerModel {
	InputData data = new InputData();

	@Override
	public boolean addCustomer(List<Customer> listCustomer, Customer customer) {
		int lenght = 0;
		boolean flag = false;
		if (customer.getAge() == 20) {
			customer.setName(customer.getName() + 20);
		}
		lenght = listCustomer.size();
		listCustomer.add(customer);
		if (lenght < listCustomer.size()) {
			flag = true;
		}

		return flag;

	}

	@Override
	public boolean editCustomer(List<Customer> listCustomer, int identifyCard) {
		boolean flag = false;
		List<Customer> customers = new ArrayList<Customer>();
		for (Customer customer : listCustomer) {
			if (customer.getIdentifyCard() == identifyCard) {
				customer.setName(data.inputString("\nEnter name: "));
				customer.setAge(data.inputInt("\nEnter age: "));
				customer.setPhone(data.inputString("\nEnter phone number: "));
			}
			customers.add(customer);
			flag = true;

		}

		return flag;

	}

	@Override
	public boolean deleteCustomer(List<Customer> listCustomer, int identifyCard) {
		boolean flag = false;
		int lenght = listCustomer.size();
		for (Customer customer : listCustomer) {
			if (customer.getIdentifyCard() == identifyCard) {
				listCustomer.remove(customer);
			}
		}
		if (lenght > listCustomer.size()) {
			flag = true;
		}

		return flag;

	}

	@Override
	public List<Customer> showCustomer(List<Customer> listCustomer) {
		Collections.sort(listCustomer, new Comparator<Customer>() {

			@Override
			public int compare(Customer customer1, Customer customer2) {
				if (customer1.getRoomNumber() - customer2.getRoomNumber() > 0) {
					return 1;
				} else if (customer1.getRoomNumber() - customer2.getRoomNumber() < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return listCustomer;
	}
}

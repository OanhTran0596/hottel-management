package com.view;

import java.util.ArrayList;
import java.util.List;

import com.common.IConfiguration;
import com.entity.Customer;
import com.entity.Room;
import com.entity.Transaction;
import com.iview.ITransactionView;

public class TransactionView implements ITransactionView {
	InputData data = new InputData();

	@Override
	public Transaction checkIn(Transaction transaction, List<Room> listRooms) {
		int transactioncode = 0;
		int roomNumber = 0;
		Room room = null;
		Customer customer = null;
		RoomView roomView = new RoomView();
		CustomerView customerView = new CustomerView();
		List<Customer> listCustomers = new ArrayList<Customer>();

		for (Room roomObject : listRooms) {
			if (roomObject.getStatus() == IConfiguration.ROOM_STATUS_AVAILABLE) {
				roomView.showRoom(roomObject);
			}
		}
		transactioncode = data.inputInt("\nEnter transaction code: ");
		roomNumber = data.inputInt("\nEnter roomNumber: ");
		customer = new Customer();
		customer = customerView.addCustomer(customer);
		listCustomers.add(customer);
		for (Room room1 : listRooms) {
			if (room1.getRoomNumber() == roomNumber) {
				room = room1;
			}
		}
		transaction.setTransactionNumber(transactioncode);
		transaction.setRoom(room);
		transaction.setCustumer(customer);

		return transaction;
	}

	@Override
	public Transaction checkOut(List<Transaction> listTransactions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showMessage(String message) {
		System.out.println(message);

	}

	@Override
	public void showTransaction(List<Transaction> listTransactions) {
		// TODO Auto-generated method stub
		
	}

}

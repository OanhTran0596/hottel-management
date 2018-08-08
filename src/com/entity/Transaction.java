package com.entity;

public class Transaction {
	private int transactionNumber;
	private Customer custumer;
	private Room room;

	public Transaction() {
		super();
	}

	public Transaction(int transactionNumber, Customer custumer, Room room) {
		super();
		this.transactionNumber = transactionNumber;
		this.custumer = custumer;
		this.room = room;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public Customer getCustumer() {
		return custumer;
	}

	public void setCustumer(Customer custumer) {
		this.custumer = custumer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}

package com.iview;

import java.util.List;

import com.entity.Room;
import com.entity.Transaction;

public interface ITransactionView {
	public abstract Transaction checkIn(Transaction transaction,
			List<Room> listRooms);

	public abstract Transaction checkOut(List<Transaction> listTransactions);

	public abstract void showTransaction(List<Transaction> listTransactions);

	public abstract void showMessage(String message);
}

package com.imodel;

import java.util.List;

import com.entity.Transaction;

public interface ITransactionModel {
	public abstract boolean checkIn(List<Transaction> listTransactions,
			Transaction transaction);

	public abstract boolean checkOut(List<Transaction> listTransactions,
			Transaction transaction);

	public abstract void showTransaction(List<Transaction> listTransactions);
}

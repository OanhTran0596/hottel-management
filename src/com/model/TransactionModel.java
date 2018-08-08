package com.model;

import java.util.List;

import com.common.IConfiguration;
import com.entity.Transaction;
import com.imodel.ITransactionModel;

public class TransactionModel implements ITransactionModel {

	@Override
	public boolean checkIn(List<Transaction> listTransactions,
			Transaction transaction) {
		int lenght = 0;
		boolean flag = false;
		lenght = listTransactions.size();
		transaction.getRoom().setStatus(IConfiguration.ROOM_STATUS_BUSY);
		listTransactions.add(transaction);
		if (listTransactions != null && lenght < listTransactions.size()) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean checkOut(List<Transaction> listTransactions,
			Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showTransaction(List<Transaction> listTransactions) {
		// TODO Auto-generated method stub
		
	}

}

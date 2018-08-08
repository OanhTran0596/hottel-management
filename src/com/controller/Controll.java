package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.common.IConfiguration;
import com.entity.Customer;
import com.entity.Room;
import com.entity.Transaction;
import com.imodel.ICustomerModel;
import com.imodel.IRoomModel;
import com.iview.IMenu;
import com.iview.ITransactionView;
import com.iview.ImpInputData;
import com.model.CustomerModel;
import com.model.RoomModel;
import com.model.TransactionModel;
import com.view.CustomerView;
import com.view.InputData;
import com.view.MenuView;
import com.view.RoomView;
import com.view.TransactionView;

public class Controll {

	public static void main(String[] args) {
		int choiceMain = 0;
		boolean flag = false;
		int choiceFunction = 0;
		String choiceOfContinueFunction = "";
		ImpInputData inputData = new InputData();
		IMenu menu = new MenuView();
		RoomView roomView = new RoomView();
		IRoomModel roomModel = new RoomModel();
		CustomerView customerView = new CustomerView();
		ICustomerModel customerModel = new CustomerModel();
		Room room = null;
		Customer customer = null;
		Transaction transaction = null;
		List<Room> listRoom = null;
		List<Customer> listCustomer = null;
		List<Transaction> listTransactions = null;

		do {
			menu.mainMenu();
			choiceMain = inputData.inputInt("\nEnter your choice: ");

			switch (choiceMain) {
			case IConfiguration.MENU_ROOM: {
				listRoom = new ArrayList<Room>();
				do {
					menu.menuRoom();
					choiceFunction = inputData
							.inputInt("\nEnter your choice room function: ");
					switch (choiceFunction) {
					case IConfiguration.MENU_ROOM_ADD_ROOM: {

						do {
							flag = false;
							room = new Room();
							room = roomView.addRoom(room);
							flag = roomModel.addRoom(listRoom, room);
							if (flag) {
								roomView.showMessage("\nAdd room succeed!");
							} else {
								roomView.showMessage("\nAdd room unsucceed!");
							}
							choiceOfContinueFunction = inputData
									.inputString("Are you want continue this function?<Y/N>");

						} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));
					}

						break;
					case IConfiguration.MENU_ROOM_EDIT_ROOM: {
						if (listRoom != null) {
							flag = false;
							int roomNumber = 0;
							do {
								roomNumber = roomView.editRoom(roomNumber);
								flag = roomModel.editRoom(listRoom, roomNumber);
								if (flag) {
									roomView.showMessage("Edit room succeed!");
								} else {
									roomView.showMessage("Edit room unsuceed!");
								}
								choiceOfContinueFunction = inputData
										.inputString("Are you want continue this function? <Y/N>");
							} while (choiceOfContinueFunction
									.equalsIgnoreCase("Y"));
						} else {
							roomView.showMessage("\nList room is not null!");

						}

					}

						break;
					case IConfiguration.MENU_ROOM_DISSPLAY_ROOM: {
						roomView.showRoomList(listRoom);
					}

						break;
					case IConfiguration.MENU_ROOM_DELETE_ROOM: {
						if (listRoom != null) {
							flag = false;
							int roomNumber = 0;
							do {
								roomNumber = roomView.deleteRoom(roomNumber);
								flag = roomModel.deleteRoom(listRoom,
										roomNumber);
								if (flag) {
									roomView.showMessage("\nDeleted room succeed!");
								} else {
									roomView.showMessage("\nDeleted room unsuceed!");
								}
								choiceOfContinueFunction = inputData
										.inputString("Are you want continue this function? <Y/N>");
							} while (choiceOfContinueFunction
									.equalsIgnoreCase("Y"));

						} else {
							roomView.showMessage("\nList room is not null!");

						}

					}

						break;

					default:
						System.out.println("\nYou must enter to 11 from 14!");
						break;
					}
					choiceOfContinueFunction = inputData
							.inputString("\nAre you want continue with this function?<Y/N>");

				} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));
			}

				break;

			case IConfiguration.MENU_CUSTOMER: {
				listCustomer = new ArrayList<Customer>();
				do {
					menu.menuCustomer();
					choiceFunction = inputData
							.inputInt("\nEnter your choice room function: ");
					switch (choiceFunction) {
					case IConfiguration.MENU_CUSTOMER_ADD_CUSTOMER: {

						do {
							flag = false;
							customer = new Customer();
							customer = customerView.addCustomer(customer);
							flag = customerModel.addCustomer(listCustomer,
									customer);
							if (flag) {
								customerView
										.showMessage("\nAdd customer succeed!");
							} else {
								customerView
										.showMessage("\nAdd customer unsucceed!");
							}
							choiceOfContinueFunction = inputData
									.inputString("Are you want continue this function?<Y/N>");

						} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));
					}

						break;
					case IConfiguration.MENU_CUSTOMER_EDIT_CUSTOMER: {
						if (listCustomer != null) {
							flag = false;
							int identifyCard = 0;
							do {
								identifyCard = customerView
										.editCustomer(identifyCard);
								flag = customerModel.editCustomer(listCustomer,
										identifyCard);
								if (flag) {
									customerView
											.showMessage("Edit customer succeed!");
								} else {
									customerView
											.showMessage("Edit customer unsuceed!");
								}
								choiceOfContinueFunction = inputData
										.inputString("Are you want continue this function? <Y/N>");
							} while (choiceOfContinueFunction
									.equalsIgnoreCase("Y"));
						} else {
							roomView.showMessage("\nList customer is not null!");

						}

					}

						break;
					case IConfiguration.MENU_CUSTOMER_DISSPLAY_CUSTOMER: {
						listCustomer = customerModel.showCustomer(listCustomer);
						customerView.showCustomerList(listCustomer);
					}

						break;
					case IConfiguration.MENU_CUSTOMER_DELETE_CUSTOMER: {
						if (listCustomer != null) {
							flag = false;
							int identifyCard = 0;
							do {
								identifyCard = customerView
										.deleteCustomer(identifyCard);
								flag = customerModel.deleteCustomer(
										listCustomer, identifyCard);
								if (flag) {
									roomView.showMessage("\nDeleted customer succeed!");
								} else {
									roomView.showMessage("\nDeleted customer unsuceed!");
								}
								choiceOfContinueFunction = inputData
										.inputString("Are you want continue this function? <Y/N>");
							} while (choiceOfContinueFunction
									.equalsIgnoreCase("Y"));

						} else {
							roomView.showMessage("\nList customer is not null!");

						}

					}

						break;

					default:
						System.out.println("\nYou must enter to 11 from 14!");
						break;
					}
					choiceOfContinueFunction = inputData
							.inputString("\nAre you want continue with this function?<Y/N>");

				} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));
			}

				break;
			case IConfiguration.MENU_TRANSACTION: {
				TransactionView transactionView = new TransactionView();
				TransactionModel transactionModel = new TransactionModel();
				do {
					menu.menuTransaction();
					choiceFunction = inputData.inputInt("\nEnter function: ");
					switch (choiceFunction) {
					case IConfiguration.MENU_TRANSACTION_CHECK_IN: {
						do {
							flag = false;
							transaction = new Transaction();
							listTransactions = new ArrayList<Transaction>();
							transaction = transactionView.checkIn(transaction,
									listRoom);
							flag = transactionModel.checkIn(listTransactions,
									transaction);
							if (flag) {
								transactionView
										.showMessage("\nCheck in succeed!");
							} else {
								transactionView
										.showMessage("\nCheck in unsucceed!");

							}
							choiceOfContinueFunction = inputData
									.inputString("\nAre you want continue this function? <Y/N>");
						} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));

					}

						break;
					case IConfiguration.MENU_TRANSACTION_CHECK_OUT:

						break;

					default:
						break;
					}
					choiceOfContinueFunction = inputData
							.inputString("\nAre you want continue this Function? <Y/N>");
				} while (choiceOfContinueFunction.equalsIgnoreCase("Y"));

			}
				break;
			case IConfiguration.MENU_EXIT: {
				System.exit(0);

			}
				break;

			default:
				System.out.println("\nYou must enter to 0 from 3!");
				break;
			}
		} while (choiceMain != 0);

	}
}

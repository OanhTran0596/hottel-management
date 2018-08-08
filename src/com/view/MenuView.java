package com.view;

import com.common.IConfiguration;
import com.iview.IMenu;

public class MenuView implements IMenu {

	@Override
	public void mainMenu() {
		System.out.println(IConfiguration.MENU_ROOM + ". To handle Room");
		System.out.println(IConfiguration.MENU_TRANSACTION
				+ ". To handle Transaction");
		System.out.println(IConfiguration.MENU_CUSTOMER
				+ ". To handle Customer");
		System.out.println(IConfiguration.MENU_EXIT + ". Exit");

	}

	@Override
	public void menuRoom() {
		System.out.println(IConfiguration.MENU_ROOM + ". To handle Room");
		System.out.println(IConfiguration.MENU_ROOM_ADD_ROOM + ". Add room");
		System.out.println(IConfiguration.MENU_ROOM_EDIT_ROOM + ". Edit room");
		System.out.println(IConfiguration.MENU_ROOM_DISSPLAY_ROOM
				+ ". Dissplay room");
		System.out.println(IConfiguration.MENU_ROOM_DELETE_ROOM
				+ ". Delete room");

	}

	@Override
	public void menuCustomer() {
		System.out.println(IConfiguration.MENU_CUSTOMER
				+ ". To handle Customer");
		System.out.println(IConfiguration.MENU_CUSTOMER_ADD_CUSTOMER
				+ ". Add Customer");
		System.out.println(IConfiguration.MENU_CUSTOMER_EDIT_CUSTOMER
				+ ". Edit Customer");
		System.out.println(IConfiguration.MENU_CUSTOMER_DISSPLAY_CUSTOMER
				+ ". Dissplay Customer");
		System.out.println(IConfiguration.MENU_CUSTOMER_DELETE_CUSTOMER
				+ ". Delete Customer");

	}

	@Override
	public void menuTransaction() {
		System.out.println(IConfiguration.MENU_TRANSACTION
				+ ".\t To handle transaction");
		System.out.println(IConfiguration.MENU_TRANSACTION_CHECK_IN
				+ ". Check in");
		System.out.println(IConfiguration.MENU_TRANSACTION_CHECK_OUT
				+ ". Check out");

	}

}

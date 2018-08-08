package com.common;

public interface IConfiguration {
	public static final int MENU_EXIT = 0;
	
	public static final int MENU_ROOM = 1;
	public static final int MENU_ROOM_ADD_ROOM = 11;
	public static final int MENU_ROOM_EDIT_ROOM = 12;
	public static final int MENU_ROOM_DISSPLAY_ROOM = 13;
	public static final int MENU_ROOM_DELETE_ROOM= 14;
	public static final String ROOM_TYPE_VIP = "VIP";
	public static final String ROOM_TYPE_NORMAL = "Normal";
	public static final int ROOM_DISCOUNT_VIP = 5;
	public static final int ROOM_DISCOUNT_NORMAL = 10;
	public static final String ROOM_STATUS_AVAILABLE = "Available";
	public static final String ROOM_STATUS_BUSY = "Busy";
	
	public static final int MENU_TRANSACTION = 2;
	public static final int MENU_TRANSACTION_CHECK_IN = 21;
	public static final int MENU_TRANSACTION_CHECK_OUT = 22;
	
	public static final int MENU_CUSTOMER = 3;
	public static final int MENU_CUSTOMER_ADD_CUSTOMER= 31;
	public static final int MENU_CUSTOMER_EDIT_CUSTOMER = 32;
	public static final int MENU_CUSTOMER_DISSPLAY_CUSTOMER = 33;
	public static final int MENU_CUSTOMER_DELETE_CUSTOMER = 34;
	
	

}

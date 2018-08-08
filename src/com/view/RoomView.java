package com.view;

import java.util.List;

import javax.xml.crypto.Data;

import com.common.IConfiguration;
import com.common.IMessage;
import com.entity.Room;
import com.iview.IRoomView;
import com.iview.ImpInputData;

public class RoomView implements IRoomView, IMessage {
	ImpInputData data = new InputData();

	@Override
	public Room addRoom(Room room) {
		int roomTypeTemp;
		roomTypeTemp = data.inputInt("Enter 0:" + IConfiguration.ROOM_TYPE_VIP
				+ "   1:" + IConfiguration.ROOM_TYPE_NORMAL);
		switch (roomTypeTemp) {
		case 0: {
			room.setRoomType(IConfiguration.ROOM_TYPE_VIP);
			room.setDiscount(IConfiguration.ROOM_DISCOUNT_VIP);
		}

			break;
		case 1: {
			room.setRoomType(IConfiguration.ROOM_TYPE_NORMAL);
			room.setDiscount(IConfiguration.ROOM_DISCOUNT_NORMAL);
		}

			break;

		default: {
			System.out.println("Rom type is undefined!");
		}
			break;
		}
		room.setRoomNumber(data.inputInt("Enter room number:"));
		room.setNumberOfPeople(data.inputInt("Enter number of people:"));
		room.setNumberOfDayRented(data.inputInt("Enter number of day rented:"));
		room.setRentCost(data.inputInt("Enter rent cost:"));
		room.setTotalmoney(room.getRentCost() * room.getDiscount());
		room.setStatus(IConfiguration.ROOM_STATUS_AVAILABLE);

		return room;
	}

	@Override
	public int editRoom(int roomNumber) {
		roomNumber = data.inputInt("\nEnter room number: ");

		return roomNumber;

	}

	@Override
	public int deleteRoom(int roomNumber) {
		roomNumber = data.inputInt("Enter roomNumber");

		return roomNumber;
	}

	@Override
	public void showRoom(Room room) {
		System.out.println("Room number: " + room.getRoomNumber());
		System.out.println("Room type: " + room.getRoomType());
		System.out
				.println("Room number of people: " + room.getNumberOfPeople());
		System.out.println("Room number of day rendted: "
				+ room.getNumberOfDayRented());
		System.out.println("Room discout: " + room.getDiscount());
		System.out.println("Room rent cost: " + room.getRentCost());
		System.out.println("Room status: " + room.getStatus());
		System.out.println("Room total money: " + room.getTotalmoney());
		System.out.println("-------------------------------------");

	}

	@Override
	public void showRoomList(List<Room> rooms) {
		for (Room room : rooms) {
			this.showRoom(room);
		}

	}

	@Override
	public int enterRoomFind() {
		int roomNumber;
		roomNumber = data.inputInt("Enter room number find:");
		return roomNumber;
	}

	@Override
	public void showMessage(String message) {
		System.out.println(message);

	}

}

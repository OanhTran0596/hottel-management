package com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.common.IConfiguration;
import com.entity.Room;
import com.imodel.IRoomModel;
import com.view.InputData;

public class RoomModel implements IRoomModel {
	InputData data = new InputData();

	@Override
	public boolean addRoom(List<Room> listRoom, Room room) {
		int lenght = 0;
		boolean flag = false;

		room.setTotalmoney(room.getRentCost() * (room.getDiscount() / 100));
		lenght = listRoom.size();
		listRoom.add(room);

		if (lenght < listRoom.size()) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean editRoom(List<Room> listRoom, int roomNumber) {
		boolean flag = false;
		int roomTypeTemp;
		int roomStatusTemp;
		List<Room> rooms = new ArrayList<Room>();
		for (Room room : listRoom) {
			if (room.getRoomNumber() == roomNumber) {
				roomTypeTemp = data.inputInt("\nEnter 0: "
						+ IConfiguration.ROOM_TYPE_VIP + "   1:"
						+ IConfiguration.ROOM_TYPE_NORMAL);
				switch (roomTypeTemp) {
				case 0:
					room.setRoomType(IConfiguration.ROOM_TYPE_VIP);
					room.setDiscount(IConfiguration.ROOM_DISCOUNT_VIP);

					break;
				case 1:
					room.setRoomType(IConfiguration.ROOM_TYPE_NORMAL);
					room.setDiscount(IConfiguration.ROOM_DISCOUNT_NORMAL);

					break;

				default:
					break;
				}
				room.setNumberOfPeople(data
						.inputInt("\nEnter room number of people: "));
				room.setNumberOfDayRented(data
						.inputInt("\nEnter number of day rented: "));
				room.setRentCost(data.inputInt("\nEnter rent cost: "));
				roomStatusTemp = data.inputInt("\nEnter room status <0:  "
						+ IConfiguration.ROOM_STATUS_AVAILABLE + "1:"
						+ IConfiguration.ROOM_STATUS_BUSY + "> ");
				switch (roomStatusTemp) {
				case 0:
					room.setStatus(IConfiguration.ROOM_STATUS_AVAILABLE);

					break;
				case 1:
					room.setStatus(IConfiguration.ROOM_STATUS_BUSY);

					break;

				default:
					break;
				}
				room.setTotalmoney(room.getRentCost()
						* (room.getDiscount() / 100));
			}
			rooms.add(room);
			flag = true;

		}

		return flag;

	}

	@Override
	public boolean deleteRoom(List<Room> listRoom, int roomNumber) {
		boolean flag = false;
		int lenght = listRoom.size();
		for (Room room : listRoom) {
			if (room.getRoomNumber() == roomNumber) {
				listRoom.remove(room);
			}
		}
		if (lenght > listRoom.size()) {
			flag = true;
		}

		return flag;

	}

	@Override
	public List<Room> showRoom(List<Room> listRoom) {
		Collections.sort(listRoom, new Comparator<Room>() {

			@Override
			public int compare(Room room1, Room room2) {
				if (room1.getRoomNumber() - room2.getRoomNumber() > 0) {
					return 1;
				} else if (room1.getRoomNumber() - room2.getRoomNumber() < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return listRoom;
	}

}

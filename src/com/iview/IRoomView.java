package com.iview;

import java.util.List;

import com.entity.Room;

public interface IRoomView {
	public abstract Room addRoom(Room room);

	public abstract int enterRoomFind();

	public abstract int editRoom(int roomNumber);

	public abstract int deleteRoom(int roomNumber);

	public abstract void showRoom(Room room);

	public abstract void showRoomList(List<Room> rooms);

}

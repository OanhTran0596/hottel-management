package com.imodel;

import java.util.List;

import com.entity.Room;

public interface IRoomModel {
	public abstract boolean addRoom(List<Room> listRoom, Room room);

	public abstract boolean editRoom(List<Room> listRoom, int roomNumber);

	public abstract boolean deleteRoom(List<Room> listRoom, int roomNumber);

	public abstract List<Room> showRoom(List<Room> listRoom);
}

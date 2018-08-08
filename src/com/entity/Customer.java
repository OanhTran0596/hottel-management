package com.entity;

public class Customer {
	private int identifyCard;
	private String name;
	private int age;
	private int roomNumber;
	private String phone;

	public Customer() {
		super();
	}

	public Customer(int identifyCard, String name, int age, int roomNumber,
			String phone) {
		super();
		this.identifyCard = identifyCard;
		this.name = name;
		this.age = age;
		this.roomNumber = roomNumber;
		this.phone = phone;
	}

	public int getIdentifyCard() {
		return identifyCard;
	}

	public void setIdentifyCard(int identifyCard) {
		this.identifyCard = identifyCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

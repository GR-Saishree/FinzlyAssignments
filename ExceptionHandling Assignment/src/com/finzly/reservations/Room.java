package com.finzly.reservations;

public class Room {

	private int roomNumber;
	private double numberOfHours;
	private double pricePerHour;
	

	public Room(int roomNumber,double numberOfHours,double pricePerHour){
		setNumberOfHours(numberOfHours);
		setRoomNumber(roomNumber);
		setPricePerHour(pricePerHour);
		
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	
}

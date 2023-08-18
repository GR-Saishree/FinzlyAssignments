package com.finzly.testquestions;

public class Room {

	private int roomNumber;
	private int capacity;
	private double pricePerNight;
	private String checkin;
	private String checkout;
	private static int totalRooms=2;
	private static int availableRooms=totalRooms;
	
	boolean checkAvailability() {
		if(availableRooms>0) {
		  System.out.println("Rooms are available");
		  return true;
		}
		else {
		  System.out.println("Rooms are not available");
		  return false;
		}
		
	}
	void makeReservation(int roomNumber,int capacity,double pricePerNight) {
		if(checkAvailability()==true) {
			this.roomNumber=roomNumber;
			this.capacity=capacity;
			this.pricePerNight=pricePerNight;
			availableRooms--;
			System.out.println(toString());
		}
	}
	void makeReservation(int roomNumber,int capacity,double pricePerNight,String checkin,String checkout) {
		if(checkAvailability()==true) {
			this.roomNumber=roomNumber;
			this.capacity=capacity;
			this.pricePerNight=pricePerNight;
			this.checkin=checkin;
			this.checkout=checkout;
			availableRooms--;
			System.out.println(toString()+" with checkin date "+checkin+" and checkout date "+checkout);
		}
	}
	@Override
	public String toString() {
		String newString="Room number:"+roomNumber+" with capacity of "+capacity+" people that cost Rs. "+pricePerNight+" price per night";
		return newString;
		
	}
}

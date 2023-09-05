package com.finzly.reservations;

public class RoomReservation extends Reservation{
	
	private Room room;

	public RoomReservation(Guest guest, String reservationDate, Room room) {
		super(guest, reservationDate);
		setRoom(room);
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}

package com.finzly.reservations;

public class Reservation {

	
	private Guest guest;
	private String reservationDate;
	
	public Reservation(Guest guest, String reservationDate) {
		setGuest(guest);
		setReservationDate(reservationDate);
	}
	
	
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		if(reservationDate.isEmpty()) {
			System.out.println("Enter a valid date");
			setReservationDate(reservationDate);
		}
		this.reservationDate = reservationDate;
	}
	
	
}

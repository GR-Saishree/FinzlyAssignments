package com.finzly.reservations;

public class EventHallResgistration extends Reservation {

	
	private String eventDetails;
	
	public EventHallResgistration(Guest guest, String reservationDate, String eventDetails) {
		super(guest, reservationDate);
		setEventDetails(eventDetails);
		
	}

	public String getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	
}

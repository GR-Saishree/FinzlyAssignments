package com.finzly.reservations;

public class SpaServiceReservation extends Reservation {

	
	private String serviceName;
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public SpaServiceReservation(Guest guest, String reservationDate,String serviceName) {
		super(guest, reservationDate);
		setServiceName(serviceName);
		
	}

	
	
}

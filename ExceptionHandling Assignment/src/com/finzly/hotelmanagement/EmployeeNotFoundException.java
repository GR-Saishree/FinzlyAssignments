package com.finzly.hotelmanagement;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

	public EmployeeNotFoundException() {
		super();
	}
}

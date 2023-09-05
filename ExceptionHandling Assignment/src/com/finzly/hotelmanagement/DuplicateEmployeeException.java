package com.finzly.hotelmanagement;

@SuppressWarnings("serial")
public class DuplicateEmployeeException extends RuntimeException{
	
	

	public DuplicateEmployeeException(String message) {
		super(message);
	}
	
	public DuplicateEmployeeException() {
		super();
	}

}

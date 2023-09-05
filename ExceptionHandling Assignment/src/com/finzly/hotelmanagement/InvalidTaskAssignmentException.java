package com.finzly.hotelmanagement;

@SuppressWarnings("serial")
public class InvalidTaskAssignmentException extends RuntimeException{
	
	public InvalidTaskAssignmentException(String message) {
		super(message);
	}
	
	public InvalidTaskAssignmentException() {
		super();
	}


}

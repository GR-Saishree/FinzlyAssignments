package com.finzly.fxtrading.exception;

// This exception is thrown when user enters invalid name
public class InvalidNameException extends RuntimeException{

	public InvalidNameException() {
		super();
	}
	
	public InvalidNameException(String message) {
		super(message);
	}
}

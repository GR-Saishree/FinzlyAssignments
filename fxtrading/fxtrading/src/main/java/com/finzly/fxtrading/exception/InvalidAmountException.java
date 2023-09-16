package com.finzly.fxtrading.exception;


// This exception is thrown when user enters invalid value
public class InvalidAmountException extends RuntimeException{
	
	
	public InvalidAmountException() {
		super();
	}
	
	public InvalidAmountException(String message) {
		super(message);
	}
}



package com.finzly.fxtrading.exception;


// This exception is thrown when user enters invalid currency pair to book trade
public class InvalidCurrencyPairToBookException extends RuntimeException{
	
	public InvalidCurrencyPairToBookException() {
		super();
	}
	
	public InvalidCurrencyPairToBookException(String message) {
		super(message);
	}

}

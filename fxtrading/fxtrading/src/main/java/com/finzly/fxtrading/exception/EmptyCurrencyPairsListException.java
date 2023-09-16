package com.finzly.fxtrading.exception;


// This exception is thrown when the currency pair list is empty
public class EmptyCurrencyPairsListException extends RuntimeException {

	public EmptyCurrencyPairsListException() {
		super();
	}
	
	public EmptyCurrencyPairsListException(String message) {
		super(message);
	}
}

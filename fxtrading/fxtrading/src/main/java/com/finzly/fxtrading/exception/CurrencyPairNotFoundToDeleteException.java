package com.finzly.fxtrading.exception;


// This exception is thrown when you can't find the currency pair to delete
public class CurrencyPairNotFoundToDeleteException extends RuntimeException {

	public CurrencyPairNotFoundToDeleteException() {
		super();
		
	}
	
	public CurrencyPairNotFoundToDeleteException(String message) {
		super(message);
	}
}

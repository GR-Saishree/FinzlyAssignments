package com.finzly.fxtrading.exception;

// This exception is thrown when user fetches trade list that is empty
public class NoTradeBookedException extends RuntimeException {

	public NoTradeBookedException() {
		super();
	}
	
	public NoTradeBookedException(String message) {
		super(message);
	}
}

package com.springboot.fxtradingmicroservice.exception;

// Custom Exception TradeAlreadyExistsException
public class TradeAlreadyExistsException extends RuntimeException {

	public TradeAlreadyExistsException(String msg) {
		super(msg);
	}

}

package com.springboot.fxtradingmicroservice.exception;

// Custom Exception TradeNotExistsException
public class TradeNotExistsException extends RuntimeException {

	public TradeNotExistsException(String msg) {
		super(msg);
	}
}

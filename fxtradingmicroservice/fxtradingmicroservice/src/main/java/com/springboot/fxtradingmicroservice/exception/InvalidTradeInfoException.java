package com.springboot.fxtradingmicroservice.exception;

// Custom Exception InvalidTradeInfoException 
public class InvalidTradeInfoException extends RuntimeException {

		public InvalidTradeInfoException(String msg) {
			super(msg);
		}
	

}

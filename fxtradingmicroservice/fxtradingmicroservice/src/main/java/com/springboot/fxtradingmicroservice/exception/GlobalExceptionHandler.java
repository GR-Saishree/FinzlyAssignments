package com.springboot.fxtradingmicroservice.exception;

// import statements
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// A class that handles custom exceptions
@RestControllerAdvice
public class GlobalExceptionHandler {

		@ExceptionHandler(TradeAlreadyExistsException.class)
		public String tradeAlreadyExistsException(TradeAlreadyExistsException ex) {
			return ex.getMessage();
		}

		@ExceptionHandler(TradeNotExistsException.class)
		public String tradeNotExistsException(TradeNotExistsException ex) {
			return ex.getMessage();
		}
		
		@ExceptionHandler(InvalidTradeInfoException.class)
		public String invalidTradeInfoException(InvalidTradeInfoException ex) {
			return ex.getMessage();
		}

}



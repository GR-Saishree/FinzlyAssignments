package com.finzly.fxtrading.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidCurrencyPairToBookException.class)
	public String invalidCurrencyPairException(InvalidCurrencyPairToBookException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(InvalidNameException.class)
	public String invalidTradeInfoException(InvalidNameException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(InvalidAmountException.class)
	public String invalidAmountException(InvalidAmountException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(NoTradeBookedException.class)
	public String noTradeBookedException(NoTradeBookedException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(CurrencyPairNotFoundToDeleteException.class)
	public String currencyPairNotFoundException(CurrencyPairNotFoundToDeleteException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(EmptyCurrencyPairsListException.class)
	public String noCurrencyPairsFoundException(EmptyCurrencyPairsListException ex) {
		return ex.getMessage();
	}

}

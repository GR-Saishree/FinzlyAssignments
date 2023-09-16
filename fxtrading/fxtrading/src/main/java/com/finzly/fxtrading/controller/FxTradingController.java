package com.finzly.fxtrading.controller;

/*
     @author Sai shree

Note: The controller transforms the raw input (in the form of a JSON request) into a domain-specific object . This transformation is specific to the HTTP request and should be handled at the controller level.
 */

// import statements

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.fxtrading.dto.TradeDetailsInputDto;
import com.finzly.fxtrading.entity.ExchangeRatePairs;
import com.finzly.fxtrading.entity.TradeDetails;
import com.finzly.fxtrading.service.FxTradingService;

@RestController
@RequestMapping("fxtrading")
public class FxTradingController {

	// Initialize a logger instance for FxTradingController class using LoggerFactory
	private final Logger logger = LoggerFactory.getLogger(FxTradingController.class);

	@Autowired
	private FxTradingService fxTradingService;

	
	// API to add or update currency pair with their exchange rates
	@PostMapping("addOrUpdateExchangeRatePairs")
	public String addOrUpdateExchangeRatePairs(@RequestBody ExchangeRatePairs exchangeRatePairs) {
		return fxTradingService.addOrUpdateExchangeRatePairs(exchangeRatePairs);
	}

	
	// API to book a trade
	@PostMapping("bookTrade")
	public ResponseEntity<String> bookTrade(@RequestBody TradeDetailsInputDto tradeDetailsInput) {

		// Handling case if user enters String value in amount attribute where Double value is expected
		String inputAmountStr = tradeDetailsInput.getInputAmount().toString();
		try {
			Double.parseDouble(inputAmountStr);
		} catch (NumberFormatException e) {
			return ResponseEntity.badRequest().body("Invalid input amount. Provide a valid numeric value");
		}

		// Create TradeDetails object and store the input values
		TradeDetails tradeDetails = new TradeDetails();
		tradeDetails.setCurrencyPair(tradeDetailsInput.getCurrencyPair());
		tradeDetails.setInputAmount(Double.parseDouble(inputAmountStr));
		tradeDetails.setSender(tradeDetailsInput.getSender());
		tradeDetails.setReceiver(tradeDetailsInput.getReceiver());

		// Book the trade and return the status of booking information
		String bookingInfo = fxTradingService.bookTrade(tradeDetails);

		// Logging trade was booked successfully , if booking is successful
		logger.info("Trade booked successfully");
		return ResponseEntity.ok(bookingInfo);
	}
	

	// API to fetch all trades as list
	@GetMapping("getTradeList")
	public List<TradeDetails> getTradeList() {
		return fxTradingService.getTradeList();
	}
	

	
	// API to get all currency pairs with its exchange rate
	@GetMapping("getAllCurrencyPairs")
	public List<ExchangeRatePairs> getAllCurrencyPairs() {
		return fxTradingService.getAllCurrencyPairs();
	}

	
	// API to delete currency pair with exchange rate
	@DeleteMapping("deleteCurrencyPair/{currencyPair}")
	public String deleteCurrencyPair(@PathVariable String currencyPair) {
		logger.info("Currency pair deleted" + currencyPair);
		return fxTradingService.deleteCurrencyPair(currencyPair);
	}
}

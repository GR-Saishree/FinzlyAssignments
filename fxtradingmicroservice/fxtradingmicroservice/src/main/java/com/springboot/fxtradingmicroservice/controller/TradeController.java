package com.springboot.fxtradingmicroservice.controller;

// import statements
import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.fxtradingmicroservice.exception.InvalidTradeInfoException;
import com.springboot.fxtradingmicroservice.exception.TradeNotExistsException;
import com.springboot.fxtradingmicroservice.model.Trade;
import com.springboot.fxtradingmicroservice.service.TradeService;

@RestController
@RequestMapping("trade")
public class TradeController {
	
		@Autowired
		TradeService service;
		
		// If user enters invalid info exception is thrown or else trade info is returned
		@PostMapping("bookTrade")
		public Object bookTrade(@RequestBody Trade trade) {
			boolean isAdded = service.bookTrade(trade);
			if(isAdded) {
				String convertedAmount = currencyConverter(trade.getUSDINRRate(),trade.getAmount());
				trade.setConvertedAmount(convertedAmount);
				return "Trade for USDINR with trade number "+trade.getTradeNum()+" been booked with rate "+trade.getUSDINRRate()+" , The amount of Rs. "+trade.getConvertedAmount()+" will be transferred in 2 working days to "+trade.getCustomerName();
			}else {
				throw new InvalidTradeInfoException("Invalid Trade Info ..");
			}
		}
		
		// Method to get converted amount and format it 
		private String currencyConverter(double USDINR, double amount) {
			double convertedValue = USDINR * amount;
			DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
			return (decimalFormat.format(convertedValue));
			
		}
		

		// If user tries to access trade which does not exists then TradeNotFoundException is thrown or else list is returned
		@GetMapping("tradeList")
		public ResponseEntity<Object> getListOfTrades(){
			
			List<Trade> tradeList = service.getTradeList();
			if(tradeList.isEmpty()) {
				throw new TradeNotExistsException("Trade does not exists..");
			}else {
				return new ResponseEntity<Object>( tradeList,HttpStatus.FOUND);
			}
			
		}

}

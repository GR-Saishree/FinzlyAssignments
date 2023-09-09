package com.springboot.fxtradingmicroservice.controller;


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
import com.springboot.fxtradingmicroservice.model.Trade;
import com.springboot.fxtradingmicroservice.service.TradeService;

@RestController
@RequestMapping("trade")
public class TradeController {
	
		@Autowired
		TradeService service;
		
		@PostMapping("bookTrade")
		public Object bookTrade(@RequestBody Trade trade) {
			boolean isAdded = service.bookTrade(trade);
			if(isAdded) {
				String convertedAmount = currencyConverter(trade.getUSDINRRate(),trade.getAmount());
				trade.setConvertedAmount(convertedAmount);
				return "Trade for USDINR with trade number "+trade.getTradeNum()+" been booked with rate "+trade.getUSDINRRate()+" , The amount of Rs. "+trade.getConvertedAmount()+" will be transferred in 2 working days to "+trade.getCustomerName();
			}else {
				return "Trade is not booked. Kindly enter the valid details\n"
						+ "Follow the following rules while entering details\n "
						+ "1.Currency pair must be USDINR \n"
						+ "2.Amount can't be zero or negative and can't exceed maximum trade value";
			}
		}
		
		public String currencyConverter(double USDINR, double amount) {
			double convertedValue = USDINR * amount;
			DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
			return (decimalFormat.format(convertedValue));
			
		}
		

		@GetMapping("tradeList")
		public ResponseEntity<Object> getListOfTrades(){
			
			List<Trade> tradeList = service.getTradeList();
			if(tradeList.isEmpty()) {
				return new ResponseEntity<Object>( HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<Object>( tradeList,HttpStatus.FOUND);
			}
			
		}

}

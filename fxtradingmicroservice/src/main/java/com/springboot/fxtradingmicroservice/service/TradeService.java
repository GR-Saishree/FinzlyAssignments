package com.springboot.fxtradingmicroservice.service;

// import statements
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.fxtradingmicroservice.model.Trade;

@Service
public class TradeService {

	
	private static int tradeCount;

	// List which stores booked trade details
	List<Trade> tradeList = new ArrayList<>();

	// Method to book the trade
	public boolean bookTrade(Trade trade) {
		
		if(!(isValidName(trade.getCustomerName())||isValidCurrencyPair(trade.getCurrencyPair())||isValidAmount(trade.getAmount()))) {
			return false;
		}
		else {
			tradeCount++;
			trade.setTradeNum(tradeCount);
			tradeList.add(trade);
			return true;
		}
	}
	
	// Method to get list of trades that have been booked
	public List<Trade> getTradeList(){
		return tradeList;
	}

	// Method for validating customer name
	private static boolean isValidName(String customerName) {
		return customerName.matches("^[a-zA-Z. ]+$") && !(customerName.isEmpty());
	}

	// Method for validating currency pair
	private static boolean isValidCurrencyPair(String currencyPair) {
		return currencyPair.equalsIgnoreCase("USDINR") && !(currencyPair.isEmpty());
	}

	// Method for validating amount
	private static boolean isValidAmount(double amount) {
		return amount>0 && amount<= Trade.getMaxTradeValue();
	}
}

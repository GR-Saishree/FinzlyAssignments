package com.springboot.fxtradingmicroservice.service;


// import statements
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.fxtradingmicroservice.model.Trade;

@Service
public class TradeService {

	
	private static int tradeCount;
	
	
	// TradeList to store all booked trades
	List<Trade> tradeList = new ArrayList<>();
	
	
	// Method to book a trade if it has valid info
	public boolean bookTrade(Trade trade) {
		
		if((isValidName(trade.getCustomerName()) && isValidCurrencyPair(trade.getCurrencyPair()) && isValidAmount(trade.getAmount()))) {
			tradeCount++;
			trade.setTradeNum(tradeCount);
			tradeList.add(trade);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// Method to get the trade list
	public List<Trade> getTradeList(){
		return tradeList;
	}
	
	// Method to validate name
	private static boolean isValidName(String customerName) {
		return customerName.matches("^[a-zA-Z. ]+$") && !(customerName.isEmpty()) && !(customerName.equals(" "));
	}
	
	// Method to validate currency pair
	private static boolean isValidCurrencyPair(String currencyPair) {
		return currencyPair.equalsIgnoreCase("USDINR") && !(currencyPair.isEmpty());
	}
	
	// Method to validate amount
	private static boolean isValidAmount(double amount) {
		return amount>0 && amount<= Trade.getMaxTradeValue();
	}
}

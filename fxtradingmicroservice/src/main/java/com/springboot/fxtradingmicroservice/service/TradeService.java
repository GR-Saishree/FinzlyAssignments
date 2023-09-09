package com.springboot.fxtradingmicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.fxtradingmicroservice.model.Trade;

@Service
public class TradeService {

	
	private static int tradeCount;
	
	List<Trade> tradeList = new ArrayList<>();
	
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
	
	
	public List<Trade> getTradeList(){
		return tradeList;
	}
	
	private static boolean isValidName(String customerName) {
		return customerName.matches("^[a-zA-Z. ]+$") && !(customerName.isEmpty());
	}
	
	private static boolean isValidCurrencyPair(String currencyPair) {
		return currencyPair.equalsIgnoreCase("USDINR") && !(currencyPair.isEmpty());
	}
	
	private static boolean isValidAmount(double amount) {
		return amount>0 && amount<= Trade.getMaxTradeValue();
	}
}

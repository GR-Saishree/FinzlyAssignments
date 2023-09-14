package com.springboot.fxtradingmicroservice.model;

public class Trade {
	
	
	// Trade class variables
	private int tradeNum=0;
	private static double USDINRRate = 66.00;
	private static double maxTradeValue = Double.MAX_VALUE-1;
	
	private double amount;
	private String customerName;
	private String currencyPair;
	private String convertedAmount;
	
	// Default constructor
	Trade(){
		
	}
	
	// Parameterized constructor
	Trade(String customerName,String currencyPair,double amount){
		this.customerName = customerName;
		this.currencyPair = currencyPair;
		this.amount = amount;
	}

	// Getters and Setters
	public int getTradeNum() {
		return tradeNum;
	}

	public void setTradeNum(int tradeNum) {
		this.tradeNum = tradeNum;
	}

	public double getUSDINRRate() {
		return USDINRRate;
	}

	public void setUSDINR(double USDINRrate) {
		USDINRRate = USDINRrate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public static double getMaxTradeValue() {
		return maxTradeValue;
	}

	public static void setMaxTradeValue(double maxTradeValue) {
		Trade.maxTradeValue = maxTradeValue;
	}
	
	public String getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(String convertedAmount2) {
		this.convertedAmount = convertedAmount2;
	}
	
	// Overridden toString()
	@Override
	public String toString() {
		return "Trade Number: "+getTradeNum()+" , Customer Name: "+getCustomerName()+" , Currency Pair: "+getCurrencyPair()+" , Rate:  "+getUSDINRRate()+" , Amount Transferred:INR " +getUSDINRRate()*getAmount();
	}

	

	
}

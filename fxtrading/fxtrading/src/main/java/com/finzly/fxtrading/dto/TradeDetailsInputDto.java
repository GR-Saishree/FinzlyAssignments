package com.finzly.fxtrading.dto;


// DTO class to receive the raw input . This allows us to handle the input validation before converting it into object
public class TradeDetailsInputDto {

	private String currencyPair;
	private String sender;
	private String receiver;
	private String inputAmount;
	
	
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getInputAmount() {
		return inputAmount;
	}
	public void setInputAmount(String inputAmount) {
		this.inputAmount = inputAmount;
	}
}

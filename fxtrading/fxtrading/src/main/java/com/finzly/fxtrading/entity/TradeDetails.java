package com.finzly.fxtrading.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TradeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tradeNum;
	private String sender;
	private String receiver;
	private String currencyPair;
	private Double exchangeRate;
	private Double inputAmount;
	private Double fxTransferAmount;
	
	public Double getInputAmount() {
		return inputAmount;
	}
	public void setInputAmount(Double inputAmount) {
		this.inputAmount = inputAmount;
	}
	public Double getFxTransferAmount() {
		return fxTransferAmount;
	}
	public void setFxTransferAmount(Double fxTransferAmount) {
		this.fxTransferAmount = fxTransferAmount;
	}
	public Long getTradeNum() {
		return tradeNum;
	}
	public void setTradeNum(Long tradeNum) {
		this.tradeNum = tradeNum;
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
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	
	
}

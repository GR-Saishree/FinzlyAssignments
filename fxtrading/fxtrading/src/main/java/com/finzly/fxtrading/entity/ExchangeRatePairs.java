package com.finzly.fxtrading.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRatePairs {

	@Id
	private String currencyPair;
	private Double exchangeRate;
	
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

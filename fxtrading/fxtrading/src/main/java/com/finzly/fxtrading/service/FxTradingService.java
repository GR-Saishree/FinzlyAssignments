package com.finzly.fxtrading.service;

/*
    @author Sai shree
 
 */
// import statements
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.fxtrading.dao.FxTradingDao;
import com.finzly.fxtrading.entity.ExchangeRatePairs;
import com.finzly.fxtrading.entity.TradeDetails;
import com.finzly.fxtrading.exception.CurrencyPairNotFoundToDeleteException;
import com.finzly.fxtrading.exception.InvalidAmountException;
import com.finzly.fxtrading.exception.InvalidCurrencyPairToBookException;
import com.finzly.fxtrading.exception.InvalidNameException;
import com.finzly.fxtrading.exception.EmptyCurrencyPairsListException;
import com.finzly.fxtrading.exception.NoTradeBookedException;

@Service
public class FxTradingService {

	// Initialize a logger instance for FxTradingController class using LoggerFactory
	private final Logger logger = LoggerFactory.getLogger(FxTradingService.class);

	@Autowired
	private FxTradingDao fxTradingDao;

	// Method that adds exchange rate pairs if not added, else updates exchange rate with currency pair
	public String addOrUpdateExchangeRatePairs(ExchangeRatePairs exchangeRatePairs) {

		List<ExchangeRatePairs> exchangeRatePairsList = fxTradingDao
				.findByCurrencyPair(exchangeRatePairs.getCurrencyPair());

		if (!exchangeRatePairsList.isEmpty()) {
			ExchangeRatePairs existingPair = exchangeRatePairsList.get(0);
			existingPair.setExchangeRate(exchangeRatePairs.getExchangeRate());
			fxTradingDao.update(existingPair);
			logger.info("Updated Exchange Rate for specified currency pair");
			return "Updated Exchange Rate for specified currency pair";
		} else {
			fxTradingDao.add(exchangeRatePairs);
			logger.info("Inserted currency pair with exchange rate");
			return "Inserted currency pair with exchange rate";
		}
	}
	
	

	// Method to book trade , it fetches exchange rate based on user entered currency pair and calculates the amount transferred
	public String bookTrade(TradeDetails tradeDetails) {
		Double exchangeRate = null;
		String currencyPair = tradeDetails.getCurrencyPair();
		Double inputAmount = tradeDetails.getInputAmount();
		String senderName = tradeDetails.getSender();
		String receiverName = tradeDetails.getReceiver();

		// Fetch exchange rate based on user entered currency pair
		List<ExchangeRatePairs> matchedPairList = fxTradingDao.findByCurrencyPair(currencyPair);
		if (matchedPairList.isEmpty()) {
			throw new InvalidCurrencyPairToBookException(
					"Invalid Currency Pair: Trade is not possible for specified currency pair");
		}
		if (!isValidName(senderName) || !isValidName(receiverName)) {
			throw new InvalidNameException("Invalid name . Provide a valid name");
		}

		if (!isValidAmount(inputAmount)) {
			throw new InvalidAmountException("Invalid amount . Provide a valid numericvalue");
		} else {

			// If all input details are valid then calculate the trade details and book the trade
			for (ExchangeRatePairs exchangeRatePair : matchedPairList) {
				exchangeRate = exchangeRatePair.getExchangeRate();
			}

			Double fxTransferAmount = inputAmount * exchangeRate;
			tradeDetails.setExchangeRate(exchangeRate);
			tradeDetails.setFxTransferAmount(fxTransferAmount);
			return fxTradingDao.bookTrade(tradeDetails);
		}

	}

	
	
	// Method to get list of all booked trades if exists, otherwise throws exception
	public List<TradeDetails> getTradeList() {
		if (fxTradingDao.getTradeList().isEmpty()) {
			throw new NoTradeBookedException("No trades have been booked yet");
		} else {
			return fxTradingDao.getTradeList();
		}

	}
	
	
	
	// Method that checks whether specified currency pair exist in table to delete, otherwise throws exception
	public String deleteCurrencyPair(String currencyPair) {
		List<ExchangeRatePairs> matchedPairList = fxTradingDao.findByCurrencyPair(currencyPair);
		if (matchedPairList.isEmpty()) {
			throw new CurrencyPairNotFoundToDeleteException(
					"Specified Currency pair cannot be deleted as it does not exist");
		}
		else {
			return fxTradingDao.deleteCurrencyPair(currencyPair);
		}
		
	}
	
	

	// Method that checks if list is empty then throws exception , otherwise returns list of all currency pairs
	public List<ExchangeRatePairs> getAllCurrencyPairs() {
		if (fxTradingDao.getAllCurrencyPairs().isEmpty()) {
			throw new EmptyCurrencyPairsListException("No currency pairs with exchange rates is available");
		} else {
			return fxTradingDao.getAllCurrencyPairs();
		}
		
	}
	
	

	// Method to validate name
	private static boolean isValidName(String customerName) {
		return customerName.matches("^[a-zA-Z. ]+$") && !(customerName.isEmpty()) && !(customerName.equals(" "));
	}
	
	

	// Method to validate amount
	private static boolean isValidAmount(Double amount) {
		return amount > 0;
	}

	

}

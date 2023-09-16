package com.finzly.fxtrading.dao;

/*
 
     @author - Sai shree
     
 */

// import statements
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.fxtrading.entity.ExchangeRatePairs;
import com.finzly.fxtrading.entity.TradeDetails;

@Repository
public class FxTradingDao {

	@Autowired
	private SessionFactory factory;

	// Method that returns list of matched currency pair entered by user
	public List<ExchangeRatePairs> findByCurrencyPair(String currencyPair) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ExchangeRatePairs.class);
		criteria.add(Restrictions.eq("currencyPair", currencyPair.trim()).ignoreCase());
		return criteria.list();
	}

	// Method to update exchange rate to database
	public void update(ExchangeRatePairs exchangeRatePair) {
		Session session = factory.openSession();
		session.update(exchangeRatePair);
		session.beginTransaction().commit();
	}

	// Method to add exchange rate pair to database
	public void add(ExchangeRatePairs exchangeRatePair) {
		Session session = factory.openSession();
		session.save(exchangeRatePair);
		session.beginTransaction().commit();

	}

	// Method to book trade
	public String bookTrade(TradeDetails tradeDetails) {
		Session session = factory.openSession();
		session.save(tradeDetails);
		session.beginTransaction().commit();
		return "Trade booked successfully";

	}

	// Method that fetches all trade details from dB
	public List<TradeDetails> getTradeList() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TradeDetails.class);
		return criteria.list();
	}

	// Method that deletes specified currency pair 
	public String deleteCurrencyPair(String currencyPair) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(ExchangeRatePairs.class);
		criteria.add(Restrictions.eq("currencyPair", currencyPair.trim()).ignoreCase());
		ExchangeRatePairs exchangeRatePairs = (ExchangeRatePairs) criteria.uniqueResult();
		session.delete(exchangeRatePairs);
		tr.commit();
		return " Currency Pair details deleted successfully";
	}

	// Method that returns list of all currency pairs with its exchange rates
	public List<ExchangeRatePairs> getAllCurrencyPairs() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ExchangeRatePairs.class);
		return criteria.list();
	}

}

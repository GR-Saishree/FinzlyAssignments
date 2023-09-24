package com.finzly.backoffice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.backoffice.entity.paymenttransaction;

@Repository
public class PaymentTransactionDao {

	
	@Autowired
	SessionFactory factory;
	public List<paymenttransaction> getTransactionHistory(Long cid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(paymenttransaction.class);
		criteria.add(Restrictions.eq("cid", cid));
		return criteria.list();
	}
	public List<paymenttransaction> getPaymentDetailsByTransactionId(Long transactionid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(paymenttransaction.class);
		criteria.add(Restrictions.eq("transactionid", transactionid));
		return criteria.list();
		
	}
	public void updatePaymentTransaction(Long transactionid,String status) {
		Session session = factory.openSession();
		paymenttransaction payTransaction = session.get(paymenttransaction.class, transactionid);
		payTransaction.setTransactionstatus(status);
		session.update(payTransaction);
		session.beginTransaction().commit();
		
	}

}

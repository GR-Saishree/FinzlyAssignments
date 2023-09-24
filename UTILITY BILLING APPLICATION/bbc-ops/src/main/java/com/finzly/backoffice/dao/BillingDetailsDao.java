package com.finzly.backoffice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.backoffice.controller.InvoiceController;
import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.entity.CustomerDetails;

@Repository
public class BillingDetailsDao {

	@Autowired
	SessionFactory factory;
	
	@Autowired
	InvoiceController invoiceController;
	
	public String manualBillEntry(BillingDetails billingDetails) {
		Session session = factory.openSession();
		session.save(billingDetails);
		invoiceController.generateInvoice(billingDetails.getBillingID());
		session.beginTransaction().commit();
		return "Successfuly registered with Billing ID: "+billingDetails.getBillingID();
		
	}
	
	public boolean checkSameStartDate(BillingDetails billingDetails){
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(BillingDetails.class);
		criteria.add(Restrictions.eq("customerID", billingDetails.getCustomerID()));
		criteria.add(Restrictions.eq("StartDate", billingDetails.getStartDate()));
		if(criteria.list().isEmpty()){
			return true;
		}
		else {
			return false;
		}
	}
	public void addBulkBillingDetails(List<BillingDetails> billingDetailsList) {
		Session session = factory.openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			for(BillingDetails billingDetails: billingDetailsList) {
				session.save(billingDetails);
			}
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
}

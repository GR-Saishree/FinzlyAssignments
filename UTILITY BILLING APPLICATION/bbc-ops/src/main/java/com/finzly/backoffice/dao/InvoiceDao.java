package com.finzly.backoffice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.entity.CustomerDetails;
import com.finzly.backoffice.entity.Invoice;

@Repository
public class InvoiceDao {

	@Autowired
	SessionFactory factory;

	public List<BillingDetails> findBillingDetailsByID(Long billingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(BillingDetails.class);
		criteria.add(Restrictions.eq("billingID", billingID));
		return criteria.list();
		
	}

	public String addInvoice(Invoice invoice) {
		Session session = factory.openSession();
		session.save(invoice);
		session.beginTransaction().commit();
		return "Invoice details added successfully";
		
	}

	public String getCustomerNameByID(Long customerID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CustomerDetails.class);
		criteria.add(Restrictions.eq("cid", customerID));
		criteria.setProjection(Projections.property("customername"));
		return (String) criteria.uniqueResult();
	}

	public List<Invoice> getGeneratedInvoice(Long billingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Invoice.class);
		criteria.add(Restrictions.eq("billingID", billingID));
		return criteria.list();
	}

	
}

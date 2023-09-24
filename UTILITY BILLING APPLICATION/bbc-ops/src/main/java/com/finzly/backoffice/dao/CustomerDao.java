package com.finzly.backoffice.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.backoffice.entity.CustomerDetails;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory factory;
	
	public void addBulkCustomerDetails(List<CustomerDetails> customerDetailsList) {
		Session session = factory.openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			for(CustomerDetails customerDetails: customerDetailsList) {
				session.save(customerDetails);
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

	public String manualCustomerEntry(CustomerDetails customerDetails) {
		Session session = factory.openSession();
		session.save(customerDetails);
		session.beginTransaction().commit();
		return "Customer Details added successfully";
		
	}

	public boolean checkCustomer(Long customerID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CustomerDetails.class);
		criteria.add(Restrictions.eq("cid", customerID));
		if(criteria.list().isEmpty()) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
}





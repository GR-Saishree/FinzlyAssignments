package com.finzly.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.backoffice.dao.BillingDetailsDao;
import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.exception.InvalidBillDetailsException;

@Service
public class BillingDetailsService {

	
	@Autowired
	BillingDetailsDao billingDetailsDao;
	
	
	public String manualBillEntry(BillingDetails billingDetails) {
		
		if(validateUnitConsumption(billingDetails.getUnitConsumed()) && (billingDetailsDao.checkSameStartDate(billingDetails)) ) {
			return billingDetailsDao.manualBillEntry(billingDetails);
		}
		else {
			throw new InvalidBillDetailsException("Invalid Bill Details");
		}
		
	}
	
	
	
	private boolean validateUnitConsumption(double unitConsumption) {
		return unitConsumption>=0;
	}

	public void addBulkBillingDetails(List<BillingDetails> billingDetailsList) {
		billingDetailsDao.addBulkBillingDetails(billingDetailsList);
		
	}


}

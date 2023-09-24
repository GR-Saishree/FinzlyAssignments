package com.finzly.backoffice.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BillingDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billingID;
	
	private Long customerID;
	
	private Double unitConsumed;
	
	private Date StartDate;
	
	private Date EndDate;
	
	private Date billDueDate;
	
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	
	
	
	
	public Long getBillingID() {
		return billingID;
	}

	public void setBillingID(Long billingID) {
		this.billingID = billingID;
	}

	

	public Double getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(Double unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public Date getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(Date billDueDate) {
		this.billDueDate = billDueDate;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	

	
	
	
	
}

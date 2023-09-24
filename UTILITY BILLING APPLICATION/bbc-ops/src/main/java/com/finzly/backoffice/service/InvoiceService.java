package com.finzly.backoffice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.finzly.backoffice.dao.InvoiceDao;
import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.entity.Invoice;

@Service
public class InvoiceService {

	@Autowired
	InvoiceDao invoiceDao;
	@Value("${billing.rate.perKw}")
	private Double billingRatePerKw;
	
	@Value("${discount.beforeDueDate}")
	private Double discountBeforeDueDate;
	
	@Value("${discount.onlinePayment}")
	private Double discountOnlinePayment;
	
	public String generateInvoice(Long billingID) {
		
		
		List<BillingDetails> billingDetailsList = invoiceDao.findBillingDetailsByID(billingID);
		
		for(BillingDetails billingDetails : billingDetailsList) {
			
			String customerName = invoiceDao.getCustomerNameByID(billingDetails.getCustomerID());
			Double totalAmount = calculateTotalAmount(billingDetails);
			Double earlyPaymentDiscount = calculateEarlyPaymentDiscount(totalAmount);
			Double onlinePaymentDiscount = calculateOnlinePaymentDiscount(totalAmount);
			Double totalDiscountAmount = calculateTotalDiscountAmount(totalAmount);
			
			
			Invoice invoice = new Invoice();
			invoice.setBillingID(billingID);
			invoice.setCustomerID(billingDetails.getCustomerID());
			invoice.setCustomerName(customerName);
			invoice.setInvoiceDate(new Date());
			invoice.setBillDueDate(billingDetails.getBillDueDate());
			invoice.setTotalAmount(totalAmount);
			invoice.setEarlyPaymentDiscount(earlyPaymentDiscount);
			invoice.setOnlinePaymentDiscount(onlinePaymentDiscount);
			invoice.setTotalDiscountAmount(totalDiscountAmount);
			
			
			return invoiceDao.addInvoice(invoice);
		}
		
		return null;
		
	}

	private Double calculateTotalDiscountAmount(Double totalAmount) {
		
		return totalAmount-(calculateEarlyPaymentDiscount(totalAmount)+calculateOnlinePaymentDiscount(totalAmount));
	}

	private Double calculateOnlinePaymentDiscount(Double totalAmount) {
		
		return totalAmount*discountOnlinePayment;
	}

	private Double calculateEarlyPaymentDiscount(Double totalAmount) {
		
		return totalAmount*discountBeforeDueDate;
	}

	private Double calculateTotalAmount(BillingDetails billingDetails) {
		
		return billingDetails.getUnitConsumed()*billingRatePerKw;
	}

	public List<Invoice> getGeneratedInvoice(Long billingID) {
		return invoiceDao.getGeneratedInvoice(billingID);
	}

}

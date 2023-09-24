package com.finzly.backoffice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.backoffice.entity.Invoice;
import com.finzly.backoffice.service.InvoiceService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;
	
	@PostMapping("generateInvoice/{billingID}")
	public String generateInvoice(@PathVariable Long billingID) {
		return invoiceService.generateInvoice(billingID);
	}
	
	@GetMapping("getGeneratedInvoice/{billingID}")
	public List<Invoice> getGeneratedInvoice(@PathVariable Long billingID){
		return invoiceService.getGeneratedInvoice(billingID);
	}
	
	
}

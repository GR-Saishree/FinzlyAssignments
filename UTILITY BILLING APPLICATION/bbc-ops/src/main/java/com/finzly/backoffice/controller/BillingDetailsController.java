package com.finzly.backoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.service.BillingDetailsService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BillingDetailsController {

	@Autowired
	BillingDetailsService billingDetailsService;
	
	@PostMapping("manualBillEntry")
	public String manualBillEntry(@RequestBody BillingDetails billingDetails){
		return billingDetailsService.manualBillEntry(billingDetails);
	}
	
	
}


package com.finzly.backoffice.controller;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.common.record.Record;
import com.finzly.backoffice.entity.BillingDetails;
import com.finzly.backoffice.entity.CustomerDetails;
import com.finzly.backoffice.service.BillingDetailsService;
import com.finzly.backoffice.service.CustomerService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CustomerController {

	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	BillingDetailsService billDetailsService;
	
	@Autowired
	InvoiceController invoiceController;
	
	@PostMapping("manualCustomerEntry")
	public String manualCustomerEntry(@RequestBody CustomerDetails customerDetails) {
		return customerService.manualCustomerEntry(customerDetails);
	}
	
	
	@PostMapping("bulkUpload")
	public String uploadData(@RequestParam("file") MultipartFile file) throws Exception{
		List<CustomerDetails> customerDetailsList = new ArrayList<>();
		List<BillingDetails> billingDetailsList = new ArrayList<>();
		
		InputStream inputStream = file.getInputStream();
		CsvParserSettings setting = new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record ->{
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setcid(Long.parseLong(record.getString("cid")));
			customerDetails.setcustomername(record.getString("customername"));
			customerDetails.setemailid(record.getString("emailid"));
			customerDetails.setmobileno(record.getString("mobileno"));
			customerDetails.sethouseno(Integer.parseInt(record.getString("houseno")));
			customerDetails.setaddress(record.getString("address"));
			customerDetails.setPincode(Long.parseLong(record.getString("pincode")));
			customerDetails.setState(record.getString("state"));
			customerDetails.setCountry(record.getString("country"));
			customerDetailsList.add(customerDetails);
			customerService.addBulkCustomerDetails(customerDetailsList);
			
			
			BillingDetails billingDetails = new BillingDetails();
			billingDetails.setCustomerID(Long.parseLong(record.getString("cid")));
			billingDetails.setUnitConsumed(Double.parseDouble(record.getString("unit_consumed")));
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date startDate = dateFormat.parse(record.getString("start_date"));
				Date endDate = dateFormat.parse(record.getString("end_date"));
				Date billDueDate = dateFormat.parse(record.getString("bill_due_date"));
				billingDetails.setStartDate(startDate);
				billingDetails.setEndDate(endDate);
				billingDetails.setBillDueDate(billDueDate);
			}
			catch(ParseException e) {
				e.printStackTrace();
			}
			
			
			billingDetailsList.add(billingDetails);
			billDetailsService.addBulkBillingDetails(billingDetailsList);
			invoiceController.generateInvoice(billingDetails.getBillingID());
			
			
		});
		return "Customer and Bill details added successfully";
	}
	
	
}

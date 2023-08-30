package com.finzly.collection.question2;

// import statements
import java.util.Scanner;

public class CustomerAccount {
	
	// CustomerAccount class variables
	private String accountHolderName;
	private String emailID;
	private String phoneNumber;
	private String accountNumber;
	private double balance=0;
	
	// Constructor that calls createAccount() method
	CustomerAccount() {
		createAccount();
	}
	
	// Scanner class to get input from user
	Scanner sc=new Scanner(System.in);
	
	// getters and Setters for account holder name
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		if(isValidName(accountHolderName)) {
			this.accountHolderName = accountHolderName;
		}
		else {
			System.out.println("Please enter a valid name");
			setAccountHolderName(sc.nextLine());
		}
		
	}
	
	// Method for validating account holder name
	private static boolean isValidName(String accountHolderName) {
		return accountHolderName.matches("^[a-zA-Z. ]+$");
	}
	
	
	// Getters and Setters for email ID
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		if(isValidEmail(emailID)) {
			this.emailID = emailID;
		}
		else {
			System.out.println("Please enter a valid email address");
			setEmailID(sc.nextLine());
		}
		
	}
	
	// Method for validating email
	private static boolean isValidEmail(String emailID) {
		return emailID.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$");
	}
	
	
	// Getters and Setters for phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(isValidPhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		}
		else {
			System.out.println("Please enter a valid phone number");
			setPhoneNumber(sc.nextLine());
		}
		
	}
	
	// Method for validating Phone number
	private static boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\+\\d{2}\\d{10}$");
	}
	
	
	// Getters and Setters for account number
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		if(!accountNumber.isEmpty()) {
			this.accountNumber = accountNumber;
		}
		else {
			System.out.println("Please enter a valid account number");
		}
		
	}
	
	
	// Getters and Setters for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// Method which creates account
	void createAccount() {
		
		
		// getting input from user and after validation setting the values
		
		System.out.println("Enter account holder's name");
		String accountHolderName= sc.nextLine();
		setAccountHolderName(accountHolderName);
		
		System.out.println("Enter Customer Email:");
		String emailID=sc.nextLine();
		setEmailID(emailID);
		
		
		System.out.println("Enter Customer Phone number:");
		String phoneNumber=sc.nextLine();
		setPhoneNumber(phoneNumber);
		
		System.out.println("Enter account Number:");
		String accountNumber=sc.nextLine();
		setAccountNumber(accountNumber);
		
		
		
	}
	
	void deposit(double amount) {
		if(amount>0)
		balance=balance+amount;
		else {
			System.out.println("Invalid amount");
		}
	}
	
	void withDraw(double amount) {
		if(balance-amount<=5000) {
			System.out.println("Minimum balance is required");
		}
		else {
			balance=balance-amount;
		}
	}
	
	@Override
	public String toString() {
		return "Customer details: accountHolderName=" + accountHolderName + ", emailID=" + emailID + ", phoneNumber="
				+ phoneNumber + ", accountNumber=" + accountNumber + ", balance=" + balance;
	}
	
	

}

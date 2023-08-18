package com.finzly.testquestions;

public class Customer {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setAccountNumber(1234576845);
		b.setOwnerName("Sai shree");
		b.deposit(10000);
		b.withdraw(2000);
		b.showDetails();
	
	}
	
}

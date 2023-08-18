package com.finzly.bankingsystem;

public class EndUser {

	public static void main(String[] args) {
		
		SavingsAccount sa=new SavingsAccount("ABC456", "Sai shree", 0, 2);
		sa.deposit(10000);
		sa.withdraw(-2000);
		System.out.println(sa.getBalance());
	    sa.withdraw(4000);
	    sa.displayDetails();
	    
	    CheckingAccount ca=new CheckingAccount("XYZ789", "Sai leela", 0, 50000);
	    ca.deposit(20000);
	    ca.withdraw(-6000);
	    ca.withdraw(50000);
	    ca.displayDetails();
	   
	   
	    
	}
}

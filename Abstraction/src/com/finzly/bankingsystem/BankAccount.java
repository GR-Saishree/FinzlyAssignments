package com.finzly.bankingsystem;

public abstract class BankAccount {
	
	protected String accountNumber;
	protected String accountHolderName;
	protected static double balance;
	
	BankAccount(String accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		BankAccount.balance=balance;
	}
	

	public abstract String getAccountNumber();
	
	public abstract String getAccountHolderName();
	
	public abstract double getBalance();
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public void displayDetails() {
		System.out.println("Account Holder Name: "+ getAccountHolderName());
		System.out.println("Account Number: "+ getAccountNumber());
		System.out.println("Your account balance: "+ getBalance());
	}
	
}

class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate){
		
		super(accountNumber,accountHolderName,balance);
		this.interestRate=interestRate;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	@Override
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	@Override
	public void withdraw(double amount) {
		double minimumBalance=5000;
		if(amount<0) {
			System.out.println("Amount cannot be negative");
		}
		else if(getBalance()-amount<=minimumBalance) {
			System.out.println("Cannot withdraw the amount");
		}
		else {
			balance=balance-amount;
		}
		
	}
	
	
	
}

class CheckingAccount extends BankAccount{
	
	
	private double overdraftLimit;
	
	CheckingAccount(String accountNumber,String accountHolderName,double balance,double overdraftLimit){
		super(accountNumber,accountHolderName,balance);
		this.overdraftLimit=overdraftLimit;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	@Override
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Amount cannot be negative");
		}
	    else if(amount>overdraftLimit) {
			System.out.println("Withdrawal amount exceeds overdraft limit");
		}
		else if(getBalance()-amount<0) {
			System.out.println("Balance is insufficient");
		}
		else {
			balance=balance-amount;
		}
	}
	
	
	
}

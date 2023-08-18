package com.finzly.testquestions;

public class BankAccount {
	
	private long accountNumber;
	private static double balance;
	private String ownerName;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		BankAccount.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	public void showDetails() {
		System.out.println(accountNumber);
		System.out.println(ownerName);
		System.out.println(balance);
	}
}

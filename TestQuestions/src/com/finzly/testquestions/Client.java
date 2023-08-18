package com.finzly.testquestions;

public class Client {

	public static void main(String[] args) {
		Transaction t=new Transaction();
		t.processTransaction(500);
		
		
		Transaction t1=new Transaction("6578435");
		t1.processTransaction(500);
		
		
	}
}

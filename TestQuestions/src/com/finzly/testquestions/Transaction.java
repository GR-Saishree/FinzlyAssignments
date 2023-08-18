package com.finzly.testquestions;

public class Transaction {
	
	private final String productKey;
	private boolean isActivated;
	Transaction(){
		this.productKey=null;
		System.out.println("You are using free version,please upgrade");
	}
	Transaction(String productKey){
		this.productKey=productKey;
	}
	void checkStatus() {
		if(isActivated==true||productKey!=null) {
			
			System.out.println("You are using upgraded version");
		}
		else {
			System.out.println("You are using free version, please make a transaction of Rs.500 to upgrade");
		}
	}
		
	
	void processTransaction(double amount) {
		if(amount==500 && productKey==null) {
			String newproductKey=Double.toString(Math.random());
			isActivated=true;
			Transaction tr=new Transaction(newproductKey);
			System.out.println(tr.productKey);
			System.out.println("Transaction successful");
			tr.checkStatus();
			
			
		}
		else if(productKey!=null) {
			System.out.println("No transaction is needed you are using upgraded version");
		}
		else {
			System.out.println("Transaction is not done-please pay first to activate product key");
		}
	}

}

package com.finzly.collection.question2;

// import statements
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EndUser {

	
	private static boolean bval=true;
	
	// Method which finds account so that we can perform operations in it
	private static CustomerAccount findAccount(Set<CustomerAccount> accounts,String accountNumber) {
		for(CustomerAccount account: accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Set<CustomerAccount> customerAccounts=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		
	    while(bval) {
	    	System.out.println("1- Create Account");
	    	System.out.println("2- Deposit Amount");
	    	System.out.println("3- Withdraw Amount");
	    	System.out.println("4- CheckBalance");
	    	System.out.println("5- List All Accounts");
	    	System.out.println("6- Exit");
	    	
	    	System.out.println("Enter your choice");
	    	int choice=sc.nextInt();
	    	
	    	switch(choice) {
	    	
	    	case 1: System.out.println("Creating Account....");
	                customerAccounts.add(new CustomerAccount());
	    	        break;
	    	        
	    	case 2: System.out.println("Depositing Amount....");
	    	        sc.nextLine();
	                System.out.println("Enter account number");
	                String accountNumber=sc.nextLine();
	                CustomerAccount depositAccount=findAccount(customerAccounts,accountNumber);
	    	        if(depositAccount!=null) {
	    	        	System.out.println("Enter deposit amount:");
	    	        	double depositAmount=sc.nextDouble();
	    	        	depositAccount.deposit(depositAmount);
	    	        	System.out.println("Amount deposited");
	    	        }
	    	        else {
	    	        	System.out.println("Invalid account number");
	    	        }
	    	        break;
	    	        
	    	case 3: System.out.println("Withdraw Amount....");
	    			sc.nextLine();
	    	        System.out.println("Enter account number");
                    accountNumber=sc.nextLine();
                    CustomerAccount withdrawAccount=findAccount(customerAccounts,accountNumber);
	                if(withdrawAccount!=null) {
	        	       System.out.println("Enter withdrawal amount:");
	        	       double withdrawAmount=sc.nextDouble();
	        	       withdrawAccount.withDraw(withdrawAmount);
	        	       System.out.println("Amount withdrawn");
	                }
	                else {
	                	System.out.println("Invalid account number");
	                }
	    	        break;
	    	        
	    	case 4: System.out.println("Check Balance");
	    			sc.nextLine();
	    	        System.out.println("Enter account number");
	    	        accountNumber=sc.nextLine();
	    	        CustomerAccount checkBalance=findAccount(customerAccounts, accountNumber);
	    	        if(checkBalance!=null) {
	    	        	System.out.println("Balance "+ checkBalance.getBalance());
	    	        }
	    	        else {
	    	        	System.out.println("Invalid account number");
	    	        }
	    	        break;
	    	        
	    	case 5: System.out.println("Listing All Accounts...");
	    	        
	    	        for(CustomerAccount custDetails: customerAccounts) {
	    	        	System.out.println(custDetails);
	    	        }
	    	        
	    	        break;
	    	case 6: System.out.println("Exiting...");
	    	        bval=false;
	    	        break;
	    	
	    	}
	    }
	    
	  sc.close();	
	}
}

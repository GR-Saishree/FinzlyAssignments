package com.finzly.coderbyte.assessment1;

import java.util.Scanner;

public class EndUser {

	private int option;
	private Scanner sc=new Scanner(System.in);
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		
		EndUser endUser=new EndUser();
		System.out.println("Below are the operations performed by this program:");
		System.out.println("                            Book Trade-1");
		System.out.println("                            Print Trades-2");
		System.out.println("                            Exit-3");
		System.out.println("Enter a number");
		endUser.option=endUser.sc.nextInt();
		
		endUser.checkOptions(endUser.option);
	}
	
	private void checkOptions(int option) {
		
		
		BookTrade bookTrade=null;
		
		//Checking entered option and executing accordingly

		if(option==1) {
			bookTrade=new BookTrade();
			System.out.println("Do you want to enter another option");
			option=sc.nextInt();
			if(option==2) {
				bookTrade.printTradeList();
			}
			else if(option==3) {
				Exit exit=new Exit();
			}
		}
		else if(option==2) {
			System.out.println("No trades have been booked");
		}
		else if(option==3) {
			Exit exit=new Exit();
			
		}
		else {
			System.out.println("Please enter valid input from 1 to 3");
			checkOptions(sc.nextInt());
			
		}
		
		
     }
}

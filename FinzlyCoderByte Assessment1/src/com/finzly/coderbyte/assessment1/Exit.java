package com.finzly.coderbyte.assessment1;

import java.util.Scanner;
public class Exit {

	Scanner sc=new Scanner(System.in);
	
	//Constructor
	Exit(){
		getUserConfirmation();
	}
	
	private void getUserConfirmation() {
		
		boolean value=true;
		System.out.println("Do you really want to exit (y/n)");
		while(value) {
			
			String userChoice=sc.next();
			if(userChoice.equalsIgnoreCase("y")) {
				System.out.println("Bye-have a good day");
				value=false;
			}
			else if(userChoice.equalsIgnoreCase("n")) {
				System.out.println("Book Trade");
				System.out.println("Print Trades");
				System.out.println("Exit");
			}
			else {
				System.out.println("Invalid input!!, Enter either y or n");
				value=true;
				
			}
			
		}
	}
}

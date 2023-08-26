package com.finzly.coderbyte.assessment1;

//  import statements
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class BookTrade {

	//ArrayList for storing Booking information
	private ArrayList<BookTrade> tradeList= new ArrayList<>();
	
	
	private Scanner sc=new Scanner(System.in);
	
	private static int tradeNum=0;
	private static double USDINR = 66.00;
	private static double maxTradeValue = Double.MAX_VALUE-1;
	
	private double amount;
	private String customerName;
	private String currencyPair;
	private String formattedValue;
	
	// Constructor
	BookTrade(){
      getInput();
	}
	
	
	
	//Getters and setters for USDINR(Rate)
	public static double getUSDINR() {
		return USDINR;
	}
	
	public void setUSDINR(double uSDINR) {
		USDINR = uSDINR;
	}
	
	
	//Getters and setters for Amount
	public double getAmount() {
		return amount;
	}

	public void setAmount(String unformattedAmount) {
		if( !unformattedAmount.isEmpty() && isValidAmount(unformattedAmount)) {
			double amount=Double.parseDouble(unformattedAmount);
			if(amount>0 && amount<maxTradeValue) {
				this.amount = amount;
			}
		}
		else{
			System.out.println("Please enter a valid amount");
			setAmount(sc.nextLine());
		}
		
	}
	
	//Method for validating amount
	private static boolean isValidAmount(String unformattedAmount) {
		int decimalCount=0;
		for(char c:unformattedAmount.toCharArray()) {
			if(c=='.') {
				if(decimalCount>0) {
					return false;
				}
				decimalCount++;
			}
			else if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	
	//Getters and setters for customer name
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		if(isValidName(customerName))
			this.customerName = customerName;
		else {
			System.out.println("Please enter a valid name");
			setCustomerName(sc.nextLine());
		}
		
	}
	
	
	//Method for validating customer name
	private static boolean isValidName(String customerName) {
		return customerName.matches("^[a-zA-Z. ]+$");
	}

	
	//Getters and setters for currency pair
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		if(currencyPair.equals("USDINR"))
			this.currencyPair = currencyPair;
		else {
			System.out.println("Curreny pair USDINR is only accepted");
			setCurrencyPair(sc.nextLine().toUpperCase());
		}
	}
	
	// Logic for checking whether user entered correct response
	void checkResponse(String response) {
		if(response.equalsIgnoreCase("yes")) {
			System.out.println("You are transferring INR "+currencyConverter(USDINR, amount)+" to "+customerName);
		}
		else if(response.equalsIgnoreCase("no")) {
			
		}
		else {
			System.out.println("Please enter a valid input Yes or No");
			checkResponse(sc.nextLine());
		}
	}
	void checkUserAction(String userAction) {
	if(userAction.equalsIgnoreCase("book")) {
		
		
		tradeList.add(this);
		System.out.println("Trade for USDINR has been booked with rate "+USDINR+" , The amount of Rs "+getFormattedValue()+" will be transferred in 2 working days to "+customerName);
		tradeNum++;
	}
	else if(userAction.equalsIgnoreCase("cancel")) {
		System.out.println("Trade is canceled");
	}
	else {
		System.out.println("Invalid input!!, Enter either Book or Cancel");
		checkUserAction(sc.nextLine());
	}
	}
	
	//Getters and setters for formatted value
	public String getFormattedValue() {
		return formattedValue;
	}

    public void setFormattedValue(String formattedValue) {
		this.formattedValue = formattedValue;
	}
	
	//Method that gets input from user and performs accordingly
	private void getInput() {
		
		
		// Input Customer name
		System.out.println("Enter Customer Name");
		setCustomerName(sc.nextLine());
		
		// Input currency Pair
		System.out.println("Enter Currency Pair");
		setCurrencyPair(sc.nextLine().toUpperCase());
		
		// Input amount
		System.out.println("Enter amount to transfer");
		setAmount(sc.nextLine());
		
		//Logic for getting rate 
		System.out.println("Do you want to get Rate? (Yes/No)");
		String response=sc.nextLine();
		checkResponse(response);
		
		//Logic for booking or cancelling trade
		
		System.out.println("Book/Cancel this trade?");
		String userAction=sc.nextLine();
		checkUserAction(userAction);
		
        getTradeList();
       
		//Calling the method to display the operations supported by program
		displayOperations();
		
		
	}
	private ArrayList<BookTrade> getTradeList(){
		return tradeList;
	}
	
	
	
	public static int getTradeNum() {
		return tradeNum;
	}



	public static void setTradeNum(int tradeNum) {
		BookTrade.tradeNum = tradeNum;
	}


	void printTradeList() {
	    if (tradeList.isEmpty()) {
	        System.out.println("No trades have been booked yet.");
	    } else {
	        System.out.println("List of booked trades:");
	        System.out.println();
	        System.out.printf("%-10s %-20s %-15s %-15s %-10s %n","TradeNo", "CustomerPair","CustomerName","Amount","Rate");
	        for (BookTrade trade : tradeList) {
	            if (trade instanceof BookTrade) {
	                BookTrade bookTrade = (BookTrade) trade;
	                String formattedAmount="INR "+ trade.getFormattedValue();
	                System.out.printf("%-10d %-20s %-15s %-15s %-10.2f %n",trade.getTradeNum(),trade.getCurrencyPair(),trade.getCustomerName(),formattedAmount,trade.getUSDINR());
	            }
	        }
	    }
	}

	// Method to convert USD to INR and formatting it
	private String currencyConverter(double USDINR, double amount) {
		double convertedValue = USDINR * amount;
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		setFormattedValue(decimalFormat.format(convertedValue));
		return getFormattedValue();
	}
	
	//Method that displays list of operations supported by program
	private void displayOperations() {
		System.out.println("List of operations supported by the program:");
		System.out.println("* Book Trade");
		System.out.println("* Print Trades");
		System.out.println("* Exit");
	}
	
	



	
	
}

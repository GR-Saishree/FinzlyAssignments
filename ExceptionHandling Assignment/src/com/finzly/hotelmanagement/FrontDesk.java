package com.finzly.hotelmanagement;

public class FrontDesk extends Employee{

	public FrontDesk(String employeeName, int employeeAge, double salary, String employeeCategory) {
		super(employeeName, employeeAge, salary, employeeCategory);
		
	}
	
	void checkInGuests() {
		
		System.out.println(getEmployeeName()+" is checking in guests");
		
	}
	
	void checkOutGuests() {
		
		System.out.println(getEmployeeName()+" is checking out guests");
	}

	
}

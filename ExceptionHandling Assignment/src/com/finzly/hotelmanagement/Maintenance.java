package com.finzly.hotelmanagement;

public class Maintenance extends Employee{

	public Maintenance(String employeeName, int employeeAge, double salary, String employeeCategory) {
		super(employeeName, employeeAge, salary, employeeCategory);
		
	}

	void ensureFunctionalities() {
		
		System.out.println(getEmployeeName()+" is ensuring functionalities");
	}
	
}

package com.finzly.hotelmanagement;

public class HouseKeeping extends Employee {

	public HouseKeeping(String employeeName, int employeeAge, double salary, String employeeCategory) {
		super(employeeName, employeeAge, salary, employeeCategory);
		
	}
	
	void cleanRoom() {
		
		System.out.println(getEmployeeName()+" is cleaning room");
	}

}

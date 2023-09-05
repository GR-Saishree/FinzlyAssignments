package com.finzly.hotelmanagement;

public class KitchenStaff extends Employee {

	public KitchenStaff(String employeeName, int employeeAge, double salary, String employeeCategory) {
		super(employeeName, employeeAge, salary, employeeCategory);
		
	}

	void cookFood() {
		
		System.out.println(getEmployeeName()+" is cooking food");
	}
}

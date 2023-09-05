package com.finzly.hotelmanagement;

import java.util.Scanner;

public class Employee {

	private String employeeName;
	private int employeeID;
	private double salary;
	private String employeeCategory;
	
	Scanner sc = new Scanner(System.in);
	public Employee(String employeeName, int employeeID, double salary, String employeeCategory) {
		super();
		setEmployeeName(employeeName);
		setEmployeeID(employeeID);
		setSalary(salary);
		setEmployeeCategory(employeeCategory);
	}
	
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Salary cannot be negative, enter a valid salary");
			setSalary(sc.nextDouble());
			sc.nextLine();
		}
		this.salary = salary;
	}

	public void setEmployeeCategory(String employeeCategory) {
		if(employeeCategory.isEmpty()) {
			System.out.println("Enter valid employee category");
			setEmployeeCategory(sc.nextLine());
		}
		this.employeeCategory = employeeCategory;
	}

	
	public double getSalary() {
		return salary;
	}

	
	public String getEmployeeCategory() {
		return employeeCategory;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		if(employeeName.isEmpty()) {
			System.out.println("Enter a valid name");
			setEmployeeName(sc.nextLine());
		}
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		if(employeeID<0) {
			System.out.println("Enter a valid ID");
			setEmployeeID(sc.nextInt());
			sc.nextLine();
		}
		this.employeeID = employeeID;
	}
}

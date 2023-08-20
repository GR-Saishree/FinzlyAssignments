package com.finzly.testQuestion4;

public class Manager extends Employee {

	private String department;
	
	Manager(String name,int id,String department){
		super(name,id);
		setDepartment(department);
		System.out.println("Employee is a manager of department: "+getDepartment());
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

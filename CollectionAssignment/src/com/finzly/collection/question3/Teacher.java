package com.finzly.collection.question3;

public class Teacher extends Person {

	private double salary;

	public Teacher(String name, String gender, int age,double salary) {
		super(name, gender, age);
		setSalary(salary);
	}

	
	@Override
	public String toString() {
		return "Teacher Details: Name:- "+ getName() +" ,Gender:- "+getGender()+ " , Age:- "+getAge()+" ,Salary:-" + salary;
	}
	
	
	// Getters and Setters for salary
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
		else {
			System.out.println("Enter valid salary");
			setSalary(sc.nextDouble());
		}
	}
	
	
}

package com.finzly.collection.question3;

public class Student extends Person {

	private int rollNumber;

	public Student(String name, String gender, int age, int rollNumber) {
		super(name, gender, age);
		setRollNumber(rollNumber);
	}
	
	

	@Override
	public String toString() {
		return "Student Details: Name:- "+ getName() +" ,Gender:- "+getGender()+ " , Age:- "+getAge()+" ,rollNumber:-" + rollNumber;
	}



	// getters and Setters for roll number
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber>0) {
			this.rollNumber=rollNumber;
		}
		else {
			System.out.println("Enter avalid rollNumber");
			setRollNumber(sc.nextInt());
		}
		
	}
	
	
}

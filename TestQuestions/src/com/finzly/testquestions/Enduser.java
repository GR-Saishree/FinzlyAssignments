package com.finzly.testquestions;

public class Enduser {

	public static void main(String[] args) {
		Student s=new Student();
		s.enrollStudent(3, "Sai shree");
		System.out.println(Student.getTotalStudents());
		s.dropStudent(3, "Sai shree");
		System.out.println(Student.getTotalStudents());
	}
}

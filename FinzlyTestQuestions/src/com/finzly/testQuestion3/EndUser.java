package com.finzly.testQuestion3;
import java.util.Scanner;
public class EndUser {
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Default constructor");
		Student s=new Student();
		System.out.println("Enter Student name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Parameterized constructor");
		Student s1=new Student(name,age);
		System.out.println("Enter Student name: ");
		String sname=sc.nextLine();
		System.out.println("Enter Student age: ");
		int sage=sc.nextInt();
		System.out.println("Enter Student ID: ");
		int sid=sc.nextInt();
		System.out.println("Overloaded Parameterized constructor");
		Student s2=new Student(sname,sage,sid);
		Student s3=new Student(10);
	   
	}
}

package com.finzly.collection.question3;

import java.util.HashSet;
import java.util.Scanner;

public class EndUser {

	static Scanner sc=new Scanner(System.in);
	private static boolean bval=true;
	
	public static void main(String[] args) {
		
		
		HashSet<Student> studentList= new HashSet<>();
		HashSet<Teacher> teacherList= new HashSet<>();
		
		while(bval) {
			
			System.out.println("Choose from below options");
			System.out.println("1- Add Student Records");
			System.out.println("2- Add Teacher Records");
			System.out.println("3- Display Student Records");
			System.out.println("4- Display Teacher Records");
			System.out.println("5- Exit the Program");
			
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1: System.out.println("Adding student records.....");
			        System.out.println("Enter Student Name");
			        String name=sc.nextLine();
			        System.out.println("Enter Student gender");
			        String gender=sc.nextLine();
			        System.out.println("Enter Student age");
			        int age=sc.nextInt();
			        System.out.println("Enter Student roll number");
			        int rollNumber=sc.nextInt();
			        sc.nextLine();
			        studentList.add(new Student(name, gender, age, rollNumber));
			        break;
			        
			case 2: System.out.println("Adding teacher records.....");
	                System.out.println("Enter Teacher Name");
	                String tname=sc.nextLine();
	                System.out.println("Enter Teacher gender");
	                String tgender=sc.nextLine();
	                System.out.println("Enter Teacher age");
	                int tage=sc.nextInt();
	                System.out.println("Enter Teacher Salary");
	                double salary=sc.nextDouble();
	                teacherList.add(new Teacher(tname, tgender, tage, salary));
	                break;
	                
			case 3: System.out.println("Display Student Records");
			        for(Student students:studentList) {
			        	System.out.println(students);
			        }
			        break;
			        
			case 4: System.out.println("Display Teacher Records");
	                for(Teacher teachers:teacherList) {
	        	        System.out.println(teachers);
	                }
	                break;
			        
			case 5: System.out.println("Exit the Program");      
			        bval=false;
			        break;
			        
			default: System.out.println("Invalid input");
			        
			}
		}
	}
}

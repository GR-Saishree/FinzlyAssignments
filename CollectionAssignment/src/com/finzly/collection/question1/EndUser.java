package com.finzly.collection.question1;

// import statements
import java.util.HashSet;
import java.util.Scanner;

public class EndUser {
	
	private static boolean bval=true;
	
	
	public static void main(String[] args) {
		
		// HashSet to store the employee details
		HashSet<Employee> employeeList=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		
		
		while(bval) {
			System.out.println("Choose from below options");
			System.out.println("1- Add Employee");
			System.out.println("2- View Employee Details");
			System.out.println("3- Search Employee By ID");
			System.out.println("4- Exit");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Adding Employee Details.....");
				    Employee employee=new Employee();
			        employeeList.add(employee);
			        break;
			        
			case 2: System.out.println("Viewing Employee Details.....");
			        for(Employee employee1:employeeList) {
			        	System.out.println(employee1);
			        }
			        break;
			        
			case 3: System.out.println("Enter Employee ID to search......");
			        int searchID=sc.nextInt();
			        for(Employee employee1:employeeList) {
			        	if(employee1.getID()==searchID) {
			        		System.out.println(employee1);
			        		break;
			        	}
			        	
			        }
			        break;
			       
			   
			case 4: System.out.println("Exiting .....");
			        bval=false;
			        break;
			        
			default: System.out.println("Enter valid option");
				
			}
		}
		 
		sc.close();	
		
	}
}

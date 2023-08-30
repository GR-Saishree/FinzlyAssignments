package com.finzly.collection.question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Enduser {

	private static boolean bval=true;
	public static void main(String[] args) {
		Map<Integer,Patient> patientRecords= new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		while(bval) {
			
			System.out.println("1- Add Patients");
			System.out.println("2- View Patient Details");
			System.out.println("3- Search Patients by ID");
			System.out.println("4- List all patients");
			System.out.println("5- Exit the program");
			
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Adding Patients...");
			        System.out.println("Enter Patient ID:");
			        int id=sc.nextInt();
			        sc.nextLine();
			        System.out.println("Enter Patient Name");
			        String name=sc.nextLine();
			        System.out.println("Enter Patient Age");
			        int age=sc.nextInt();
			        sc.nextLine();
			        patientRecords.put(id, new Patient(id,name,age));
			        break;
			        
			case 2: System.out.println("Viewing Patient Details");
			        System.out.println("Enter Patient ID");
			        boolean condition=false;
			        int inputid=sc.nextInt();
			        for(Map.Entry<Integer,Patient> entry : patientRecords.entrySet()) {
			        	if(entry.getKey().equals(inputid)) {
			        		condition=true;
			        	System.out.println("ID = " + entry.getKey() +
	                             ", Patient Details = " + entry.getValue());
			        	}
			        	
			        }
			        if(!condition) {
	                	System.out.println("No patients with the given ID");
		        	}
			        break;
			        
			case 3: System.out.println("Search Patients By ID");
			        System.out.println("Viewing Patient Details");
	                System.out.println("Enter Patient ID");
	                condition=false;
	                int searchid=sc.nextInt();
	                for(Map.Entry<Integer,Patient> entry : patientRecords.entrySet()) {
	        	        if(entry.getKey().equals(searchid)) {
	        	        	condition=true;
	        	    	    System.out.println("ID = " + entry.getKey() +", Patient Details = " + entry.getValue());
	        	        }
	                }
	                if(!condition) {
	                	System.out.println("No patients with the given ID");
		        	}
	                break;
	                
			case 4: System.out.println("List all patients");
			        for(Map.Entry<Integer,Patient> entry: patientRecords.entrySet()) {
			        	System.out.println("ID = "+ entry.getKey() +", Patient Details = "+ entry.getValue());
			        }
			        break;
			        
			case 5: System.out.println("Exit the Program");
			        bval=false;
			        break;
			        
			default: System.out.println("Please enter valid option");
			        
			        
			}
		}
		sc.close();
	}
}

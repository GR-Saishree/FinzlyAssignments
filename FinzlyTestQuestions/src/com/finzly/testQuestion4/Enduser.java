package com.finzly.testQuestion4;
import java.util.Scanner;
public class Enduser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Manager's name:");
		String managerName=sc.nextLine();
		System.out.println("Enter Manager's ID:");
		int managerID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter manager's department");
		String department=sc.nextLine();
		
		Manager m=new Manager(managerName,managerID,department);
		
		System.out.println("Enter Developer's name:");
		String developerName=sc.nextLine();
		System.out.println("Enter Developer's ID:");
		int developerID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Developer's department");
		String programmingLanguage=sc.nextLine();
		
		Developer d=new Developer(developerName,developerID,programmingLanguage);
		sc.close();
	}
}

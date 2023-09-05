package com.finzly.hotelmanagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EndUser {

	private Map<String,List<Employee>> employeeCategories = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public EndUser() {
		
		employeeCategories.put("Front Desk", new ArrayList<>());
		employeeCategories.put("House Keeping", new ArrayList<>());
		employeeCategories.put("Kitchen Staff", new ArrayList<>());
		employeeCategories.put("Maintenance", new ArrayList<>());
		
	}
	
	public void hireEmployee(Employee employee, String category) throws DuplicateEmployeeException {
		List<Employee> employees= employeeCategories.get(category);
		
		
		for(Employee employee1: employees) {
			if(employee1.getEmployeeID()==employee.getEmployeeID()) {
				throw new DuplicateEmployeeException("Employee already exist");
			}
		}
		
		
		employeeCategories.get(category).add(employee);
	}
	
	
	public void fireEmployee(Employee employee, String category) throws EmployeeNotFoundException{
		boolean removed = employeeCategories.get(category).remove(employee);
		
		if(!removed) {
			throw new EmployeeNotFoundException("Employee is not found");
		}
	}
	
	
	public void assignTask(Employee employee,String task) throws InvalidTaskAssignmentException {
		if(employee instanceof FrontDesk) {
			if(!task.equals("Check in and out guests")) {
				throw new InvalidTaskAssignmentException("Invalid task assignment for front desk");
			}
			((FrontDesk)employee).checkInGuests();
			((FrontDesk)employee).checkOutGuests();
		}
		else if(employee instanceof HouseKeeping) {
			if(!task.equals("Clean room")) {
				throw new InvalidTaskAssignmentException("Invalid task assignment for house keeping");
			}
			((HouseKeeping)employee).cleanRoom();
		}
		else if(employee instanceof KitchenStaff) {
			if(!task.equals("Cook food")) {
				throw new InvalidTaskAssignmentException("Invalid task assignment for kitchen staff");
			}
			((KitchenStaff)employee).cookFood();
		}
		else if(employee instanceof Maintenance) {
			if(!task.equals("Ensure functionalities")) {
				throw new InvalidTaskAssignmentException("Invalid task assignmentfor maintenance");
			}
			((Maintenance)employee).ensureFunctionalities();
		}
	}
	
	
	public void updateEmployeeDetails(String employeeName,int employeeID,double salary,String employeeCategory) {
		List<Employee> employees= employeeCategories.get(employeeCategory);
		
		
		for(Employee employee: employees) {
			if(employee.getEmployeeID()==employeeID) {
				((Employee) employeeCategories).setEmployeeName(employeeName);
				((Employee) employeeCategories).setSalary(salary);
				System.out.println("Employee details updated");
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		EndUser enduser=  new EndUser();
		
		while(true) {
			System.out.println("1. Hire Employee");
			System.out.println("2. Fire Employee");
			System.out.println("3. Update Employee Details");
			System.out.println("4. Assign tasks");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: System.out.println("Enter employee name");
	                String employeeName=sc.nextLine();
	                System.out.println("Enter employee category");
	                String employeeCategory=sc.nextLine();
				    System.out.println("Enter employee id");
			        int employeeID=sc.nextInt();
			        System.out.println("Enter employee salary");
	                double employeeSalary=sc.nextDouble();
	                sc.nextLine();
	                try {
	                	enduser.hireEmployee(new Employee(employeeName,employeeID,employeeSalary,employeeCategory), employeeCategory);
	                }
	                catch(DuplicateEmployeeException e) {
	                	System.out.println(e.getMessage());
	                }
	                
	                break;
	                
			case 2: System.out.println("Enter employee name");
            		employeeName=sc.nextLine();
            		System.out.println("Enter employee category");
            		employeeCategory=sc.nextLine();
            		System.out.println("Enter employee id");
            		employeeID=sc.nextInt();
            		System.out.println("Enter employee salary");
            		employeeSalary=sc.nextDouble();
            		sc.nextLine();
            		try {
            		enduser.fireEmployee(new Employee(employeeName,employeeID,employeeSalary,employeeCategory), employeeCategory);
            		}
            		catch (EmployeeNotFoundException e) {
						System.out.println(e.getMessage());
					}
            		break;
            		
			case 3: System.out.println("Enter employee name");
    				employeeName=sc.nextLine();
    				System.out.println("Enter employee category");
    				employeeCategory=sc.nextLine();
    				System.out.println("Enter employee id");
    				employeeID=sc.nextInt();
    				System.out.println("Enter employee salary");
    				employeeSalary=sc.nextDouble();
    				sc.nextLine();
    				enduser.updateEmployeeDetails(employeeName, employeeID, employeeSalary, employeeCategory);
    				break;
    				
			case 4: System.out.println("Enter employee name");
					employeeName=sc.nextLine();
					System.out.println("Enter employee category");
					employeeCategory=sc.nextLine();
					System.out.println("Enter employee id");
					employeeID=sc.nextInt();
					System.out.println("Enter employee salary");
					employeeSalary=sc.nextDouble();
					sc.nextLine();
					try {
						enduser.assignTask(new Employee(employeeName, employeeID, employeeSalary, employeeCategory), employeeCategory);	
					}
					catch(InvalidTaskAssignmentException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
			case 5: System.out.println("Exiting....");		
			        System.exit(0);
			        
			default: System.out.println("Enter valid option");
	                
			}
		}
		
	}
	
}

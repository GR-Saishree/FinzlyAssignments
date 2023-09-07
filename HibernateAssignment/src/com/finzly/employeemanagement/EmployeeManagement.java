package com.finzly.employeemanagement;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;




public class EmployeeManagement {

	
	void addEmployee(int employeeID,String empFirstName,String empLastName,String empDob,String empEmail,String empDept,int empSalary) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmployeeID(employeeID);
		emp.setEmpFirstName(empFirstName);
		emp.setEmpLastName(empLastName);
		emp.setEmpDob(empDob);
		emp.setEmpEmail(empEmail);
		emp.setEmpDept(empDept);
		emp.setEmpSalary(empSalary);
		session.save(emp);
		System.out.println("Employee added successfully");
		tr.commit();
		session.close();
	}
	
	
	void getEmployeeByID(int employeeID) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Employee emp = new Employee();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeID",employeeID));
		List<Employee> list = criteria.list();
		System.out.println("Employee matching specified ID");
		for(Employee employee: list) {
			System.out.println(employee);
		}
		session.close();
	}
	
	void displayAllEmployees() {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.isNotNull("employeeID"));
		List<Employee> list = criteria.list();
		System.out.println("List of all employees");
		for(Employee emp:list) {
			System.out.println(list);
		}
		tr.commit();
		session.close();
	}
	
	void restrictSalary() {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("empSalary", 30000));
		
		
		List<Employee> list = criteria.list();
		System.out.println("Employees salary greater than 30000");
		for(Employee emp: list) {
			System.out.println(emp);
		}
		
		session.close();
	}
	
	void restrictDepartment() {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion criterion1 = Restrictions.eq("empDept","Developer");
		Criterion criterion2 = Restrictions.eq("empDept","Tester");
		criteria.add(Restrictions.or(criterion1,criterion2));
		
		
		List<Employee> list = criteria.list();
		System.out.println("If department is either developer or tester it will display");
		for(Employee emp: list) {
			System.out.println(emp);
		}
		
		session.close();
	}
	
	void getNotTesterDepartment() {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("empDept", "Tester"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employees not in department tester");
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		session.close();
	}
	
	
	void sortSalaryDesc() {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("empSalary"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employees salary sorted in descending order");
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		session.close();
		
	}
	
	void updateEmployeeDetails(int employeeID,String empFirstName,String empLastName,String empDob,String empEmail,String empDept,int empSalary) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql="UPDATE Employee SET empFirstName=:empFirstName,empLastName=:empLastName,empDob=:empDob, empEmail=:empEmail,empDept=:empDept,empSalary=:empSalary WHERE employeeID=:employeeID";
		Query query = session.createQuery(hql);
		query.setParameter("empFirstName", empFirstName);
		query.setParameter("empLastName", empLastName);
		query.setParameter("empDob", empDob);
		query.setParameter("empEmail", empEmail);
		query.setParameter("empDept", empDept);
		query.setParameter("empSalary", empSalary);
		query.setParameter("employeeID", employeeID);
		query.executeUpdate();
		tr.commit();
		System.out.println("Employee details updated successfully");
		session.close();
	}
	
	void deleteBookDetails(int employeeID) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql = "DELETE FROM Employee WHERE employeeID = :employeeID";
		Query query = session.createQuery(hql);
		query.setParameter("employeeID",employeeID);
		query.executeUpdate();
		System.out.println("Employee detail deleted successfully");
		tr.commit();
		session.close();
	}
	

	public static void main(String[] args) {
		EmployeeManagement empMng = new EmployeeManagement();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. Add new employee");
		System.out.println("2. Get Employees -> a. By ID, b. list all employees, c. salary greater than 30000, d. department developer and tester , e. department other than tester, f. sort in desc based on salary");
		System.out.println("3. Update the details of employee");
		System.out.println("4. Delete a employee");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		String choice= sc.nextLine();
		
		switch(choice) {
		
		case"1": System.out.println("Enter Employee Id");
		         int employeeID = sc.nextInt();
		         sc.nextLine();
		         System.out.println("Enter Employee First Name");
		         String empFirstName = sc.nextLine();
		         System.out.println("Enter Employee Last Name");
		         String empLastName = sc.nextLine();
		         System.out.println("Enter Employee DOB");
		         String empDob = sc.nextLine();
		         System.out.println("Enter Employee Email");
		         String empEmail = sc.nextLine();
		         System.out.println("Enter Employee Department");
		         String empDept = sc.nextLine();
		         System.out.println("Enter Employee Salary");
		         int empSalary = sc.nextInt();
		         sc.nextLine();
		         empMng.addEmployee(employeeID, empFirstName, empLastName, empDob, empEmail, empDept, empSalary);
		         break;
		         
		case"a": System.out.println("Enter Employee ID");
		         int employeeId= sc.nextInt();
		         sc.nextLine();
		         empMng.getEmployeeByID(employeeId);
		         break;
		         
		case"b": empMng.displayAllEmployees();
				 break;
		         
		case"c": empMng.restrictSalary();    
		         break;
		         
		case"d": empMng.restrictDepartment();
				 break;
				 
		case"e": empMng.getNotTesterDepartment();
				 break;
		
		case"f": empMng.sortSalaryDesc();
		 		 break;
		 		 
		case"3": System.out.println("Enter Employee Id");
        		 int employeeID1 = sc.nextInt();
        		 sc.nextLine();
        		 System.out.println("Enter Employee First Name");
        		 String empFirstName1 = sc.nextLine();
        		 System.out.println("Enter Employee Last Name");
        		 String empLastName1 = sc.nextLine();
        		 System.out.println("Enter Employee DOB");
        		 String empDob1 = sc.nextLine();
        		 System.out.println("Enter Employee Email");
        		 String empEmail1 = sc.nextLine();
        		 System.out.println("Enter Employee Department");
        		 String empDept1 = sc.nextLine();
        		 System.out.println("Enter Employee Salary");
        		 int empSalary1 = sc.nextInt();
        		 sc.nextLine();
        		 empMng.updateEmployeeDetails(employeeID1, empFirstName1, empLastName1, empDob1, empEmail1, empDept1, empSalary1);
        		 break;
        		 
		case"4": System.out.println("Enter Employee ID");
				 int employeeid = sc.nextInt();
				 sc.nextLine();
				 empMng.deleteBookDetails(employeeid);
				 break;
				 
		case"5": System.exit(0);
		
		default: System.out.println("Enter valid choice");
		
		}
	  }
	}
}

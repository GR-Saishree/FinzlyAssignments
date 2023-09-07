package com.finzly.employeemanagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private int employeeID;
	private String empFirstName;
	private String empLastName;
	private String empDob;
	private String empEmail;
	private String empDept;
	private int empSalary;
	
	@Id
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee : employeeID=" + employeeID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDob=" + empDob + ", empEmail=" + empEmail + ", empDept=" + empDept + ", empSalary=" + empSalary
				;
	}
	
}

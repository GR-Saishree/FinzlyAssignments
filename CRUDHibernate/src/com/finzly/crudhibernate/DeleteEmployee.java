package com.finzly.crudhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Priya");
		emp.setSalary("56000");
		
		session.delete(emp);
		System.out.println("Data deleted successfully");
		tr.commit();
		session.close();
	}
}

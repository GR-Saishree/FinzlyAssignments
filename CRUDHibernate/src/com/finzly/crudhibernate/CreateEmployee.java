package com.finzly.crudhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Sai shree");
		emp.setSalary("20000");
		session.save(emp);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
	}
	
}

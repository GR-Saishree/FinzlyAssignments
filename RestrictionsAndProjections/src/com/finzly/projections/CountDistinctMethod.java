package com.finzly.projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.finzly.restrictions.Config;
import com.finzly.restrictions.Employee;

public class CountDistinctMethod {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
	    criteria.setProjection(Projections.countDistinct("salary"));
		
		List<Employee> list = criteria.list();
		
		System.out.println("Distinct count of salary is "+list);
		
	}
	
}

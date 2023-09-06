package com.finzly.restrictions;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class IsNullMethod {

		@SuppressWarnings({ "unchecked", "deprecation" })
		public static void main(String[] args) {
			
			SessionFactory sf = Config.getSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.isNull("salary"));
			
			
			List<Employee> list = criteria.list();
			System.out.println("If salary is null then it displays");
			for(Employee emp: list) {
				System.out.println(emp);
			}
			
			session.close();
		}
	

}

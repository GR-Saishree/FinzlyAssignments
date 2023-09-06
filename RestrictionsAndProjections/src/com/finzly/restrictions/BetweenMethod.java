package com.finzly.restrictions;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class BetweenMethod {

		@SuppressWarnings({ "unchecked", "deprecation" })
		public static void main(String[] args) {
			
			SessionFactory sf = Config.getSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.between("salary","40000","60000"));
			
			
			List<Employee> list = criteria.list();
			System.out.println("If salary is between 40000 to 60000 then it displays");
			for(Employee emp: list) {
				System.out.println(emp);
			}
			
			session.close();
		}
	

}

package com.finzly.backoffice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.backoffice.entity.Employee;
import com.finzly.backoffice.exception.EmployeeIDNotExistsException;
import com.finzly.backoffice.exception.InvalidEmployeeOTPException;

@Repository
public class EmployeeDao {

	@Autowired
	private SessionFactory factory;

	public void signupEmployee(Employee employee) {
		Session session = factory.openSession();
		session.save(employee);
		session.beginTransaction().commit();
	}

	public boolean isEmployeeIDExists(Integer generatedEmployeeID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeID", generatedEmployeeID));
	    if(criteria.list().isEmpty()) {
	    	return false;
	    }
	    else {
	    	return true;
	    }
	}

	public boolean isEmployeeOTPExists(Integer generatedEmployeeOTP) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeOTP", generatedEmployeeOTP));
	    if(criteria.list().isEmpty()) {
	    	return false;
	    }
	    else {
	    	return true;
	    }
		
	}
	
	public boolean isEmployeeEmailExists(String employeeEmail) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeEmail", employeeEmail));
	    if(criteria.list().isEmpty()) {
	    	return false;
	    }
	    else {
	    	return true;
	    }
	}
	
	public boolean isEmployeeMobileExists(String employeeMobile) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeMobile", employeeMobile));
	    if(criteria.list().isEmpty()) {
	    	return false;
	    }
	    else {
	    	return true;
	    }
	}

	public String loginEmployee(Integer employeeID, Integer employeeOTP) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeID", employeeID));
		if(criteria.list().isEmpty()) {
			throw new EmployeeIDNotExistsException("Employee ID not exist. Please enter valid employee ID");
		}
		else {
			criteria.setProjection(Projections.projectionList().add(Projections.property("employeeOTP")));
			List<Integer> employeeotp = criteria.list();
			if(employeeOTP.equals(employeeotp.get(0))) {
				return "Welcome Employee "+ employeeID;
			}
			else {
				throw new InvalidEmployeeOTPException("Invalid Employee OTP");
			}
			
		}
	}
		
	

}

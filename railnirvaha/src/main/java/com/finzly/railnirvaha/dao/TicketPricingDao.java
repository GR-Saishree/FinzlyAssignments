package com.finzly.railnirvaha.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.railnirvaha.entity.TicketPricing;
import com.finzly.railnirvaha.entity.TrainRoute;

@Repository
public class TicketPricingDao {

	
	@Autowired
	SessionFactory factory;
	public List<TicketPricing> getAllGeneralPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();

	}
	public List<TicketPricing> getAllHandicappedPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();

	}
	public List<TicketPricing> getAllSeniorCitizenPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllTatkalPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAll1APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAll2APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAll3APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllSLPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllGeneralTatkalPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllGeneralHandicappedPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllGeneralSeniorCitizenPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllHandicappedSeniorCitizenPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllTatkalHandicappedPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public List<TicketPricing> getAllTatkalSeniorCitizenPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		return criteria.list();
	}
	public String addTicketPrice(TicketPricing ticketPrice) {
		Session session = factory.openSession();
		session.save(ticketPrice);
		session.beginTransaction().commit();
		return "Ticket Price details added successfully";
	}
	public List<TrainRoute> getAllTicketPrices() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		return criteria.list();
	}
	public String updateTicketPrice(TicketPricing ticketPrice) {
		Session session = factory.openSession();
		session.update(ticketPrice);
		session.beginTransaction().commit();
		return "Ticket details updated successfully";
	}
	public String deleteTicketPrice(long pricingID) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		TicketPricing ticketPricing = (TicketPricing) criteria.uniqueResult();
		session.delete(ticketPricing);
		tr.commit();
		return "Ticket price details deleted successfully";
	}
	
	public List<TicketPricing> getGeneral1APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general1A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getGeneral2APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general2A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getGeneral3APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general3A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getGeneralSLPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("generalSL")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getHandicapped1APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped1A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getHandicapped2APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped2A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getHandicapped3APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped3A")));
		return criteria.list();
		
	}
	
	public List<TicketPricing> getHandicappedSLPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicappedSL")));
		return criteria.list();
		
	}
	public List<TicketPricing> getTatkal1APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal1A")));
		return criteria.list();
	}
	public List<TicketPricing> getTatkal2APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal2A")));
		return criteria.list();
	}
	public List<TicketPricing> getTatkal3APrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal3A")));
		return criteria.list();
	}
	public List<TicketPricing> getTatkalSLPrice(long pricingID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TicketPricing.class);
		criteria.add(Restrictions.eq("pricingID", pricingID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkalSL")));
		return criteria.list();
	}
	
	

}

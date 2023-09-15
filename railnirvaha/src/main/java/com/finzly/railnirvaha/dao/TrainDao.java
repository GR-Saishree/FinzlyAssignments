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

import com.finzly.railnirvaha.entity.Train;

@Repository
public class TrainDao {

	@Autowired
	SessionFactory factory;
	public String addTrain(Train train) {
		
		Session session = factory.openSession();
		session.save(train);
		session.beginTransaction().commit();
		return "Train details added successfully";
		
		
	}
	public List<Train> getTrain() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		return criteria.list();
	}
	public List<Train> getTrainByNumber(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		return criteria.list();
	}
	public List<Train> getTrainByName(String trainName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainName", trainName));
		return criteria.list();
	}
	public List<Train> getTrainByType(String trainType) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainType", trainType));
		return criteria.list();
		
	}
	public List<Train> getTrainByDepartureStation(String departureStation) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("departureStation", departureStation));
		return criteria.list();
	}
	public List<Train> getTrainByArrivalStation(String arrivalStation) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("arrivalStation", arrivalStation));
		return criteria.list();
	}
	public String updateTrain(Train train) {
		Session session = factory.openSession();
		session.update(train);
		session.beginTransaction().commit();
		return "Train details updated successfully";
		
	}
	public String deleteTrain(int trainNumber) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		Train train = (Train) criteria.uniqueResult();
		session.delete(train);
		tr.commit();
		return "Train details deleted successfully";
	}
	public int getGeneral1A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general1A")));
		List<Integer> general1ASeats = criteria.list();
		if(general1ASeats.size()>0) {
			return general1ASeats.get(0);
		}
		else {
			return 0;
		}
		
	}
	public int getGeneral2A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general2A")));
		List<Integer> general2ASeats = criteria.list();
		if(general2ASeats.size()>0) {
			return general2ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	
	public int getGeneral3A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("general3A")));
		List<Integer> general3ASeats = criteria.list();
		if(general3ASeats.size()>0) {
			return general3ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	
	public int getGeneralSL(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("generalSL")));
		List<Integer> generalSLSeats = criteria.list();
		if(generalSLSeats.size()>0) {
			return generalSLSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTatkalSL(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkalSL")));
		List<Integer> tatkalSLSeats = criteria.list();
		if(tatkalSLSeats.size()>0) {
			return tatkalSLSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTatkal3A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal3A")));
		List<Integer> tatkal3ASeats = criteria.list();
		if(tatkal3ASeats.size()>0) {
			return tatkal3ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTatkal2A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal2A")));
		List<Integer> tatkal2ASeats = criteria.list();
		if(tatkal2ASeats.size()>0) {
			return tatkal2ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTatkal1A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkal1A")));
		List<Integer> tatkal1ASeats = criteria.list();
		if(tatkal1ASeats.size()>0) {
			return tatkal1ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getHandicapped1A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped1A")));
		List<Integer> handicapped1ASeats = criteria.list();
		if(handicapped1ASeats.size()>0) {
			return handicapped1ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getHandicapped2A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped2A")));
		List<Integer> handicapped2ASeats = criteria.list();
		if(handicapped2ASeats.size()>0) {
			return handicapped2ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getHandicapped3A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicapped3A")));
		List<Integer> handicapped3ASeats = criteria.list();
		if(handicapped3ASeats.size()>0) {
			return handicapped3ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getHandicappedSL(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicappedSL")));
		List<Integer> handicappedSLSeats = criteria.list();
		if(handicappedSLSeats.size()>0) {
			return handicappedSLSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getSeniorCitizen1A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("seniorcitizen1A")));
		List<Integer> seniorCitizen1ASeats = criteria.list();
		if(seniorCitizen1ASeats.size()>0) {
			return seniorCitizen1ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getSeniorCitizen2A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("seniorcitizen2A")));
		List<Integer> seniorCitizen2ASeats = criteria.list();
		if(seniorCitizen2ASeats.size()>0) {
			return seniorCitizen2ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getSeniorCitizen3A(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("seniorcitizen3A")));
		List<Integer> seniorCitizen3ASeats = criteria.list();
		if(seniorCitizen3ASeats.size()>0) {
			return seniorCitizen3ASeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getSeniorCitizenSL(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("seniorcitizenSL")));
		List<Integer> seniorCitizenSLSeats = criteria.list();
		if(seniorCitizenSLSeats.size()>0) {
			return seniorCitizenSLSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTotalGeneralSeats(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("generalTotalSeats")));
		List<Integer> generalTotalSeats = criteria.list();
		if(generalTotalSeats.size()>0) {
			return generalTotalSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTotalTatkalSeats(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("tatkalTotalSeats")));
		List<Integer> tatkalTotalSeats = criteria.list();
		if(tatkalTotalSeats.size()>0) {
			return tatkalTotalSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTotalHandicappedSeats(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("handicappedTotalSeats")));
		List<Integer> handicappedTotalSeats = criteria.list();
		if(handicappedTotalSeats.size()>0) {
			return handicappedTotalSeats.get(0);
		}
		else {
			return 0;
		}
	
	}
	public int getTotalSeniorCitizenSeats(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("seniorcitizenTotalSeats")));
		List<Integer> seniorcitizenTotalSeats = criteria.list();
		if(seniorcitizenTotalSeats.size()>0) {
			return seniorcitizenTotalSeats.get(0);
		}
		else {
			return 0;
		}
	}
	public int getTotalSeats(int trainNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		criteria.add(Restrictions.eq("trainNumber", trainNumber));
		criteria.setProjection(Projections.projectionList().add(Projections.property("totalSeats")));
		List<Integer> totalSeats = criteria.list();
		if(totalSeats.size()>0) {
			return totalSeats.get(0);
		}
		else {
			return 0;
		}
	}
	

}

package com.finzly.railnirvaha.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.railnirvaha.entity.Station;
import com.finzly.railnirvaha.entity.Train;
import com.finzly.railnirvaha.entity.TrainRoute;

@Repository
public class TrainRouteDao {

	@Autowired
	SessionFactory factory;
	public List<TrainRoute> getFromToByTrainID(int trainID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		criteria.add(Restrictions.eq("trainID", trainID ));
		System.out.println(criteria.list());
		return criteria.list();
	}
	public List<TrainRoute> getDeptArrByTrainID(int trainID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		criteria.add(Restrictions.eq("trainID", trainID ));
		return criteria.list();
	}
	public List<TrainRoute> getDetailsByTrainID(int trainID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		criteria.add(Restrictions.eq("trainID", trainID ));
		return criteria.list();
	}
	public List<TrainRoute> searchArrivalTimeByKeyword() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		return criteria.list();
		
	}
	public List<TrainRoute> searchDepartureTimeByKeyword() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		return criteria.list();
	}
	public List<TrainRoute> searchFromStationByKeyword() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		return criteria.list();
	}
	public List<TrainRoute> searchToStationByKeyword() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		return criteria.list();
	}
	public String addRoute(TrainRoute trainRoute) {
		Session session = factory.openSession();
		session.save(trainRoute);
		session.beginTransaction().commit();
		return "Train route details added successfully";
	}
	public List<TrainRoute> getAllTrainsRoutes() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		return criteria.list();
	}
	public String updateTrainDao(TrainRoute trainRoute) {
		Session session = factory.openSession();
		session.update(trainRoute);
		session.beginTransaction().commit();
		return "Train Route details updated successfully";
	}
	public String deleteTrainRoute(long routeID) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(TrainRoute.class);
		criteria.add(Restrictions.eq("routeID", routeID));
		TrainRoute trainRoute = (TrainRoute) criteria.uniqueResult();
		session.delete(trainRoute);
		tr.commit();
		return "Train Route details deleted successfully";
	}

}

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

import com.finzly.railnirvaha.entity.Station;

@Repository
public class StationDao {

	@Autowired
	SessionFactory factory;
	
	// Inserts station details to Station DB
	public String addStation(Station station) {
		Session session = factory.openSession();
		session.save(station);
		session.beginTransaction().commit();
		return "Station details added successfully";
	}

	// Fetches all stations details
	public List<Station> getAllStations() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		return criteria.list();
		
	}

	// Fetches station details By specified ID
	public List<Station> getStationByID(long stationID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("stationID", stationID));
		return criteria.list();
	}

	// Fetches station details by specified name
	public List<Station> getStationByName(String stationName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("stationName", stationName));
		return criteria.list();
	}

	// Fetches station details by specified  city
	public List<Station> getStationByCity(String city) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("city", city));
		return criteria.list();
	}

	// Fetches station details by specified region
	public List<Station> getStationByRegion(String region) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("region", region));
		return criteria.list();
	}

	// Fetches station details by specified country
	public List<Station> getStationByCountry(String country) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("country", country));
		return criteria.list();
	}

	// Fetches station details by specified platform count
	public List<Station> getStationByPlatformCount(String platformCount) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("platformCount", platformCount));
		return criteria.list();
	}

	// Fetches station details by specified  number of tracks
	public List<Station> getStationByNumberOfTracks(String numberofTracks) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("numberofTracks", numberofTracks));
		return criteria.list();
	}

	// Fetches station emergency contact by specified ID
	public String getEmergencyContact(int stationID) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("stationID", stationID));
		criteria.setProjection(Projections.projectionList().add(Projections.property("emergencyContact")));
		List<String> emergencyContact = criteria.list();
		if(emergencyContact.size()>0) {
			return emergencyContact.get(0);
		}
		else {
			return "";
		}
		
	}

	// Fetches station details by specified operating hours
	public List<Station> getStationByOperatingHours(String operatingHours) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("operatingHours", operatingHours));
		return criteria.list();
	}

	// Updates station details to Station DB
	public String updateStation(Station station) {
		Session session = factory.openSession();
		session.update(station);
		session.beginTransaction().commit();
		return "Station details updated successfully";
	}

	// Delete station details by specified ID from Station DB
	public String deleteStation(long stationID) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("stationID", stationID));
		Station station = (Station) criteria.uniqueResult();
		session.delete(station);
		tr.commit();
		return "Station details deleted successfully";
	}

	// Fetches station details with 24/7 availability
	public List<Station> getStationWith24X7Availability() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("operatingHours", "24/7"));
		return criteria.list();
	}

	// Fetches station details with platform count greater than 10
	public List<Station> getStationWithPlatformCountGT10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.gt("platformCount", 10));
		return criteria.list();
		
	}

	// Fetches station details with platform count greater than 10
	public List<Station> getRegionWithPlatformCountGT10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.gt("platformCount", 10));
		return criteria.list();
	}

	// Fetches station details with platform count greater than or equal to 10
	public List<Station> getStationTracksWithPlatformCountGE10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.ge("platformCount", 10));
		return criteria.list();
	}

	// Fetches station details with specified country
	public List<Station> getStationAndRegionWithCountry(String country) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("country", country));
		return criteria.list();
	}

	// Fetches station details with specified city
	public List<Station> getStationDetailsByCity(String city) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("city", city));
		return criteria.list();
	}

	// Fetches station details with specified region
	public List<Station> getStationDetailsByRegion(String region) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("region", region));
		return criteria.list();
	}

	// Fetches station details with specified country
	public List<Station> getStationDetailsByCountry(String country) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("country", country));
		return criteria.list();
	}

	// Fetches station details with platform count in range 5 to 15
	public List<Station> getStationWithPlatformRange5To15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.between("platformCount", 5, 15));
		return criteria.list();
	}

	// Fetches station details with number of tracks count in range 5 to 10
	public List<Station> getStationWithTracksRange5To10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.between("numberofTracks", 5, 10));
		return criteria.list();
	}

	// Fetches station details with platform count lesser than 10
	public List<Station> getStationWithPlatformCountLT10() {
	
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.lt("platformCount", 10));
		return criteria.list();
	}

	// Fetches station details with platform count lesser than or equal to 10
	public List<Station> getRegionWithPlatformCountLT10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.lt("platformCount", 10));
		return criteria.list();
	}
	
	// Fetches station details with number of tracks count in range 1 to 15
	public List<Station> getStationTracksWithPlatformCountLE10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.le("platformCount", 10));
		return criteria.list();

}

	// Fetches station details with 20/6 availability
	public List<Station> getStationWith20X6Availability() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("operatingHours", "20/6"));
		return criteria.list();
	}

	// Fetches station details with 20/5 availability
	public List<Station> getStationWith20X5Availability() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("operatingHours", "20/5"));
		return criteria.list();
	}

	// Fetches station details with 16/7 availability
	public List<Station> getStationWith16X7Availability() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.eq("operatingHours", "16/7"));
		return criteria.list();
	}

	// Fetches station details with platform count in range 1 to 15
	public List<Station> getStationWithPlatformRange1To15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.between("platformCount", 1, 15));
		return criteria.list();
	}

	// Fetches station details with number of tracks in range 1 to 5
	public List<Station> getStationWithTracksRange1To5() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.between("numberofTracks", 1, 5));
		return criteria.list();
	}

	// Fetches station details with number of tracks in range 1 to 25
	public List<Station> getStationWithTracksRange1To25() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Station.class);
		criteria.add(Restrictions.between("numberofTracks", 1, 25));
		return criteria.list();
	}
}

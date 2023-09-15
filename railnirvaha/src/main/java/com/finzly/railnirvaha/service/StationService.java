package com.finzly.railnirvaha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.railnirvaha.dao.StationDao;
import com.finzly.railnirvaha.entity.Station;

@Service
public class StationService {

	@Autowired
	StationDao stationDao;
	
	public String addStation(Station station) {
		return stationDao.addStation(station);
	}

	public List<Station> getAllStations() {
		return stationDao.getAllStations();
	}

	public List<Station> getStationByID(long stationID) {
		return stationDao.getStationByID(stationID);
	}

	public List<Station> getStationByName(String stationName) {
		return stationDao.getStationByName(stationName);
	}

	public List<Station> getStationByCity(String city) {
		return stationDao.getStationByCity(city);
	}

	public List<Station> getStationByRegion(String region) {
		return stationDao.getStationByRegion(region);
	}

	public List<Station> getStationByCountry(String country) {
		return stationDao.getStationByCountry(country);
	}

	public List<Station> getStationByPlatformCount(String platformCount) {
		return stationDao.getStationByPlatformCount(platformCount);
	}

	public List<Station> getStationByNumberOfTracks(String numberofTracks) {
		return stationDao.getStationByNumberOfTracks(numberofTracks);
	}

	public String getEmergencyContact(int stationID) {
		return stationDao.getEmergencyContact(stationID);
	}

	public List<Station> getStationByOperatingHours(String operatingHours) {
		return stationDao.getStationByOperatingHours(operatingHours);
	}

	public String updateStation(Station station) {
		return stationDao.updateStation(station);
	}

	public String deleteStation(long stationID) {
		return stationDao.deleteStation(stationID);
	}

	// Returns station name and city with station 24/7 availability
	public List<Station> getStationWith24X7Availability() {
	    List<Station> list = stationDao.getStationWith24X7Availability();
	    List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station platform count greater than 10
	public List<Station> getStationWithPlatformCountGT10() {
		List<Station> list = stationDao.getStationWithPlatformCountGT10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station region and city with platform count greater than 10
	public List<Station> getRegionWithPlatformCountGT10() {
		List<Station> list = stationDao.getRegionWithPlatformCountGT10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String region = station.getRegion();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setRegion(region);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and number of tracks with platform count greater than equal to 10
	public List<Station> getStationTracksWithPlatformCountGE10() {
		List<Station> list = stationDao.getStationTracksWithPlatformCountGE10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	int numberOfTracks = station.getNumberofTracks();
	    	String stationName = station.getStationName();
	    	
	    	Station stations = new Station();
	    	stations.setNumberofTracks(numberOfTracks);
	    	stations.setStationName(stationName);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and region with specified country 
	public List<Station> getStationAndRegionWithCountry(String country) {
		List<Station> list = stationDao.getStationAndRegionWithCountry(country);
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String region = station.getRegion();
	    	String stationName = station.getStationName();
	    	
	    	Station stations = new Station();
	    	stations.setRegion(region);
	    	stations.setStationName(stationName);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name , region and country with specified city
	public List<Station> getStationDetailsByCity(String city) {
		List<Station> list = stationDao.getStationDetailsByCity(city);
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String region = station.getRegion();
	    	String stationName = station.getStationName();
	    	String country = station.getCountry();
	    	
	    	Station stations = new Station();
	    	stations.setRegion(region);
	    	stations.setStationName(stationName);
	    	stations.setCountry(country);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name,country and city with specified region
	public List<Station> getStationDetailsByRegion(String region) {
		List<Station> list = stationDao.getStationDetailsByRegion(region);
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String city = station.getCity();
	    	String stationName = station.getStationName();
	    	String country = station.getCountry();
	    	
	    	Station stations = new Station();
	    	stations.setCity(city);
	    	stations.setStationName(stationName);
	    	stations.setCountry(country);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name,region and city with specified country
	public List<Station> getStationDetailsByCountry(String country) {
		List<Station> list = stationDao.getStationDetailsByCountry(country);
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String city = station.getCity();
	    	String stationName = station.getStationName();
	    	String region = station.getRegion();
	    	
	    	Station stations = new Station();
	    	stations.setCity(city);
	    	stations.setStationName(stationName);
	    	stations.setRegion(region);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station platform count ranging 5 to 15
	public List<Station> getStationWithPlatformRange5To15() {
		List<Station> list = stationDao.getStationWithPlatformRange5To15();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station tracks count ranging 5 to 10
	public List<Station> getStationWithTracksRange5To10() {
		List<Station> list = stationDao.getStationWithTracksRange5To10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station platform count lesser than 10
	public List<Station> getStationWithPlatformCountLT10() {
		List<Station> list = stationDao.getStationWithPlatformCountLT10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and number of tracks with station platform count lesser than or equal to 10
	public List<Station> getStationTracksWithPlatformCountLE10() {
		List<Station> list = stationDao.getStationTracksWithPlatformCountLE10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	int numberOfTracks = station.getNumberofTracks();
	    	String stationName = station.getStationName();
	    	
	    	Station stations = new Station();
	    	stations.setNumberofTracks(numberOfTracks);
	    	stations.setStationName(stationName);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
		
	}

	// Returns station region and city with station platform count lesser than 10
	public List<Station> getRegionWithPlatformCountLT10() {
		List<Station> list = stationDao.getRegionWithPlatformCountLT10();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String region = station.getRegion();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setRegion(region);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station operating hours 20/6 availability
	public List<Station> getStationWith20X6Availability() {
		 List<Station> list = stationDao.getStationWith20X6Availability();
		    List<Station> finalList = new ArrayList<>();
		    for(Station station: list) {
		    	String stationName = station.getStationName();
		    	String city = station.getCity();
		    	
		    	Station stations = new Station();
		    	stations.setStationName(stationName);
		    	stations.setCity(city);
		    	
		    	finalList.add(stations);
		    }
		    return finalList;
	}

	// Returns station name and city with station operating hours 20/5 availability
	public List<Station> getStationWith20X5Availability() {
		List<Station> list = stationDao.getStationWith20X5Availability();
	    List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station operating hours 16/7 availability
	public List<Station> getStationWith16X7Availability() {
		List<Station> list = stationDao.getStationWith16X7Availability();
	    List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station platform count ranging 1 to 15
	public List<Station> getStationWithPlatformRange1To15() {
		List<Station> list = stationDao.getStationWithPlatformRange1To15();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station tracks count ranging 1 to 5
	public List<Station> getStationWithTracksRange1To5() {
		List<Station> list = stationDao.getStationWithTracksRange1To5();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

	// Returns station name and city with station tracks count ranging 1 to 25
	public List<Station> getStationWithTracksRange1To25() {
		List<Station> list = stationDao.getStationWithTracksRange1To25();
		List<Station> finalList = new ArrayList<>();
	    for(Station station: list) {
	    	String stationName = station.getStationName();
	    	String city = station.getCity();
	    	
	    	Station stations = new Station();
	    	stations.setStationName(stationName);
	    	stations.setCity(city);
	    	
	    	finalList.add(stations);
	    }
	    return finalList;
	}

}

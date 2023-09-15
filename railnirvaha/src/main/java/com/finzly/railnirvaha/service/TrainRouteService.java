package com.finzly.railnirvaha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.railnirvaha.dao.TrainRouteDao;
import com.finzly.railnirvaha.entity.TrainRoute;

@Service
public class TrainRouteService {

	@Autowired
	TrainRouteDao trainRouteDao;
	
	public List<TrainRoute> getFromToByTrainID(int trainID) {
		List<TrainRoute> list = trainRouteDao.getFromToByTrainID(trainID);
		List<TrainRoute> finalList = new ArrayList<>();
	    for(TrainRoute trainRoute: list) {
	    	String fromStation = trainRoute.getFromStationName();
	    	String toStation = trainRoute.getToStationName();
	    	
	    	TrainRoute trainRoutes = new TrainRoute();
	    	trainRoutes.setToStationName(toStation);
	    	trainRoutes.setFromStationName(fromStation);
	    	
	    	finalList.add(trainRoutes);
	    }
	    return finalList;
	}

	public List<TrainRoute> getDeptArrByTrainID(int trainID) {
		List<TrainRoute> list = trainRouteDao.getDeptArrByTrainID(trainID);
		List<TrainRoute> finalList = new ArrayList<>();
	    for(TrainRoute trainRoute: list) {
	    	String departureTime = trainRoute.getDepartureTime();
	    	String arrivalTime = trainRoute.getArrivalTime();
	    	
	    	TrainRoute trainRoutes = new TrainRoute();
	    	trainRoutes.setDepartureTime(departureTime);
	    	trainRoutes.setArrivalTime(arrivalTime);
	    	
	    	finalList.add(trainRoutes);
	    }
	    return finalList;
	}

	public List<TrainRoute> getDetailsByTrainID(int trainID) {
		List<TrainRoute> list = trainRouteDao.getDetailsByTrainID(trainID);
		List<TrainRoute> finalList = new ArrayList<>();
	    for(TrainRoute trainRoute: list) {
	    	String departureTime = trainRoute.getDepartureTime();
	    	String arrivalTime = trainRoute.getArrivalTime();
	    	String fromStation = trainRoute.getFromStationName();
	    	String toStation = trainRoute.getToStationName();
	    	
	    	TrainRoute trainRoutes = new TrainRoute();
	    	trainRoutes.setDepartureTime(departureTime);
	    	trainRoutes.setArrivalTime(arrivalTime);
	    	trainRoutes.setToStationName(toStation);
	    	trainRoutes.setFromStationName(fromStation);
	    	
	    	finalList.add(trainRoutes);
	    }
	    return finalList;
	}

	public List<TrainRoute> searchArrivalTimeByKeyword(String keyword) {
		List<TrainRoute> list = trainRouteDao.searchArrivalTimeByKeyword();
		List<TrainRoute> finalList = new ArrayList<>();
		
		for(TrainRoute trainRoute : list) {
			if(trainRoute.getArrivalTime().toLowerCase().contains(keyword.toLowerCase())) {
				finalList.add(trainRoute);
			}
		}
		
		return finalList;
		
		
		
	}

	public List<TrainRoute> searchDepartureTimeByKeyword(String keyword) {
		List<TrainRoute> list = trainRouteDao.searchDepartureTimeByKeyword();
		List<TrainRoute> finalList = new ArrayList<>();
		
		for(TrainRoute trainRoute : list) {
			if(trainRoute.getDepartureTime().toLowerCase().contains(keyword.toLowerCase())) {
				finalList.add(trainRoute);
			}
		}
		
		return finalList;
	}

	public List<TrainRoute> searchFromStationByKeyword(String keyword) {
		List<TrainRoute> list = trainRouteDao.searchFromStationByKeyword();
		List<TrainRoute> finalList = new ArrayList<>();
		
		for(TrainRoute trainRoute : list) {
			if(trainRoute.getFromStationName().toLowerCase().contains(keyword.toLowerCase())) {
				finalList.add(trainRoute);
			}
		}
		
		return finalList;
	}

	public List<TrainRoute> searchToStationByKeyword(String keyword) {
		List<TrainRoute> list = trainRouteDao.searchToStationByKeyword();
		List<TrainRoute> finalList = new ArrayList<>();
		
		for(TrainRoute trainRoute : list) {
			if(trainRoute.getToStationName().toLowerCase().contains(keyword.toLowerCase())) {
				finalList.add(trainRoute);
			}
		}
		
		return finalList;
	}

	public String addRoute(TrainRoute trainRoute) {
		return trainRouteDao.addRoute(trainRoute);
	}

	public List<TrainRoute> getAllTrainsRoutes() {
		return trainRouteDao.getAllTrainsRoutes();
	}

	public String updateTrainRoute(TrainRoute trainRoute) {
		return trainRouteDao.updateTrainDao(trainRoute);
	}

	public String deleteTrainRoute(long routeID) {
		return trainRouteDao.deleteTrainRoute(routeID);
	}

}

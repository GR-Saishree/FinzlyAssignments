package com.finzly.railnirvaha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.finzly.railnirvaha.dao.TrainDao;
import com.finzly.railnirvaha.entity.Train;

@Service
public class TrainService {

	@Autowired
	TrainDao trainDao;
	
	public String addTrain(Train train) {
		return trainDao.addTrain(train);
		
	}

	public List<Train> getTrain() {
		return trainDao.getTrain();
	}

	public List<Train> getTrainByNumber(int trainNumber) {
		return trainDao.getTrainByNumber(trainNumber);
	}

	public List<Train> getTrainByName(String trainName) {
		return trainDao.getTrainByName(trainName);
	}

	public List<Train> getTrainByType(String trainType) {
		return trainDao.getTrainByType(trainType);
	}

	public List<Train> getTrainByDepartureStation(String departureStation) {
		return trainDao.getTrainByDepartureStation(departureStation);
	}

	public List<Train> getTrainByArrivalStation(String arrivalStation) {
		return trainDao.getTrainByArrivalStation(arrivalStation);
	}

	public String updateTrain(Train train) {
		return trainDao.updateTrain(train);
	}

	public String deleteTrain(int trainNumber){
		return trainDao.deleteTrain(trainNumber);
	}

	public int getGeneral1A(int trainNumber) {
		return trainDao.getGeneral1A(trainNumber);
	}

	public int getGeneral2A(int trainNumber) {
		return trainDao.getGeneral2A(trainNumber);
	}

	public int getGeneral3A(int trainNumber) {
		return trainDao.getGeneral3A(trainNumber);
	}

	public int getGeneralSL(int trainNumber) {
		return trainDao.getGeneralSL(trainNumber);
	}

	public int getTatkalSL(int trainNumber) {
		return trainDao.getTatkalSL(trainNumber);
	}

	public int getTatkal3A(int trainNumber) {
		return trainDao.getTatkal3A(trainNumber);
	}

	public int getTatkal2A(int trainNumber) {
		return trainDao.getTatkal2A(trainNumber);
	}

	public int getTatkal1A(int trainNumber) {
		return trainDao.getTatkal1A(trainNumber);
	}

	public int getHandicapped1A(int trainNumber) {
		return trainDao.getHandicapped1A(trainNumber);
	}

	public int getHandicapped2A(int trainNumber) {
		return trainDao.getHandicapped2A(trainNumber);
	}

	public int getHandicapped3A(int trainNumber) {
		return trainDao.getHandicapped3A(trainNumber);
	}

	public int getHandicappedSL(int trainNumber) {
		return trainDao.getHandicappedSL(trainNumber);
	}

	public int getSeniorCitizen1A(int trainNumber) {
		return trainDao.getSeniorCitizen1A(trainNumber);
	}

	public int getSeniorCitizen2A(int trainNumber) {
		return trainDao.getSeniorCitizen2A(trainNumber);
	}

	public int getSeniorCitizen3A(int trainNumber) {
		return trainDao.getSeniorCitizen3A(trainNumber);
	}

	public int getSeniorCitizenSL(int trainNumber) {
		return trainDao.getSeniorCitizenSL(trainNumber);
	}

	public int getTotalGeneralSeats(int trainNumber) {
		return trainDao.getTotalGeneralSeats(trainNumber);
	}

	public int getTotalTatkalSeats(int trainNumber) {
		return trainDao.getTotalTatkalSeats(trainNumber);
	}

	public int getTotalHandicappedSeats(int trainNumber) {
		return trainDao.getTotalHandicappedSeats(trainNumber);
	}

	public int getTotalSeniorCitizenSeats(int trainNumber) {
		return trainDao.getTotalSeniorCitizenSeats(trainNumber);
	}

	public int getTotalSeats(int trainNumber) {
		return trainDao.getTotalSeats(trainNumber);
	}

}

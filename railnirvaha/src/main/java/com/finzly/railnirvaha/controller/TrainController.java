package com.finzly.railnirvaha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.railnirvaha.entity.Train;
import com.finzly.railnirvaha.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	TrainService trainService;
	
	@PostMapping("addTrain")
	public String addTrain(@RequestBody Train train) {
		return trainService.addTrain(train);
	
	}
	
	@GetMapping("getAllTrains")
	public List<Train> getTrain(){
		return trainService.getTrain();
	}
	
	@GetMapping("getTrainByNumber/{trainNumber}")
	public List<Train> getTrainByNumber(@PathVariable int trainNumber){
		return trainService.getTrainByNumber(trainNumber);
	}
	
	@GetMapping("getTrainByName/{trainName}")
	public List<Train> getTrainByName(@PathVariable String trainName){
		return trainService.getTrainByName(trainName);
	}
	
	@GetMapping("getTrainByType/{trainType}")
	public List<Train> getTrainByType(@PathVariable String trainType){
		return trainService.getTrainByType(trainType);
	}
	
	@GetMapping("getTrainByDepartureStation/{departureStation}")
	public List<Train> getTrainByDepartureStation(@PathVariable String departureStation){
		return trainService.getTrainByDepartureStation(departureStation);
	}
	
	@GetMapping("getTrainByArrivalStation/{arrivalStation}")
	public List<Train> getTrainByArrivalStation(@PathVariable String arrivalStation){
		return trainService.getTrainByArrivalStation(arrivalStation);
	}
	
	@PutMapping("updateTrain")
	public String updateTrain(@RequestBody Train train) {
		return trainService.updateTrain(train);
	}
	
	@DeleteMapping("deleteTrain/{trainNumber}")
	public String deleteTrain(@PathVariable int trainNumber) {
		return trainService.deleteTrain(trainNumber);
	}
	
	@GetMapping("getGeneral1ASeats/{trainNumber}")
	public int getGeneral1A(@PathVariable int trainNumber){
		return trainService.getGeneral1A(trainNumber);
		
	}
	
	@GetMapping("getGeneral2ASeats/{trainNumber}")
	public int getGeneral2A(@PathVariable int trainNumber){
		return trainService.getGeneral2A(trainNumber);
		
	}
	
	@GetMapping("getGeneral3ASeats/{trainNumber}")
	public int getGeneral3A(@PathVariable int trainNumber){
		return trainService.getGeneral3A(trainNumber);
		
	}
	
	@GetMapping("getGeneralSLSeats/{trainNumber}")
	public int getGeneralSL(@PathVariable int trainNumber){
		return trainService.getGeneralSL(trainNumber);
		
	}
	
	@GetMapping("getTatkal1ASeats/{trainNumber}")
	public int getTatkal1A(@PathVariable int trainNumber){
		return trainService.getTatkal1A(trainNumber);
		
	}
	
	@GetMapping("getTatkal2ASeats/{trainNumber}")
	public int getTatkal2A(@PathVariable int trainNumber){
		return trainService.getTatkal2A(trainNumber);
		
	}
	
	@GetMapping("getTatkal3ASeats/{trainNumber}")
	public int getTatkal3A(@PathVariable int trainNumber){
		return trainService.getTatkal3A(trainNumber);
		
	}
	
	@GetMapping("getTatkalSLSeats/{trainNumber}")
	public int getTatkalSL(@PathVariable int trainNumber){
		return trainService.getTatkalSL(trainNumber);
		
	}
	
	@GetMapping("getHandicapped1ASeats/{trainNumber}")
	public int getHaddicapped1A(@PathVariable int trainNumber){
		return trainService.getHandicapped1A(trainNumber);
		
	}
	
	@GetMapping("getHandicapped2ASeats/{trainNumber}")
	public int getHandicapped2A(@PathVariable int trainNumber){
		return trainService.getHandicapped2A(trainNumber);
		
	}
	
	@GetMapping("getHandicapped3ASeats/{trainNumber}")
	public int getHandicapped3A(@PathVariable int trainNumber){
		return trainService.getHandicapped3A(trainNumber);
		
	}
	
	@GetMapping("getHandicappedSLSeats/{trainNumber}")
	public int getHandicappedSL(@PathVariable int trainNumber){
		return trainService.getHandicappedSL(trainNumber);
		
	}
	
	@GetMapping("getSeniorCitizen1ASeats/{trainNumber}")
	public int getSeniorCitizenA(@PathVariable int trainNumber){
		return trainService.getSeniorCitizen1A(trainNumber);
		
	}
	
	@GetMapping("getSeniorCitizen2ASeats/{trainNumber}")
	public int getSeniorCitizen2A(@PathVariable int trainNumber){
		return trainService.getSeniorCitizen2A(trainNumber);
		
	}
	
	@GetMapping("getSeniorCitizen3ASeats/{trainNumber}")
	public int getSeniorCitizen3A(@PathVariable int trainNumber){
		return trainService.getSeniorCitizen3A(trainNumber);
		
	}
	
	@GetMapping("getSeniorCitizenSLSeats/{trainNumber}")
	public int getSeniorCitizenSL(@PathVariable int trainNumber){
		return trainService.getSeniorCitizenSL(trainNumber);
		
	}
	
	@GetMapping("getTotalGeneralSeats/{trainNumber}")
	public int getTotalGeneralSeats(@PathVariable int trainNumber){
		return trainService.getTotalGeneralSeats(trainNumber);
		
	}
	
	@GetMapping("getTotalTatkalSeats/{trainNumber}")
	public int getTotalTatkalSeats(@PathVariable int trainNumber){
		return trainService.getTotalTatkalSeats(trainNumber);
		
	}
	
	@GetMapping("getTotalHandicappedSeats/{trainNumber}")
	public int getTotalHandicappedSeats(@PathVariable int trainNumber){
		return trainService.getTotalHandicappedSeats(trainNumber);
		
	}
	
	@GetMapping("getTotalSeniorCitizenSeats/{trainNumber}")
	public int getTotalSeniorCitizenSeats(@PathVariable int trainNumber){
		return trainService.getTotalSeniorCitizenSeats(trainNumber);
		
	}
	
	@GetMapping("getTotalSeats/{trainNumber}")
	public int getTotalSeats(@PathVariable int trainNumber){
		return trainService.getTotalSeats(trainNumber);
		
	}


	
	
	
	

}

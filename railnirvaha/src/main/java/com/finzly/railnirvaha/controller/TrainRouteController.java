package com.finzly.railnirvaha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.finzly.railnirvaha.entity.TrainRoute;
import com.finzly.railnirvaha.service.TrainRouteService;

@RestController
public class TrainRouteController {

	@Autowired
	TrainRouteService trainRouteService;
	
	@GetMapping("getFromToByTrainID/{trainID}")
	public List<TrainRoute> getFromToByTrainID(@PathVariable int trainID){
		return trainRouteService.getFromToByTrainID(trainID);
	}
	
	@GetMapping("getDeptArrByTrainID/{trainID}")
	public List<TrainRoute> getDeptArrByTrainID(@PathVariable int trainID){
		return trainRouteService.getDeptArrByTrainID(trainID);
	}
	
	@GetMapping("getDetailsByTrainID/{trainID}")
	public List<TrainRoute> getDetailsByTrainID(@PathVariable int trainID){
		return trainRouteService.getDetailsByTrainID(trainID);
	}
	
	@GetMapping("searchArrivalTimeByKeyword")
	public List<TrainRoute> searchArrivalTimeByKeyword(@RequestParam String keyword){
		return trainRouteService.searchArrivalTimeByKeyword(keyword);
	}
	
	@GetMapping("searchDepartureTimeByKeyword")
	public List<TrainRoute> searchDepartureTimeByKeyword(@RequestParam String keyword){
		return trainRouteService.searchDepartureTimeByKeyword(keyword);
	}
	
	@GetMapping("searchFromStationByKeyword")
	public List<TrainRoute> searchFromStationByKeyword(@RequestParam String keyword){
		return trainRouteService.searchFromStationByKeyword(keyword);
	}
	
	@GetMapping("searchToStationByKeyword")
	public List<TrainRoute> searchToStationByKeyword(@RequestParam String keyword){
		return trainRouteService.searchToStationByKeyword(keyword);
	}
	
	@PostMapping("addRoute")
	public String addRoute(@RequestBody TrainRoute trainRoute) {
		return trainRouteService.addRoute(trainRoute);
	
	}
	
	@GetMapping("getAllTrainsRoutes")
	public List<TrainRoute> getAlltrainsRoutes(){
		return trainRouteService.getAllTrainsRoutes();
	}
	
	@PutMapping("updateTrainRoute")
	public String updateTrainRoute(@RequestBody TrainRoute trainRoute) {
		return trainRouteService.updateTrainRoute(trainRoute);
	}
	
	@DeleteMapping("deleteTrainRoute/{routeID}")
	public String deleteTrainRoute(@PathVariable long routeID) {
		return trainRouteService.deleteTrainRoute(routeID);
	}
}

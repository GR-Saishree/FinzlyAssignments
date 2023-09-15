package com.finzly.railnirvaha.controller;


// import statements
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.railnirvaha.entity.Station;
import com.finzly.railnirvaha.service.StationService;

@RestController
public class StationController {

	@Autowired
	StationService stationService;
	
	// API to add station details
	@PostMapping("addStation")
	public String addStation(@RequestBody Station station ) {
		return stationService.addStation(station);
		
	}
	
	// API to fetch all stations details
	@GetMapping("getAllStations")
	public List<Station> getAllStations(){
		return stationService.getAllStations();
	}
	
	// API to fetch station by ID
	@GetMapping("getStationByID/{stationID}")
	public List<Station> getStationByID(@PathVariable long stationID){
		return stationService.getStationByID(stationID);
	}
	
	// API to fetch station by name
	@GetMapping("getStationByName/{stationName}")
	public List<Station> getStationByName(@PathVariable String stationName){
		return stationService.getStationByName(stationName);
	}
	
	// API to fetch station by city
	@GetMapping("getStationByCity/{city}")
	public List<Station> getStationByCity(@PathVariable String city){
		return stationService.getStationByCity(city);
	}
	
	// API to fetch station by region
	@GetMapping("getStationByRegion/{region}")
	public List<Station> getStationByRegion(@PathVariable String region){
		return stationService.getStationByRegion(region);
	}
	
	// API to fetch station by country
	@GetMapping("getStationByCountry/{country}")
	public List<Station> getStationByCountry(@PathVariable String country){
		return stationService.getStationByCountry(country);
	}
	
	// API to fetch station by specified platform count
	@GetMapping("getStationByPlatformCount/{platformCount}")
	public List<Station> getStationByPlatformCount(@PathVariable String platformCount){
		return stationService.getStationByPlatformCount(platformCount);
	}
	
	// API to fetch station by specified number of tracks in station
	@GetMapping("getStationByNumberOfTracks/{numberofTracks}")
	public List<Station> getStationByNumberOfTracks(@PathVariable String numberofTracks){
		return stationService.getStationByNumberOfTracks(numberofTracks);
	}
	
	// API to fetch emergency contact by ID
	@GetMapping("getEmergencyContact/{stationID}")
	public String getEmergencyContact(@PathVariable int stationID){
		return stationService.getEmergencyContact(stationID);
		
	}
	
	// API to fetch station by operating hours
	@GetMapping("getStationByOperatingHours")
	public List<Station> getStationByOperatingHours(@PathVariable String operatingHours){
		return stationService.getStationByOperatingHours(operatingHours);
	}
	
	// API to update station details
	@PutMapping("updateStation")
	public String updateStation(@RequestBody Station station) {
		return stationService.updateStation(station);
	}
	
	// API to delete station details by ID
	@DeleteMapping("deleteStation/{stationID}")
	public String deleteStation(@PathVariable long stationID) {
		return stationService.deleteStation(stationID);
	}
	
	// API to fetch station with 20/6 availability
	@GetMapping("getStationWith20X6Availability")
	public List<Station> getStationWith20X6Availability(){
		return stationService.getStationWith20X6Availability();
	}
	
	// API to fetch station with 20/5 availability
	@GetMapping("getStationWith20X5Availability")
	public List<Station> getStationWith20X5Availability(){
		return stationService.getStationWith20X5Availability();
	}
	
	// API to fetch station with 24/7 availability
	@GetMapping("getStationWith24X7Availability")
	public List<Station> getStationWith24X7Availability(){
		return stationService.getStationWith24X7Availability();
	}
	
	// API to fetch station with 16/7 availability
	@GetMapping("getStationWith16X7Availability")
	public List<Station> getStationWith16X7Availability(){
		return stationService.getStationWith16X7Availability();
	}
	
	// API to fetch station with platform count greater than 10
	@GetMapping("getStationWithPlatformCountGT10")
	public List<Station> getStationWithPlatformCountGT10(){
		return stationService.getStationWithPlatformCountGT10();
	}
	
	// API to fetch station region with platform count greater than 10
	@GetMapping("getRegionWithPlatformCountGT10")
	public List<Station> getRegionWithPlatformCountGT10(){
		return stationService.getRegionWithPlatformCountGT10();
	}
	
	// API to fetch station with tracks count greater than and equal to 10
	@GetMapping("getStationTracksWithPlatformCountGE10")
	public List<Station> getStationTracksWithPlatformCountGE10(){
		return stationService.getStationTracksWithPlatformCountGE10();
	}
	
	// API to fetch station with platform count lesser than 10
	@GetMapping("getStationWithPlatformCountLT10")
	public List<Station> getStationWithPlatformCountLT10(){
		return stationService.getStationWithPlatformCountLT10();
	}
	
	// API to fetch station region with platform count lesser than 10
	@GetMapping("getRegionWithPlatformCountLT10")
	public List<Station> getRegionWithPlatformCountLT10(){
		return stationService.getRegionWithPlatformCountLT10();
	}
	
	// API to fetch station with tracks count lesser than and equal to 10
	@GetMapping("getStationTracksWithPlatformCountLE10")
	public List<Station> getStationTracksWithPlatformCountLE10(){
		return stationService.getStationTracksWithPlatformCountLE10();
	}
	
	// API to fetch station and region with country 
	@GetMapping("getStationAndRegionWithCountry/{country}")
	public List<Station> getStationAndRegionWithCountry(@PathVariable String country) {
		return stationService.getStationAndRegionWithCountry(country);
	}
	
	// API to fetch station details by city
	@GetMapping("getStationDetailsByCity/{city}")
	public List<Station> getStationDetailsByCity(@PathVariable String city){
		return stationService.getStationDetailsByCity(city);
	}
	
	// API to fetch station details by region
	@GetMapping("getStationDetailsByRegion/{region}")
	public List<Station> getStationDetailsByRegion(@PathVariable String region){
		return stationService.getStationDetailsByRegion(region);
	}
	
	// API to fetch station details by country
	@GetMapping("getStationDetailsByCountry/{country}")
	public List<Station> getStationDetailsByCountry(@PathVariable String country){
		return stationService.getStationDetailsByCountry(country);
	}
	
	// API to fetch station with platform count range 5 to 15
	@GetMapping("getStationWithPlatformRange5To15")
	public List<Station> getStationWithPlatformRange5To15(){
		return stationService.getStationWithPlatformRange5To15();
	}
	
	// API to fetch station with tracks count range 5 to 10
	@GetMapping("getStationWithTracksRange5To10")
	public List<Station> getStationWithTracksRange5To10(){
		return stationService.getStationWithTracksRange5To10();
	}
	
	// API to fetch station with platform count range 1 to 15
	@GetMapping("getStationWithPlatformRange1To15")
	public List<Station> getStationWithPlatformRange1To15(){
		return stationService.getStationWithPlatformRange1To15();
	}
	
	// API to fetch station with tracks count range 1 to 5
	@GetMapping("getStationWithTracksRange1To5")
	public List<Station> getStationWithTracksRange1To5(){
		return stationService.getStationWithTracksRange1To5();
	}
	
	// API to fetch station with tracks count range 1 to 25
	@GetMapping("getStationWithTracksRange1To25")
	public List<Station> getStationWithTracksRange1To25(){
		return stationService.getStationWithTracksRange1To25();
	}
	
	
	
}

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

import com.finzly.railnirvaha.entity.TicketPricing;
import com.finzly.railnirvaha.entity.TrainRoute;
import com.finzly.railnirvaha.service.TicketPricingService;

@RestController
public class TicketPricingController {

	@Autowired
	TicketPricingService ticketPricingService;
	
	@GetMapping("AllGeneralPrice/{pricingID}")
	public List<TicketPricing> getAllGeneralPrice(@PathVariable long pricingID) {
		return ticketPricingService.getAllGeneralPrice(pricingID);
	}
	
	@GetMapping("AllHandicappedPrice/{pricingID}")
	public List<TicketPricing> getAllHandicappedPrice(@PathVariable long pricingID) {
		return ticketPricingService.getAllHandicappedPrice(pricingID);
	}
	
	@GetMapping("AllSeniorCitizenPrice/{pricingID}")
	public List<TicketPricing> getAllSeniorCitizenPrice(@PathVariable long pricingID) {
		return ticketPricingService.getAllSeniorCitizenPrice(pricingID);
	}
	
	@GetMapping("AllTatkalPrice/{pricingID}")
	public List<TicketPricing> getTatkalPrice(@PathVariable long pricingID) {
		return ticketPricingService.getAllTatkalPrice(pricingID);
	}
	
	@GetMapping("All1APrice/{pricingID}")
	public List<TicketPricing> getAll1APrice(@PathVariable long pricingID) {
		return ticketPricingService.getAll1APrice(pricingID);
	}
	
	@GetMapping("All2APrice/{pricingID}")
	public List<TicketPricing> getAll2APrice(@PathVariable long pricingID) {
		return ticketPricingService.getAll2APrice(pricingID);
	}
	
	@GetMapping("All3APrice/{pricingID}")
	public List<TicketPricing> getAll3APrice(@PathVariable long pricingID) {
		return ticketPricingService.getAll3APrice(pricingID);
	}
	
	@GetMapping("AllSLPrice/{pricingID}")
	public List<TicketPricing> getSLPrice(@PathVariable long pricingID) {
		return ticketPricingService.getAllSLPrice(pricingID);
	}
	
	@GetMapping("AllGeneralTatkalPrice/{pricingID}")
	public List<TicketPricing> getAllGeneralTatkalPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllGeneralTatkalPrice(pricingID);
	}
	
	@GetMapping("AllGeneralHandicappedPrice/{pricingID}")
	public List<TicketPricing> AllGeneralHandicappedPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllGeneralHandicappedPrice(pricingID);
	}
	
	@GetMapping("AllGeneralSeniorCitizenPrice/{pricingID}")
	public List<TicketPricing> AllGeneralSeniorCitizenPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllGeneralSeniorCitizenPrice(pricingID);
	}
	
	
	@GetMapping("AllHandicappedSeniorCitizenPrice/{pricingID}")
	public List<TicketPricing> AllHandicappedSeniorCitizenPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllHandicappedSeniorCitizenPrice(pricingID);
	}
	
	@GetMapping("AllTatkalHandicappedPrice/{pricingID}")
	public List<TicketPricing> AllTatkalHandicappedPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllTatkalHandicappedPrice(pricingID);
	}
	
	@GetMapping("AllTatkalSeniorCitizenPrice/{pricingID}")
	public List<TicketPricing> AllTatkalSeniorCitizenPrice(@PathVariable long pricingID) {
		return ticketPricingService.AllTatkalSeniorCitizenPrice(pricingID);
	}
	
	@PostMapping("addTicketPrice")
	public String addTicketPrice(@RequestBody TicketPricing ticketPrice) {
		return ticketPricingService.addTicketPrice(ticketPrice);
	
	}
	
	@GetMapping("getAllTicketPrices")
	public List<TrainRoute> getAllticketPrices(){
		return ticketPricingService.getAllTicketPrices();
	}
	
	@PutMapping("updateTicketPrice")
	public String updateTicketPrice(@RequestBody TicketPricing ticketPrice) {
		return ticketPricingService.updateTicketPrice(ticketPrice);
	}
	
	@DeleteMapping("deleteTicketPrice/{pricingID}")
	public String deleteTicketPrice(@PathVariable long pricingID) {
		return ticketPricingService.deleteTicketPrice(pricingID);
	}
	
	@GetMapping("getGeneral1APrice/{pricingID}")
	public List<TicketPricing> getGeneral1APrice(long pricingID){
		return ticketPricingService.getGeneral1APrice(pricingID);
	}
	
	@GetMapping("getGeneral2APrice/{pricingID}")
	public List<TicketPricing> getGeneral2APrice(long pricingID){
		return ticketPricingService.getGeneral2APrice(pricingID);
	}
	
	@GetMapping("getGeneral3APrice/{pricingID}")
	public List<TicketPricing> getGeneral3APrice(long pricingID){
		return ticketPricingService.getGeneral3APrice(pricingID);
	}
	
	@GetMapping("getGeneralSLPrice/{pricingID}")
	public List<TicketPricing> getGeneralSLPrice(long pricingID){
		return ticketPricingService.getGeneralSLPrice(pricingID);
	}
	
	@GetMapping("getHandicapped1APrice/{pricingID}")
	public List<TicketPricing> getHandicapped1APrice(@PathVariable long pricingID) {
		return ticketPricingService.getHandicapped1APrice(pricingID);
	}
	
	@GetMapping("getHandicapped2APrice/{pricingID}")
	public List<TicketPricing> getHandicapped2APrice(@PathVariable long pricingID) {
		return ticketPricingService.getHandicapped2APrice(pricingID);
	}
	@GetMapping("getHandicapped3APrice/{pricingID}")
	public List<TicketPricing> getHandicapped3APrice(@PathVariable long pricingID) {
		return ticketPricingService.getHandicapped3APrice(pricingID);
	}
	@GetMapping("getHandicappedSLPrice/{pricingID}")
	public List<TicketPricing> getHandicappedSLPrice(@PathVariable long pricingID) {
		return ticketPricingService.getHandicappedSLPrice(pricingID);
	}
	
	@GetMapping("getTatkal1APrice/{pricingID}")
	public List<TicketPricing> getTatkal1APrice(long pricingID){
		return ticketPricingService.getTatkal1APrice(pricingID);
	}
	
	@GetMapping("getTatkal2APrice/{pricingID}")
	public List<TicketPricing> getTatkal2APrice(long pricingID){
		return ticketPricingService.getTatkal2APrice(pricingID);
	}
	
	@GetMapping("getTatkal3APrice/{pricingID}")
	public List<TicketPricing> getTatkal3APrice(long pricingID){
		return ticketPricingService.getTatkal3APrice(pricingID);
	}
	
	@GetMapping("getTatkalSLPrice/{pricingID}")
	public List<TicketPricing> getTatkalSLPrice(long pricingID){
		return ticketPricingService.getTatkalSLPrice(pricingID);
	}
	
}

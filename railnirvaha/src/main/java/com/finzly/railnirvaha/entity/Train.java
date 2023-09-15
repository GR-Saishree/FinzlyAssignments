package com.finzly.railnirvaha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Train {

	@Id
	private int trainNumber;
	private String trainName;
	private String departureStation;
	private String arrivalStation;
	private String depatureTime;
	private String arrivalTime;
	private String trainType;
	private int general1A;
	private int general2A;
	private int general3A;
	private int generalSL;
	private int tatkal1A;
	private int tatkal2A;
	private int tatkal3A;
	private int tatkalSL;
	private int seniorcitizen1A;
	private int seniorcitizen2A;
	private int seniorcitizen3A;
	private int seniorcitizenSL;
	private int handicapped1A;
	private int handicapped2A;
	private int handicapped3A;
	private int handicappedSL;
	private int generalTotalSeats;
	private int tatkalTotalSeats;
	private int seniorcitizenTotalSeats;
	private int handicappedTotalSeats;
	private int totalSeats;
	
	
	
	
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getDepartureStation() {
		return departureStation;
	}
	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	public String getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public int getGeneral1A() {
		return general1A;
	}
	public void setGeneral1A(int general1a) {
		general1A = general1a;
	}
	public int getGeneral2A() {
		return general2A;
	}
	public void setGeneral2A(int general2a) {
		general2A = general2a;
	}
	public int getGeneral3A() {
		return general3A;
	}
	public void setGeneral3A(int general3a) {
		general3A = general3a;
	}
	public int getGeneralSL() {
		return generalSL;
	}
	public void setGeneralSL(int generalSL) {
		this.generalSL = generalSL;
	}
	public int getTatkal1A() {
		return tatkal1A;
	}
	public void setTatkal1A(int tatkal1a) {
		tatkal1A = tatkal1a;
	}
	public int getTatkal2A() {
		return tatkal2A;
	}
	public void setTatkal2A(int tatkal2a) {
		tatkal2A = tatkal2a;
	}
	public int getTatkal3A() {
		return tatkal3A;
	}
	public void setTatkal3A(int tatkal3a) {
		tatkal3A = tatkal3a;
	}
	public int getTatkalSL() {
		return tatkalSL;
	}
	public void setTatkalSL(int tatkalSL) {
		this.tatkalSL = tatkalSL;
	}
	public int getSeniorcitizen1A() {
		return seniorcitizen1A;
	}
	public void setSeniorcitizen1A(int seniorcitizen1a) {
		seniorcitizen1A = seniorcitizen1a;
	}
	public int getSeniorcitizen2A() {
		return seniorcitizen2A;
	}
	public void setSeniorcitizen2A(int seniorcitizen2a) {
		seniorcitizen2A = seniorcitizen2a;
	}
	public int getSeniorcitizen3A() {
		return seniorcitizen3A;
	}
	public void setSeniorcitizen3A(int seniorcitizen3a) {
		seniorcitizen3A = seniorcitizen3a;
	}
	public int getSeniorcitizenSL() {
		return seniorcitizenSL;
	}
	public void setSeniorcitizenSL(int seniorcitizenSL) {
		this.seniorcitizenSL = seniorcitizenSL;
	}
	public int getHandicapped1A() {
		return handicapped1A;
	}
	public void setHandicapped1A(int handicapped1a) {
		handicapped1A = handicapped1a;
	}
	public int getHandicapped2A() {
		return handicapped2A;
	}
	public void setHandicapped2A(int handicapped2a) {
		handicapped2A = handicapped2a;
	}
	public int getHandicapped3A() {
		return handicapped3A;
	}
	public void setHandicapped3A(int handicapped3a) {
		handicapped3A = handicapped3a;
	}
	public int getHandicappedSL() {
		return handicappedSL;
	}
	public void setHandicappedSL(int handicappedSL) {
		this.handicappedSL = handicappedSL;
	}
	public int getGeneralTotalSeats() {
		return generalTotalSeats;
	}
	public void setGeneralTotalSeats(int generalTotalSeats) {
		this.generalTotalSeats = generalTotalSeats;
	}
	public int getTatkalTotalSeats() {
		return tatkalTotalSeats;
	}
	public void setTatkalTotalSeats(int tatkalTotalSeats) {
		this.tatkalTotalSeats = tatkalTotalSeats;
	}
	public int getSeniorcitizenTotalSeats() {
		return seniorcitizenTotalSeats;
	}
	public void setSeniorcitizenTotalSeats(int seniorcitizenTotalSeats) {
		this.seniorcitizenTotalSeats = seniorcitizenTotalSeats;
	}
	public int getHandicappedTotalSeats() {
		return handicappedTotalSeats;
	}
	public void setHandicappedTotalSeats(int handicappedTotalSeats) {
		this.handicappedTotalSeats = handicappedTotalSeats;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	
	
}

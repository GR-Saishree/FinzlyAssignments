package com.finzly.railnirvaha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketPricing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pricingID;
	private long trainRouteID;
	private double general1APrice;
	private double general2APrice;
	private double general3APrice;
	private double generalSLPrice;
	private double tatkal1APrice;
	private double tatkal2APrice;
	private double tatkal3APrice;
	private double tatkalSLPrice;
	private double seniorcitizen1APrice;
	private double seniorcitizen2APrice;
	private double seniorcitizen3APrice;
	private double seniorcitizenSLPrice;
	private double handicapped1APrice;
	private double handicapped2APrice;
	private double handicapped3APrice;
	private double handicappedSLPrice;
	
	public long getPricingID() {
		return pricingID;
	}
	public void setPricingID(long pricingID) {
		this.pricingID = pricingID;
	}
	public long getTrainRouteID() {
		return trainRouteID;
	}
	public void setTrainRouteID(long trainRouteID) {
		this.trainRouteID = trainRouteID;
	}
	public double getGeneral1APrice() {
		return general1APrice;
	}
	public void setGeneral1APrice(double general1aPrice) {
		general1APrice = general1aPrice;
	}
	public double getGeneral2APrice() {
		return general2APrice;
	}
	public void setGeneral2APrice(double general2aPrice) {
		general2APrice = general2aPrice;
	}
	public double getGeneral3APrice() {
		return general3APrice;
	}
	public void setGeneral3APrice(double general3aPrice) {
		general3APrice = general3aPrice;
	}
	public double getGeneralSLPrice() {
		return generalSLPrice;
	}
	public void setGeneralSLPrice(double generalSLPrice) {
		this.generalSLPrice = generalSLPrice;
	}
	public double getTatkal1APrice() {
		return tatkal1APrice;
	}
	public void setTatkal1APrice(double tatkal1aPrice) {
		tatkal1APrice = tatkal1aPrice;
	}
	public double getTatkal2APrice() {
		return tatkal2APrice;
	}
	public void setTatkal2APrice(double tatkal2aPrice) {
		tatkal2APrice = tatkal2aPrice;
	}
	public double getTatkal3APrice() {
		return tatkal3APrice;
	}
	public void setTatkal3APrice(double tatkal3aPrice) {
		tatkal3APrice = tatkal3aPrice;
	}
	public double getTatkalSLPrice() {
		return tatkalSLPrice;
	}
	public void setTatkalSLPrice(double tatkalSLPrice) {
		this.tatkalSLPrice = tatkalSLPrice;
	}
	public double getSeniorcitizen1APrice() {
		return seniorcitizen1APrice;
	}
	public void setSeniorcitizen1APrice(double seniorcitizen1aPrice) {
		seniorcitizen1APrice = seniorcitizen1aPrice;
	}
	public double getSeniorcitizen2APrice() {
		return seniorcitizen2APrice;
	}
	public void setSeniorcitizen2APrice(double seniorcitizen2aPrice) {
		seniorcitizen2APrice = seniorcitizen2aPrice;
	}
	public double getSeniorcitizen3APrice() {
		return seniorcitizen3APrice;
	}
	public void setSeniorcitizen3APrice(double seniorcitizen3aPrice) {
		seniorcitizen3APrice = seniorcitizen3aPrice;
	}
	public double getSeniorcitizenSLPrice() {
		return seniorcitizenSLPrice;
	}
	public void setSeniorcitizenSLPrice(double seniorcitizenSLPrice) {
		this.seniorcitizenSLPrice = seniorcitizenSLPrice;
	}
	public double getHandicapped1APrice() {
		return handicapped1APrice;
	}
	public void setHandicapped1APrice(double handicapped1aPrice) {
		handicapped1APrice = handicapped1aPrice;
	}
	public double getHandicapped2APrice() {
		return handicapped2APrice;
	}
	public void setHandicapped2APrice(double handicapped2aPrice) {
		handicapped2APrice = handicapped2aPrice;
	}
	public double getHandicapped3APrice() {
		return handicapped3APrice;
	}
	public void setHandicapped3APrice(double handicapped3aPrice) {
		handicapped3APrice = handicapped3aPrice;
	}
	public double getHandicappedSLPrice() {
		return handicappedSLPrice;
	}
	public void setHandicappedSLPrice(double handicappedSLPrice) {
		this.handicappedSLPrice = handicappedSLPrice;
	}
	
	

}

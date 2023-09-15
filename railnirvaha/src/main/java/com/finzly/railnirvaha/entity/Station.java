package com.finzly.railnirvaha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stationID;
	private String stationName;
	private String city;
	private String region;
	private String country;
	private int platformCount;
	private int numberofTracks;
	private String emergencyContact;
	private String operatingHours;
	
	
	public long getStationID() {
		return stationID;
	}
	public void setStationID(long stationID) {
		this.stationID = stationID;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPlatformCount() {
		return platformCount;
	}
	public void setPlatformCount(int platformCount) {
		this.platformCount = platformCount;
	}
	public int getNumberofTracks() {
		return numberofTracks;
	}
	public void setNumberofTracks(int numberofTracks) {
		this.numberofTracks = numberofTracks;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}
	

	
	
}

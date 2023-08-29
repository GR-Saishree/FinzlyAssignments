package com.finzly.collection.assignment;

public class City {

	private String cityName;
	private String famousFor;
	
	@Override
	public String toString() {
		return "City : cityName=" + cityName + ", famousFor=" + famousFor + "";
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public City() {
		
	}
	
	public City(String cityName,String famousFor) {
		setCityName(cityName);
		setFamousFor(famousFor);
		
	}
}

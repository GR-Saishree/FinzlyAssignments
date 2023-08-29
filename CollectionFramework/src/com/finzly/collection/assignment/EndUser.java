package com.finzly.collection.assignment;

import java.util.HashSet;
import java.util.HashMap;


public class EndUser {

	public static void main(String[] args) {
		District district=new District();
		HashMap<String, HashMap<String, HashMap<String, HashSet<City>>>> countryData = district.operations();

        for (String countryKey : countryData.keySet()) {
            HashMap<String, HashMap<String, HashSet<City>>> statesData = countryData.get(countryKey);
            System.out.println("Country: " + countryKey);

            for (String stateKey : statesData.keySet()) {
                HashMap<String, HashSet<City>> districtData = statesData.get(stateKey);
                System.out.println("State: " + stateKey);

                for (String districtKey : districtData.keySet()) {
                    HashSet<City> cityList = districtData.get(districtKey);
                    System.out.println("District: " + districtKey);

                    for (City city : cityList) {
                        System.out.println(city);
                    }
                }
            }
        }
		
	
		
	}
}

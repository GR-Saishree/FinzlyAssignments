package com.finzly.collection.assignment;

import java.util.HashSet;
import java.util.HashMap;

public class District {

	HashMap<String,HashMap<String,HashMap<String,HashSet<City>>>> operations() {
		
		City tc1=new City("Chennai","IT industry");
		City tc2=new City("Madurai","Cultural heritage");
		City tc3=new City("Kanchipuram","Temples and silk sarees");
		City tc4=new City("Vadipatti","Music culture");
		City tc5=new City("Sriperumbudur","Techno-industrial");
		
		HashSet<City> chennai=new HashSet<>();
		chennai.add(tc1);
		
		
		HashSet<City> madurai=new HashSet<>();
		madurai.add(tc2);
		madurai.add(tc4);
		
		HashSet<City> kanchipuram=new HashSet<>();
		kanchipuram.add(tc3);
		kanchipuram.add(tc5);
		
		HashMap<String,HashSet<City>> tnDistrict=new HashMap<>();
		tnDistrict.put("Chennai", chennai);
		tnDistrict.put("Madurai", madurai);
		tnDistrict.put("Kanchipuram", kanchipuram);
		
		
		
		
		City tec1=new City("Secunderabad","Jewelry");
		City tec2=new City("Peddapally","Sabitham waterfalls");
		City tec3=new City("Warangal","Warangal Fort");
		City tec4=new City("Chandur","Jaggery");
		City tec5=new City("Vadapally","Venkateswara swamy Temple");
		
		HashSet<City> hyderabad=new HashSet<>();
		hyderabad.add(tec1);
		hyderabad.add(tec2);
		
		HashSet<City> warangal=new HashSet<>();
		warangal.add(tec3);
		
		HashSet<City> nalgonda=new HashSet<>();
		nalgonda.add(tec4);
		nalgonda.add(tec5);
		
		HashMap<String,HashSet<City>> teDistrict=new HashMap<>();
		teDistrict.put("Hyderabad",hyderabad);
		teDistrict.put("Warangal",warangal);
		teDistrict.put("Nalgonda", nalgonda);
		
		
		
		
		
		City mc1=new City("Bhor","tourist destination");
		City mc2=new City("Pimpri-Chinchwad","Industrial township");
		City mc3=new City("Thane","Tourist destination");
		City mc4=new City("Barshi","Bhagwat mandir");
		City mc5=new City("Pandharpur","Lord Vitthala temple");
		
		HashSet<City> pune=new HashSet<>();
		pune.add(mc1);
		pune.add(mc2);
		
		HashSet<City> thane=new HashSet<>();
		thane.add(mc3);
		
		HashSet<City> solapur=new HashSet<>();
		solapur.add(mc4);
		solapur.add(mc5);
		
		HashMap<String,HashSet<City>> mhDistrict=new HashMap<>();
		mhDistrict.put("Pune",pune);
		mhDistrict.put("Thane",thane);
		mhDistrict.put("Solapur", solapur);
		
		HashMap<String,HashMap<String,HashSet<City>>> states=new HashMap<>();
		states.put("Maharashtra", mhDistrict);
		states.put("Telangana", teDistrict);
		states.put("TamilNadu", tnDistrict);
		
		HashMap<String,HashMap<String,HashMap<String,HashSet<City>>>> country=new HashMap<>();
		country.put("INDIA",states);
		
		return country;
		
		
		
		
		
	}
}

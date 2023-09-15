package com.finzly.railnirvaha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.railnirvaha.dao.TicketPricingDao;
import com.finzly.railnirvaha.entity.TicketPricing;
import com.finzly.railnirvaha.entity.TrainRoute;

@Service
public class TicketPricingService {

	@Autowired
	TicketPricingDao ticketPricingDao;

	public List<TicketPricing> getAllGeneralPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllGeneralPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral1APrice = ticketPricing.getGeneral1APrice();
			double getGeneral2APrice = ticketPricing.getGeneral2APrice();
			double getGeneral3APrice = ticketPricing.getGeneral3APrice();
			double getGeneralSLPrice = ticketPricing.getGeneralSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setGeneral1APrice(getGeneral1APrice);
			ticketsPricing.setGeneral2APrice(getGeneral2APrice);
			ticketsPricing.setGeneral3APrice(getGeneral3APrice);
			ticketsPricing.setGeneralSLPrice(getGeneralSLPrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAllHandicappedPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllHandicappedPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getHandicapped1APrice = ticketPricing.getHandicapped1APrice();
			double getHandicapped2APrice = ticketPricing.getHandicapped2APrice();
			double getHandicapped3APrice = ticketPricing.getHandicapped3APrice();
			double getHandicappedSLPrice = ticketPricing.getHandicappedSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setHandicapped1APrice(getHandicapped1APrice);
			ticketsPricing.setHandicapped2APrice(getHandicapped2APrice);
			ticketsPricing.setHandicapped3APrice(getHandicapped3APrice);
			ticketsPricing.setHandicappedSLPrice(getHandicappedSLPrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAllSeniorCitizenPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllSeniorCitizenPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getSeniorCitizen1APrice = ticketPricing.getSeniorcitizen1APrice();
			double getSeniorCitizen2APrice = ticketPricing.getSeniorcitizen2APrice();
			double getSeniorCitizen3APrice = ticketPricing.getSeniorcitizen3APrice();
			double getSeniorCitizenSLPrice = ticketPricing.getSeniorcitizenSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setHandicapped1APrice(getSeniorCitizen1APrice);
			ticketsPricing.setHandicapped2APrice(getSeniorCitizen2APrice);
			ticketsPricing.setHandicapped3APrice(getSeniorCitizen3APrice);
			ticketsPricing.setHandicappedSLPrice(getSeniorCitizenSLPrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAllTatkalPrice(long pricingID) {
		
		List<TicketPricing> list = ticketPricingDao.getAllTatkalPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getTatkal1APrice = ticketPricing.getTatkal1APrice();
			double getTatkal2APrice = ticketPricing.getTatkal2APrice();
			double getTatkal3APrice = ticketPricing.getTatkal3APrice();
			double getTatkalSLPrice = ticketPricing.getTatkalSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setTatkal1APrice(getTatkal1APrice);
			ticketsPricing.setTatkal2APrice(getTatkal2APrice);
			ticketsPricing.setTatkal3APrice(getTatkal3APrice);
			ticketsPricing.setTatkalSLPrice(getTatkalSLPrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAll1APrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAll1APrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral1APrice = ticketPricing.getGeneral1APrice();
			double getTatkal1APrice = ticketPricing.getTatkal1APrice();
			double getHandicapped1APrice = ticketPricing.getHandicapped1APrice();
			double getSeniorCitizen1APrice = ticketPricing.getSeniorcitizen1APrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setGeneral1APrice(getGeneral1APrice);
			ticketsPricing.setTatkal1APrice(getTatkal1APrice);
			ticketsPricing.setHandicapped1APrice(getHandicapped1APrice);
			ticketsPricing.setSeniorcitizen1APrice(getSeniorCitizen1APrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAll2APrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAll2APrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral2APrice = ticketPricing.getGeneral2APrice();
			double getTatkal2APrice = ticketPricing.getTatkal2APrice();
			double getHandicapped2APrice = ticketPricing.getHandicapped2APrice();
			double getSeniorCitizen2APrice = ticketPricing.getSeniorcitizen2APrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setGeneral2APrice(getGeneral2APrice);
			ticketsPricing.setTatkal2APrice(getTatkal2APrice);
			ticketsPricing.setHandicapped2APrice(getHandicapped2APrice);
			ticketsPricing.setSeniorcitizen2APrice(getSeniorCitizen2APrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAll3APrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAll3APrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral3APrice = ticketPricing.getGeneral3APrice();
			double getTatkal3APrice = ticketPricing.getTatkal3APrice();
			double getHandicapped3APrice = ticketPricing.getHandicapped3APrice();
			double getSeniorCitizen3APrice = ticketPricing.getSeniorcitizen3APrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setGeneral3APrice(getGeneral3APrice);
			ticketsPricing.setTatkal3APrice(getTatkal3APrice);
			ticketsPricing.setHandicapped3APrice(getHandicapped3APrice);
			ticketsPricing.setSeniorcitizen3APrice(getSeniorCitizen3APrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> getAllSLPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllSLPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneralSLPrice = ticketPricing.getGeneralSLPrice();
			double getTatkalSLPrice = ticketPricing.getTatkalSLPrice();
			double getHandicappedSLPrice = ticketPricing.getHandicappedSLPrice();
			double getSeniorCitizenSLPrice = ticketPricing.getSeniorcitizenSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setGeneralSLPrice(getGeneralSLPrice);
			ticketsPricing.setTatkalSLPrice(getTatkalSLPrice);
			ticketsPricing.setHandicappedSLPrice(getHandicappedSLPrice);
			ticketsPricing.setSeniorcitizenSLPrice(getSeniorCitizenSLPrice);

			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> AllGeneralTatkalPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllGeneralTatkalPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral1APrice = ticketPricing.getGeneral1APrice();
			double getGeneral2APrice = ticketPricing.getGeneral2APrice();
			double getGeneral3APrice = ticketPricing.getGeneral3APrice();
			double getGeneralSLPrice = ticketPricing.getGeneralSLPrice();
			double getTatkal1APrice = ticketPricing.getTatkal1APrice();
			double getTatkal2APrice = ticketPricing.getTatkal2APrice();
			double getTatkal3APrice = ticketPricing.getTatkal3APrice();
			double getTatkalSLPrice = ticketPricing.getTatkalSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setTatkal1APrice(getTatkal1APrice);
			ticketsPricing.setTatkal2APrice(getTatkal2APrice);
			ticketsPricing.setTatkal3APrice(getTatkal3APrice);
			ticketsPricing.setTatkalSLPrice(getTatkalSLPrice);
			ticketsPricing.setGeneral1APrice(getGeneral1APrice);
			ticketsPricing.setGeneral2APrice(getGeneral2APrice);
			ticketsPricing.setGeneral3APrice(getGeneral3APrice);
			ticketsPricing.setGeneralSLPrice(getGeneralSLPrice);
			
			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> AllGeneralHandicappedPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllGeneralHandicappedPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral1APrice = ticketPricing.getGeneral1APrice();
			double getGeneral2APrice = ticketPricing.getGeneral2APrice();
			double getGeneral3APrice = ticketPricing.getGeneral3APrice();
			double getGeneralSLPrice = ticketPricing.getGeneralSLPrice();
			double getHandicapped1APrice = ticketPricing.getHandicapped1APrice();
			double getHandicapped2APrice = ticketPricing.getHandicapped2APrice();
			double getHandicapped3APrice = ticketPricing.getHandicapped3APrice();
			double getHandicappedSLPrice = ticketPricing.getHandicappedSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setHandicapped1APrice(getHandicapped1APrice);
			ticketsPricing.setHandicapped2APrice(getHandicapped2APrice);
			ticketsPricing.setHandicapped3APrice(getHandicapped3APrice);
			ticketsPricing.setHandicappedSLPrice(getHandicappedSLPrice);
			ticketsPricing.setGeneral1APrice(getGeneral1APrice);
			ticketsPricing.setGeneral2APrice(getGeneral2APrice);
			ticketsPricing.setGeneral3APrice(getGeneral3APrice);
			ticketsPricing.setGeneralSLPrice(getGeneralSLPrice);
			
			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> AllGeneralSeniorCitizenPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllGeneralSeniorCitizenPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getGeneral1APrice = ticketPricing.getGeneral1APrice();
			double getGeneral2APrice = ticketPricing.getGeneral2APrice();
			double getGeneral3APrice = ticketPricing.getGeneral3APrice();
			double getGeneralSLPrice = ticketPricing.getGeneralSLPrice();
			double getSeniorCitizen1APrice = ticketPricing.getSeniorcitizen1APrice();
			double getSeniorCitizen2APrice = ticketPricing.getSeniorcitizen2APrice();
			double getSeniorCitizen3APrice = ticketPricing.getSeniorcitizen3APrice();
			double getSeniorCitizenSLPrice = ticketPricing.getSeniorcitizenSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setSeniorcitizen1APrice(getSeniorCitizen1APrice);
			ticketsPricing.setSeniorcitizen2APrice(getSeniorCitizen2APrice);
			ticketsPricing.setSeniorcitizen3APrice(getSeniorCitizen3APrice);
			ticketsPricing.setSeniorcitizenSLPrice(getSeniorCitizenSLPrice);
			ticketsPricing.setGeneral1APrice(getGeneral1APrice);
			ticketsPricing.setGeneral2APrice(getGeneral2APrice);
			ticketsPricing.setGeneral3APrice(getGeneral3APrice);
			ticketsPricing.setGeneralSLPrice(getGeneralSLPrice);
			al.add(ticketsPricing);
		}
		return al;
		
	}

	public List<TicketPricing> AllHandicappedSeniorCitizenPrice(long pricingID) {
		List<TicketPricing> list = ticketPricingDao.getAllHandicappedSeniorCitizenPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
			double getHandicapped1APrice = ticketPricing.getHandicapped1APrice();
			double getHandicapped2APrice = ticketPricing.getHandicapped2APrice();
			double getHandicapped3APrice = ticketPricing.getHandicapped3APrice();
			double getHandicappedSLPrice = ticketPricing.getHandicappedSLPrice();
			double getSeniorCitizen1APrice = ticketPricing.getSeniorcitizen1APrice();
			double getSeniorCitizen2APrice = ticketPricing.getSeniorcitizen2APrice();
			double getSeniorCitizen3APrice = ticketPricing.getSeniorcitizen3APrice();
			double getSeniorCitizenSLPrice = ticketPricing.getSeniorcitizenSLPrice();
			TicketPricing ticketsPricing = new TicketPricing();
			ticketsPricing.setSeniorcitizen1APrice(getSeniorCitizen1APrice);
			ticketsPricing.setSeniorcitizen2APrice(getSeniorCitizen2APrice);
			ticketsPricing.setSeniorcitizen3APrice(getSeniorCitizen3APrice);
			ticketsPricing.setSeniorcitizenSLPrice(getSeniorCitizenSLPrice);
			ticketsPricing.setHandicapped1APrice(getHandicapped1APrice);
			ticketsPricing.setHandicapped2APrice(getHandicapped2APrice);
			ticketsPricing.setHandicapped3APrice(getHandicapped3APrice);
			ticketsPricing.setHandicappedSLPrice(getHandicappedSLPrice);
			
			al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> AllTatkalHandicappedPrice(long pricingID) {
		
		List<TicketPricing> list = ticketPricingDao.getAllTatkalHandicappedPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
		double getTatkal1APrice = ticketPricing.getTatkal1APrice();
		double getTatkal2APrice = ticketPricing.getTatkal2APrice();
		double getTatkal3APrice = ticketPricing.getTatkal3APrice();
		double getTatkalSLPrice = ticketPricing.getTatkalSLPrice();
		double getHandicapped1APrice = ticketPricing.getHandicapped1APrice();
		double getHandicapped2APrice = ticketPricing.getHandicapped2APrice();
		double getHandicapped3APrice = ticketPricing.getHandicapped3APrice();
		double getHandicappedSLPrice = ticketPricing.getHandicappedSLPrice();
		TicketPricing ticketsPricing = new TicketPricing();
		ticketsPricing.setTatkal1APrice(getTatkal1APrice);
		ticketsPricing.setTatkal2APrice(getTatkal2APrice);
		ticketsPricing.setTatkal3APrice(getTatkal3APrice);
		ticketsPricing.setTatkalSLPrice(getTatkalSLPrice);
		ticketsPricing.setHandicapped1APrice(getHandicapped1APrice);
		ticketsPricing.setHandicapped2APrice(getHandicapped2APrice);
		ticketsPricing.setHandicapped3APrice(getHandicapped3APrice);
		ticketsPricing.setHandicappedSLPrice(getHandicappedSLPrice);
		
		al.add(ticketsPricing);
		}
		return al;
	}

	public List<TicketPricing> AllTatkalSeniorCitizenPrice(long pricingID) {
		
		List<TicketPricing> list = ticketPricingDao.getAllTatkalSeniorCitizenPrice(pricingID);
		List<TicketPricing> al = new ArrayList<>();
		for (TicketPricing ticketPricing : list) {
		double getTatkal1APrice = ticketPricing.getTatkal1APrice();
		double getTatkal2APrice = ticketPricing.getTatkal2APrice();
		double getTatkal3APrice = ticketPricing.getTatkal3APrice();
		double getTatkalSLPrice = ticketPricing.getTatkalSLPrice();
		double getSeniorCitizen1APrice = ticketPricing.getSeniorcitizen1APrice();
		double getSeniorCitizen2APrice = ticketPricing.getSeniorcitizen2APrice();
		double getSeniorCitizen3APrice = ticketPricing.getSeniorcitizen3APrice();
		double getSeniorCitizenSLPrice = ticketPricing.getSeniorcitizenSLPrice();
		TicketPricing ticketsPricing = new TicketPricing();
		ticketsPricing.setSeniorcitizen1APrice(getSeniorCitizen1APrice);
		ticketsPricing.setSeniorcitizen2APrice(getSeniorCitizen2APrice);
		ticketsPricing.setSeniorcitizen3APrice(getSeniorCitizen3APrice);
		ticketsPricing.setSeniorcitizenSLPrice(getSeniorCitizenSLPrice);
		ticketsPricing.setTatkal1APrice(getTatkal1APrice);
		ticketsPricing.setTatkal2APrice(getTatkal2APrice);
		ticketsPricing.setTatkal3APrice(getTatkal3APrice);
		ticketsPricing.setTatkalSLPrice(getTatkalSLPrice);
		
		al.add(ticketsPricing);
		}
		return al;
		
	}

	public String addTicketPrice(TicketPricing ticketPrice) {
		return ticketPricingDao.addTicketPrice(ticketPrice);
		
	}

	public List<TrainRoute> getAllTicketPrices() {
		return ticketPricingDao.getAllTicketPrices();
	}

	public String updateTicketPrice(TicketPricing ticketPrice) {
		return ticketPricingDao.updateTicketPrice(ticketPrice);
	}

	public String deleteTicketPrice(long pricingID) {
		return ticketPricingDao.deleteTicketPrice(pricingID);
	}

	public List<TicketPricing> getGeneral1APrice(long pricingID) {
		return ticketPricingDao.getGeneral1APrice(pricingID);
	}
	
	public List<TicketPricing> getGeneral2APrice(long pricingID) {
		return ticketPricingDao.getGeneral2APrice(pricingID);
	}
	public List<TicketPricing> getGeneral3APrice(long pricingID) {
		return ticketPricingDao.getGeneral3APrice(pricingID);
	}
	public List<TicketPricing> getGeneralSLPrice(long pricingID) {
		return ticketPricingDao.getGeneralSLPrice(pricingID);
	}

	public List<TicketPricing> getHandicapped1APrice(long pricingID) {
		return ticketPricingDao.getHandicapped1APrice(pricingID);
	}

	public List<TicketPricing> getHandicapped2APrice(long pricingID) {
		return ticketPricingDao.getHandicapped2APrice(pricingID);
	}

	public List<TicketPricing> getHandicapped3APrice(long pricingID) {
		return ticketPricingDao.getHandicapped3APrice(pricingID);
	}

	public List<TicketPricing> getHandicappedSLPrice(long pricingID) {
		return ticketPricingDao.getHandicappedSLPrice(pricingID);
	}

	public List<TicketPricing> getTatkal1APrice(long pricingID) {
		return ticketPricingDao.getTatkal1APrice(pricingID);
	}

	public List<TicketPricing> getTatkal2APrice(long pricingID) {
		return ticketPricingDao.getTatkal2APrice(pricingID);
	}

	public List<TicketPricing> getTatkal3APrice(long pricingID) {
		return ticketPricingDao.getTatkal3APrice(pricingID);
	
	}

	public List<TicketPricing> getTatkalSLPrice(long pricingID) {
		return ticketPricingDao.getTatkalSLPrice(pricingID);
	}
	
}


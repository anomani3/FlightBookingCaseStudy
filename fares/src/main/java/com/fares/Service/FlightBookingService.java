package com.fares.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fares.Repository.FareRepository;
import com.fares.entity.FareDetails;

@Service
public class FlightBookingService  {
	@Autowired
	private FareRepository fareRepository;
	String id;
	String fare;
	String fin="0";
	public String getdata(FareDetails f1,String type) {
		
		id=f1.getFid();
		String t1="economyClass";
		String t2="premiumEconomy";
		String t3="businessClass";
		
		if(type.contains(t1)) {
			fare=f1.getEconomyClass();
			this.fin=fare;
			this.fin=t1;
			return fin;
		}
		else
			if(type.contains(t2)) {
				fare=f1.getPremiumEconomy();
				this.fin=fare;
				this.fin=t2;
				return fin;
			}
			else
				if(type.contains(t3)) {
					fare=f1.getBusinessClass();
					this.fin=fare;
					this.fin=t3;
					return fin;
				}
					else
						return "sorry No such mapping found";		
	}
	
	public String fid() {
		return id;
	}
	public String fcl() {
		return fin;
	}
	public String fr() {
		return fare;
	}
	public String deleteFlight(String fid) {
		 fareRepository.deleteById(fid);
		 return "Delete Successfully";
		}

	public List<FareDetails> getAllFlights() {
        return fareRepository.findAll();
	}
	
	/*******************UPDATE******************/

	public void updateFlight(String fid, FareDetails updatedFlight) {
		
		fareRepository.save(updatedFlight);
		
	}

	
	
	}
	


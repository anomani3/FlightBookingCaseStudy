package com.fares.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fares")
public class FareDetails {	
	
@Indexed(unique=true)
@Id
private String fid;
private String economyClass;
private String premiumEconomy;
private String businessClass;
private String flightDate;
private String route;

public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}

public String getEconomyClass() {
	return economyClass;
}
public void setEconomyClass(String economyClass) {
	this.economyClass = economyClass;
}
public String getPremiumEconomy() {
	return premiumEconomy;
}
public void setPremiumEconomy(String premiumEconomy) {
	this.premiumEconomy = premiumEconomy;
}
public String getBusinessClass() {
	return businessClass;
}
public void setBusinessClass(String businessClass) {
	this.businessClass = businessClass;
}
public String getFlightDate() {
	return flightDate;
}
public void setFlightDate(String flightDate) {
	this.flightDate = flightDate;
}
public String getRoute() {
	return route;
}
public void setRoute(String route) {
	this.route = route;
}


public FareDetails(String fid, String economyClass, String premiumEconomy, String businessClass,
		String  flightDate, String route) {
	super();
	this.fid = fid;
	this.economyClass = economyClass;
	this.premiumEconomy = premiumEconomy;
	this.businessClass = businessClass;
	this.flightDate = flightDate;
	this.route = route;
	
}
public FareDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "FareDetails [fid=" + fid + ", economyClass=" + economyClass
			+ ", premiumEconomy=" + premiumEconomy + ", businessClass=" + businessClass + ", flightDate=" + flightDate
			+ ", route=" + route + "]";
}
	
	
	
}

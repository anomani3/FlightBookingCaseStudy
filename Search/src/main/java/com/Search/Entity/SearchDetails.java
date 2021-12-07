package com.Search.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fares")
public class SearchDetails {
	

	private String flightDate;
	private String startPoint;
	private String endPoint;
	private String flightNumber;
	private String economyClass;
	private String premiumEconomy;
	private String businessClass;
	
	public SearchDetails() {
		super();
		
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public SearchDetails(String flightDate, String startPoint, String endPoint, String flightNumber,
			String economyClass, String premiumEconomy, String businessClass) {
		super();
		this.flightDate = flightDate;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.flightNumber = flightNumber;
		this.economyClass = economyClass;
		this.premiumEconomy = premiumEconomy;
		this.businessClass = businessClass;
	}

	@Override
	public String toString() {
		return "SearchDetails [flightDate=" + flightDate + ", startPoint=" + startPoint + ", endPoint=" + endPoint
				+ ", flightNumber=" + flightNumber + ", economyClass=" + economyClass + ", premiumEconomy="
				+ premiumEconomy + ", businessClass=" + businessClass + "]";
	}
	
	
	
}

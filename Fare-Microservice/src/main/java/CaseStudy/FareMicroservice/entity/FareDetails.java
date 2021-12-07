package CaseStudy.FareMicroservice.entity;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fares")
public class FareDetails {
	@Id
	private String fId;

	private String flightNumber;
	private String economyClass;
	private String premiumEconomy;
	private String businessClass;
	private String flightDate;
	private String startPoint;
	private String endPoint;
	
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
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
	public FareDetails(String fId, String flightNumber, String economyClass, String premiumEconomy,
			String businessClass, String flightDate, String startPoint, String endPoint) {
		super();
		this.fId = fId;
		this.flightNumber = flightNumber;
		this.economyClass = economyClass;
		this.premiumEconomy = premiumEconomy;
		this.businessClass = businessClass;
		this.flightDate = flightDate;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public FareDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FareDetails [fId=" + fId + ", flightNumber=" + flightNumber + ", economyClass=" + economyClass
				+ ", premiumEconomy=" + premiumEconomy + ", businessClass=" + businessClass + ", flightDate="
				+ flightDate + ", startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
	}

}

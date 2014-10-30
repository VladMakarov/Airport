package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FlightId")
	@SequenceGenerator(name = "FlightId", sequenceName = "FlightId_Seq", initialValue=1, allocationSize=1)
	private long flightId;
	@ManyToOne
	@JoinColumn(name = "flightTypeId", referencedColumnName = "flightTypeId")
	private FlightType flightType ;
	@ManyToOne
	@JoinColumn(name = "airportId", referencedColumnName = "airportId")
	private Airport airport ;
	private String departure;
	private String arrival;
	private int price;
	private String type;
	
	public Flight() {
		
	}
	
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

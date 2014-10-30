package com.academysmart.jpa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class FlightSpecific {
		
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "flightSpecificId")
	@SequenceGenerator(name = "flightSpecificId", sequenceName = "flightSpecificId_Seq", initialValue=1, allocationSize=1)
	private long flightSpecificId;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "flightTypeId", referencedColumnName = "flightTypeIdId")
    private FlightType flightType;
	private Date date;
	private String departure;
	private String arrival;
    private int price;
	
	public FlightSpecific() {
		
	}
	
	public long getFlightSpecificId(){
		return flightSpecificId;
	}
	
	public void setFlightSpecificId(long flightSpecificId){
		this.flightSpecificId = flightSpecificId;
	}
	
    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
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
	
	@Override
	public String toString() {
		return "Flight Specific: "
				+ "(Flight Specific ID - " + " " + flightSpecificId 
				+ ", Flight Type - " + flightType
				+ ", Date - " + date
				+ ", Departure - " + departure 
				+ ", Arrival - " + arrival 
				+ ", Price - " + price + ");";
	}
}

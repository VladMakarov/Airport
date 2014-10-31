package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


@Entity
@NamedQuery(name = "selectFlightSpecifics", query = "SELECT fs FROM FlightSpecific fs")
public class FlightSpecific {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long flightSpecificId;
    @ManyToOne
    @JoinColumn(name = "flightTypeId", referencedColumnName = "flightTypeId")
    private FlightType flightType;
	private String date;
	@ManyToOne
	@JoinColumn(name = "airportIdDeparture", referencedColumnName = "airportId")
	private Airport departure;
	@ManyToOne
	@JoinColumn(name = "airportIdArrival", referencedColumnName = "airportId")
	private Airport arrival;
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
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date = date;
	}

	public Airport getDeparture() {
		return departure;
	}

	public void setDeparture(Airport departure) {
		this.departure = departure;
	}

	public Airport getArrival() {
		return arrival;
	}

	public void setArrival(Airport arrival) {
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
//				+ "(Flight Specific ID - " + " " + flightSpecificId 
				+ "(FLIGHT TYPE " + flightType
				+ ", DATE - " + date
				+ ", DEPARTURE - " + departure 
			    + ", ARRIVAL - " + arrival 
				+ ", PRICE - " + price + ");";
	}

}

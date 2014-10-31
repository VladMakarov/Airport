package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "selectFlights", query = "SELECT f FROM Flight f")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long flightId;
	@ManyToOne
	@JoinColumn(name = "flightSpecificId", referencedColumnName = "flightSpecificId")
	private FlightSpecific flightSpecific ;
	@ManyToOne
	@JoinColumn(name = "airportId", referencedColumnName = "airportId")
	private Airport airport ;
	
	public Flight() {
		
	}
	
	public long getFlightId(){
		return flightId;
	}
	
	public void setFlightId(long flightId){
		this.flightId = flightId;
	}
	
	public FlightSpecific getFlightSpecific(){
		return flightSpecific;
	}
	
	public void setFlightSpecific(FlightSpecific flightSpecific){
		this.flightSpecific = flightSpecific;
	}
	
	public Airport getAirport(){
		return airport;
	}
	
	public void setSirport(Airport airport){
		this.airport = airport;
	}

	@Override
	public String toString() {
		return "Flight: "
//				+ "(Flight ID - " + " " + flightId  
				+ ", FLIGHT SPECIFIC - " + flightSpecific
				+ ", AIRPORT - " + airport + ");";
	}
}

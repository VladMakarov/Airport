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
				+ "(Flight ID - " + " " + flightId  
				+ ", Flight Specific - " + flightSpecific
				+ ", Airport - " + airport + ");";
	}
}

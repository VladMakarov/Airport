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
@NamedQuery(name = "selectFlights", query = "SELECT f FROM Flight f")
public class Flight {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long flightId;
    @ManyToOne
    @JoinColumn(name = "flightTypeId", referencedColumnName = "flightTypeId")
    private FlightType flightType;
	private String date;
	@OneToOne
	@JoinColumn(name = "airportIdDeparture")
	private Airport departure;
	@OneToOne
	@JoinColumn(name = "airportIdArrival")
	private Airport arrival;
    private double price;
    private String category;
	
	public Flight() {
		
	}
	
	public long getFlightId(){
		return flightId;
	}
	
	public void setFlightId(long flightId){
		this.flightId = flightId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return  "(FLIGHT TYPE " + flightType
				+ ", DATE - " + date
				+ ", DEPARTURE - " + departure 
			    + ", ARRIVAL - " + arrival 
				+ ", PRICE - " + price + ");";
	}

}

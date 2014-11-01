package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "selectFlightTypes", query = "SELECT ft FROM FlightType ft")
public class FlightType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long flightTypeId;
	private String numberOfClass;
	private double price;
	
	public FlightType()	{
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getNumberOfClass() {
		return numberOfClass;
	}

	public void setNumberOfClass(String numberOfClass) {
		this.numberOfClass = numberOfClass;
	}
	
	@Override
	public String toString() {
		return  numberOfClass;
	}

}

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
	private int price;
	
	public FlightType()	{
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getNumberOfClass() {
		return numberOfClass;
	}

	public void setNumberOfClass(String numberOfClass) {
		this.numberOfClass = numberOfClass;
	}

//	public int getFirstClass() {
//		return firstClass;
//	}
//
//	public void setFirstClass(int firstClass) {
//		this.firstClass = firstClass;
//	}
//
//	public int getSecondClass() {
//		return secondClass;
//	}
//	
//	public void setSecondClass(int secondClass) {
//		this.secondClass = secondClass;
//	}
//
//	public int getThirdClass() {
//		return thirdClass;
//	}
//
//	public void setThirdClass(int thirdClass) {
//		this.thirdClass = thirdClass;
//	}
	
	@Override
	public String toString() {
		return "Flight Type: "
//				+ "(Flight Type ID - " + " " + flightTypeId  
				+ "(CLASS - " + numberOfClass
				+ ", PRICE - " + price + ");";
	}

}

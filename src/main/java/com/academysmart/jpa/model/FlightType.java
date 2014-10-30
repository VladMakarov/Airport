package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class FlightType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "flightTypeId")
	@SequenceGenerator(name = "flightTypeId", sequenceName = "flightTypeId_Seq", initialValue=1, allocationSize=1)
	private long flightTypeId;
	private int firstClass;
	private int secondClass;
	private int thirdClass;
	private int seats;
	
	public FlightType()	{
		
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(int firstClass) {
		this.firstClass = firstClass;
	}

	public int getSecondClass() {
		return secondClass;
	}
	
	public void setSecondClass(int secondClass) {
		this.secondClass = secondClass;
	}

	public int getThirdClass() {
		return thirdClass;
	}

	public void setThirdClass(int thirdClass) {
		this.thirdClass = thirdClass;
	}
	
	@Override
	public String toString() {
		return "Flight Type: "
				+ "(Flight Type ID - " + " " + flightTypeId  
				+ ", First Class - " + firstClass
				+ ", Second Class - " + secondClass
				+ ", Third Class - " + thirdClass
				+ ", Seats - " + seats + ");";
	}
}

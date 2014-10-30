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
	private String type;
	private int seats;
	
	public FlightType()	{
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

}

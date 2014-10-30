package com.academysmart.jpa.model;

import javax.persistence.Entity;
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
	@ManyToOne
	@JoinColumn(name = "flightId", referencedColumnName = "flightId")
	private Flight flight ;
	private String date;
	private String race;
	private int freeSeats;
	
	public FlightSpecific() {
		
	}
	
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
	public String getRace(){
		return race;
	}
	public void setRace(String race){
		this.race = race;
	}
	public int getFreeSeats() {
		return freeSeats;
	}
	public void setFreeSeats(int freeSeats) {
		this.freeSeats = freeSeats;
	}

}

package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ticketId")
	@SequenceGenerator(name = "ticketId", sequenceName = "ticketId_Seq", initialValue=1, allocationSize=1)
	private long ticketId;
	@OneToOne(targetEntity = Passenger.class)
	@JoinColumn(name = "passengerId")
	private Passenger passenger;
	@ManyToOne
	@JoinColumn(name = "flightSpecificId", referencedColumnName = "flightSpecificId")
	private FlightSpecific flightSpecific ;
	private String raceSpecific;
	private int price;
	private String category;
	private int baggage;
	private boolean child;
	
	public Ticket() {
		
	}
	
	public String getRaceSpecific() {
		return raceSpecific;
	}
	public void setRaceSpecific(String raceSpecific) {
		this.raceSpecific = raceSpecific;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBaggage() {
		return baggage;
	}
	public void setBaggage(int baggage) {
		this.baggage = baggage;
	}
	public boolean isChild() {
		return child;
	}
	public void setChild(boolean child) {
		this.child = child;
	}

}

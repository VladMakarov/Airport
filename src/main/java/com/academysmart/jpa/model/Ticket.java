package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ticketId")
	@SequenceGenerator(name = "ticketId", sequenceName = "ticketId_Seq", initialValue=1, allocationSize=1)
	private long ticketId;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "passengerId", referencedColumnName = "passengerId")
    private Passenger passenger;
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name = "airportId", referencedColumnName = "airportId")
//    private Airport airport;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "flightId", referencedColumnName = "flightId")
    private Flight flight;
    private int price;
    private int baggage;
    private boolean child;
    private int numberofclass;

	public Ticket() {
		
	}
	
    public long getTicketId() {
        return ticketId;
    }
    
    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
    
    public Passenger getPassenger() {
        return passenger;
    }
    
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
//    public Airport getAirport() {
//        return airport;
//    }
//
//    public void setAirport(Airport airport) {
//        this.airport = airport;
//    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getBaggage() {
		return baggage;
	}
	
	public void setBaggage(int baggage) {
		this.baggage = baggage;
	}
	
	public boolean getChild() {
		return child;
	}
	
	public void setChild(boolean child) {
		this.child = child;
	}
	
	public int getNumberofclass() {
		return numberofclass;
	}
	
	public void setNumberofclass(int numberofclass) {
		this.numberofclass = numberofclass;
	}
	
    @Override
    public String toString() {
        return "Ticket: " 
                + "(Ticket ID=" + ticketId 
                + ", passenger - " + passenger 
//                + ", airport - " + airport 
                + ", flight - " + flight 
                + ", Price - " + price 
                + ", Baggage - " + baggage 
                + ", Child - '" + child + ");"; 
    }
}

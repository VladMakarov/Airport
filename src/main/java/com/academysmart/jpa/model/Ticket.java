package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "selectTickets", query = "SELECT t FROM Ticket t")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ticketId;
    @ManyToOne
    @JoinColumn(name = "passengerId", referencedColumnName = "passengerId")
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name = "flightId", referencedColumnName = "flightId")
    private Flight flight;
    private double price;
    private int baggage;
    private boolean child;
    private String category;

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
    
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
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
		
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
    @Override
    public String toString() {
        return  "---------------------------------------------" + "\n"
        		+ "TICKET: " +"\n"
                + "\tTICKET ID - " + ticketId + ".\n"
                + "\tPASSENGER - " + passenger + ".\n"
                + "\tFLIGHT - " + flight + "\n"
                + "\tCATEGORY - " + category + ".\n"
                + "\tBAGGAGE - " + baggage + "kg.\n"
                + "\tCHILD - " + child + ".\n"
                + "\tPRICE - " + price + " uah.";
    }
}

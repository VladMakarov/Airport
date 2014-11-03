package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import EntityActions.AirportAction;
import EntityActions.FlightAction;
import EntityActions.PassengerAction;
import EntityActions.TicketAction;
import MyEntityFactory.MyEntityManager;

public class EmployeeIT {
	
	@Test
	public void shouldFindPassenger(){
		Passenger pass = MyEntityManager.em.find(Passenger.class, 1L);
		assertEquals("Makarov", pass.getLname());
	}

	@Test
	public void addPassenger(){
		Passenger passenger = new Passenger();
		passenger.setFname("Dmitriy");
		passenger.setLname("Baksheev");
		passenger.setPatronymic("Vladimirovich");
		passenger.setPhoneNumber("+380936543513");
		PassengerAction pa = new PassengerAction();
		pa.addPassenger(passenger);
		@SuppressWarnings("unchecked")
		List<Passenger> pass = MyEntityManager.em.createNamedQuery("selectPassengers").getResultList();
		assertEquals(2, pass.size());
	}
		
	@Test
	public void getAllAirport(){
		AirportAction aa = new AirportAction();
		assertEquals(7, aa.getAllAirpors().size());
	}
		
	@Test
	public void addTicket(){
		PassengerAction pa = new PassengerAction();
		FlightAction fa = new FlightAction();
		TicketAction t = new TicketAction();
		Ticket ticket = new Ticket();
		ticket.setPassenger(pa.getPassengerById(1));    // Choose Passenger from table
		ticket.setFlight(fa.getFlightById(3));			// Choose flight
		ticket.setBaggage(15);							// Set baggage	
		ticket.setChild(false);                          // Child ticket
		ticket.setCategory(ticket.getFlight().getCategory());  // get category
		ticket.setPrice(t.calculatePrice(ticket));		// Calculate price
		t.addTicket(ticket);
		@SuppressWarnings("unchecked")
		List<Ticket> tickets = MyEntityManager.em.createNamedQuery("selectTickets").getResultList();
		assertEquals(1, tickets.size());
	}
	
	@Test
	public void shouldEqualsTicketPrice(){
		TicketAction ta = new TicketAction();
		Ticket ticket = ta.getTicketById(1);
		assertTrue(ticket.getPrice() == 1400);
		System.out.println(ta.getTicketById(1));
	}
	
}

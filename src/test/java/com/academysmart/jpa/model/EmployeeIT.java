package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import EntityActions.AirportAction;
import EntityActions.FlightAction;
import EntityActions.PassengerAction;
import EntityActions.TicketAction;
import MyEntityFactory.MyEntityManager;

public class EmployeeIT {
	
	@Test
	public void getPassengerById(){
		PassengerAction pa = new PassengerAction();
        System.out.println(pa.getPassengerById(1));
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
	public void getAllEmployee(){
		PassengerAction pa = new PassengerAction();
		System.out.println(pa.getAllPassengers());
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
		ticket.setPassenger(pa.getPassengerById(1));    // Выбрать пассажира из таблицы
		ticket.setFlight(fa.getFlightById(3));			// Выбрать рейс
		ticket.setBaggage(15);							// Багаж	
		ticket.setChild(false);                          // Взрослый/Детский
		ticket.setCategory(ticket.getFlight().getCategory());  // Категория
		ticket.setPrice(t.calculatePrice(ticket));		// Подсчет цены
		t.addTicket(ticket);
	}
	
	@Test
	public void getTicketById(){
		TicketAction t = new TicketAction();
        System.out.println(t.getTicketById(1));
	}
	
}

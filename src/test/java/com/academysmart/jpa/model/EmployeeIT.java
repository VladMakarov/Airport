package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import EntityActions.AirportAction;
import EntityActions.FlightSpecificAction;
import EntityActions.FlightTypeAction;
import EntityActions.PassengerAction;
import MyEntityFactory.MyEntityManager;

@SuppressWarnings("deprecation")
public class EmployeeIT {

//	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbyTest");
//	private EntityManager em;
//	private EntityTransaction tx;
	
//	@Before
//	public void setUp() throws Exception {
//		em = emf.createEntityManager();
//		tx = em.getTransaction();
//	}

//	@After
//	public void tearDown() throws Exception {
//		if (em != null) {
//			em.clear();
//		}
//	}
	
//	@Test
//	public void getPassengerById(){
//		PassengerAction pa = new PassengerAction();
//        System.out.println(pa.getPassengerById(1));
//	}
	
//	@Test
//	public void addPassenger(){
//		Passenger passenger = new Passenger();
//		passenger.setFname("Dmitriy");
//		passenger.setLname("Baksheev");
//		passenger.setPatronymic("Vladimirovich");
//		passenger.setPhoneNumber("+380936543513");
//		PassengerAction pa = new PassengerAction();
//		pa.addPassenger(passenger);
//		@SuppressWarnings("unchecked")
//		List<Passenger> pass = MyEntityManager.em.createNamedQuery("selectPassengers").getResultList();
//		assertEquals(2, pass.size());
//	}
	
//	@Test
//	public void getAllEmployee(){
//		PassengerAction pa = new PassengerAction();
//		System.out.println(pa.getAllPassengers());
//	}
	
//	@Test
//	public void getAllAirport(){
//		AirportAction aa = new AirportAction();
//		assertEquals(7, aa.getAllAirpors().size());
//	}
	
//	@Test
//	public void getFlightTypeById(){
//		FlightTypeAction fta = new FlightTypeAction();
//        System.out.println(fta.getFlightTypeById(2));
//	}
	
	@Test
	public void getFlightSpecificById(){
		FlightSpecificAction fta = new FlightSpecificAction();
        System.out.println(fta.getFlightSpecificById(2));
	}
//	@Test
//	public void ft(){
//		@SuppressWarnings("unchecked")
//		List<FlightType> pass = em.createNamedQuery("selectFlightType").getResultList();
//		assertEquals(1, pass.size());
//	}
	
//	@Test
//	public void shouldFindEmployee() throws Exception {
//		Employee employee = em.find(Employee.class, 2l);
//		//employee.setLname("mak");
//		assertEquals("bak", employee.getLname());
//				
//	}
	
//	@Test
//	public void addEmployee() throws Exception {
//		Employee employee = new Employee();
//		employee.setFname("Vladik");
//		employee.setLname("Makaka");
//		tx.begin();
//		em.persist(employee);
//		tx.commit();
//		@SuppressWarnings("unchecked")
//		List<Employee> emp = em.createNamedQuery("selectAllEmp").getResultList();
//		assertEquals(4, emp.size());
//		System.out.println(employee.toString());
//				
//	}

//	@Test
//	public void shouldCreateAdress() throws Exception {
//		Adress adress = new Adress();
//		adress.setCity("don");
//		adress.setStreet("lal");
//		tx.begin();
//		em.persist(adress);
//		tx.commit();
//		@SuppressWarnings("unchecked")
//		List<Adress> adresses = em.createNamedQuery("selectAll").getResultList();
//		assertEquals(4, adresses.size());
//		}

}

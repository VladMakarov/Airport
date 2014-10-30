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

@SuppressWarnings("deprecation")
public class EmployeeIT {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbyTest");
	private EntityManager em;
	private EntityTransaction tx;
	
	@Before
	public void setUp() throws Exception {
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@After
	public void tearDown() throws Exception {
		if (em != null) {
			em.clear();
		}
	}

	@Test
	public void Airport(){
		//Passenger pas = em.find(Employee.class, 1L);
		Airport airport= new Airport();
		airport.setName("lal");
		airport.setAdress("Kh");
		airport.setAirportId(1l);
		//pas.setPhoneNumber("123");
		//pas.toString();
		System.out.println(airport.toString());
	}
	
	@Test
	public void shouldFindEmployee() throws Exception {
		Employee employee = em.find(Employee.class, 2l);
		//employee.setLname("mak");
		assertEquals("bak", employee.getLname());
				
	}
	
	@Test
	public void addEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setFname("Vladik");
		employee.setLname("Makaka");
		tx.begin();
		em.persist(employee);
		tx.commit();
		@SuppressWarnings("unchecked")
		List<Employee> emp = em.createNamedQuery("selectAllEmp").getResultList();
		assertEquals(4, emp.size());
		System.out.println(employee.toString());
				
	}

	@Test
	public void shouldCreateAdress() throws Exception {
		Adress adress = new Adress();
		adress.setCity("don");
		adress.setStreet("lal");
		tx.begin();
		em.persist(adress);
		tx.commit();
//		Student student = (Student) session.get(Student.class, 1);
//		System.out.print("Студент " + student.getName());
		@SuppressWarnings("unchecked")
		List<Adress> adresses = em.createNamedQuery("selectAll").getResultList();
		assertEquals(4, adresses.size());
		}

}

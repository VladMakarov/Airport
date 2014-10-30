package com.academysmart.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "passengerId")
	@SequenceGenerator(name = "passengerId", sequenceName = "passengerId_Seq", initialValue=1, allocationSize=1)
	private long passengerId;
//	@OneToOne(targetEntity = Ticket.class)
//	@JoinColumn(name = "ticketId")
//	private Ticket ticket;
	private String fname;
	private String lname;
	private String patronymic;
	private String phoneNumber;
	
	public Passenger() {
		
	}

	public String getFname(){
		return fname;
	}
	public void setFname(String fname){
		this.fname = fname;
	}
	public String getLname(){
		return lname;
	}
	public void setLname(String lname){
		this.lname = lname;
	}
	public String getPatronymic(){
		return patronymic;
	}
	public void setPatronymic(String patronymic){
		this.patronymic = patronymic;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
}

package com.academysmart.jpa.model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "selectAirports", query = "SELECT a FROM Airport a")
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long airportId;
	private String name;
	private String adress;
	
	public Airport() {
		
	}
	
	public long getAirportId() {
		return airportId;
	}
	public void setAirportId(long airportId) {
		this.airportId = airportId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Airport: " + name+ ", ADRESS: " + adress + ".";
	}
}

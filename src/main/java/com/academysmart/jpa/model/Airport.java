package com.academysmart.jpa.model;

import javax.persistence.*;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "AirportId")
	@SequenceGenerator(name = "AirportId", sequenceName = "AirportId_Seq", initialValue=1, allocationSize=1)
//	@Column (name = "AIRPORTID")
	private long airportId;
//	@Column (name = "NAME")
	private String name;
//	@Column (name = "ADRESS")
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
		return "Airport{" +
					"idAirport=" + airportId +
					", name='" + name + '\'' +
					", adress='" + adress + '\'' +
					'}';
	}
}

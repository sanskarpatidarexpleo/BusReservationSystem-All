package com.expleo.busReservationSystem.entity;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

//@Entity
public class BusList {
//	@Id
	private String busNumber;
	private String busName;
	private int seatsAvailable;
	private String source;
	private String destination;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate departuredate;
	private LocalTime departureTime;
	private float price;
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(LocalDate departuredate) {
		this.departuredate = departuredate;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	
	public BusList() {
		
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public BusList(String busNumber, String busName, int seatsAvailable, String source, String destination,
			LocalDate departuredate, LocalTime departureTime, float price) {
		super();
		this.busNumber = busNumber;
		this.busName = busName;
		this.seatsAvailable = seatsAvailable;
		this.source = source;
		this.destination = destination;
		this.departuredate = departuredate;
		this.departureTime = departureTime;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BusList [busNumber=" + busNumber + ", busName=" + busName + ", seatsAvailable=" + seatsAvailable
				+ ", source=" + source + ", destination=" + destination + ", departuredate=" + departuredate
				+ ", departureTime=" + departureTime + ", price=" + price + "]";
	}
	
	
	
	
	

}

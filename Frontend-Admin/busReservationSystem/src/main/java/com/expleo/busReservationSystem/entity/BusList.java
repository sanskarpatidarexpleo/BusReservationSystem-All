package com.expleo.busReservationSystem.entity;


import java.time.LocalTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class BusList {
//	@Id
	private String busNumber;
	private String busName;
	private String seatsAvailable;
	private String source;
	private String destination;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date departuredate;
	private LocalTime departureTime;
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
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
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
	public BusList(String busNumber,String busName, String seatsAvailable,String source, String destination, Date departuredate,
			LocalTime departureTime) {
		super();
		this.busName = busName;
		this.busNumber = busNumber;
		this.seatsAvailable=seatsAvailable;
		this.source = source;
		this.destination = destination;
		this.departuredate = departuredate;
		this.departureTime = departureTime;
	}
	@Override
	public String toString() {
		return "BusList [busNumber=" + busNumber + ",busName=" + busName +  ", source=" + source + ", destination="
				+ destination + ", departuredate=" + departuredate + ", departureTime=" + departureTime + "]";
	}
	public String getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(String seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	
	

}

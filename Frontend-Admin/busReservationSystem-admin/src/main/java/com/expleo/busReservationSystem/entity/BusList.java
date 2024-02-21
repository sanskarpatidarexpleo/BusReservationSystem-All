package com.expleo.busReservationSystem.entity;

import java.time.LocalTime;

public class BusList {
	

	private int id;
	private String travelName;
	private String travelfrom;
	private String travelTo;
	private String busNo;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private int totalSeats;
	private float amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTravelName() {
		return travelName;
	}
	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}
	public String getTravelfrom() {
		return travelfrom;
	}
	public void setTravelfrom(String travelfrom) {
		this.travelfrom = travelfrom;
	}
	public String getTravelTo() {
		return travelTo;
	}
	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public BusList(int id, String travelName, String travelfrom, String travelTo, String busNo, LocalTime departureTime,
			LocalTime arrivalTime, int totalSeats, float amount) {
		super();
		this.id = id;
		this.travelName = travelName;
		this.travelfrom = travelfrom;
		this.travelTo = travelTo;
		this.busNo = busNo;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeats = totalSeats;
		this.amount = amount;
	}
	public BusList() {
		super();
	}
	@Override
	public String toString() {
		return "BusList [id=" + id + ", travelName=" + travelName + ", travelfrom=" + travelfrom + ", travelTo="
				+ travelTo + ", busNo=" + busNo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", totalSeats=" + totalSeats + ", amount=" + amount + "]";
	}

	
	


	
	
	
}

package com.expleo.busReservationSystem.entity;

import java.time.LocalTime;
import java.util.Date;


/* By Admin - Add a new bus/travel
 * It is a entity class which contains the data of travels/bus
 * Whenever an admin add a new bus the bus data should be stored like it.
 */


public class BusList {

	private int id;

	private String travelName;

	private String travelFrom;

	private String travelTo;

	private String busNo;

	private LocalTime departureTime;

	private LocalTime arrivalTime;

	private int totalSeats;

	private float price;

	private Date createdAt;

	private Date deletedAt;

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

	public String getTravelFrom() {
		return travelFrom;
	}

	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public BusList(int id, String travelName, String travelFrom, String travelTo, String busNo, LocalTime departureTime,
			LocalTime arrivalTime, int totalSeats, float price, Date createdAt, Date deletedAt) {
		super();
		this.id = id;
		this.travelName = travelName;
		this.travelFrom = travelFrom;
		this.travelTo = travelTo;
		this.busNo = busNo;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeats = totalSeats;
		this.price = price;
		this.createdAt = createdAt;
		this.deletedAt = deletedAt;
	}

	public BusList() {
		super();
	}

	@Override
	public String toString() {
		return "BusList [id=" + id + ", travelName=" + travelName + ", travelFrom=" + travelFrom + ", travelTo="
				+ travelTo + ", busNo=" + busNo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", totalSeats=" + totalSeats + ", price=" + price + ", createdAt=" + createdAt + ", deletedAt="
				+ deletedAt + "]";
	}
	
	


}
	
	
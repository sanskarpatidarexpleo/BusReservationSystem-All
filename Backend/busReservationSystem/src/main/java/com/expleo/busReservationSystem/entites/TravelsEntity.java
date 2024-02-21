package com.expleo.busReservationSystem.entites;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* By Admin - Add a new bus/travel
 * It is a entity class which contains the data of travels/bus
 * Whenever an admin add a new bus the bus data should be stored like it.
 */

@Entity(name = "tbl_travels")
public class TravelsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "travel_name")
	private String travelName;
	
	@Column(name = "travel_from")
	private String travelFrom;
	
	@Column(name = "travel_to")
	private String travelTo;
	
	@Column(name = "bus_no")
	private String busNo;
	
	@Column(name = "departure_time")
	private LocalTime departureTime;
	
	@Column(name = "arrival_time")
	private LocalTime arrivalTime;
	
	@Column(name = "total_seats")
	private int totalSeats;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "deleted_at")
	private Date deletedAt;
	
	public TravelsEntity() {
		
	}

	public TravelsEntity(String travelName, String travelFrom, String travelTo, String busNo, LocalTime departureTime,
			LocalTime arrivalTime, int totalSeats, float price, Date createdAt, Date deletedAt) {
		super();
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

	@Override
	public String toString() {
		return "TravelsEntity [id=" + id + ", travelName=" + travelName + ", travelfrom=" + travelFrom + ", travelTo="
				+ travelTo + ", busNo=" + busNo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", totalSeats=" + totalSeats + ", price=" + price + ", createdAt=" + createdAt + ", deletedAt="
				+ deletedAt + "]";
	}
	
}

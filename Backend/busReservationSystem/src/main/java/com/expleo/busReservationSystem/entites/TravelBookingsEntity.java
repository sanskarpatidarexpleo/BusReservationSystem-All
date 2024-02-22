package com.expleo.busReservationSystem.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * By Admin -
 * Act as a medium between users booking and travel
 * Like which user books which travel
 * This entity will be used to fetch all the bookings of user related to that travel.
 */

@Entity(name = "tbl_travel_bookings")
public class TravelBookingsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "bus_id")
	private int busId;  // id of the bus which is booked
	
	@Column(name = "user_id")
	private int userId; // user id who booked
	
	@Column(name = "date")
	private Date date; //date of booking
	
	public TravelBookingsEntity() {
		
	}
	
	public TravelBookingsEntity(int busId, int userId, Date date) {
		this.busId = busId;
		this.userId = userId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TravelBookingsEntity [ id=" + id + ", busId=" + busId + ", userId=" + userId + ", date=" + date + " ]";
	}
	
}

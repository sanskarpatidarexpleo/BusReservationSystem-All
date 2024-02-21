package com.expleo.busReservationSystem.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "tbl_bookings")
public class BookingsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "travel_id")
	private int travelId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "is_booking_active")
	private boolean isBookingActive;
	
	public BookingsEntity() {
		
	}

	public BookingsEntity(int userId, int travelId, String name, String mobile, String gender,
			Date date , boolean isBookingActive) {
		this.userId = userId;
		this.travelId = travelId;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.date = date;
		this.isBookingActive = isBookingActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isBookingActive() {
		return isBookingActive;
	}

	public void setBookingActive(boolean isBookingActive) {
		this.isBookingActive = isBookingActive;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookingsEntity [id=" + id + ", userId=" + userId + ", travelId=" + travelId + ", name=" + name
				+ ", mobile=" + mobile + ", gender=" + gender + ", date=" + date + ", isBookingActive="
				+ isBookingActive + "]";
	}

	
	
}

package com.expleo.busReservationSystem.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_bookings")
public class BookingsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userId;
	private int travelId;
	private String name;
	private String mobile;
	private String gender;
	private String status;
	private boolean isBookingActive;
	
	public BookingsEntity() {
		
	}

	public BookingsEntity(int userId, int travelId, String name, String mobile, String gender, String status,
			boolean isBookingActive) {
		this.userId = userId;
		this.travelId = travelId;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isBookingActive() {
		return isBookingActive;
	}

	public void setBookingActive(boolean isBookingActive) {
		this.isBookingActive = isBookingActive;
	}

	@Override
	public String toString() {
		return "BookingsEntity [ id=" + id + ", userId=" + userId + ", travelId=" + travelId + ", name=" + name
				+ ", mobile=" + mobile + ", gender=" + gender + ", status=" + status + ", isBookingActive="
				+ isBookingActive + " ]";
	}
}

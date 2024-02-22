package com.expleo.busReservationSystem.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Entity class contains data of user booking like user's name , mobile etc
 * and travelId is the id of the bus which he booked.
 * This travelId is reference to id of the bus from TravelsEntity.
 */

@Entity(name = "tbl_bookings")
public class BookingsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int userId;  // id of user who booked
	
	@Column(name = "travel_id")
	private int travelId;  //contains id of travel which is booked
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "amount")
	private float amount;  //total amount user paid
	
	@Column(name = "seats")
	private int seats; // no. of seats user booked
	
	@Column(name = "date")
	private Date date;  //date of booking
	
	
	public BookingsEntity() {
		
	}


	public BookingsEntity(int userId, int travelId, String name, String mobile, String gender, float amount, int seats,
			Date date) {
		super();
		this.userId = userId;
		this.travelId = travelId;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.amount = amount;
		this.seats = seats;
		this.date = date;
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


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "BookingsEntity [ id=" + id + ", userId=" + userId + ", travelId=" + travelId + ", name=" + name
				+ ", mobile=" + mobile + ", gender=" + gender + ", amount=" + amount + ", seats=" + seats + ", date="
				+ date + " ]";
	}	
}

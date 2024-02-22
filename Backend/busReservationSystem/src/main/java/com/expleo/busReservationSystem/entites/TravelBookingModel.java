package com.expleo.busReservationSystem.entites;

/*
 * This is a simple model class containing two types of data.
 * 1. User booking 
 * 2. Travel booked
 * 
 * -> This data is required for admin -> Which users booked which travel 
 */

public class TravelBookingModel {

	private TravelsEntity travelsEntity;
	private BookingsEntity bookingsEntity;
	
	public TravelBookingModel(TravelsEntity travelsEntity, BookingsEntity bookingsEntity) {
		this.travelsEntity = travelsEntity;
		this.bookingsEntity = bookingsEntity;
	}

	public TravelsEntity getTravelsEntity() {
		return travelsEntity;
	}

	public void setTravelsEntity(TravelsEntity travelsEntity) {
		this.travelsEntity = travelsEntity;
	}

	public BookingsEntity getBookingsEntity() {
		return bookingsEntity;
	}

	public void setBookingsEntity(BookingsEntity bookingsEntity) {
		this.bookingsEntity = bookingsEntity;
	}
	
}

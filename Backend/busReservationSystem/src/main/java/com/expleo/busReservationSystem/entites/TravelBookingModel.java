package com.expleo.busReservationSystem.entites;

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

package com.expleo.busReservationSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.ResponseModel;
import com.expleo.busReservationSystem.db.BookingRepository;
import com.expleo.busReservationSystem.entites.BookingsEntity;


@Service
public class BookingService {

	private static final String CANCEL = "cancel";
	
	@Autowired
	BookingRepository bookingRepository;
	
	public BookingsEntity bookTravels(BookingsEntity entity) {
		return bookingRepository.save(entity);
	}
	
	public ResponseModel cancelBooking(BookingsEntity entity) {
		entity.setStatus(CANCEL);
		entity.setBookingActive(false);
		BookingsEntity responseEntity = bookingRepository.save(entity);
		ResponseModel responseModel;
		if(responseEntity != null) {
			responseModel = new ResponseModel(true,"Booking Cancelled");
		} else {
			responseModel = new ResponseModel(true,"Failed to Cancel");
		}
		return responseModel;
	}
	
}
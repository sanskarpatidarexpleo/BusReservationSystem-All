package com.expleo.busReservationSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.db.BookingRepository;
import com.expleo.busReservationSystem.entites.BookingsEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;


@Service
public class BookingService {

	private static final String CANCEL = "cancel";
	
	@Autowired
	BookingRepository bookingRepository;
	
	public BookingsEntity bookTravels(BookingsEntity entity) {
		return bookingRepository.save(entity);
	}
	
	
	public ResponseModel cancelBooking(int bookingId) {
		ResponseModel responseModel = new ResponseModel();
		try {
			bookingRepository.deleteById(bookingId);
			responseModel.status = true;
			responseModel.message = "Booking Cancelled";
		} catch (Exception e) {
			responseModel.status = false;
			responseModel.message = "Failed to Cancel";
		}
		return responseModel;
//		entity.setStatus(CANCEL);
//		entity.setBookingActive(false);
//		BookingsEntity responseEntity = bookingRepository.save(entity);
//		ResponseModel responseModel;
//		if(responseEntity != null) {
//			responseModel = new ResponseModel(true,"Booking Cancelled");
//		} else {
//			responseModel = new ResponseModel(true,"Failed to Cancel");
//		}
//		return responseModel;
	}
	
}

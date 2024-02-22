package com.expleo.busReservationSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.db.BookingRepository;
import com.expleo.busReservationSystem.entites.BookingsEntity;
import com.expleo.busReservationSystem.entites.TravelsEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;

/*
 * This actions will be perform by User
 * Book or cancel or get all its pending bookings for a travel. 
 */

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	//======================================== BOOK TRAVEL ============================================//
	
	public BookingsEntity bookTravels(BookingsEntity entity) {
		return bookingRepository.save(entity);
	}
	
	
	//======================================== CANCEL TRAVEL ============================================//
	
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
	}
	
	
	//======================================== SEARCH TRAVEL ============================================//
	
	public List<TravelsEntity> searchTravelByRoute(String travelFrom , String travelTo){
		return bookingRepository.findAllByTravelFromAndTravelTo(travelFrom, travelTo);
		
	}	
}

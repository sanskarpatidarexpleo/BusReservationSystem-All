package com.expleo.busReservationSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.busReservationSystem.entites.BookingsEntity;
import com.expleo.busReservationSystem.entites.TravelBookingModel;
import com.expleo.busReservationSystem.entites.TravelsEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;
import com.expleo.busReservationSystem.responseModels.ResponseObjectModel;
import com.expleo.busReservationSystem.services.BookingService;
import com.expleo.busReservationSystem.services.TravelsBookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@Autowired
	TravelsBookingService travelsBookingService;
	
	/* BOOK A TRAVEL/BUS */
	@PostMapping("/bookTravel")
	public ResponseEntity<ResponseObjectModel<BookingsEntity>> bookTravel(BookingsEntity entity ){
		BookingsEntity bookingEntity = bookingService.bookTravels(entity);
		
		ResponseObjectModel<BookingsEntity> responseModel = new ResponseObjectModel<BookingsEntity>();
		ResponseEntity<ResponseObjectModel<BookingsEntity>> responseEntity;
		if(bookingEntity != null) {
			if(travelsBookingService.setTravelBooked(entity)) {
				responseModel.status = true;
				responseModel.message = "Booked Successfully";
				responseModel.setData(bookingEntity);
			}
		} else {
			responseModel.status = false;
			responseModel.message = "Failed to book";
			responseModel.setData(bookingEntity);
		}
		
		responseEntity = new ResponseEntity<ResponseObjectModel<BookingsEntity>>(responseModel,HttpStatus.OK);
		return responseEntity;
	}
	
	
	/*CANCEL BOOKING*/
	@GetMapping("/cancelBooking")
	public ResponseEntity<ResponseModel> cancelBooking(BookingsEntity entity){
		ResponseModel responseModel = bookingService.cancelBooking(entity.getId());
		if(responseModel.status) {
			travelsBookingService.deleteTravelBooked(entity);  
		}
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	
	/* SEARCH TRAVEL BY SOURCE AND DESTINATION */
	@GetMapping("/searchTravels")
	public ResponseEntity<List<TravelsEntity>> getSearchTravels(String travelFrom , String travelTo){
		List<TravelsEntity> travelList = bookingService.searchTravelByRoute(travelFrom, travelTo);
		return new ResponseEntity<List<TravelsEntity>>(travelList , HttpStatus.OK);
	}
	
	//TODO
	@GetMapping("/getBookingDetails")
	public ResponseEntity<List<TravelBookingModel>> getBookingDetails() {
		return null;
	}
}

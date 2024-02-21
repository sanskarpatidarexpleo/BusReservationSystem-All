package com.expleo.busReservationSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.busReservationSystem.ResponseModel;
import com.expleo.busReservationSystem.entites.BookingsEntity;
import com.expleo.busReservationSystem.services.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@PostMapping("/bookTravel")
	public ResponseEntity<Object> bookTravel(BookingsEntity entity ){
		BookingsEntity bookingEntity = bookingService.bookTravels(entity);
		ResponseEntity<Object> responseEntity ;
		if(bookingEntity == null) {
			responseEntity = new ResponseEntity<Object>(new ResponseModel(false,"Failed to Book"),HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Object>(bookingEntity,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/cancelBooking")
	public ResponseEntity<ResponseModel> cancelBooking(BookingsEntity entity){
		ResponseModel responseModel = bookingService.cancelBooking(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	@GetMapping("/getBookingDetails")
	public void getBookingDetails() {
		
	}
}

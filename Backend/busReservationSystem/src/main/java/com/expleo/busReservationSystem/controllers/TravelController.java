package com.expleo.busReservationSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.busReservationSystem.entites.TravelBookingModel;
import com.expleo.busReservationSystem.entites.TravelsEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;
import com.expleo.busReservationSystem.services.TravelsService;

@RestController
public class TravelController {

	@Autowired
	TravelsService travelsService;
	
	 /* CREATE */
    @PostMapping("/addTravel")
	public ResponseEntity<ResponseModel> addTravels(TravelsEntity entity){
		ResponseModel responseModel =  travelsService.addTravels(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
    /* READ */
	@GetMapping("/getAllTravels")
	public ResponseEntity<List<TravelsEntity>> getAllTravels(){
		List<TravelsEntity> travelList =  travelsService .getAllTravels();
		return new ResponseEntity<List<TravelsEntity>>(travelList,HttpStatus.OK);
	}
	
	 /* DELETE */
	@DeleteMapping("/deleteTravel")
	public ResponseEntity<ResponseModel> deleteTravel(TravelsEntity entity){
		ResponseModel responseModel = travelsService.deleteTravel(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	 /* UPDATE */
	@PatchMapping("/updateTravel")
	public ResponseEntity<ResponseModel> updateTravel(TravelsEntity entity){
		ResponseModel responseModel = travelsService.updateTravels(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	
	/* GET ALL BOOKINGS RELATED TO THAT TRAVEL 
	 * This method will return the data of which user booked that travel 
	 * Like as a admin he wants to see all the bookings of todays buses
	 */
	@GetMapping("/getAllBookingsOfTravel")
	public ResponseEntity<List<TravelBookingModel>> getBookingsOfParticularTravel(){
		List<TravelBookingModel> travelBookingList = travelsService.getBookingsOfTravel();
		return new ResponseEntity<List<TravelBookingModel>>(travelBookingList,HttpStatus.OK);
	}
}

package com.expleo.busReservationSystem.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.db.BookingRepository;
import com.expleo.busReservationSystem.db.TravelRepository;
import com.expleo.busReservationSystem.entites.TravelBookingModel;
import com.expleo.busReservationSystem.entites.TravelBookingsEntity;
import com.expleo.busReservationSystem.entites.TravelsEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;

/*
 * CRUD Operations on Travels
 * This Travels manipulations is done only by Admin .
 */

@Service
public class TravelsService {

	@Autowired
	TravelRepository travelRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	TravelsBookingService travelsBookingService;
	
	//======================================== CREATE ============================================//
	
	public ResponseModel addTravels(TravelsEntity entity) {
		entity.setCreatedAt(new Date());
		TravelsEntity responseEntity = travelRepository.save(entity);
		System.out.println("TravelsService::addTravels() ResponseEntity -> "+responseEntity);
		ResponseModel responseModel;
		if(responseEntity == null) {
			responseModel = new ResponseModel(true,"Travels added");
		} else {
			System.err.println("TravelsService::addTravels() ERROR");
			responseModel = new ResponseModel(false,"Something went wrong");
		}
		return responseModel;
	}
	
	
	//======================================== READ ============================================//
	
	public List<TravelsEntity> getAllTravels() {
		return travelRepository.findByDeletedAtIsNull();
	}
	
	
	//======================================== DELETE ============================================//
	
	public ResponseModel deleteTravel(TravelsEntity entity) {
		ResponseModel responseModel ;
		try {
			entity.setDeletedAt(new Date());
			travelRepository.save(entity);
			responseModel = new ResponseModel(true , "Travel deleted");
		} catch (Exception e) {
			responseModel = new ResponseModel(false,"No travels deleted");
		}
		return responseModel;
	}
	
	
	//======================================== UPDATE ============================================//
	
	//It is calling addTravels() for updating the value as the object is already exist. 
	public ResponseModel updateTravels(TravelsEntity entity) {
		return addTravels(entity);
	}
	
	//======================= GET ALL BOOKINGS RELATED TO THAT TRAVEL ===========================//
	
	public List<TravelBookingModel> getBookingsOfTravel() {
		Date todayDate = new Date();
		List<TravelBookingsEntity> travelBookingList = travelsBookingService.getAllTravelBooking(todayDate);
		List<TravelBookingModel> bookingModel = new ArrayList<TravelBookingModel>();
		for(TravelBookingsEntity entity : travelBookingList) {
			int busId = entity.getBusId();
			int userId = entity.getUserId();
			
			bookingModel.add(new TravelBookingModel(travelRepository.findById(busId).get(), bookingRepository.findById(userId).get()));
		}
		
		return bookingModel;
	}
}

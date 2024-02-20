package com.expleo.busReservationSystem.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.db.TravelBookingRepository;
import com.expleo.busReservationSystem.entites.TravelBookingsEntity;

@Service
public class TravelsBookingService {

	@Autowired
	TravelBookingRepository repository;
	
	public List<TravelBookingsEntity> getAllTravelBooking(Date todayDate){
		return repository.findAllByDate(todayDate);
	}
}

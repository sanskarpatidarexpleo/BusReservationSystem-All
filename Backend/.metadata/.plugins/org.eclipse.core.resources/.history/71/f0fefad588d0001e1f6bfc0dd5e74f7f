package com.expleo.busReservationSystem.db;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.TravelBookingsEntity;

@Repository
public interface TravelBookingRepository extends ListCrudRepository<TravelBookingsEntity, Integer>{

	public List<TravelBookingsEntity> findAllByDate(Date date);
}

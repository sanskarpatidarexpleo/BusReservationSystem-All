package com.expleo.busReservationSystem.db;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.TravelBookingsEntity;

@Repository
public interface TravelBookingRepository extends ListCrudRepository<TravelBookingsEntity, Integer>{

	public List<TravelBookingsEntity> findAllByDate(Date date);
	
//	 @Query("DELETE FROM tbl_travel_bookings WHERE user_id = :user_id AND bus_id = :bus_id AND date = :date")
//	 long findBySomeProperty(@Param("user_id") int userId , @Param("bus_id") int busId , @Param("date") Date bookingDate);
}

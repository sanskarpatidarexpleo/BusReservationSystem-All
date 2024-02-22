package com.expleo.busReservationSystem.db;

import java.util.List;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.BookingsEntity;
import com.expleo.busReservationSystem.entites.TravelsEntity;

@Repository
public interface BookingRepository extends ListCrudRepository<BookingsEntity, Integer>{

	public List<TravelsEntity> findAllByTravelFromAndTravelTo(String travelFrom , String travelTo);
}

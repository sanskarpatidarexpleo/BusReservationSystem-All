package com.expleo.busReservationSystem.db;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.TravelsEntity;

@Repository
public interface TravelRepository extends ListCrudRepository<TravelsEntity, Integer>{

	List<TravelsEntity> findByDeletedAtIsNull();
	
}
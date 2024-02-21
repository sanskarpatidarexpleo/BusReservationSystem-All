package com.expleo.busReservationSystem.db;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.UserLoginEntity;

@Repository
public interface AuthRepository extends ListCrudRepository<UserLoginEntity, String>{

	public UserLoginEntity findByEmail(String email);
}

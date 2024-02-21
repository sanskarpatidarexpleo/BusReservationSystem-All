package com.expleo.busReservationSystem.db;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.LoginUserEntity;

@Repository
public interface AuthRepository extends ListCrudRepository<LoginUserEntity, String>{

	public LoginUserEntity findByEmail(String email);
}

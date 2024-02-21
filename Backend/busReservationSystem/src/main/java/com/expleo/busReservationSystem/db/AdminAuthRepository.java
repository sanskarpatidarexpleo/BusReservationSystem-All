package com.expleo.busReservationSystem.db;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.AdminEntity;


@Repository
public interface AdminAuthRepository extends ListCrudRepository<AdminEntity, Integer>{

	public AdminEntity findByEmail(String email);
}

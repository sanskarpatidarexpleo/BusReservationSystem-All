package com.expleo.busReservationSystem.db;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.busReservationSystem.entites.AdminLoginEntity;


@Repository
public interface AdminAuthRepository extends ListCrudRepository<AdminLoginEntity, Integer>{

	public AdminLoginEntity findByEmail(String email);
}

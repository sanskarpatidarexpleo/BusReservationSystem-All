package com.expleo.busReservationSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.db.AdminAuthRepository;
import com.expleo.busReservationSystem.db.AuthRepository;
import com.expleo.busReservationSystem.entites.AdminLoginEntity;
import com.expleo.busReservationSystem.entites.UserLoginEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;

@Service
public class AuthService {

	@Autowired
	AuthRepository authRepository;
	
	@Autowired
	AdminAuthRepository adminAuthRepository;
	
	public ResponseModel loginUser(UserLoginEntity entity) {
		UserLoginEntity userEntity = authRepository.findByEmail(entity.getEmail());
		ResponseModel responseModel ; 
		if(userEntity != null) {
			
			System.out.println("AuthService::loginUser() ENTITY-> "+userEntity);
			if(entity.getPassword().equals(userEntity.getPassword())) {
				responseModel = new ResponseModel(true,"Logged In..");
			} else {
				responseModel = new ResponseModel(false,"Invalid Username or Password");
			}
		} else {
			System.err.println("AuthService::loginUser() -> Something went worng");
			responseModel = new ResponseModel(false,"No account found");
		}
		return responseModel;
	}
	
	
	
	public ResponseModel registerUser(UserLoginEntity entity) {
		UserLoginEntity validateEntity = authRepository.findByEmail(entity.getEmail());
		ResponseModel responseModel ; 
		if(validateEntity != null) {
			responseModel = new ResponseModel(false , "User already registered..");
			return responseModel;
		}
		
		UserLoginEntity userEntity = authRepository.save(entity);
		if(userEntity != null) {
			responseModel = new ResponseModel(true,"User registered..");
		}
		else {
			System.err.println("AuthService::registerUser() -> Something went worng");
			responseModel = new ResponseModel(false,"Something went wrong");
		}
		return responseModel;
	}
	
	
	public ResponseModel loginAdmin(AdminLoginEntity entity) {
		AdminLoginEntity adminLoginEntity = adminAuthRepository.findByEmail(entity.getEmail());
		ResponseModel responseModel ; 
		if(adminLoginEntity != null) {
			
			System.out.println("AuthService::loginAdmin() ENTITY-> "+adminLoginEntity);
			if(entity.getPassword().equals(adminLoginEntity.getPassword())) {
				responseModel = new ResponseModel(true,"Logged In..");
			} else {
				responseModel = new ResponseModel(false,"Invalid Username or Password");
			}
		} else {
			System.err.println("AuthService::loginAdmin() -> Something went worng");
			responseModel = new ResponseModel(false,"No account found");
		}
		return responseModel;
	}
}

package com.expleo.busReservationSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.busReservationSystem.ResponseModel;
import com.expleo.busReservationSystem.db.AuthRepository;
import com.expleo.busReservationSystem.entites.LoginUserEntity;

@Service
public class AuthService {

	@Autowired
	AuthRepository authRepository;
	
	public ResponseModel loginUser(LoginUserEntity entity) {
		LoginUserEntity userEntity = authRepository.findByEmail(entity.getEmail());
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
	
	
	
	public ResponseModel registerUser(LoginUserEntity entity) {
		LoginUserEntity validateEntity = authRepository.findByEmail(entity.getEmail());
		ResponseModel responseModel ; 
		if(validateEntity != null) {
			responseModel = new ResponseModel(false , "User already registered..");
			return responseModel;
		}
		
		LoginUserEntity userEntity = authRepository.save(entity);
		if(userEntity != null) {
			responseModel = new ResponseModel(true,"User registered..");
		}
		else {
			System.err.println("AuthService::registerUser() -> Something went worng");
			responseModel = new ResponseModel(false,"Something went wrong");
		}
		return responseModel;
	}
}

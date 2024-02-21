package com.expleo.busReservationSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.busReservationSystem.ResponseModel;
import com.expleo.busReservationSystem.entites.LoginUserEntity;
import com.expleo.busReservationSystem.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	AuthService authService;
	
	@GetMapping("/login")
	public ResponseEntity<ResponseModel> loginUser(LoginUserEntity entity){
		ResponseModel responseModel = authService.loginUser(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	@GetMapping("/register")
	public ResponseEntity<ResponseModel> registerUser(LoginUserEntity entity){
		ResponseModel responseModel = authService.registerUser(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
}

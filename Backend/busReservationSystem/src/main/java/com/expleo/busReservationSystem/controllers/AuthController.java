package com.expleo.busReservationSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.busReservationSystem.entites.AdminLoginEntity;
import com.expleo.busReservationSystem.entites.UserLoginEntity;
import com.expleo.busReservationSystem.responseModels.ResponseModel;
import com.expleo.busReservationSystem.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	AuthService authService;
	
	/* USER LOGIN */
	@GetMapping("/login")
	public ResponseEntity<ResponseModel> loginUser(UserLoginEntity entity){
		ResponseModel responseModel = authService.loginUser(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	/* USER REGISTER */
	@GetMapping("/register")
	public ResponseEntity<ResponseModel> registerUser(UserLoginEntity entity){
		ResponseModel responseModel = authService.registerUser(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
	/* ADMIN LOGIN */
	@GetMapping("/adminLogin")
	public ResponseEntity<ResponseModel> loginAdmin(AdminLoginEntity entity){
		ResponseModel responseModel = authService.loginAdmin(entity);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
}

package com.expleo.busReservationSystem;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import com.expleo.busReservationSystem.responseModels.ResponseModel;

@RestControllerAdvice
public class GlobalExceptionHandler {

	public ResponseEntity<ResponseModel> handleGlobalException(Exception exception , HandlerMethod handlerMethod){
		
		// from which method does exception arise
		String methodName = handlerMethod.getMethod().getName();
		
		// from which controller does exception arise
		String controllerName = handlerMethod.getBeanType().getSimpleName();
		
		System.err.println("Exception : GlobalExceptionHandler::handleGlobalException() ->\n Controller ->"+controllerName+"\n Method ->"+methodName);
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.status = false;
		responseModel.message = exception.getMessage();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseModel);
	}
}

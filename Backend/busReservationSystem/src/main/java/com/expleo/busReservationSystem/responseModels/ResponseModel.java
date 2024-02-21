package com.expleo.busReservationSystem.responseModels;

public class ResponseModel {

	public boolean status;
	public String message;
	
	public ResponseModel() {
		
	}
	
	public ResponseModel(boolean status, String message) {
		this.status = status;
		this.message = message;
	}
}

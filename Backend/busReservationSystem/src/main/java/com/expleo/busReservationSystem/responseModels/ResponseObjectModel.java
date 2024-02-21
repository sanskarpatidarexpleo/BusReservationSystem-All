package com.expleo.busReservationSystem.responseModels;

public class ResponseObjectModel<T> {

	public String message;
	public boolean status;
	private T data;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}

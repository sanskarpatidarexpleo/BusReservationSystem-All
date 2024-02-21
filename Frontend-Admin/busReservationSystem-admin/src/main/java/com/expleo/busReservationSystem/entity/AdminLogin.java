package com.expleo.busReservationSystem.entity;


public class AdminLogin {
	private int id;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLogin(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public AdminLogin() {
		super();
	}
	@Override
	public String toString() {
		return "AdminLogin [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	

}

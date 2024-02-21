package com.expleo.busReservationSystem.entity;



public class AdminLogin {
	private int id;
	private String email;
	private String password;
	
	public AdminLogin() {
		
	}
	
	public AdminLogin(String email, String password) {
		this.email = email;
		this.password = password;
	}

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

	@Override
	public String toString() {
		return "AdminEntity [ id=" + id + ", email=" + email + ", password=" + password + " ]";
	}

	
}

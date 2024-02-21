package com.expleo.busReservationSystem.entity;


<<<<<<< HEAD

=======
>>>>>>> c50a8fc3214ff4dbf1ad7437c21e598599cfa036
public class AdminLogin {
	private int id;
	private String email;
	private String password;
<<<<<<< HEAD
	
	public AdminLogin() {
		
	}
	
	public AdminLogin(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
=======
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
>>>>>>> c50a8fc3214ff4dbf1ad7437c21e598599cfa036
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
<<<<<<< HEAD

	@Override
	public String toString() {
		return "AdminEntity [ id=" + id + ", email=" + email + ", password=" + password + " ]";
	}

	
=======
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
	
	

>>>>>>> c50a8fc3214ff4dbf1ad7437c21e598599cfa036
}
	
	
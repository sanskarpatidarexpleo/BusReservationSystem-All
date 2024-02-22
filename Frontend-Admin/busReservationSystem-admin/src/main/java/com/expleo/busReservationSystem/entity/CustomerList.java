package com.expleo.busReservationSystem.entity;

import java.util.Date;


/*
 * Entity class contains data of user booking like user's name , mobile etc
 * and travelId is the id of the bus which he booked.
 * This travelId is reference to id of the bus from TravelsEntity.
 */

public class CustomerList {

	private int id;
	private String name;
	private String mobile;
	private String gender;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public CustomerList(int id, String name, String mobile, String gender, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.date = date;
	}
	public CustomerList() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerList [id=" + id + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", date="
				+ date + "]";
	}
	
	


}
	
	
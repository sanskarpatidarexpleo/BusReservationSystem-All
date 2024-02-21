//package com.expleo.FrontendUser.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Booking {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Long userId;
//    private String name;
//    private String mobile;
//    private int seats;
//    private String gender;
//    private Long busId;
//    private boolean active;
//    private String status;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMobile() {
//		return mobile;
//	}
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//	public int getSeats() {
//		return seats;
//	}
//	public void setSeats(int seats) {
//		this.seats = seats;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public Long getBusId() {
//		return busId;
//	}
//	public void setBusId(Long busId) {
//		this.busId = busId;
//	}
//	public boolean isActive() {
//		return active;
//	}
//	public void setActive(boolean active) {
//		this.active = active;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	@Override
//	public String toString() {
//		return "Booking [id=" + id + ", userId=" + userId + ", name=" + name + ", mobile=" + mobile + ", seats=" + seats
//				+ ", gender=" + gender + ", busId=" + busId + ", active=" + active + ", status=" + status + "]";
//	}
//	public Booking(Long id, Long userId, String name, String mobile, int seats, String gender, Long busId,
//			boolean active, String status) {
//		super();
//		this.id = id;
//		this.userId = userId;
//		this.name = name;
//		this.mobile = mobile;
//		this.seats = seats;
//		this.gender = gender;
//		this.busId = busId;
//		this.active = active;
//		this.status = status;
//	}
//	public Booking() {
//		super();
//	}
//  
//}

package com.expleo.busReservationSystem.entites;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_travels")
public class TravelsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String travelName;
	private String travelfrom;
	private String travelTo;
	private String busNo;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private int isTodayAvailable;
	private int travelType;
	private int totalSeats;
	private Date createdAt;
	private Date deletedAt;
	
	public TravelsEntity() {
		
	}
	
	public TravelsEntity(String travelName, String travelfrom, String travelTo, String busNo, LocalTime departureTime,
			LocalTime arrivalTime, int isTodayAvailable, int travelType, int totalSeats, Date createdAt, Date deletedAt) {
		this.travelName = travelName;
		this.travelfrom = travelfrom;
		this.travelTo = travelTo;
		this.busNo = busNo;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.isTodayAvailable = isTodayAvailable;
		this.travelType = travelType;
		this.totalSeats = totalSeats;
		this.createdAt = createdAt;
		this.deletedAt = deletedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getFrom() {
		return travelfrom;
	}

	public void setFrom(String travelfrom) {
		this.travelfrom = travelfrom;
	}

	public String getTo() {
		return travelTo;
	}

	public void setTo(String travelTo) {
		this.travelTo = travelTo;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int isTodayAvailable() {
		return isTodayAvailable;
	}

	public void setTodayAvailable(int isTodayAvailable) {
		this.isTodayAvailable = isTodayAvailable;
	}

	public int getType() {
		return travelType;
	}

	public void setType(int travelType) {
		this.travelType = travelType;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Override
	public String toString() {
		return "TravelsEntity [ id=" + id + ", travelName=" + travelName + ", from=" + travelfrom + ", to=" + travelTo + ", busNo="
				+ busNo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", isTodayAvailable="
				+ isTodayAvailable + ", type=" + travelType + ", totalSeats=" + totalSeats + ", createdAt=" + createdAt
				+ ", deletedAt=" + deletedAt + " ]";
	}
	
	
	
}

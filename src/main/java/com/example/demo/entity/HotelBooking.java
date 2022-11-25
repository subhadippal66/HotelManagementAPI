package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotelbooking")
public class HotelBooking {

	@Id
	@GeneratedValue
	private int id;
	private int userHash;
	private String userName;
	private String userMobileNo;
	private String userEmail;
	private String bookingDate; //YYYY-MM-DD
	private int noOfRooms;
	private int roomType;
	private int adults;
	private int children;
	private int location;
	private int paymentMode;
	private int status;
	private int status1;
	public HotelBooking(int id, int userHash, String userName, String userMobileNo, String userEmail,
			String bookingDate, int noOfRooms, int roomType, int adults, int children, int location, int paymentMode,
			int status, int status1) {
		super();
		this.id = id;
		this.userHash = userHash;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.userEmail = userEmail;
		this.bookingDate = bookingDate;
		this.noOfRooms = noOfRooms;
		this.roomType = roomType;
		this.adults = adults;
		this.children = children;
		this.location = location;
		this.paymentMode = paymentMode;
		this.status = status;
		this.status1 = status1;
	}
	public HotelBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserHash() {
		return userHash;
	}
	public void setUserHash(int userHash) {
		this.userHash = userHash;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStatus1() {
		return status1;
	}
	public void setStatus1(int status1) {
		this.status1 = status1;
	}
	@Override
	public String toString() {
		return "HotelBooking [id=" + id + ", userHash=" + userHash + ", userName=" + userName + ", userMobileNo="
				+ userMobileNo + ", userEmail=" + userEmail + ", bookingDate=" + bookingDate + ", noOfRooms="
				+ noOfRooms + ", roomType=" + roomType + ", adults=" + adults + ", children=" + children + ", location="
				+ location + ", paymentMode=" + paymentMode + ", status=" + status + ", status1=" + status1 + "]";
	}
	
		
	
}

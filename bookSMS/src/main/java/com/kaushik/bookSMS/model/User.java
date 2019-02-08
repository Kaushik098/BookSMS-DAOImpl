package com.kaushik.bookSMS.model;

import java.time.LocalDate;

public class User {

	private int userID;
	private String username;
	private String password;
	private LocalDate dob;
	private char gender;
	private String address;
	private int securityPin;
	
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getSecurityPin() {
		return securityPin;
	}
	public void setSecurityPin(int securityPin) {
		this.securityPin = securityPin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", securityPin=" + securityPin + "]";
	}
	
	
	
	
	
	
}

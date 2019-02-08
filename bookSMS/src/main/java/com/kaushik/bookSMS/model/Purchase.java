package com.kaushik.bookSMS.model;

import java.sql.Timestamp;

public class Purchase {

	private Timestamp dateTime;
	private long purchaseID;
	private int customerID;
	private String customerName;
	private int bookID;
	private String bookName;
	private String authorName;
	private int totalAmount;
	private String billStatus;
	
	
	
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public long getPurchaseID() {
		return purchaseID;
	}
	public void setPurchaseID(long purchaseID) {
		this.purchaseID = purchaseID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	
	@Override
	public String toString() {
		return "Purchase [dateTime=" + dateTime + ", purchaseID=" + purchaseID + ", customerID=" + customerID
				+ ", customerName=" + customerName + ", totalAmount=" + totalAmount + ", billStatus=" + billStatus
				+ "]";
	}

	
	
	
	
}

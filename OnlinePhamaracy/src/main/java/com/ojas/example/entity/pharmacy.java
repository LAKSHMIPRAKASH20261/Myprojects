package com.ojas.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHARMACY")
public class pharmacy {
	
	@Id
	@GeneratedValue
	private int pID;
	private String PName;
	private String pPhoneNumber;
	private String pAddress;
	public pharmacy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pharmacy(int pID, String pName, String pPhoneNumber, String pAddress) {
		super();
		this.pID = pID;
		PName = pName;
		this.pPhoneNumber = pPhoneNumber;
		this.pAddress = pAddress;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getpPhoneNumber() {
		return pPhoneNumber;
	}
	public void setpPhoneNumber(String pPhoneNumber) {
		this.pPhoneNumber = pPhoneNumber;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	
	

}

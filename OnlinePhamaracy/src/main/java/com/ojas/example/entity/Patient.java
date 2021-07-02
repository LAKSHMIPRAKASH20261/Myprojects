package com.ojas.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PATIENT_TABLE")
public class Patient {
	
	@Id
	@GeneratedValue
	private int pID;
	private String pName;
	private String problem;
	private int pAge;
	private int pAddress;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int pID, String pName, String problem, int pAge, int pAddress) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.problem = problem;
		this.pAge = pAge;
		this.pAddress = pAddress;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public int getpAddress() {
		return pAddress;
	}
	public void setpAddress(int pAddress) {
		this.pAddress = pAddress;
	}

	
}

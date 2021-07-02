package com.ojas.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCTOR_TABLE")
public class Doctor {

	@Id
	@GeneratedValue
	private int id;
	private String DName;
	private String DSpeciality;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public String getDSpeciality() {
		return DSpeciality;
	}
	public void setDSpeciality(String dSpeciality) {
		DSpeciality = dSpeciality;
	}
	public Doctor(int id, String dName, String dSpeciality) {
		super();
		this.id = id;
		DName = dName;
		DSpeciality = dSpeciality;
	}
	
	
}

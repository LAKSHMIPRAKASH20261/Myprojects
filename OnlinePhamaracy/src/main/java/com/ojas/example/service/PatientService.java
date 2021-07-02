package com.ojas.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.example.Repositroy.PatientRepo;
import com.ojas.example.entity.Doctor;
import com.ojas.example.entity.Patient;

@Service
public class PatientService {
	
	private PatientRepo patientRepo;
	
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
		
	}
	public List<Patient> savepaPatients(List<Patient> patients){
		return patientRepo.saveAll(patients);
		
	}
	public Patient getPatientById(int id) {
		return patientRepo.findById(id).orElse(null);
		
	}
	public List<Patient> getPatients(){
		return patientRepo.findAll();
		
	}
	public String deletePatientById(int id) {
	patientRepo.deleteById(id);
	return "patient is delete by id"+id;
	
	}
	
	public Patient updatePatient(Patient patient){
		Patient existingPatient=patientRepo.findById(patient.getpID()).orElse(null);
		existingPatient.setpID(patient.getpID());
		return patient;
		
	}
}

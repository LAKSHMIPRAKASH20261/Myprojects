package com.ojas.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.example.entity.Patient;
import com.ojas.example.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/addPatient")
	public Patient addPatient(Patient patient) {
		return patientService.savePatient(patient);
	}
	@PostMapping("/addPatients")
	public List<Patient> addPatients(@RequestBody List<Patient> patients) {
		return patientService.savepaPatients(patients);
	}
	@GetMapping("/findPatients")
	public List<Patient> findPatients() {
		return patientService.getPatients();
	}
	@GetMapping("/findPatientsById")
	public Patient findPatientById(int id) {
		return patientService.getPatientById(id);
	}
	@PutMapping("/updatePatient")
	public Patient updatePatient(Patient patient) {
		return patientService.updatePatient(patient);
	}
	@DeleteMapping("/deletePatient")
	public String deletePatient(int id) {
		return patientService.deletePatientById(id);
	}
}

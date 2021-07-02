package com.ojas.example.service;

import java.util.List;import javax.persistence.Id;
import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ojas.example.Repositroy.DoctorRepo;
import com.ojas.example.entity.Doctor;

@Service
public class DoctorService {

	private DoctorRepo doctorRepo;
	
	@PostMapping("/saveDoctor")
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	@PostMapping("/saveDoctors")
	public List<Doctor> saveDoctors(List<Doctor> doctors) {
		return doctorRepo.saveAll(doctors);
		
	}
	@GetMapping("/findDoctorById")
	public Doctor getDoctorById(int id) {
		return doctorRepo.findById(id).orElse(null);
		
	}
	@GetMapping("/getAllDoctors")
	public List<Doctor> getDoctors(){
		return doctorRepo.findAll();
		
	}
	@GetMapping("/getDoctorByName")
	public Doctor getDoctorByName(String name) {
		return doctorRepo.findByName(name);
		
	}
	@GetMapping("/getDoctorBySpecility")
	public Doctor getDoctorByDSpeciality(String dspeciality) {
		return doctorRepo.findByDSpeciality(dspeciality);
		
	}
	@DeleteMapping("/deleteDotorById")
	public String delectDocotor(int id) {
		doctorRepo.deleteById(id);
           return "doctor Removed "+id;
		
	}
	@PutMapping("/updatingDoctor")
	public Doctor updateDoctor(Doctor doctor) {
		Doctor existingDoctor=doctorRepo.findById(doctor.getId()).orElse(null);
		 existingDoctor.setDName(doctor.getDName());
		 existingDoctor.setDSpeciality(doctor.getDSpeciality());
		return doctorRepo.save(existingDoctor);
	}


}

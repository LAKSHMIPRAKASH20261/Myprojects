package com.ojas.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.example.entity.Doctor;
import com.ojas.example.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
	@PostMapping()
	public List<Doctor> addDoctors(@RequestBody List<Doctor> doctors){
		return doctorService.saveDoctors(doctors);
	}
	@GetMapping("/doctors")
	public List<Doctor> findAllDoctors(){
		return doctorService.getDoctors();
		
	}
	@GetMapping("/doctor/{id}")
	public Doctor findDoctorById(@PathVariable int id) {
		return doctorService.getDoctorById(id);
		
	}
	@GetMapping("/doctor/{DName}")
	public Doctor findByDoctorByName(@PathVariable String DName) {
		return doctorService.getDoctorByName(DName);
		
	}
	@GetMapping("/doctor/{DSpeciality}")
	public Doctor findByDSpeciality(@PathVariable String DSpeciality) {
		return doctorService.getDoctorByDSpeciality(DSpeciality);
		
	}
	@PutMapping("/updateDoctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}
	@DeleteMapping("/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable int id) {
		return doctorService.delectDocotor(id);
		
	}
	
	
	
}

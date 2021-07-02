package com.ojas.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.example.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
}

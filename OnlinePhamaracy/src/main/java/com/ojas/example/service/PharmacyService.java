package com.ojas.example.service;

import org.springframework.stereotype.Service;

import com.ojas.example.Repositroy.pharmacyRepo;
import com.ojas.example.entity.pharmacy;

@Service
public class PharmacyService {
	
	private pharmacyRepo pharmacyRepo;
	
	public pharmacy savepharmacy(pharmacy pharmacy) {
		return pharmacyRepo.save(pharmacy);
		
	}

}

package com.ojas.example.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.example.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}

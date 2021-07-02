package com.ojas.example.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.example.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer > {

	Doctor findByName(String name);

	Doctor findByDSpeciality(String dspeciality);
 
}

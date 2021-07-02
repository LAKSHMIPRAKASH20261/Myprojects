package com.ojas.example.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.example.entity.pharmacy;

public interface pharmacyRepo extends JpaRepository<pharmacy, Integer> {

}

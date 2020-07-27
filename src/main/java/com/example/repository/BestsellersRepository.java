package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Bestsellers;

public interface BestsellersRepository extends JpaRepository<Bestsellers, Integer> {

}

package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Bestsellers;
import com.example.repository.BestsellersRepository;
import com.example.service.BestsellersService;

@Service
public class BestsellersServiceImpl implements BestsellersService{
	
	
	@Autowired
	BestsellersRepository bestsellersRepository;

	public List<Bestsellers> getBestsellersList() {
		
		return bestsellersRepository.findAll();
	}
	
	

}

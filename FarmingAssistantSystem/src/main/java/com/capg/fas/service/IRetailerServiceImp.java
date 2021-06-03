package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.beans.Retailer;
import com.capg.fas.repository.IRepository;

@Service
public class IRetailerServiceImp implements IRetailerService {

	@Autowired
	IRepository repo;
	
	@Override
	public Retailer addRetailer(Retailer retailer) {
		
		return repo.save(retailer);
	}

}

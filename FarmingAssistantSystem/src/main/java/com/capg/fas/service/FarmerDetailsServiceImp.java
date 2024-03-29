package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.repository.IRepositoryFarmerDetails;
import com.capg.fas.util.FarmerDetailsUtils;

@Service
public class FarmerDetailsServiceImp implements IFarmerDetailsService {

	
	@Autowired
	IRepositoryFarmerDetails repo;
	
	@Override
	public FarmerDetailsDTO addFarmer(FarmerDetails farmer) {
		
		FarmerDetails far= repo.save(farmer);
		FarmerDetailsDTO fardto=FarmerDetailsUtils.convertToFarmerDetailsDto(far);
		return fardto;
	}

}

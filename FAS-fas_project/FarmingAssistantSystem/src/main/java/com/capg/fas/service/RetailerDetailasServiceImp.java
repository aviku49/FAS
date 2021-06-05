package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.repository.IRepositoryRetailerDetails;
import com.capg.fas.util.RetailerDetailsUtils;

@Service
public class RetailerDetailasServiceImp implements IRetailerDetailsService{

	@Autowired
	IRepositoryRetailerDetails repo;
	
	@Override
	public RetailerDetailsDTO addRetailer(RetailerDetails retailer) {
		
		RetailerDetails ret= repo.save(retailer);
		RetailerDetailsDTO retdto=RetailerDetailsUtils.convertToRetailerDetailsDto(ret);
		return retdto;
}
}

package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.RetailerDetailsDTO;

import com.capg.fas.exception.InvalidRetailerDetailsException;
import com.capg.fas.service.IRetailerDetailsService;
import com.capg.fas.service.RetailerDetailsServiceImp;

@RestController
@RequestMapping("/api/retailer")
public class RetailerDetailsController {

	@Autowired
	IRetailerDetailsService service;
	@PostMapping("/add")
	public RetailerDetailsDTO addRetailer(@RequestBody RetailerDetailsDTO retailer) throws InvalidRetailerDetailsException
	{
		RetailerDetailsDTO retailerDetails=null;
		boolean isValid = RetailerDetailsServiceImp.validRetailerDetails(retailer);
		if(isValid)
		{
		retailerDetails = service.addRetailer(retailer);
		}
		else
		{
			throw new InvalidRetailerDetailsException();
		}
		
		return retailerDetails;
		
	}
}

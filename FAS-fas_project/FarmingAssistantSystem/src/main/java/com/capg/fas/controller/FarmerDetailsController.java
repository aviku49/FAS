package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.service.IFarmerDetailsService;

@RestController
@RequestMapping("/api/farmer")
public class FarmerDetailsController {
	
	
	@Autowired
	IFarmerDetailsService service;
	
	@PostMapping("/add")
	public FarmerDetailsDTO addFarmerDetails(@RequestBody FarmerDetails farmer)
	{
		return service.addFarmer(farmer);
	}
	
	
	
	

}

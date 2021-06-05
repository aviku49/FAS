package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.service.IRetailerDetailsService;

@RestController
@RequestMapping("/api/retailer")
public class RetailerDetailsController {

	@Autowired
	IRetailerDetailsService service;
	@PostMapping("/add")
	public RetailerDetailsDTO addRetailer(@RequestBody RetailerDetails retailer)
	{
		return service.addRetailer(retailer);
		
	}
}

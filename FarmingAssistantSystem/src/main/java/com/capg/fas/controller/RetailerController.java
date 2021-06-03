package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.beans.Retailer;
import com.capg.fas.service.IRetailerService;

@RestController
@RequestMapping("/retailer")
public class RetailerController {
	
	@Autowired
	IRetailerService service;
	
	@PostMapping("/add")
	public Retailer insertRetailer(@RequestBody Retailer retailer)
	{
		return service.addRetailer(retailer);
	}
	

}

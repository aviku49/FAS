package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.service.IFarmerDetailsService;
import com.capg.fas.service.IOfferDetailsService;
import com.capg.fas.service.IPostAdvertisementService;

@RestController
@RequestMapping("/api/farmer")
public class FarmerDetailsController {
	
	
	@Autowired
	IFarmerDetailsService service;
	
	@Autowired
	IPostAdvertisementService ser;
	
	@Autowired
	IOfferDetailsService servi;
	
	@PostMapping("/add")
	public FarmerDetailsDTO addFarmerDetails(@RequestBody FarmerDetails farmer)
	{
		return service.addFarmer(farmer);
	}
	
	@GetMapping("/get/{id}")
	public PostAdvertisementDTO showAdvertisement(@PathVariable int id)
	{
		return ser.getPost(id);
	}
	
	@GetMapping("show/{ids}")
	public OfferDetailsDTO showOffer(@PathVariable int ids)
	{
		return servi.showOffer(ids);
	}
	
	
	
	

}

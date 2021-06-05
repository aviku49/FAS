package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.beans.OfferDetails;
import com.capg.fas.service.IOfferDetailsService;

@RestController
@RequestMapping("/api/offer")
public class OfferDetailsController {

	
	@Autowired
	IOfferDetailsService service;
	@PostMapping("/add")
	public OfferDetailsDTO addOffer(@RequestBody OfferDetails offer)
	{
		return service.addOffer(offer);
		
	}
}

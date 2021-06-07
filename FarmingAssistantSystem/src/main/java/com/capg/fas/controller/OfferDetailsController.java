package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.beans.OfferDetails;
import com.capg.fas.exception.InvalidOfferDetailsException;
import com.capg.fas.service.IOfferDetailsService;
import com.capg.fas.service.OfferDetailsServiceImp;

@RestController
@RequestMapping("/api/offer")
public class OfferDetailsController {

	
	@Autowired
	IOfferDetailsService service;
	@PostMapping("/add")
	public OfferDetailsDTO addOffer(@RequestBody OfferDetailsDTO offer) throws InvalidOfferDetailsException
	{
		OfferDetailsDTO offerDto=null;
		boolean isValid=OfferDetailsServiceImp.validOfferDetails(offer);
		if(isValid)
		{
	      offerDto = service.addOffer(offer);
		}
		else
		{
			throw new InvalidOfferDetailsException();
		}
		return offerDto;
		
	}
}

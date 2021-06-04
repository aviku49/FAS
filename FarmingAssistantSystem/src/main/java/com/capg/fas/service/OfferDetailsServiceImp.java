package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.beans.OfferDetails;
import com.capg.fas.repository.IRepositoryOfferDetails;

import com.capg.fas.util.OfferDetailsUtils;

@Service
public class OfferDetailsServiceImp implements IOfferDetailsService {

	@Autowired
	IRepositoryOfferDetails repo;
	
	@Override
	public OfferDetailsDTO addOffer(OfferDetails offer) {
		
		OfferDetails com= repo.save(offer);
		OfferDetailsDTO comdto=OfferDetailsUtils.convertToOfferDetailsDto(com);
		return comdto;
	}

}

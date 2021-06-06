package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.OfferDetails;
import com.capg.fas.beans.PostAdvertisement;
import com.capg.fas.repository.IRepositoryOfferDetails;

import com.capg.fas.util.OfferDetailsUtils;
import com.capg.fas.util.PostAdvertisementUtils;

@Service
public class OfferDetailsServiceImp implements IOfferDetailsService {

	@Autowired
	IRepositoryOfferDetails repo;
	
	@Override
	public OfferDetailsDTO addOffer(OfferDetails offer) {
		
		OfferDetails ofs= repo.save(offer);
		OfferDetailsDTO ofsdto=OfferDetailsUtils.convertToOfferDetailsDto(ofs);
		return ofsdto;
	}

	@Override
	public OfferDetailsDTO showOffer(int id) {
		
		OfferDetails list= repo.findById(id).orElse(new OfferDetails());
		OfferDetailsDTO posdto=OfferDetailsUtils.convertToOfferDetailsDto(list);
		return posdto;
	}

}

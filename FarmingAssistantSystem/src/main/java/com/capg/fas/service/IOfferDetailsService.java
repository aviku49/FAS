package com.capg.fas.service;


import com.capg.fas.DTO.OfferDetailsDTO;



public interface IOfferDetailsService {
	
	public OfferDetailsDTO addOffer(OfferDetailsDTO offer);

	public OfferDetailsDTO showOffer(int id);
}

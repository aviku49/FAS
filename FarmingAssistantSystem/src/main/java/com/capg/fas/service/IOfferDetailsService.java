package com.capg.fas.service;


import com.capg.fas.DTO.OfferDetailsDTO;

import com.capg.fas.beans.OfferDetails;

public interface IOfferDetailsService {
	
	public OfferDetailsDTO addOffer(OfferDetails offer);

	public OfferDetailsDTO showOffer(int id);
}

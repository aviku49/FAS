package com.capg.fas.service;


import java.util.List;

import com.capg.fas.DTO.OfferDetailsDTO;
/*
 * @Author 1 : Rajesh
 *  @Author 2 : Naveen
 * Date : 7/june/2021
 * Description : This is interface  for offer
 * 
 */

public interface IOfferDetailsService {
	
	public OfferDetailsDTO addOffer(OfferDetailsDTO offer);

	public OfferDetailsDTO showOffer(int id);
	
	public List<OfferDetailsDTO> getAllOffer();
}
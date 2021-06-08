package com.capg.fas.service;

import java.util.regex.Pattern;

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
	public OfferDetailsDTO addOffer(OfferDetailsDTO offer) {
		OfferDetails offerSimple=OfferDetailsUtils.convertToOfferDetails(offer);
		OfferDetails offer1= repo.save(offerSimple);
		OfferDetailsDTO offerDTO=OfferDetailsUtils.convertToOfferDetailsDto(offer1);
		return offerDTO;
	}

	@Override
	public OfferDetailsDTO showOffer(int id) {
		
		OfferDetails list= repo.findById(id).orElse(new OfferDetails());
		OfferDetailsDTO posdto=OfferDetailsUtils.convertToOfferDetailsDto(list);
		return posdto;
	}

	public static boolean validOfferDetails(OfferDetailsDTO offerdetails)
	{
		boolean flag=false;
		
		
		if(
				Pattern.matches("^[A-Za-z]\\w{5,29}$",offerdetails.getProductName())&&
				offerdetails.getProductPrice()>=0&&
				Pattern.matches("^[0-9]\\w{100}$",offerdetails.getProductDiscount())&&
				Pattern.matches("^[0-9]\\w{1000}$",offerdetails.getProductQuantity())&&
		offerdetails.getRetailer().getRetailerId()>0)
		{
			flag=true;
		}
		return flag;
		
	}
}

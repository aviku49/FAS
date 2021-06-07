package com.capg.fas.service;

import java.util.regex.Pattern;

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
		String retailerId=String.valueOf(offerdetails.getRetailer().getRetailerId());
		String productId=String.valueOf(offerdetails.getProductId());
		
		if((Pattern.matches("[123456789]{1}[0-9]{7}", productId))&&
				Pattern.matches("^[A-Za-z]\\w{5,29}$",offerdetails.getProductName())&&
				offerdetails.getProductPrice()>=0&&
				Pattern.matches("^[0-9]\\w{100}$",offerdetails.getProductDiscount())&&
				Pattern.matches("^[0-9]\\w{1000}$",offerdetails.getProductQuantity())&&
				Pattern.matches("[123456789]{1}[0-9]{7}", retailerId))
		{
			flag=true;
		}
		return flag;
		
	}
}

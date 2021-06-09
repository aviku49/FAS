package com.capg.fas.service;

import java.util.List;
import java.util.Optional;
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
	
	/*
	 * @Author 1: Rajesh
	 * @Author 2: Naveen
	 * Date :7/june/2021
	 * Description : This is serviceImp for add offer
	 * Params :  OfferDetailsDTO
	 * return : OfferDetailsDTO
	 * 
	 */
	@Override
	public OfferDetailsDTO addOffer(OfferDetailsDTO offer) {
		OfferDetails offerSimple=OfferDetailsUtils.convertToOfferDetails(offer);
		OfferDetails offer1= repo.save(offerSimple);
		OfferDetailsDTO offerDTO=OfferDetailsUtils.convertToOfferDetailsDto(offer1);
		return offerDTO;
	}

	/*
	 * @Author 1: Rajesh
	 * @Author 2: Naveen
	 * Date :7/june/2021
	 * Description : This is serviceImp for  find offer by id
	 * Params :  int
	 * return : OfferDetailsDTO
	 * 
	 */
	@Override
	public OfferDetailsDTO showOffer(int id) {
		
		Optional<OfferDetails> list= repo.findById(id);
		if(list.isPresent())
		{
			OfferDetails offer=list.get();
			OfferDetailsDTO offerDto= OfferDetailsUtils.convertToOfferDetailsDto(offer);
			return offerDto;
		}
		else
		{
			return null;
		}
		
	}

	public static boolean validOfferDetails(OfferDetailsDTO offerdetails)
	{
		boolean flag=false;
		
		
		if(
				Pattern.matches("^[A-Za-z]\\w{5,29}$",offerdetails.getProductName())&&
				(offerdetails.getFarmingTips().length()<500)&&
				offerdetails.getProductPrice()>0&&
				Pattern.matches("^[0-9]{0,100}$",offerdetails.getProductDiscount())&&
				Pattern.matches("^[0-9]{0,1000}$",offerdetails.getProductQuantity())&&
		offerdetails.getRetailer().getRetailerId()>0)
		{
			flag=true;
		}
		return flag;
		
	}

	/*
	 * @Author 1: Rajesh
	 * @Author 2: Naveen
	 * Date :7/june/2021
	 * Description : This is serviceImp for  find all offer 
	 * return : List<OfferDetailsDTO>
	 * 
	 */
	@Override
	public List<OfferDetailsDTO> getAllOffer() {
		List<OfferDetails> list= repo.findAll();
		List<OfferDetailsDTO> listDto=OfferDetailsUtils.convertToOfferDetailsDTOList(list);
		return listDto;
	}
}

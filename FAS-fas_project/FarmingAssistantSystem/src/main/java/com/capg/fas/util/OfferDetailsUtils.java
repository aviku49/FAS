package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.beans.OfferDetails;

public class OfferDetailsUtils {
	
	public static List<OfferDetailsDTO> convertToOfferDetailsDTOList(List<OfferDetails> list){
		List<OfferDetailsDTO> dtolist = new ArrayList<OfferDetailsDTO>();
		for(OfferDetails OfferDetails : list) 
			dtolist.add(convertToOfferDetailsDto(OfferDetails));
		return dtolist;
	}
	
	public static OfferDetails convertToOfferDetails(OfferDetailsDTO OfferDetailsDTO) {
		OfferDetails OfferDetails = new OfferDetails();
		OfferDetails.setProductQuantity(OfferDetailsDTO.getProductQuantity());
		OfferDetails.setProductDiscount(OfferDetailsDTO.getProductDiscount());
		OfferDetails.setProductPrice(OfferDetailsDTO.getProductPrice());
		OfferDetails.setProductName(OfferDetailsDTO.getProductName());
		OfferDetails.setProductId(OfferDetailsDTO.getProductId());
		OfferDetails.setFarmer(OfferDetailsDTO.getFarmer());
		OfferDetails.setResponse(OfferDetailsDTO.getResponse());
		
		return OfferDetails;
	}
	
	
		
		public static OfferDetailsDTO convertToOfferDetailsDto(OfferDetails OfferDetails) {
			OfferDetailsDTO OfferDetailsDTO = new OfferDetailsDTO();
			OfferDetailsDTO.setProductQuantity(OfferDetails.getProductQuantity());
			OfferDetailsDTO.setProductDiscount(OfferDetails.getProductDiscount());
			OfferDetailsDTO.setProductPrice(OfferDetails.getProductPrice());
			OfferDetailsDTO.setProductName(OfferDetails.getProductName());
			OfferDetailsDTO.setProductId(OfferDetails.getProductId());
			OfferDetailsDTO.setFarmer(OfferDetails.getFarmer());
			OfferDetailsDTO.setResponse(OfferDetails.getResponse());
			return OfferDetailsDTO;
		}

}

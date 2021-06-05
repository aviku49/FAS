package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;

public class RetailerDetailsUtils {
	
	public static List<RetailerDetailsDTO> convertToRetailerDetailsDTOList(List<RetailerDetails> list){
		List<RetailerDetailsDTO> dtolist = new ArrayList<RetailerDetailsDTO>();
		for(RetailerDetails RetailerDetails : list) 
			dtolist.add(convertToRetailerDetailsDto(RetailerDetails));
		return dtolist;
	}
	
	public static RetailerDetails convertToRetailerDetails(RetailerDetailsDTO RetailerDetailsDTO) {
		RetailerDetails RetailerDetails = new RetailerDetails();
		RetailerDetails.setRetailerCategory(RetailerDetailsDTO.getRetailerCategory());
		RetailerDetails.setRetailerNumber(RetailerDetailsDTO.getRetailerNumber());
		RetailerDetails.setRetailerName(RetailerDetailsDTO.getRetailerName());
		RetailerDetails.setRetailerId(RetailerDetailsDTO.getRetailerId());
		
		return RetailerDetails;
	}
	
	
		
		public static RetailerDetailsDTO convertToRetailerDetailsDto(RetailerDetails RetailerDetails) {
			RetailerDetailsDTO RetailerDetailsDTO = new RetailerDetailsDTO();
			RetailerDetailsDTO.setRetailerCategory(RetailerDetails.getRetailerCategory());
			RetailerDetailsDTO.setRetailerNumber(RetailerDetails.getRetailerNumber());
			RetailerDetailsDTO.setRetailerName(RetailerDetails.getRetailerName());
			RetailerDetailsDTO.setRetailerId(RetailerDetails.getRetailerId());
			return RetailerDetailsDTO;
		}

}

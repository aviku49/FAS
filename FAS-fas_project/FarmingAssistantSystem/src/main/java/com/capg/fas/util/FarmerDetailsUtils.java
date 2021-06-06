package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.FarmerDetails;

public class FarmerDetailsUtils {
	
	public static List<FarmerDetailsDTO> convertToFarmerDetailsDTOList(List<FarmerDetails> list){
		List<FarmerDetailsDTO> dtolist = new ArrayList<FarmerDetailsDTO>();
		for(FarmerDetails FarmerDetails : list) 
			dtolist.add(convertToFarmerDetailsDto(FarmerDetails));
		return dtolist;
	}
	
	public static FarmerDetails convertToFarmerDetails(FarmerDetailsDTO FarmerDetailsDTO) {
		FarmerDetails FarmerDetails = new FarmerDetails();
		
		FarmerDetails.setComplain(FarmerDetailsDTO.getComplain());
		FarmerDetails.setTypeOfCrop(FarmerDetailsDTO.getTypeOfCrop());
		FarmerDetails.setFarmerAddress(FarmerDetailsDTO.getFarmerAddress());
		FarmerDetails.setFarmerNumber(FarmerDetailsDTO.getFarmerNumber());
		FarmerDetails.setFarmerAge(FarmerDetailsDTO.getFarmerAge());
		FarmerDetails.setFarmerName(FarmerDetailsDTO.getFarmerName());
		FarmerDetails.setFarmerId(FarmerDetailsDTO.getFarmerId());
		
		return FarmerDetails;
	}
	
	
		
		public static FarmerDetailsDTO convertToFarmerDetailsDto(FarmerDetails FarmerDetails) {
			FarmerDetailsDTO FarmerDetailsDTO = new FarmerDetailsDTO();
			
			FarmerDetailsDTO.setComplain(FarmerDetails.getComplain());
			FarmerDetailsDTO.setTypeOfCrop(FarmerDetails.getTypeOfCrop());
			FarmerDetailsDTO.setFarmerAddress(FarmerDetails.getFarmerAddress());
			FarmerDetailsDTO.setFarmerNumber(FarmerDetails.getFarmerNumber());
			FarmerDetailsDTO.setFarmerAge(FarmerDetails.getFarmerAge());
			FarmerDetailsDTO.setFarmerName(FarmerDetails.getFarmerName());
			FarmerDetailsDTO.setFarmerId(FarmerDetails.getFarmerId());
			return FarmerDetailsDTO;
		}

}

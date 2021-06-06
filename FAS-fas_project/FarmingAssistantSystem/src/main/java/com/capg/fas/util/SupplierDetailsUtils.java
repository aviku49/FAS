package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.beans.SupplierDetails;

public class SupplierDetailsUtils {

	public static List<SupplierDetailsDTO> convertToSupplierDetailsDTOList(List<SupplierDetails> list){
		List<SupplierDetailsDTO> dtolist = new ArrayList<SupplierDetailsDTO>();
		for(SupplierDetails SupplierDetails : list) 
			dtolist.add(convertToSupplierDetailsDto(SupplierDetails));
		return dtolist;
	}
	
	public static SupplierDetails convertToSupplierDetails(SupplierDetailsDTO SupplierDetailsDTO) {
		SupplierDetails SupplierDetails = new SupplierDetails();
		SupplierDetails.setSupplierNumber(SupplierDetailsDTO.getSupplierNumber());
		SupplierDetails.setSupplierName(SupplierDetailsDTO.getSupplierName());
		SupplierDetails.setSupplierId(SupplierDetailsDTO.getSupplierId());
		SupplierDetails.setAdvertise(SupplierDetailsDTO.getAdvertise());
		return SupplierDetails;
	}
	
	
		
		public static SupplierDetailsDTO convertToSupplierDetailsDto(SupplierDetails SupplierDetails) {
			SupplierDetailsDTO SupplierDetailsDTO = new SupplierDetailsDTO();
			SupplierDetailsDTO.setSupplierNumber(SupplierDetails.getSupplierNumber());
			SupplierDetailsDTO.setSupplierName(SupplierDetails.getSupplierName());
			SupplierDetailsDTO.setSupplierId(SupplierDetails.getSupplierId());
			SupplierDetailsDTO .setAdvertise(SupplierDetails.getAdvertise());
			return SupplierDetailsDTO;
		}
}

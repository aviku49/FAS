package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;

public class ComplaintDetailsUtils {
	public static List<ComplaintDetailsDTO> convertToComplaintDetailsDTOList(List<ComplaintDetails> list){
		List<ComplaintDetailsDTO> dtolist = new ArrayList<ComplaintDetailsDTO>();
		for(ComplaintDetails ComplaintDetails : list) 
			dtolist.add(convertToComplaintDetailsDto(ComplaintDetails));
		return dtolist;
	}
	
	public static ComplaintDetails convertToComplaintDetails(ComplaintDetailsDTO ComplaintDetailsDTO) {
		ComplaintDetails ComplaintDetails = new ComplaintDetails();
		ComplaintDetails.setComplaintFrom(ComplaintDetailsDTO.getComplaintFrom());
		ComplaintDetails.setComplaintOn(ComplaintDetailsDTO.getComplaintOn());
		ComplaintDetails.setComplaintMessage(ComplaintDetailsDTO.getComplaintMessage());
		ComplaintDetails.setComplaintType(ComplaintDetailsDTO.getComplaintType());
		ComplaintDetails.setComplaintId(ComplaintDetailsDTO.getComplaintId());

		return ComplaintDetails;
	}
	
	
		
		public static ComplaintDetailsDTO convertToComplaintDetailsDto(ComplaintDetails ComplaintDetails) {
			ComplaintDetailsDTO ComplaintDetailsDTO = new ComplaintDetailsDTO();
			ComplaintDetailsDTO.setComplaintFrom(ComplaintDetails.getComplaintFrom());
			ComplaintDetailsDTO.setComplaintOn(ComplaintDetails.getComplaintOn());
			ComplaintDetailsDTO.setComplaintMessage(ComplaintDetails.getComplaintMessage());
			ComplaintDetailsDTO.setComplaintType(ComplaintDetails.getComplaintType());
			ComplaintDetailsDTO.setComplaintId(ComplaintDetails.getComplaintId());
			
			return ComplaintDetailsDTO;
		}

}

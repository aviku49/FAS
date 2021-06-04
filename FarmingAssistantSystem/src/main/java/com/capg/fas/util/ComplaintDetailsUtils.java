package com.capg.fas.util;

public class ComplaintDetailsUtils {
	public static List<ComplaintDetailsDTO> convertToComplaintDetailsDTOList(List<ComplaintDetails> list){
		List<ComplaintDetailsDTO> dtolist = new ArrayList<ComplaintDetailsDTO>();
		for(ComplaintDetails ComplaintDetails : list) 
			dtolist.add(convertToComplaintDetailsDTO(ComplaintDetails));
		return dtolist;
	}
	
	public static ComplaintDetails convertToComplaintDetails(ComplaintDetailsDTO ComplaintDetailsDTO) {
		ComplaintDetails ComplaintDetails = new ComplaintDetails();
		ComplaintDetails.setSalary(ComplaintDetailsDTO.getSalary());
		ComplaintDetails.setName(ComplaintDetailsDTO.getName());
		ComplaintDetails.setId(ComplaintDetailsDTO.getId());
		return ComplaintDetails;
	}
	
	
		
		public static ComplaintDetailsDTO convertToComplaintDetailsDTO(ComplaintDetails ComplaintDetails) {
			ComplaintDetailsDTO ComplaintDetailsDTO = new ComplaintDetailsDTO();
			ComplaintDetailsDTO.setSalary(ComplaintDetails.getSalary());
			ComplaintDetailsDTO.setName(ComplaintDetails.getName());
			ComplaintDetailsDTO.setId(ComplaintDetails.getId());
			return ComplaintDetailsDTO;
		}

}

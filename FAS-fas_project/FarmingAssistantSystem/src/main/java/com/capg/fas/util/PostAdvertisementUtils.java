package com.capg.fas.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.PostAdvertisement;

public class PostAdvertisementUtils {
	public static List<PostAdvertisementDTO> convertToPostAdvertisementDTOList(List<PostAdvertisement> list){
		List<PostAdvertisementDTO> dtolist = new ArrayList<PostAdvertisementDTO>();
		for(PostAdvertisement PostAdvertisement : list) 
			dtolist.add(convertToPostAdvertisementDto(PostAdvertisement));
		return dtolist;
	}
	
	public static PostAdvertisement convertToPostAdvertisement(PostAdvertisementDTO PostAdvertisementDTO) {
		PostAdvertisement PostAdvertisement = new PostAdvertisement();

		PostAdvertisement.setQuantityInKgs(PostAdvertisementDTO.getQuantityInKgs());
		PostAdvertisement.setTypeOfCrop(PostAdvertisementDTO.getTypeOfCrop());

		PostAdvertisement.setPostId(PostAdvertisementDTO.getPostId());
		PostAdvertisement.setFarmer(PostAdvertisementDTO.getFarmer());
		PostAdvertisement.setSupplier(PostAdvertisementDTO.getSupplier());
		PostAdvertisement.setResponse(PostAdvertisementDTO.getResponse());
		return PostAdvertisement;
	}
	
	
		
		public static PostAdvertisementDTO convertToPostAdvertisementDto(PostAdvertisement PostAdvertisement) {
			PostAdvertisementDTO PostAdvertisementDTO = new PostAdvertisementDTO();
		
			PostAdvertisementDTO.setQuantityInKgs(PostAdvertisement.getQuantityInKgs());
			PostAdvertisementDTO.setTypeOfCrop(PostAdvertisement.getTypeOfCrop());
		
			PostAdvertisementDTO.setPostId(PostAdvertisement.getPostId());
			PostAdvertisementDTO.setFarmer(PostAdvertisement.getFarmer());
			PostAdvertisementDTO.setSupplier(PostAdvertisement.getSupplier());
			PostAdvertisementDTO.setResponse(PostAdvertisement.getResponse());
			return PostAdvertisementDTO;
		}

}

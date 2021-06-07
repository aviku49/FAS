package com.capg.fas.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.PostAdvertisement;
import com.capg.fas.repository.IRepositoryPostAdvertisement;
import com.capg.fas.util.PostAdvertisementUtils;

@Service
public class PostAdvertisementServiceImp implements IPostAdvertisementService {

	@Autowired
	IRepositoryPostAdvertisement repo;
	
	@Override
	public PostAdvertisementDTO addPost(PostAdvertisementDTO post) {
		PostAdvertisement simplePost=PostAdvertisementUtils.convertToPostAdvertisement(post);
		PostAdvertisement post1= repo.save(simplePost);
		PostAdvertisementDTO postDto=PostAdvertisementUtils.convertToPostAdvertisementDto(post1);
		return postDto;

}

	@Override
	public PostAdvertisementDTO getPost(int id) {
		
		PostAdvertisement list= repo.findById(id).orElse(new PostAdvertisement());
		PostAdvertisementDTO posdto=PostAdvertisementUtils.convertToPostAdvertisementDto(list);
		return posdto;

	}
	public static boolean validPost(PostAdvertisementDTO advertise)
	{
		boolean flag=false;
		String postId=String.valueOf(advertise.getPostId());
		String supplierId=String.valueOf(advertise.getSupplier().getSupplierId());
		if((Pattern.matches("[123456789]{1}[0-9]{7}", postId))&&
				(advertise.getTypeOfCrop().length()<30)&&
				Pattern.matches("^[0-9]{1000}$",advertise.getQuantity())&&
				Pattern.matches("[123456789]{1}[0-9]{7}", supplierId))
		{
			flag=true;
		}
		return flag;
		
		
	}
}
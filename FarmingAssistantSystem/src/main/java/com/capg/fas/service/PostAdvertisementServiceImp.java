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
	public PostAdvertisementDTO addPost(PostAdvertisement post) {
		
		PostAdvertisement pos= repo.save(post);
		PostAdvertisementDTO posdto=PostAdvertisementUtils.convertToPostAdvertisementDto(pos);
		return posdto;

}

	@Override
	public PostAdvertisementDTO getPost(int id) {
		
		PostAdvertisement list= repo.findById(id).orElse(new PostAdvertisement());
		PostAdvertisementDTO posdto=PostAdvertisementUtils.convertToPostAdvertisementDto(list);
		return posdto;

	}
	public static boolean validPost(PostAdvertisement ad)
	{
		boolean flag=false;
		String id=String.valueOf(ad.getPostId());
		if((Pattern.matches("[123456789]{1}[0-9]{8}", id))&&
				(ad.getTypeOfCrop().length()<30)&&
				Pattern.matches("^[0-9]\\w{1000}$",ad.getQuantity()))
		{
			flag=true;
		}
		return flag;
		
		
	}
}
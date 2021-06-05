package com.capg.fas.service;

import java.util.List;

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
}
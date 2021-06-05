package com.capg.fas.service;

import java.util.List;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.PostAdvertisement;

public interface IPostAdvertisementService {
	
	public PostAdvertisementDTO addPost(PostAdvertisement post);
	
	public  PostAdvertisementDTO getPost(int id);
	
	

}

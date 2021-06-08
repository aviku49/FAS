package com.capg.fas.service;



import com.capg.fas.DTO.PostAdvertisementDTO;


public interface IPostAdvertisementService {
	
	public PostAdvertisementDTO addPost(PostAdvertisementDTO post);
	
	public  PostAdvertisementDTO getPost(int id);
	
	

}

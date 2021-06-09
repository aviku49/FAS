package com.capg.fas.service;



import java.util.List;

import com.capg.fas.DTO.PostAdvertisementDTO;

/*
 * @Author 1 : Sai Supriya
 * @Author 2 : Sowgandhika 
 * Date : 7/june/2021
 * Description : This is interface  for postAdvertisement
 * 
 */
public interface IPostAdvertisementService {
	
	public PostAdvertisementDTO addPost(PostAdvertisementDTO post);
	
	public  PostAdvertisementDTO getPost(int id);
	
	public List<PostAdvertisementDTO> getAllPost();
	
	

}

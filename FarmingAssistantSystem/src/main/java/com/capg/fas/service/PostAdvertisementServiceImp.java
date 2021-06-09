package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.PostAdvertisement;
import com.capg.fas.repository.IRepositoryPostAdvertisement;
import com.capg.fas.util.PostAdvertisementUtils;

import java.util.List;
import java.util.Optional;

@Service
public class PostAdvertisementServiceImp implements IPostAdvertisementService {

	
	
	@Autowired
	IRepositoryPostAdvertisement repo;
	
	/*
	 * @Author 1 : Sai Supriya
	 * @Author 2 : Sowgandhika 
	 * Date : 7/june/2021
	 * Description : This is serviceImp  for  add postAdvertisement
	 * params : PostAdvertisementDTO
	 * return : PostAdvertisementDTO
	 * 
	 */
	@Override
	public PostAdvertisementDTO addPost(PostAdvertisementDTO post) {
		PostAdvertisement simplePost=PostAdvertisementUtils.convertToPostAdvertisement(post);
		PostAdvertisement post1= repo.save(simplePost);
		PostAdvertisementDTO postDto=PostAdvertisementUtils.convertToPostAdvertisementDto(post1);
		return postDto;

}

	

	/*
	 * @Author 1 : Sai Supriya
	 * @Author 2 : Sowgandhika 
	 * Date : 7/june/2021
	 * Description : This is serviceImp  for get postAdvertisement by id
	 * params : int
	 * return : PostAdvertisementDTO
	 * 
	 */
	 @Override
      public PostAdvertisementDTO getPost(int id) {
		
		
		Optional<PostAdvertisement> response=repo.findById(id);
		//PostAdvertisement list= repo.findById(id).get();
		if(response.isPresent()) {
			
		
		PostAdvertisement list=response.get();
		PostAdvertisementDTO posdto=PostAdvertisementUtils.convertToPostAdvertisementDto(list);
		return posdto;}
		else
		{
			return null;
		}
		
	 }
		
	public static boolean validPost(PostAdvertisementDTO advertise)
	{
		boolean flag=false;
		
		if(
				(advertise.getTypeOfCrop().length()<30)&&
				(advertise.getQuantity()!=null))
		{
			flag=true;
		}
		return flag;
		
		
	}
	/*
	 * @Author 1 : Sai Supriya
	 * @Author 2 : Sowgandhika 
	 * Date : 7/june/2021
	 * Description : This is serviceImp  for  get all postAdvertisement
	 * return : List<PostAdvertisementDTO>
	 * 
	 */

	@Override
	public List<PostAdvertisementDTO> getAllPost() {
		List<PostAdvertisement> list= repo.findAll();
		List<PostAdvertisementDTO> listDto=PostAdvertisementUtils.convertToPostAdvertisementDTOList(list);
		return listDto;
	}
}
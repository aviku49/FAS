package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.PostAdvertisementDTO;

import com.capg.fas.service.IPostAdvertisementService;



@SpringBootTest
public class PostServiceTest {
	
	
	@Autowired
	IPostAdvertisementService service;
	
	
	@Test
	void addPostAdvertisement()
	{
		
		PostAdvertisementDTO post =new PostAdvertisementDTO();
		
		post.setPostId(5001);
		post.setQuantity("500kg");
		post.setTypeOfCrop("Wheat");
	  //post.setSupplier(null);
		
		
		PostAdvertisementDTO post_result =service.addPost(post);
		
		assertNotNull(post_result);

}
	
	@Test
	void getPostAdvertisement()
	{
		PostAdvertisementDTO post= service.getPost(5001);
		assertNotNull(post);
	}
	
}
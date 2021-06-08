package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.beans.SupplierDetails;
import com.capg.fas.service.IPostAdvertisementService;
import com.capg.fas.service.ISupplierDetailsService;
import com.capg.fas.service.PostAdvertisementServiceImp;



@SpringBootTest
public class PostServiceTest {
	
	
	@Autowired
	IPostAdvertisementService service;
	
	@Autowired
	ISupplierDetailsService ser;
	
	
	@Test
	void addPostAdvertisement()
	{
		
		
		PostAdvertisementDTO post =new PostAdvertisementDTO();
		
	//	post.setPostId(5001);
		post.setQuantity("500");
		post.setTypeOfCrop("Wheat");
	  //post.setSupplier(null);
		
		SupplierDetails supplier=new SupplierDetails();
		supplier.setSupplierId(12);
		supplier.setSupplierName("Avinash");
		supplier.setSupplierNumber( 9176298015L);
	
		
		post.setSupplier(supplier);
		
		
		
		PostAdvertisementDTO post_result =service.addPost(post);
		
		assertNotNull(post_result);

}
	@Test
	void addPostAdvertisementInvalid()
	{
		
		
		PostAdvertisementDTO post =new PostAdvertisementDTO();
		
	//	post.setPostId(5001);
		post.setQuantity(null);
		post.setTypeOfCrop("Wheatkdkkdkdkdkdkdkkdkddkkdkdkkdkdkdkdk");
	
		
		SupplierDetails supplier=new SupplierDetails();
		supplier.setSupplierId(12);
		supplier.setSupplierName("Avinash");
		supplier.setSupplierNumber( 9198015L);
	
		
		post.setSupplier(supplier);
		
		
		
		boolean isValid=PostAdvertisementServiceImp.validPost(post);
		
		assertFalse(isValid);

}
	
	@Test
	void getPostAdvertisement()
	{
		PostAdvertisementDTO post= service.getPost(11);
		assertNotNull(post);
	}
	@Test
	void getPostAdvertisementInvalid()
	{
		PostAdvertisementDTO post ;
		
		 post= service.getPost(324);
		 System.err.println(post+" this is from postInvalid");
		assertTrue(post==null);
	}
	
}
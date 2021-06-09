package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.SupplierDetails;
import com.capg.fas.service.IPostAdvertisementService;
import com.capg.fas.service.ISupplierDetailsService;
import com.capg.fas.service.PostAdvertisementServiceImp;



@SpringBootTest
public class PostServiceTest {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);
	
	
	@Autowired
	IPostAdvertisementService service;
	
	@Autowired
	ISupplierDetailsService ser;
	
	
	@Test
	void addPostAdvertisement()
	{
		
		
		PostAdvertisementDTO post =new PostAdvertisementDTO();
		
	
		post.setQuantity("500");
		post.setTypeOfCrop("Wheat");
	
		
		SupplierDetails supplier=new SupplierDetails();
		supplier.setSupplierId(12);
		supplier.setSupplierName("Avinash");
		supplier.setSupplierNumber( 9176298015L);
		supplier.setSupplierEmail("rajesh1@gmail.com");
	
		
		post.setSupplier(supplier);
		
		
		
		PostAdvertisementDTO post_result =service.addPost(post);
		
		assertNotNull(post_result);
		LOGGER.info("Valid add postDetails test case executed");

}
	@Test
	void addPostAdvertisementInvalid()
	{
		
		
		PostAdvertisementDTO post =new PostAdvertisementDTO();
		
	
		post.setQuantity(null);
		post.setTypeOfCrop("Wheatkdkkdkdkdkdkdkkdkddkkdkdkkdkdkdkdk");
	
		
		SupplierDetails supplier=new SupplierDetails();
		supplier.setSupplierId(12);
		supplier.setSupplierName("Avinash");
		supplier.setSupplierNumber( 9198015L);
		supplier.setSupplierEmail("rajesh1");
	
		
		post.setSupplier(supplier);
		
		
		
		boolean isValid=PostAdvertisementServiceImp.validPost(post);
		
		assertFalse(isValid);
		LOGGER.warn("Invalid add postDetails test case executed");

}
	
	@Test
	void getPostAdvertisement()
	{
		PostAdvertisementDTO post= service.getPost(1);
		assertNotNull(post);
		LOGGER.info("valid add postDetails test case executed");
	}
	@Test
	void getPostAdvertisementInvalid()
	{
		PostAdvertisementDTO post ;
		
		 post= service.getPost(324);
		 
		assertTrue(post==null);
		
		LOGGER.warn("Invalid add getPostDetails test case executed");
	}
	
}
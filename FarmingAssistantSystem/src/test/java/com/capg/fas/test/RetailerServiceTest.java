package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.RetailerDetailsDTO;

import com.capg.fas.service.IRetailerDetailsService;
import com.capg.fas.service.RetailerDetailsServiceImp;


@SpringBootTest
public class RetailerServiceTest {
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);
	
	
	@Autowired
	IRetailerDetailsService service;
	
	
	@Test
	void addRetailer()
	{
		
		RetailerDetailsDTO retailer = new RetailerDetailsDTO();
		
	
		retailer.setRetailerName("Avinash");
		retailer.setRetailerNumber(9863783736L);
		retailer.setRetailerCategory("Fertilizer");
		retailer.setRetailerEmail("avinash1@gmail.com");
	
		
		
		RetailerDetailsDTO retailer_result =service.addRetailer(retailer);
		
		assertNotNull(retailer_result);
		
		LOGGER.info("Valid add retailerDetails test case executed");


}
	
	
	
	
	
	@Test
	void addRetailerInvalid()
	{
		
		RetailerDetailsDTO retailer =new RetailerDetailsDTO();
		
	
		retailer.setRetailerName("Avinash");
		retailer.setRetailerNumber(93736L);
		retailer.setRetailerCategory("Fertilizer");
	
		retailer.setRetailerEmail("avi111.com");
		
		
		
		boolean isValid=RetailerDetailsServiceImp.validRetailerDetails(retailer);
		
		assertFalse(isValid);
		
		LOGGER.warn("Invalid add retailerDetails test case executed");


}
}
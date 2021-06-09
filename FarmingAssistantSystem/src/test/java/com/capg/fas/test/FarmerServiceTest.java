package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.FarmerDetailsDTO;


import com.capg.fas.service.FarmerDetailsServiceImp;


@SpringBootTest
public class FarmerServiceTest {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);

     @Autowired
     FarmerDetailsServiceImp service;
	
	
	@Test
	void testAddFarmer() {
		
			FarmerDetailsDTO farmer = new FarmerDetailsDTO();
	
			    farmer.setFarmerAge(45);
			    farmer.setFarmerAddress("Hyderabad");
			    farmer.setFarmerName("Naveen");
			    farmer.setFarmerNumber(9988776655L);
			    farmer.setFarmerEmail("sunil23@gmail.com");
			   
	
				
		FarmerDetailsDTO farmer_result =	service.addFarmer(farmer);
		
		assertNotNull(farmer_result);
		
		LOGGER.info("Valid add farmerDetails test case executed");
		
	}
	
	
	
	
	@Test
	void testAddFarmerInvalid() {
		
			FarmerDetailsDTO farmer = new FarmerDetailsDTO();
		
			    farmer.setFarmerAge(45);
			    farmer.setFarmerAddress("Hyderabad");
			    farmer.setFarmerName("Naveen");
			    farmer.setFarmerEmail("sunil23@gmailcom");
			    farmer.setFarmerNumber(99755L);
		
			    LOGGER.debug("FarmerDetails validating");
	boolean isValid  =	FarmerDetailsServiceImp.validFarmerDetails(farmer);
		
		assertFalse(isValid);
		LOGGER.warn("Invalid add farmerDetails test case executed");
	}
	
	
	
	
	/*
	 * 
	 */
	
	
	
}
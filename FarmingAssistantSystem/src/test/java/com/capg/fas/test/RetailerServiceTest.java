package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.RetailerDetailsDTO;

import com.capg.fas.service.IRetailerDetailsService;
import com.capg.fas.service.RetailerDetailsServiceImp;


@SpringBootTest
public class RetailerServiceTest {
	
	
	@Autowired
	IRetailerDetailsService service;
	
	
	@Test
	void addRetailer()
	{
		
		RetailerDetailsDTO retailer =new RetailerDetailsDTO();
		
	//	retailer.setRetailerId(3001);
		retailer.setRetailerName("Avinash");
		retailer.setRetailerNumber(9863783736L);
		retailer.setRetailerCategory("Fertilizer");
		retailer.setFarmingTips("wealth");
		//retailer.setofferDetials(null);
		
		
		RetailerDetailsDTO retailer_result =service.addRetailer(retailer);
		
		assertNotNull(retailer_result);


}
	@Test
	void addRetailerInvalid()
	{
		
		RetailerDetailsDTO retailer =new RetailerDetailsDTO();
		
	//	retailer.setRetailerId(3001);
		retailer.setRetailerName("Avinash");
		retailer.setRetailerNumber(93736L);
		retailer.setRetailerCategory("Fertilizer");
		retailer.setFarmingTips("wealth");
		//retailer.setofferDetials(null);
		
		
		boolean isValid=RetailerDetailsServiceImp.validRetailerDetails(retailer);
		
		assertFalse(isValid);


}
}
package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.service.IOfferDetailsService;
import com.capg.fas.service.IRetailerDetailsService;
import com.capg.fas.service.OfferDetailsServiceImp;



@SpringBootTest
public class OfferServiceTest {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);
	
	@Autowired
	IOfferDetailsService service;
	
	@Autowired
	IRetailerDetailsService ser;
	
	@Test
	void addOffer()
	{
		
		OfferDetailsDTO offer =new OfferDetailsDTO();
		
		
		offer.setProductName("Insecticide");
		offer.setProductPrice(4000);
		offer.setProductDiscount("10");
		offer.setProductQuantity("20");
		offer.setFarmingTips("water");
		
		RetailerDetails retailer =new RetailerDetails();
		
			retailer.setRetailerId(30);
			retailer.setRetailerName("Avinash");
			retailer.setRetailerNumber(9863783736L);
			retailer.setRetailerCategory("Fertilizer");
			retailer.setRetailerEmail("naveen13@gmail.com");
			
			
			offer.setRetailer(retailer);
		
		OfferDetailsDTO offer_result =service.addOffer(offer);
		
		assertNotNull(offer_result);
		LOGGER.info("Valid add offerDetails test case executed");

		
}
	@Test
	void addOfferInvalid()
	{
	
		
		OfferDetailsDTO offer =new OfferDetailsDTO();
		
		//offer.setProductId(4001);
		offer.setProductName("aa");
		offer.setProductPrice(0);
		offer.setProductDiscount("4");
		offer.setProductQuantity("0");
		offer.setFarmingTips("water");
		
		
		RetailerDetails retailer =new RetailerDetails();
		
			retailer.setRetailerId(1);
			retailer.setRetailerName("dahiya");
			retailer.setRetailerNumber(9863736L);
			retailer.setRetailerCategory("seed");
			retailer.setRetailerEmail("naveen$#gmailcom");
			
			
			offer.setRetailer(retailer);
			
		boolean isValid=OfferDetailsServiceImp.validOfferDetails(offer);
	
		assertFalse(isValid);
		LOGGER.warn("Invalid add offerDetails test case executed");

}
	@Test
	void getOffer()
	{
		OfferDetailsDTO offer= service.showOffer(1);
		assertNotNull(offer);
		LOGGER.info("Valid add getOffer test case executed");

	}
	
	@Test
	void getOfferInvalid()
	{
		OfferDetailsDTO offer;
		offer=service.showOffer(222);
		assertTrue(offer==null);
		LOGGER.warn("Invalid add getOffer test case executed");
	}
	
}
package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.service.IOfferDetailsService;
import com.capg.fas.service.IRetailerDetailsService;
import com.capg.fas.service.OfferDetailsServiceImp;



@SpringBootTest
public class OfferServiceTest {
	
	
	@Autowired
	IOfferDetailsService service;
	
	
	
	@Autowired
	IRetailerDetailsService ser;
	
	@Test
	void addOffer()
	{
		
		OfferDetailsDTO offer =new OfferDetailsDTO();
		
		//offer.setProductId(4001);
		offer.setProductName("Insecticide");
		offer.setProductPrice(4000);
		offer.setProductDiscount("10");
		offer.setProductQuantity("20");
		
		
		RetailerDetails retailer =new RetailerDetails();
		
			retailer.setRetailerId(30);
			retailer.setRetailerName("Avinash");
			retailer.setRetailerNumber(9863783736L);
			retailer.setRetailerCategory("Fertilizer");
			retailer.setFarmingTips("wealth");
			
			offer.setRetailer(retailer);
			
			
		
		
		OfferDetailsDTO offer_result =service.addOffer(offer);
		
		assertNotNull(offer_result);

		
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
		
		
		RetailerDetails retailer =new RetailerDetails();
		
			retailer.setRetailerId(1);
			retailer.setRetailerName("dahiya");
			retailer.setRetailerNumber(9863736L);
			retailer.setRetailerCategory("seed");
			retailer.setFarmingTips("wealth");
			
			offer.setRetailer(retailer);
			
		boolean isValid=OfferDetailsServiceImp.validOfferDetails(offer);
		
		
		
		
		assertFalse(isValid);

}
	@Test
	void getOffer()
	{
		OfferDetailsDTO offer= service.showOffer(4001);
		assertNotNull(offer);
	}
	
}
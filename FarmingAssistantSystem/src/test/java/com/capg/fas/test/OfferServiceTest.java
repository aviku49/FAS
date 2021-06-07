package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.OfferDetailsDTO;
import com.capg.fas.service.IOfferDetailsService;



@SpringBootTest
public class OfferServiceTest {
	
	
	@Autowired
	IOfferDetailsService service;
	
	
	@Test
	void addOffer()
	{
		
		OfferDetailsDTO offer =new OfferDetailsDTO();
		
		offer.setProductId(4001);
		offer.setProductName("Insecticide");
		offer.setProductPrice(4000);
		offer.setProductDiscount("10%");
		offer.setProductQuantity("20kgs");
		//offer.setRetailer(null);
		
		
		OfferDetailsDTO offer_result =service.addOffer(offer);
		
		assertNotNull(offer_result);

}
	
	@Test
	void getOffer()
	{
		OfferDetailsDTO offer= service.showOffer(4001);
		assertNotNull(offer);
	}
	
}
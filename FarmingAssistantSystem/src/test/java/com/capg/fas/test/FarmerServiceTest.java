package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.FarmerDetailsDTO;


import com.capg.fas.service.FarmerDetailsServiceImp;


@SpringBootTest
public class FarmerServiceTest {

     @Autowired
     FarmerDetailsServiceImp service;
	
	
	@Test
	void testAddFarmer() {
		
			FarmerDetailsDTO farmer = new FarmerDetailsDTO();
		//	ComplaintDetails complain=new ComplaintDetails();
			
			 
			 
			 
			//	farmer.setFarmerId(101);
			    farmer.setFarmerAge(45);
			    farmer.setFarmerAddress("Hyderabad");
			    farmer.setFarmerName("Naveen");
			    farmer.setTypeOfCrop("Wheat,Maize,Barley");
			    farmer.setFarmerNumber(9988776655L);
			   
			    
				
		/*	    
			    List<ComplaintDetails> list =new ArrayList<ComplaintDetails>(); 
				 
				
				 complain.setComplaintId(1001);
				 complain.setComplaintOn("Javeed");
				 complain.setComplaintType("Money");
				 complain.setComplaintMessage("You taken the 5 rice bags and not given money its already 2 weeks , So return my bag or else give my money");
				
				 FarmerDetails simpleFarmer=FarmerDetailsUtils.convertToFarmerDetails(farmer);
				 complain.setFarmer(simpleFarmer);
				 
		           list.add(complain);
		         //  farmer.setComplain(list);
		         	          
		     */
				
		FarmerDetailsDTO farmer_result =	service.addFarmer(farmer);
		
		assertNotNull(farmer_result);
		
	}
	
	@Test
	void testAddFarmerInvalid() {
		
			FarmerDetailsDTO farmer = new FarmerDetailsDTO();
		//	ComplaintDetails complain=new ComplaintDetails();
	 
			//	farmer.setFarmerId(101);
			    farmer.setFarmerAge(45);
			    farmer.setFarmerAddress("Hyderabad");
			    farmer.setFarmerName("Naveen");
			    farmer.setTypeOfCrop("Wheat,Maize,Barley");
			    farmer.setFarmerNumber(99755L);
		
	boolean isValid  =	FarmerDetailsServiceImp.validFarmerDetails(farmer);
		
		assertFalse(isValid);
		
	}
	
	
	
	
	
	
	
	
}
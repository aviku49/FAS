package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.service.ComplaintDetailsServiceImp;
import com.capg.fas.service.IComplaintDetailsService;

@SpringBootTest
public class ComplaintServiceTest {
	
	@Autowired
	IComplaintDetailsService service;
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);
	
	@Test
	
	void addComplaint()
	{
		ComplaintDetailsDTO complain=new ComplaintDetailsDTO();
		FarmerDetails farmer=new FarmerDetails();
		
		farmer.setFarmerId(34);
	    farmer.setFarmerAge(45);
	    farmer.setFarmerAddress("Hyderabad");
	    farmer.setFarmerName("Naveen");
	    farmer.setFarmerNumber(9988776655L);
	    farmer.setFarmerEmail("avinash1@gmail.com");
		
 
		complain.setComplaintOn("Javeed");
		complain.setComplaintMessage("You had taken 5 rice bags but money not given to me");
		complain.setComplaintType("Money not recieved");
		complain.setFarmer(farmer);
	
		
	ComplaintDetailsDTO complainresult =	service.addComplaint(complain);
		
		assertNotNull(complainresult);
		LOGGER.info("Valid add complaint test case executed");
	}

	
	@Test
	void addComplaintInvalid()
	{
		ComplaintDetailsDTO complain=new ComplaintDetailsDTO();
		FarmerDetails farmer=new FarmerDetails();
		
	//	farmer.setFarmerId(34);
	    farmer.setFarmerAge(300);
	    farmer.setFarmerAddress("HyderabadHyderabad");
	    farmer.setFarmerName("Nave");
	    farmer.setFarmerNumber(9988776655L);
	    farmer.setFarmerEmail("avinash1#gmail.com");
		
 
		complain.setComplaintOn("Javeed");
		complain.setComplaintMessage("You had taken 5 rice bags but money not given to me");
		complain.setComplaintType("Money not recieved");
		complain.setFarmer(farmer);
		
		boolean isValid = ComplaintDetailsServiceImp.validComplaintDetails(complain);
		
	
		
		assertFalse(isValid);
		LOGGER.error("invalid add complaint test case executed");
	}

}
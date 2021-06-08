package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.service.ComplaintDetailsServiceImp;
import com.capg.fas.service.IComplaintDetailsService;

@SpringBootTest
public class ComplaintServiceTest {
	
	@Autowired
	IComplaintDetailsService service;
	
	@Test
	
	void addComplaint()
	{
		ComplaintDetailsDTO complain=new ComplaintDetailsDTO();
		FarmerDetails farmer=new FarmerDetails();
		
		farmer.setFarmerId(34);
	    farmer.setFarmerAge(45);
	    farmer.setFarmerAddress("Hyderabad");
	    farmer.setFarmerName("Naveen");
	    farmer.setTypeOfCrop("Wheat,Maize,Barley");
	    farmer.setFarmerNumber(9988776655L);
		
 
		complain.setComplaintOn("Javeed");
		complain.setComplaintMessage("You had taken 5 rice bags but money not given to me");
		complain.setComplaintType("Money not recieved");
		complain.setFarmer(farmer);
		
	ComplaintDetailsDTO complainresult =	service.addComplaint(complain);
		
		assertNotNull(complainresult);
	}

	
	@Test
	void addComplaintInvalid()
	{
		ComplaintDetailsDTO complain=new ComplaintDetailsDTO();
		FarmerDetails farmer=new FarmerDetails();
		
	//	farmer.setFarmerId(34);
	    farmer.setFarmerAge(300);
	    farmer.setFarmerAddress("HyderabadHyderabadHyderabadHyderabad");
	    farmer.setFarmerName("Nave");
	    farmer.setTypeOfCrop("Wheat,Maize,Barley");
	    farmer.setFarmerNumber(9988776655L);
		
 
		complain.setComplaintOn("Javeed");
		complain.setComplaintMessage("You had taken 5 rice bags but money not given to me");
		complain.setComplaintType("Money not recieved");
		complain.setFarmer(farmer);
		
		boolean isValid = ComplaintDetailsServiceImp.validComplaintDetails(complain);
		
	
		
		assertFalse(isValid);
	}

}
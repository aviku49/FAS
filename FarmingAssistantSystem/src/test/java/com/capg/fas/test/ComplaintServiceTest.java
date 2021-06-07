package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.beans.FarmerDetails;
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
		
		farmer.setFarmerId(101);
	    farmer.setFarmerAge(45);
	    farmer.setFarmerAddress("Hyderabad");
	    farmer.setFarmerName("Naveen");
	    farmer.setTypeOfCrop("Wheat,Maize,Barley");
		
		complain.setComplaintId(1001);
		complain.setComplaintOn("Javeed");
		complain.setComplaintMessage("You had taken 5 rice bags but money not given to me");
		complain.setComplaintType("Money not recieved");
		complain.setFarmer(farmer);
		
	ComplaintDetailsDTO complainresult =	service.addComplaint(complain);
		
		assertNotNull(complainresult);
	}


}

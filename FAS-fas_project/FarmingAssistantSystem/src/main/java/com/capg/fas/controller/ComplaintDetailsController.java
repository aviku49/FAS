package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.service.IComplaintDetailsService;

@RestController
@RequestMapping("/api/complain")
public class ComplaintDetailsController {
	

	@Autowired
	IComplaintDetailsService service;
	
	@PostMapping("/add")
	public ComplaintDetailsDTO addFarmerDetails(@RequestBody ComplaintDetails details)
	{
		return service.addComplaint(details);
	}

}

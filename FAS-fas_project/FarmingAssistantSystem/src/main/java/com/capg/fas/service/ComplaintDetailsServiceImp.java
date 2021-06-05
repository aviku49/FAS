package com.capg.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.repository.IRepositoryComplaintDetails;
import com.capg.fas.util.ComplaintDetailsUtils;
import com.capg.fas.util.FarmerDetailsUtils;

@Service
public class ComplaintDetailsServiceImp implements IComplaintDetailsService {
	
	@Autowired
	IRepositoryComplaintDetails repo;

	@Override
	public ComplaintDetailsDTO addComplaint(ComplaintDetails details) {
		
		
		
		ComplaintDetails com= repo.save(details);
		ComplaintDetailsDTO comdto=ComplaintDetailsUtils.convertToComplaintDetailsDto(com);
		return comdto;
	}

}

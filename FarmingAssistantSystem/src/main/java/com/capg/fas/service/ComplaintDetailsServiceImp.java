package com.capg.fas.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.beans.OfferDetails;
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

	@Override
	public ComplaintDetailsDTO showComplain(int id) {
		ComplaintDetails coms= repo.findById(id).orElse(new ComplaintDetails());
		ComplaintDetailsDTO comsdto=ComplaintDetailsUtils.convertToComplaintDetailsDto(coms);
		return comsdto;
		
	}
	public static boolean validComplaintDetails(ComplaintDetails details)
	{
		boolean flag=false;
		String id=String.valueOf(details.getComplaintId());
	
	   if((Pattern.matches("[123456789]{1}[0-9]{8}", id))&&
			   (Pattern.matches("^[A-Za-z]\\w{5,29}$",details.getFarmer().getFarmerName())==true)&&
			   (Pattern.matches("^[A-Za-z]\\w{5,29}$", details.getComplaintOn())==true)&&
			   (details.getComplaintMessage()!=null)&&(details.getComplaintType()!=null))
		{
			flag=true;
		}
		return flag;
		
	}

}

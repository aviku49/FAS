package com.capg.fas.service;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;

public interface IComplaintDetailsService {
	
	
	public ComplaintDetailsDTO addComplaint(ComplaintDetailsDTO details);
	
	public ComplaintDetailsDTO showComplain(int id);

}
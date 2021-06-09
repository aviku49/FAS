package com.capg.fas.service;

import java.util.List;

import com.capg.fas.DTO.ComplaintDetailsDTO;
/*
 * @Author : Avinash
 * Date :7/june/2021
 * Description : This is interface for complain
 * 
 */

public interface IComplaintDetailsService {
	
	
	public ComplaintDetailsDTO addComplaint(ComplaintDetailsDTO details);
	
	public ComplaintDetailsDTO showComplain(int id);
	
	public List<ComplaintDetailsDTO> getAllComplaint();
	
	

}

package com.capg.fas.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.beans.ComplaintDetails;
import com.capg.fas.repository.IRepositoryComplaintDetails;
import com.capg.fas.util.ComplaintDetailsUtils;


@Service
public class ComplaintDetailsServiceImp implements IComplaintDetailsService {
	
	@Autowired
	IRepositoryComplaintDetails repo;

	
	/*
	 * @Author : Avinash
	 * Date :7/june/2021
	 * Description : This is serviceImp for  add complain
	 * Params :  ComplaintDetailsDTO
	 * return : ComplaintDetailsDTO
	 * 
	 */
	
	@Override
	public ComplaintDetailsDTO addComplaint(ComplaintDetailsDTO details) {
		
		
		ComplaintDetails simpleComplain=ComplaintDetailsUtils.convertToComplaintDetails(details);
		ComplaintDetails detail1= repo.save(simpleComplain);
		ComplaintDetailsDTO comDto=ComplaintDetailsUtils.convertToComplaintDetailsDto(detail1);
		return comDto;
	}

	/*
	 * Description : This is serviceImp for find complain by id
	 * Params :  int
	 * return : ComplaintDetailsDTO
	 * 
	 */
	@Override
	public ComplaintDetailsDTO showComplain(int id) {
		ComplaintDetails complain= repo.findById(id).orElse(new ComplaintDetails());
		ComplaintDetailsDTO comDto=ComplaintDetailsUtils.convertToComplaintDetailsDto(complain);
		return comDto;
		
	}
	public static boolean validComplaintDetails(ComplaintDetailsDTO details)
	{
		boolean flag=false;
		
		
		
	   if((details.getFarmer().getFarmerId()>0)&&
			   (Pattern.matches("^[A-Za-z]\\w{5,29}$", details.getComplaintOn())==true)&&
			   (details.getComplaintMessage()!=null)&&(details.getComplaintType()!=null))
		{
			flag=true;
		}
		return flag;
		
	}

	/*
	 * Description : This is serviceImp for find all complain 
	 * return : List<ComplaintDetailsDTO>
	 * 
	 */
	@Override
	public List<ComplaintDetailsDTO> getAllComplaint() {
		List<ComplaintDetails> list= repo.findAll();
		List<ComplaintDetailsDTO> listDto=ComplaintDetailsUtils.convertToComplaintDetailsDTOList(list);
		return listDto;
	}

}

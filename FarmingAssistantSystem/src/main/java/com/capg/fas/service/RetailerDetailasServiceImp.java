package com.capg.fas.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.repository.IRepositoryRetailerDetails;
import com.capg.fas.util.RetailerDetailsUtils;

@Service
public class RetailerDetailasServiceImp implements IRetailerDetailsService{

	@Autowired
	IRepositoryRetailerDetails repo;
	
	@Override
	public RetailerDetailsDTO addRetailer(RetailerDetails retailer) {
		
		RetailerDetails ret= repo.save(retailer);
		RetailerDetailsDTO retdto=RetailerDetailsUtils.convertToRetailerDetailsDto(ret);
		return retdto;
}
	public static boolean validRetailerDetails(RetailerDetails retailers)
	{
		boolean flag=false;
		String id=String.valueOf(retailers.getRetailerId());
		String str=String.valueOf(retailers.getRetailerNumber());
		if((Pattern.matches("[123456789]{1}[0-9]{8}", id))&&
				Pattern.matches("^[A-Za-z]\\w{5,29}$",retailers.getRetailerName())&&
						Pattern.matches("[789]{1}[0-9]{9}", str)&&
						(retailers.getFarmingTips().length()<1000)&&
						(retailers.getRetailerCategory().length()<25))
		{
			flag=true;
		}
		return flag;
	}
}

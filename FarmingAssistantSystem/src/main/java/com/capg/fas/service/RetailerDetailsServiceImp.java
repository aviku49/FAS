package com.capg.fas.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.RetailerDetailsDTO;
import com.capg.fas.beans.RetailerDetails;
import com.capg.fas.repository.IRepositoryRetailerDetails;
import com.capg.fas.util.RetailerDetailsUtils;

@Service
public class RetailerDetailsServiceImp implements IRetailerDetailsService{

	@Autowired
	IRepositoryRetailerDetails repo;
	
	@Override
	public RetailerDetailsDTO addRetailer(RetailerDetailsDTO retailer) {
		RetailerDetails simpleRetailer=RetailerDetailsUtils.convertToRetailerDetails(retailer);
		RetailerDetails retailer1= repo.save(simpleRetailer);
		RetailerDetailsDTO retailerDto=RetailerDetailsUtils.convertToRetailerDetailsDto(retailer1);
		return retailerDto;
}
	public static boolean validRetailerDetails(RetailerDetailsDTO retailers)
	{
		boolean flag=false;
		String retailerId=String.valueOf(retailers.getRetailerId());
		String retailerNumber=String.valueOf(retailers.getRetailerNumber());
		
		if((Pattern.matches("[123456789]{1}[0-9]{7}", retailerId))&&
				Pattern.matches("^[A-Za-z]\\w{5,29}$",retailers.getRetailerName())&&
						Pattern.matches("[789]{1}[0-9]{9}", retailerNumber)&&
						(retailers.getFarmingTips().length()<1000)&&
						(retailers.getRetailerCategory().length()<25))
		{
			flag=true;
		}
		return flag;
	}
}

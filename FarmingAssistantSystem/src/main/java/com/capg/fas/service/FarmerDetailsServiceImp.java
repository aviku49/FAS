package com.capg.fas.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.FarmerDetailsDTO;
import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.repository.IRepositoryFarmerDetails;
import com.capg.fas.util.FarmerDetailsUtils;

@Service
public class FarmerDetailsServiceImp implements IFarmerDetailsService {

	
	@Autowired
	IRepositoryFarmerDetails repo;
	
	@Override
	public FarmerDetailsDTO addFarmer(FarmerDetails farmer) {
		
		FarmerDetails far= repo.save(farmer);
		FarmerDetailsDTO fardto=FarmerDetailsUtils.convertToFarmerDetailsDto(far);
		return fardto;
	}
	
	public static boolean validFarmerDetails(FarmerDetails farmerValid)
	{
		boolean flag=false;
		
	String str=String.valueOf(farmerValid.getFarmerNumber());
	String id=String.valueOf(farmerValid.getFarmerId());
				if((Pattern.matches("[123456789]{1}[0-9]{8}", id))&&
						Pattern.matches("^[A-Za-z]\\w{5,29}$", farmerValid.getFarmerName())&&
								(farmerValid.getFarmerAge()>18 && farmerValid.getFarmerAge()<100)&&
								Pattern.matches("[789]{1}[0-9]{9}", str)&&
								(farmerValid.getFarmerAddress().length()<100)&&
								(farmerValid.getTypeOfCrop().length()<30))
				{
					flag=true;
				}
		
				return flag;
		
	}

}

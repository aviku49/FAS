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
	
	/*
	 * @Author : Avinash
	 * Date :7/june/2021
	 * Description : This is serviceImp for  add farmer
	 * Params :  FarmerDetailsDTO
	 * return : FarmerDetailsDTO
	 * 
	 */
	@Override
	public FarmerDetailsDTO addFarmer(FarmerDetailsDTO farmer) {
		FarmerDetails simpleFarmer=FarmerDetailsUtils.convertToFarmerDetails(farmer);
		FarmerDetails farmer1 = repo.save(simpleFarmer);
		FarmerDetailsDTO farmerDto=FarmerDetailsUtils.convertToFarmerDetailsDto(farmer1);
		return farmerDto;
	}
	
	public static boolean validFarmerDetails(FarmerDetailsDTO farmerValid)
	{
		boolean flag=false;
		
	String farmerNumber=String.valueOf(farmerValid.getFarmerNumber());
	
				if(
						Pattern.matches("^[A-Za-z]\\w{5,29}$", farmerValid.getFarmerName())&&
								(farmerValid.getFarmerAge()>18 && farmerValid.getFarmerAge()<100)&&
								Pattern.matches("[789]{1}[0-9]{9}", farmerNumber)&&
								(farmerValid.getFarmerAddress().length()<100)&&
								Pattern.matches("^(.+)@(.+)$", farmerValid.getFarmerEmail()))
				{
					flag=true;
				}
		
				return flag;
		
	}

}

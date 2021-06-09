package com.capg.fas.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.beans.SupplierDetails;
import com.capg.fas.repository.IRepositorySupplierDetails;
import com.capg.fas.util.SupplierDetailsUtils;


@Service
public class SupplierDetailsServiceImp implements ISupplierDetailsService {

	@Autowired
	IRepositorySupplierDetails repo;
	
	
	/*
	 * @Author 1 : Sai Supriya
	 * @Author 2 : Sowgandhika 
	 * Date : 7/june/2021
	 * Description : This is serviceImp  for  add supplier
	 * params : SupplierDetailsDTO
	 * return : SupplierDetailsDTO
	 * 
	 */
	@Override
	public SupplierDetailsDTO addSupplier(SupplierDetailsDTO supplier) {
		SupplierDetails simpleSupplier=SupplierDetailsUtils.convertToSupplierDetails(supplier);
		SupplierDetails supplier1= repo.save(simpleSupplier);
		SupplierDetailsDTO supplierDto=SupplierDetailsUtils.convertToSupplierDetailsDto(supplier1);
		return supplierDto;
	}
	
	public static boolean validSupplier(SupplierDetailsDTO suppliers)
	{
		boolean flag=false;
		
		String supplierNumber=String.valueOf(suppliers.getSupplierNumber());
		if(Pattern.matches("^[A-Za-z ]\\w{5,29}$",suppliers.getSupplierName())&&
				Pattern.matches("[789]{1}[0-9]{9}", supplierNumber)&&
				Pattern.matches("^(.+)@(.+)$", suppliers.getSupplierEmail()))
				{
					flag=true;
				}
		return flag;
	}

}

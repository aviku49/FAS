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
	
	@Override
	public SupplierDetailsDTO addSupplier(SupplierDetails supplier) {
		SupplierDetails sup= repo.save(supplier);
		SupplierDetailsDTO supdto=SupplierDetailsUtils.convertToSupplierDetailsDto(sup);
		return supdto;
	}
	
	public static boolean validSupplier(SupplierDetails suppliers)
	{
		boolean flag=false;
		String id=String.valueOf(suppliers.getSupplierId());
		String str=String.valueOf(suppliers.getSupplierNumber());
		if((Pattern.matches("[123456789]{1}[0-9]{8}", id))&&
				Pattern.matches("^[A-Za-z]\\w{5,29}$",suppliers.getSupplierName())&&
				Pattern.matches("[789]{1}[0-9]{9}", str))
				{
					flag=true;
				}
		return flag;
	}

}

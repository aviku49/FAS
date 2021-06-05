package com.capg.fas.service;

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

}

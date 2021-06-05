package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.beans.SupplierDetails;
import com.capg.fas.service.ISupplierDetailsService;

@RestController
@RequestMapping("/api/farmer")
public class SupplierDetailsController {

	@Autowired
	ISupplierDetailsService service;
	
	@PostMapping("/add")
	public SupplierDetailsDTO addSupplierDetails(@RequestBody SupplierDetails supplier)
	{
		return service.addSupplier(supplier);
	}
}

package com.capg.fas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.ComplaintDetailsDTO;
import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.exception.InvalidSupplierDetailsException;
import com.capg.fas.service.IComplaintDetailsService;
import com.capg.fas.service.ISupplierDetailsService;
import com.capg.fas.service.SupplierDetailsServiceImp;


/*
 * @Author 1 : Sowgandhika 
 * @Author 2 : Sai Supriya
 * Date : 8/june/2021
 * Description : This is controller class for supplier
 * Exception : InvalidSupplierDetailsException
 */
@RestController
@RequestMapping("/api/supplier")
public class SupplierDetailsController {
	
	@Autowired
	ISupplierDetailsService service;
	
	@Autowired
	IComplaintDetailsService ser;
	
	@PostMapping("/add")
	public SupplierDetailsDTO addSupplierDetails(@RequestBody SupplierDetailsDTO supplier) throws InvalidSupplierDetailsException
	{
		SupplierDetailsDTO supplierDetails=null;
		boolean isValid=SupplierDetailsServiceImp.validSupplier(supplier);
		if(isValid)
		{
		supplierDetails = service.addSupplier(supplier);
		}
		else
		{
			throw new InvalidSupplierDetailsException();
		}
		return supplierDetails;
	}
	
	@GetMapping("showcomplains/{id}")
	public ComplaintDetailsDTO showComplain(@PathVariable int id)
	{
		return ser.showComplain(id);
	}
	
	@GetMapping("getcomplains/all")
	public List<ComplaintDetailsDTO> getAllComplaint()
	{
		return ser.getAllComplaint();
	}
}

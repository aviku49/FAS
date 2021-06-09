package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.service.ISupplierDetailsService;
import com.capg.fas.service.SupplierDetailsServiceImp;

@SpringBootTest
public class SupplierServiceTest {
	
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ComplaintServiceTest.class);
	
	@Autowired
	ISupplierDetailsService service;
	
	
	@Test
	void addSupplier()
	{
		
		SupplierDetailsDTO supplier =new SupplierDetailsDTO();
		
	
		supplier.setSupplierName("Naveen");
		supplier.setSupplierNumber(9698858585L);
		supplier.setSupplierEmail("avinash1gmail.com");
		
		
		
		SupplierDetailsDTO supplier_result =service.addSupplier(supplier);
		
		
		assertNotNull(supplier_result);
		
		LOGGER.info("Valid add supplierDetails test case executed");


}
	
	
	
	
	
	
	
	
	@Test
	void addSupplierInvalid()
	{
		
		SupplierDetailsDTO supplier =new SupplierDetailsDTO();
		
	
		supplier.setSupplierName("Naveen");
		supplier.setSupplierNumber(58585L);
		supplier.setSupplierEmail("supriya");
		
	boolean isValid =	SupplierDetailsServiceImp.validSupplier(supplier);
	
		
		assertFalse(isValid);
		
		LOGGER.warn("Invalid add supplierDetails test case executed");



}
}
package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.service.ISupplierDetailsService;
import com.capg.fas.service.SupplierDetailsServiceImp;

@SpringBootTest
public class SupplierServiceTest {
	
	
	@Autowired
	ISupplierDetailsService service;
	
	
	@Test
	void addSupplier()
	{
		
		SupplierDetailsDTO supplier =new SupplierDetailsDTO();
		
	//	supplier.setSupplierId(2001);
		supplier.setSupplierName("Naveen");
		supplier.setSupplierNumber(9698858585L);
		
		
		SupplierDetailsDTO supplier_result =service.addSupplier(supplier);
		
		
		assertNotNull(supplier_result);


}
	@Test
	void addSupplierInvalid()
	{
		
		SupplierDetailsDTO supplier =new SupplierDetailsDTO();
		
	//	supplier.setSupplierId(2001);
		supplier.setSupplierName("Naveen");
		supplier.setSupplierNumber(58585L);
		
	boolean isValid =	SupplierDetailsServiceImp.validSupplier(supplier);
	
		
		assertFalse(isValid);


}
}
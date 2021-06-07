package com.capg.fas.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.fas.DTO.SupplierDetailsDTO;
import com.capg.fas.service.ISupplierDetailsService;

@SpringBootTest
public class SupplierServiceTest {
	
	
	@Autowired
	ISupplierDetailsService service;
	
	
	@Test
	void addSupplier()
	{
		
		SupplierDetailsDTO supplier =new SupplierDetailsDTO();
		
		supplier.setSupplierId(2001);
		supplier.setSupplierName("Naveen");
		//supplier.setSupplierNumber(969858585);
		
		SupplierDetailsDTO supplier_result =service.addSupplier(supplier);
		
		
		assertNotNull(supplier_result);


}
}
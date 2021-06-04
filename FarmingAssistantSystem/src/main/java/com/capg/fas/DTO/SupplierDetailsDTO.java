package com.capg.fas.DTO;

import org.springframework.stereotype.Component;

@Component
public class SupplierDetailsDTO {

	private int supplierId;
	private String supplierName;
	private Long supplierNumber;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Long getSupplierNumber() {
		return supplierNumber;
	}
	public void setSupplierNumber(Long supplierNumber) {
		this.supplierNumber = supplierNumber;
	}
}

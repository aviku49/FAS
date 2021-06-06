package com.capg.fas.DTO;

import java.util.List;



import org.springframework.stereotype.Component;

import com.capg.fas.beans.PostAdvertisement;

@Component
public class SupplierDetailsDTO {

	
	private int supplierId;
	private String supplierName;
	private Long supplierNumber;
	

	private List<PostAdvertisement> advertise;
	
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
	public List<PostAdvertisement> getAdvertise() {
		return advertise;
	}
	public void setAdvertise(List<PostAdvertisement> advertise) {
		this.advertise = advertise;
	}
	
	@Override
	public String toString() {
		return "SupplierDetailsDTO [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierNumber="
				+ supplierNumber + "]";
	}
}

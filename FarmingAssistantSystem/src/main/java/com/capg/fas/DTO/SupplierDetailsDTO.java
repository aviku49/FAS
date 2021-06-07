package com.capg.fas.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.PostAdvertisement;

@Component
public class SupplierDetailsDTO {

	private int supplierId; //id>0 {1,8}
	private String supplierName; //name validation
	private Long supplierNumber; // number validation
	
	@OneToMany(mappedBy="supplier", cascade=CascadeType.ALL)
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
	
	
}

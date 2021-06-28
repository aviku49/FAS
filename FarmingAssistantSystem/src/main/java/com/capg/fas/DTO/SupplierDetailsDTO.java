package com.capg.fas.DTO;

import java.util.List;



import org.springframework.stereotype.Component;

import com.capg.fas.beans.PostAdvertisement;
/*
 * @Author 1 : Sai Supriya
 * @Author 2 : Sowgandhika 
 * Date : 4/june/2021
 * Description : This is DTO class for supplier
 * 
 */

@Component
public class SupplierDetailsDTO {

	private int supplierId; 
	private String supplierName;
	private Long supplierNumber; 
	private String supplierEmail;
	
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

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
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
				+ supplierNumber + ", supplierEmail=" + supplierEmail + ", advertise=" + advertise + "]";
	}
	
	
}

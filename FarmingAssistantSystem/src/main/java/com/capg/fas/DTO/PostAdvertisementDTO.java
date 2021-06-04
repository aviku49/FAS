package com.capg.fas.DTO;

import org.springframework.stereotype.Component;

@Component
public class PostAdvertisementDTO {
	
	private int postId;
	private String supplierName;
	private String typeOfCrop;
	private int QuantityInKgs;
	private Long supplierNumber;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	public int getQuantityInKgs() {
		return QuantityInKgs;
	}
	public void setQuantityInKgs(int quantityInKgs) {
		QuantityInKgs = quantityInKgs;
	}
	public Long getSupplierNumber() {
		return supplierNumber;
	}
	public void setSupplierNumber(Long supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

}

package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_info")
public class PostAdvertisement {
	
	@Id
	private int postId;
	private String supplierName;
	private String typeOfCrop;
	public SupplierDetails getSupplier() {
		return supplier;
	}
	public void setSupplier(SupplierDetails supplier) {
		this.supplier = supplier;
	}
	private int QuantityInKgs;
	private Long supplierNumber;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="supplier_id")
	private SupplierDetails supplier;
	
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

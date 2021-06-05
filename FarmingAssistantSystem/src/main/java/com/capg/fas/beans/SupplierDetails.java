package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier_info")
public class SupplierDetails {

	@Id
	private int supplierId;
	private String supplierName;
	private Long supplierNumber;
	//@OneToMany
	//private List<PostAdvertisement> advertise = new ArrayList<>();
	//@OneToMany
	//private List<ComplaintDetails> complain= new ArrayList<>();
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

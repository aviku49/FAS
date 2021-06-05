package com.capg.fas.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier_info")
public class SupplierDetails {

	@Id
	private int supplierId;
	private String supplierName;
	private Long supplierNumber;
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

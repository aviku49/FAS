package com.capg.fas.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * @Author 1 : Sowgandhika 
 * @Author 2 : Sai Supriya
 * Date : 4/June/2021
 * Description : This is entity class for supplier
 * 
 */
@Entity
@Table(name="supplier_info")
public class SupplierDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int supplierId; 
	private String supplierName;
	private Long supplierNumber; 
	private String supplierEmail;
	
	@OneToMany(mappedBy="supplier",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
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
	
	
	
	
}

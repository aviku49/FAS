package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Retailer_Details")
public class Retailer {
	
	@Id
	private int retailerId;
	private String retailerName;
	private Long retailerNumber;
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public Long getRetailerNumber() {
		return retailerNumber;
	}
	public void setRetailerNumber(Long retailerNumber) {
		this.retailerNumber = retailerNumber;
	}
	
	
	

}

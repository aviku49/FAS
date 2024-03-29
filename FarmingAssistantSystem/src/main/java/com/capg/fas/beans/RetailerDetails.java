package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Retailer_Details")
public class RetailerDetails {
	
	@Id
	private int retailerId;
	private String retailerName;
	private Long retailerNumber;
	private String farmingTips;
	private String retailerCategory;
	
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
	public String getRetailerCategory() {
		return retailerCategory;
	}
	public void setRetailerCategory(String retailerCategory) {
		this.retailerCategory = retailerCategory;
	}
	public String getFarmingTips() {
		return farmingTips;
	}
	public void setFarmingTips(String farmingTips) {
		this.farmingTips = farmingTips;
	}
	
	
	

}

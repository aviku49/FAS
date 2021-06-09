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
 * @Author 1 : Rajesh
 *  @Author 2 : Naveen
 * Date : 4/June/2021
 * Description : This is entity class for retailer
 * 
 */

@Entity
@Table(name="Retailer_info")
public class RetailerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int retailerId; 
	private String retailerName;	
	private Long retailerNumber;
	private String retailerEmail;
	private String retailerCategory; 
	
	
	@OneToMany(mappedBy="retailer",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<OfferDetails> offerDetails;


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


	public String getRetailerEmail() {
		return retailerEmail;
	}


	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}


	public String getRetailerCategory() {
		return retailerCategory;
	}


	public void setRetailerCategory(String retailerCategory) {
		this.retailerCategory = retailerCategory;
	}


	public List<OfferDetails> getOfferDetails() {
		return offerDetails;
	}


	public void setOfferDetails(List<OfferDetails> offerDetails) {
		this.offerDetails = offerDetails;
	}
	
	

	
		
	

}

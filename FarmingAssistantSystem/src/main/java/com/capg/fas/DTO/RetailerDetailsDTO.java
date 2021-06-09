package com.capg.fas.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.OfferDetails;
/*
 * @Author 1 : Rajesh
 *  @Author 2 : Naveen
 * Date : 4/june/2021
 * Description : This is DTO class for retailer
 * 
 */

@Component
public class RetailerDetailsDTO {
	
	private int retailerId; 
	private String retailerName;	
	@Column(unique=true)
	private Long retailerNumber;
	@Column(unique=true)
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


	@Override
	public String toString() {
		return "RetailerDetailsDTO [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerNumber="
				+ retailerNumber + ", retailerEmail=" + retailerEmail + ", retailerCategory=" + retailerCategory
				+ ", offerDetails=" + offerDetails + "]";
	}
	
	
	
}

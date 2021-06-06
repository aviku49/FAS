package com.capg.fas.DTO;

import java.util.List;


import org.springframework.stereotype.Component;

import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.beans.OfferDetails;

@Component
public class RetailerDetailsDTO {
	

	private int retailerId;
	private String retailerName;
	private Long retailerNumber;
	private String retailerCategory;
	private String farmingTips;
	
	private String response; // Response from farmer whether accepted or rejected;

	private FarmerDetails farmer;
	
	
	
	private List<OfferDetails> offerDetails;
	
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public FarmerDetails getFarmer() {
		return farmer;
	}
	public void setFarmer(FarmerDetails farmer) {
		this.farmer = farmer;
	}
	public String getFarmingTips() {
		return farmingTips;
	}
	public void setFarmingTips(String farmingTips) {
		this.farmingTips = farmingTips;
	}

	
	

	
	public List<OfferDetails> getOfferDetails() {
		return offerDetails;
	}
	public void setOfferDetails(List<OfferDetails> offerDetails) {
		this.offerDetails = offerDetails;
	}
	public List<OfferDetails> getofferDetails() {
		return offerDetails;
	}
	public void setofferDetials(List<OfferDetails> offerDetails) {
		this.offerDetails = offerDetails;
	}
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
	
	
	@Override
	public String toString() {
		return "RetailerDetailsDTO [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerNumber="
				+ retailerNumber + ", farmingTips=" + farmingTips + ", retailerCategory=" + retailerCategory + "]";
	}

}

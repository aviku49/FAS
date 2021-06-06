package com.capg.fas.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.beans.RetailerDetails;

@Component
public class OfferDetailsDTO {
	
	
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private int productDiscount;
	private int productQuantity;
    private String response; // Response from farmer whether accepted or rejected;

	private FarmerDetails farmer;
	
	

	   private RetailerDetails retailer;
	
	
	
	
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
	public RetailerDetails getRetailer() {
		return retailer;
	}
	public void setRetailer(RetailerDetails retailer) {
		this.retailer = retailer;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	@Override
	public String toString() {
		return "OfferDetailsDTO [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDiscount=" + productDiscount + ", productQuantity=" + productQuantity + "]";
	}

}

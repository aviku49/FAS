package com.capg.fas.DTO;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.RetailerDetails;
/*
 * @Author 1 : Rajesh
 * @Author 2 : Naveen
 * Date : 4/June/2021
 * Description : This is DTO class for offer
 * 
 */

@Component
public class OfferDetailsDTO {
	
	
	private int productId; 
	private String productName; 
	private int productPrice; 
	private String productDiscount; 
	private String productQuantity; 
	private String farmingTips;
	
	@ManyToOne
	@JoinColumn(name="retailer_id")
	   private RetailerDetails retailer;

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

	public String getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getFarmingTips() {
		return farmingTips;
	}

	public void setFarmingTips(String farmingTips) {
		this.farmingTips = farmingTips;
	}

	public RetailerDetails getRetailer() {
		return retailer;
	}

	public void setRetailer(RetailerDetails retailer) {
		this.retailer = retailer;
	}

	@Override
	public String toString() {
		return "OfferDetailsDTO [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDiscount=" + productDiscount + ", productQuantity=" + productQuantity
				+ ", farmingTips=" + farmingTips + ", retailer=" + retailer + "]";
	}
	
	
	
	
	
}

package com.capg.fas.DTO;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.RetailerDetails;

@Component
public class OfferDetailsDTO {
	
	
	private int productId; //{1,8} id>0
	private String productName; //name validation
	private int productPrice; // p>=0 && 
	private String productDiscount; // regex
	private String productQuantity; // regex
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="retailer_id")
	   private RetailerDetails retailer;
	
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
	@Override
	public String toString() {
		return "OfferDetailsDTO [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDiscount=" + productDiscount + ", productQuantity=" + productQuantity
				+ ", retailer=" + retailer + "]";
	}
	
	
}

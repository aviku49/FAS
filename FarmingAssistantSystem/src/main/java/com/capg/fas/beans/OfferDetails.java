package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Offer_info")
public class OfferDetails {
	
	@Id
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
	
	
	
	

}

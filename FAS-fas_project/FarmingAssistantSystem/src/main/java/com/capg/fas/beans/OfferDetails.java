package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Offer_Details")
public class OfferDetails {
	
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private int productDiscount;
	private int productQuantity;
	//@ManyToMany
	//private List<RetailerDetails> retailer;

	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="retailer_id")
	   private RetailerDetails retailer;
	
//	@ManyToOne
    //private FarmerDetails farmer;
 
	
//	public RetailerDetails getRetailer() {
//		return retailer;
//	}
//	public void setRetailer(RetailerDetails retailer) {
//		this.retailer = retailer;
//	}
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
	
	
	
	

}

package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * @Author 1 : Rajesh
 * @Author 2 : Naveen
 * Date : 4/june/2021
 * Description : This is entity class for offer
 * 
 */
@Entity
@Table(name="Offer_info")
public class OfferDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
	
	

}

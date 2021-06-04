package com.capg.fas.DTO;

import org.springframework.stereotype.Component;

@Component
public class OfferDetailsDTO {
	
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productDiscount;
	private int productQuantity;
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

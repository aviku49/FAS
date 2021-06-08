package com.capg.fas.DTO;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.SupplierDetails;

@Component
public class PostAdvertisementDTO {
	
	private int postId;
	private String typeOfCrop;
	private String quantity;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="supplier_id")
	private SupplierDetails supplier;
	
	public SupplierDetails getSupplier() {
		return supplier;
	}
	public void setSupplier(SupplierDetails supplier) {
		this.supplier = supplier;
	}
	
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "PostAdvertisementDTO [postId=" + postId + ", typeOfCrop=" + typeOfCrop + ", quantity=" + quantity
				+ ", supplier=" + supplier + "]";
	}
	

}

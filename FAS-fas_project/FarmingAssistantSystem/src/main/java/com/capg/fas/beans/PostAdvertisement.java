package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_info")
public class PostAdvertisement {
	
	@Id
	private int postId;

	private String typeOfCrop;
	private int QuantityInKgs;

	@ManyToOne(cascade=CascadeType.ALL)
	private SupplierDetails supplier;
	//@ManyToOne
	//private FarmerDetails farmer;
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
	public int getQuantityInKgs() {
		return QuantityInKgs;
	}
	public void setQuantityInKgs(int quantityInKgs) {
		QuantityInKgs = quantityInKgs;
	}

	

}

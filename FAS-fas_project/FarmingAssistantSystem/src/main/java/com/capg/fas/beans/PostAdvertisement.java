package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_info")
public class PostAdvertisement {
	
	@Id
	private int postId;
	private String typeOfCrop;
	private int QuantityInKgs;
	private String response; // Response from farmer whether accepted or rejected;
	
	@ManyToOne(cascade=CascadeType.ALL) //Get the farmer id who accepted this advertisement
	@JoinColumn(name="farmer_id")
	private FarmerDetails farmer;
	
	@ManyToOne(cascade=CascadeType.ALL) // Get the supplier id who post this advertisement;
	@JoinColumn(name="supplier_id")
	private SupplierDetails supplier;

	
	
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
	public int getQuantityInKgs() {
		return QuantityInKgs;
	}
	public void setQuantityInKgs(int quantityInKgs) {
		QuantityInKgs = quantityInKgs;
	}

	

}

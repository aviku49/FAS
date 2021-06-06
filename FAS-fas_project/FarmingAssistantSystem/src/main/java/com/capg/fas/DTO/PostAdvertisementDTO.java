package com.capg.fas.DTO;




import org.springframework.stereotype.Component;

import com.capg.fas.beans.FarmerDetails;
import com.capg.fas.beans.SupplierDetails;

@Component
public class PostAdvertisementDTO {
	
	
	private int postId;
	private String typeOfCrop;
	private int QuantityInKgs;
	private String response; // Response from farmer whether accepted or rejected;
	
	
	private FarmerDetails farmer;
	

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

	
	@Override
	public String toString() {
		return "PostAdvertisementDTO [postId=" + postId + ", supplierName=" + supplier.getSupplierName() + ", typeOfCrop="
				+ typeOfCrop + ", QuantityInKgs=" + QuantityInKgs + ", supplierNumber=" + supplier.getSupplierNumber() + "]";
	}

}

package com.capg.fas.DTO;

import java.util.List;



import org.springframework.stereotype.Component;

import com.capg.fas.beans.ComplaintDetails;

@Component
public class FarmerDetailsDTO {

	private int farmerId;
	private String farmerName;
	private int farmerAge;
	private Long farmerNumber;
	private String farmerAddress;
	private String typeOfCrop; // Types of crop he is producing

	
	
	private List<ComplaintDetails> complain;
	

	
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	public List<ComplaintDetails> getComplain() {
		return complain;
	}
	public void setComplain(List<ComplaintDetails> complain) {
		this.complain = complain;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public int getFarmerAge() {
		return farmerAge;
	}
	public void setFarmerAge(int farmerAge) {
		this.farmerAge = farmerAge;
	}
	public Long getFarmerNumber() {
		return farmerNumber;
	}
	public void setFarmerNumber(Long farmerNumber) {
		this.farmerNumber = farmerNumber;
	}
	public String getFarmerAddress() {
		return farmerAddress;
	}
	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}


	@Override
	public String toString() {
		return "FarmerDetailsDTO [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerAge=" + farmerAge
				+ ", farmerNumber=" + farmerNumber + ", farmerAddress=" + farmerAddress + ", typeOfCrop=" + typeOfCrop
				+ ", farmerComplaint=" + complain + "]";
	}

}

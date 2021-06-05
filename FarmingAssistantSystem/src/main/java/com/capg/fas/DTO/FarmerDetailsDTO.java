package com.capg.fas.DTO;

import org.springframework.stereotype.Component;

@Component
public class FarmerDetailsDTO {
	private int farmerId;
	private String farmerName;
	private int farmerAge;
	private Long farmerNumber;
	private String farmerAddress;
	private String typeOfCrop;
	private String farmerComplaint;
	private String soldCrop;
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
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	public String getFarmerComplaint() {
		return farmerComplaint;
	}
	public void setFarmerComplaint(String farmerComplaint) {
		this.farmerComplaint = farmerComplaint;
	}
	public String getSoldCrop() {
		return soldCrop;
	}
	public void setSoldCrop(String soldCrop) {
		this.soldCrop = soldCrop;
	}
	@Override
	public String toString() {
		return "FarmerDetailsDTO [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerAge=" + farmerAge
				+ ", farmerNumber=" + farmerNumber + ", farmerAddress=" + farmerAddress + ", typeOfCrop=" + typeOfCrop
				+ ", farmerComplaint=" + farmerComplaint + ", soldCrop=" + soldCrop + "]";
	}

}

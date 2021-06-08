package com.capg.fas.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="farmer_info")
public class FarmerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int farmerId; //{1,8} ,id>0
	private String farmerName; //name validation	
	private int farmerAge; //>18&&<100;
	private Long farmerNumber;  //number validation	
	private String farmerAddress; //length<100
	private String typeOfCrop; // length<30
	
	
	@OneToMany(mappedBy="farmer", cascade=CascadeType.ALL)
	private List<ComplaintDetails> complain;
	
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
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	
	
	
	
}

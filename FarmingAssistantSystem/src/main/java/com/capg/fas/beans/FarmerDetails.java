package com.capg.fas.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*
 * @Author : Avinash
 * Date : 4/June/2021
 * Description : This is entity class for farmer
 * 
 */

@Entity
@Table(name="farmer_info")
public class FarmerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int farmerId; 
	private String farmerName; 	
	private int farmerAge; 
	private Long farmerNumber;  	
	private String farmerAddress;
	private String farmerEmail;
	

	
	
	@OneToMany(mappedBy="farmer",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<ComplaintDetails> complain;




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




	public String getFarmerEmail() {
		return farmerEmail;
	}




	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}




	public List<ComplaintDetails> getComplain() {
		return complain;
	}




	public void setComplain(List<ComplaintDetails> complain) {
		this.complain = complain;
	}
	
	
	
	
}

package com.capg.fas.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.ComplaintDetails;

/*
 * @Author : Avinash
 * Date : 4/june/2021
 * Description : This is DTO class for farmer
 * 
 */
@Component
public class FarmerDetailsDTO {
	private int farmerId; 
	private String farmerName; 	
	private int farmerAge; 
	@Column(unique=true)
	private Long farmerNumber;  	
	private String farmerAddress;
	@Column(unique=true)
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




	@Override
	public String toString() {
		return "FarmerDetailsDTO [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerAge=" + farmerAge
				+ ", farmerNumber=" + farmerNumber + ", farmerAddress=" + farmerAddress + ", farmerEmail=" + farmerEmail
				+ ", complain=" + complain + "]";
	}
	
	
	
	

	
	
	
	
	
	

}

package com.capg.fas.DTO;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.capg.fas.beans.FarmerDetails;

/*
 * @Author : Avinash
 * Date : 4/June/2021
 * Description : This is DTO class for complain
 * 
 */
@Component
public class ComplaintDetailsDTO {
	private int complaintId;   
	private String complaintType;   
	private String complaintMessage; 
	private String complaintOn; 
	
	@ManyToOne
	@JoinColumn(name="farmer_id")
	private FarmerDetails farmer;  //null
	
	public int getComplaintId() {
		return complaintId;
	}
	public FarmerDetails getFarmer() {
		return farmer;
	}
	public void setFarmer(FarmerDetails farmer) {
		this.farmer = farmer;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public String getComplaintMessage() {
		return complaintMessage;
	}
	public void setComplaintMessage(String complaintMessage) {
		this.complaintMessage = complaintMessage;
	}
	public String getComplaintOn() {
		return complaintOn;
	}
	public void setComplaintOn(String complaintOn) {
		this.complaintOn = complaintOn;
	}
	@Override
	public String toString() {
		return "ComplaintDetailsDTO [complaintId=" + complaintId + ", complaintType=" + complaintType
				+ ", complaintMessage=" + complaintMessage + ", complaintOn=" + complaintOn + ", farmer=" + farmer
				+ "]";
	}
	
	

}

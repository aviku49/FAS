package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * @Author : Avinash
 * Date : 4/june/2021
 * Description : This is entity class for complain
 * 
 */

@Entity
@Table(name="complaint_info")
public class ComplaintDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
	

}

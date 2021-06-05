package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complaint_info")
public class ComplaintDetails {
	
	@Id
	private int complaintId;
	private String complaintType;
	private String complaintMessage;
	private String complaintOn;
	private String complaintFrom;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="farmer_id")
	private FarmerDetails farmer;
	
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
	public String getComplaintFrom() {
		return complaintFrom;
	}
	public void setComplaintFrom(String complaintFrom) {
		this.complaintFrom = complaintFrom;
	}

}

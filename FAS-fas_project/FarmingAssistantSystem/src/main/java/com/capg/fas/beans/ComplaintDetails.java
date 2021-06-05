package com.capg.fas.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complaint_info")
public class ComplaintDetails {
	
	@Id
	private int complaintId;
	private String complaintType;
	private String complaintMessage;

	@ManyToOne(cascade=CascadeType.ALL)
	private FarmerDetails farmer;
	//@ManyToOne
	//private SupplierDetails supplier;
	
	public int getComplaintId() {
		return complaintId;
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


}

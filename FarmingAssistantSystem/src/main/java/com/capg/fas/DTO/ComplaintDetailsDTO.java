package com.capg.fas.DTO;

import org.springframework.stereotype.Component;

@Component
public class ComplaintDetailsDTO {
	private int complaintId;
	private String complaintType;
	private String complaintMessage;
	private String complaintOn;
	private String complaintFrom;
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
	@Override
	public String toString() {
		return "ComplaintDetailsDTO [complaintId=" + complaintId + ", complaintType=" + complaintType
				+ ", complaintMessage=" + complaintMessage + ", complaintOn=" + complaintOn + ", complaintFrom="
				+ complaintFrom + "]";
	}

}

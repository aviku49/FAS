package com.capg.fas.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * @Author 1 : Sai Supriya
 * @Author 2 : Sowgandhika 
 * Date : 4/june/2021
 * Description : This is entity class for postAdvertisement
 * 
 */

@Entity
@Table(name="post_info")
public class PostAdvertisement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int postId;
	private String typeOfCrop; 
	private String quantity; 
	
	
	
	@ManyToOne
	@JoinColumn(name="supplier_id")
	private SupplierDetails supplier;
	
	public SupplierDetails getSupplier() {
		return supplier;
	}
	public void setSupplier(SupplierDetails supplier) {
		this.supplier = supplier;
	}
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	

}

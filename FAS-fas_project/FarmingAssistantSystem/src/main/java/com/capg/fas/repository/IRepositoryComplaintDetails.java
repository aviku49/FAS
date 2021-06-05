package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.ComplaintDetails;

@Repository
public interface IRepositoryComplaintDetails extends JpaRepository<ComplaintDetails, Integer>{
	

}

package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.FarmerDetails;

@Repository
public interface IRepositoryFarmerDetails extends JpaRepository<FarmerDetails, Integer> {

	
	
}

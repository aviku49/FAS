package com.capg.fas.repository;

/*
 * @Author  : Avinash
 * Date : 5/june/2021
 * Description : This is Repository class for farmer
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.FarmerDetails;

@Repository
public interface IRepositoryFarmerDetails extends JpaRepository<FarmerDetails, Integer> {
	
	
	
	
}

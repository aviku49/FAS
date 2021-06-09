package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.RetailerDetails;

/*
 * @Author 1 : Rajesh
 *  @Author 2 : Naveen
 * Date : 5/june/2021
 * Description : This is Repository class for retailer
 * 
 */
@Repository
public interface IRepositoryRetailerDetails extends JpaRepository<RetailerDetails, Integer> {

    
}

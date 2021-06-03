package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.Retailer;

@Repository
public interface IRepository extends JpaRepository<Retailer, Integer>{
	

}

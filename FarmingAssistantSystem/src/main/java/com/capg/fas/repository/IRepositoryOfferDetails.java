package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.OfferDetails;

@Repository
public interface IRepositoryOfferDetails extends JpaRepository<OfferDetails, Integer> {
	

}

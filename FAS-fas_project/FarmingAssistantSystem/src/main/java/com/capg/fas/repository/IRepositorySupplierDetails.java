package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.SupplierDetails;

@Repository
public interface IRepositorySupplierDetails extends JpaRepository<SupplierDetails, Integer>{

}

package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.PostAdvertisement;

@Repository
public interface IRepositoryPostAdvertisement  extends JpaRepository<PostAdvertisement, Integer>{

}

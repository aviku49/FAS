package com.capg.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fas.beans.PostAdvertisement;

/*
 * @Author 1 : Sai Supriya
 * @Author 2 : Sowgandhika 
 * Date : 5/june/2021
 * Description : This is Repository class for PostAdvertisement
 * 
 */
@Repository
public interface IRepositoryPostAdvertisement  extends JpaRepository<PostAdvertisement, Integer>{

}

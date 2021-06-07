package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.exception.InvalidPostAdvertisementException;
import com.capg.fas.service.IPostAdvertisementService;
import com.capg.fas.service.PostAdvertisementServiceImp;

@RestController
@RequestMapping("/api/post")
public class PostAdvertisementController {
	
	@Autowired
	IPostAdvertisementService service;
	@PostMapping("/add")
	public PostAdvertisementDTO addPost(@RequestBody PostAdvertisementDTO post) throws InvalidPostAdvertisementException
	{
		PostAdvertisementDTO postAd=null;
		boolean isValid=PostAdvertisementServiceImp.validPost(post);
		if(isValid)
		{
		postAd = service.addPost(post);
		}
		else
		{
			throw new InvalidPostAdvertisementException();
		}
		return postAd;
		
	}

}

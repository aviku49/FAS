package com.capg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fas.DTO.PostAdvertisementDTO;
import com.capg.fas.beans.PostAdvertisement;
import com.capg.fas.service.IPostAdvertisementService;

@RestController
@RequestMapping("/api/post")
public class PostAdvertisementController {
	
	@Autowired
	IPostAdvertisementService service;
	@PostMapping("/add")
	public PostAdvertisementDTO addPost(@RequestBody PostAdvertisement post)
	{
		return service.addPost(post);
		
	}

}

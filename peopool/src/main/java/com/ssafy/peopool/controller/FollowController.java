package com.ssafy.peopool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.peopool.model.service.FollowService;

@RestController
@RequestMapping("/fol")
public class FollowController {
	
	@Autowired
	FollowService followService;

}

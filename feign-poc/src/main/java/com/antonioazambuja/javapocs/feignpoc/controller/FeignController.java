package com.antonioazambuja.javapocs.feignpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.antonioazambuja.javapocs.feignpoc.domain.GithubUser;
import com.antonioazambuja.javapocs.feignpoc.operation.FeignHttpClient;

@RestController
public class FeignController {
	
	@Autowired
	private FeignHttpClient feignHttpClient;
	
	@GetMapping("/{userName}")
	public GithubUser getUserGithub(@PathVariable String userName) {
		return feignHttpClient.getUserGithub(userName);
	}
	
}

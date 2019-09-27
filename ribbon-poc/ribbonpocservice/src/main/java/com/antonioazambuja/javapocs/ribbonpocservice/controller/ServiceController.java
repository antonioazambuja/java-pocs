package com.antonioazambuja.javapocs.ribbonpocservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<String> getHelloWorld(){
		System.out.println("AQUIIII");
		return ResponseEntity.ok("Hello World!");
	}
	
	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public ResponseEntity<String> getHelloWorld(@PathVariable(value = "user") String user){
		return ResponseEntity.ok("Hello " + user + "!");
	}
	
}

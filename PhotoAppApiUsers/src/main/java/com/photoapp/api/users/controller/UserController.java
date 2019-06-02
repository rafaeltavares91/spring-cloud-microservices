package com.photoapp.api.users.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private Environment env; 
	
	public UserController(Environment env) {
		this.env = env;
	}
	
	@GetMapping("/status/check")
	public String status() {
		return "working on port "+ env.getProperty("local.server.port");
	}
	
}
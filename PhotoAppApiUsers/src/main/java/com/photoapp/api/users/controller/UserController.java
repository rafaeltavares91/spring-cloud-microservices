package com.photoapp.api.users.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoapp.api.users.dto.CreateUserRequestModel;
import com.photoapp.api.users.dto.UserDTO;
import com.photoapp.api.users.dto.CreateUserResponseModel;
import com.photoapp.api.users.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private Environment env; 
	private UserService userSevice;
	
	public UserController(Environment env, UserService userSevice) {
		this.env = env;
		this.userSevice = userSevice;
	}
	
	@GetMapping("/status/check")
	public String status() {
		return new StringBuilder()
				.append("working on port ")
				.append(env.getProperty("local.server.port"))
				.append(", with token = ")
				.append(env.getProperty("token.secret"))
				.toString();
	}
	
	@PostMapping
	public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDTO userDTO = mapper.map(userDetails, UserDTO.class);
		
		CreateUserResponseModel createdUser = userSevice.createUser(userDTO);
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(createdUser);
	}
	
}
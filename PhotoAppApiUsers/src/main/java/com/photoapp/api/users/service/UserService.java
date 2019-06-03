package com.photoapp.api.users.service;

import com.photoapp.api.users.dto.UserDTO;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.photoapp.api.users.dto.CreateUserResponseModel;

public interface UserService extends UserDetailsService {

	CreateUserResponseModel createUser(UserDTO userDTO);

	UserDTO getUserDTOByEmail(String userName);
	
}

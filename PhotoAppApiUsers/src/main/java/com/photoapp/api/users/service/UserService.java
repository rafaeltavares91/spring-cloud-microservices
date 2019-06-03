package com.photoapp.api.users.service;

import com.photoapp.api.users.dto.UserDTO;
import com.photoapp.api.users.dto.CreateUserResponseModel;

public interface UserService {

	CreateUserResponseModel createUser(UserDTO userDTO);
	
}

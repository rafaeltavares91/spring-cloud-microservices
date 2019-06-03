package com.photoapp.api.users.service;

import com.photoapp.api.users.dto.UserDTO;
import com.photoapp.api.users.dto.UserResponseModel;

public interface UserService {

	UserResponseModel createUser(UserDTO userDTO);
	
}

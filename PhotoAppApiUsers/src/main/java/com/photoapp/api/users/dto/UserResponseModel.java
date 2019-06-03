package com.photoapp.api.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseModel {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String createdAt;
	
	private String lastLogin;
	
}